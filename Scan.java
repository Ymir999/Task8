package Task80;
import java.io.*;
import java.lang.StringBuilder;

public class Scan  {
    public void Read () throws IOException{
        PrintWriter writer = null;
        InputStreamReader readText = null;
        File scan = new File("scan.txt");
        try {

            StringBuilder strok = new StringBuilder();
            writer = new PrintWriter(scan);
            readText =new  InputStreamReader (System.in);
            System.out.println("Please put, or write !q for exit.");
            char text;
            do {
                text =(char) readText.read();
                writer.print(text);
                strok.append(text);
            }
            while (strok.indexOf("!q") < 0);
        }

        finally {
            if (readText != null) readText.close();
            if (writer != null) writer.close();

        }
    }


}
