
import java.io.File;
import java.util.Scanner;

public class file_handeliiing {
    public static void main(String[] args) {

        // crreateing file 
    //     File creatfile = new File("NisidhDiscription.txt");
    //  try{
    //        creatfile.createNewFile();
    //  }
    //  catch(Exception e){
    //     System.out.println("thre is an error "+ e);
    //  }

    // try {
    //     FileWriter fileWriter = new FileWriter("NisidhDiscription.txt");
    //     fileWriter.write("my name is nisidh");
    //     fileWriter.close();
        
    // } catch (Exception e) {
    //     System.out.println("thre is an error in the code ");
    // }

    File file = new File("NisidhDiscription.txt");
    try {
        Scanner sc = new Scanner(file );
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    } catch (Exception e) {
        System.out.println("there is an error ");
    }
        
    }
}
