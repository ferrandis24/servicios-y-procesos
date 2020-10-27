
import java.io.*;
import java.text.MessageFormat;


//ejercicio 1
public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("fichero.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            printer.println ( (int)(Math.random() * 100));
        }
        long endTime = System.currentTimeMillis();
        printer.println(MessageFormat.format("El proceso de escritura es {0}", (endTime - starTime)+" ms"));
            printer.close();





        //ejercicio 2
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        int total = 0;
        long starTime1 = System.currentTimeMillis();
            while ((line = reader.readLine()) != null ){
            try{
               total += Integer.parseInt(line);
            }catch (Exception NumberFormatException)
            { System.out.println(line); }

            }
        long endTime1 = System.currentTimeMillis();
        printer.println(MessageFormat.format("El proceso de lectura es {0}", (endTime1 - starTime1)+" ms"));
        System.out.println(total);
        reader.close();
    }

}
