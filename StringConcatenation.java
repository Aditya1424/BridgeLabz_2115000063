public class StringConcatenation{
    public static void main(String[] args) {
        int n = 1000;

       
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        System.out.println("String: " + (System.nanoTime() - start)/ 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder: " + (System.nanoTime() - start) / 1e6 + " ms");


        start = System.nanoTime();
        StringBuffer in = new StringBuffer();
        for (int i = 0; i < n; i++) {
            in.append("a");
        }
        System.out.println("StringBuffer: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}

