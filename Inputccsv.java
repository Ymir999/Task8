package Task80;

import java.io.*;
public class Inputccsv  {
    File csv = new File("csv.csv");
    Person andrey = new Person("Andrey", "Shutskiy", "24","89543435412");
    Person sergey = new Person("sergey", "Shutskiy", "24","89543435412");
    Person vasiliy = new Person("Vasiliy", "Shutskiy", "24","89543435412");
    Person semen = new Person("Semen", "Shutskiy", "24","89543435412");
    Person drogmir = new Person("Drogmir", "Shutskiy", "24","89543435412");

    public void Outnput () throws  IOException{
        PrintWriter writer = null;
        try{
            csv.createNewFile();
            writer = new PrintWriter(csv);
            writer.print("name;surname;age;number;\n"+ andrey.toString()+"\n" + sergey.toString()+"\n" + vasiliy.toString()+"\n" + semen.toString()+"\n"
                    + drogmir.toString());

        }
        finally {
            if (writer != null) writer.close();
        }}
    public void Input()throws IOException{
        StringBuilder builder = new StringBuilder();
        String text;
        String name;
        String surname;
        String number;
        String age;
        int n = 0;
        BufferedReader read = null;
        Person [] mass=new Person[5];
        try{
            read= new BufferedReader(new InputStreamReader(new FileInputStream(csv)));
            do {
                text = read.readLine();
                if (text == null)
                    break;
                if (text.equals("name;surname;age;number;"))
                    continue;
                builder.append(text);
                int g = builder.indexOf(";");
                name=builder.substring(0,g);
                builder.delete(0,g+1);
                g=builder.indexOf(";");
                surname=builder.substring(0,g);
                builder.delete(0,g+1);
                g=builder.indexOf(";");
                age=builder.substring(0,g);
                builder.delete(0,g+1);
                g=builder.indexOf(";");
                number=builder.substring(0,g);
                builder.delete(0,g+1);
                mass[n]= new Person(name,surname,age,number);
                n++;
            }
            while (text != null);
            for (int i =0;i< mass.length;i++)
                System.out.println(mass[i].toString());
            System.out.println();}

        finally {
            if (read != null) read.close();
        }
    }}