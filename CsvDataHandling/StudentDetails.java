import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
class StudentDetails{
    public static void main(String args[]){
        String CSVFile="C:\\Users\\Hp\\IdeaProjects\\CSVJAVA\\src\\main\\java\\org\\example\\Student.csv";
        try(CSVReader csv=new CSVReader(new FileReader(CSVFile))){
            String[] Record;
            boolean isHeader=true;
            while((Record=csv.readNext())!=null){
                if(isHeader){
                    isHeader=false;
                    continue;
                }
                String id=Record[0];
                String name=Record[1];
                String age=Record[2];
                String marks=Record[3];

                System.out.println("Students Details: ");
                System.out.println("Id: " +id);
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("marks: "+marks);
            }
        }
		catch(IOException e){
            e.printStackTrace();
        } 
		
		catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}