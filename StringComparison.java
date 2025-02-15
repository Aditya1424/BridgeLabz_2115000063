public class StringComparison {
    public static void main(String[] args) {
        int n =1000000;
        String text="hello";

        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime)/1e6 + " ms");

        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i< n; i++) {
            builder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println((endTime - startTime)/1e6 + " ms");
    }
}