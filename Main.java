package Task80;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        File scan = new File("scan.txt");
        Scan rev = new Scan();

        rev.Read();
        File csv = new File("csv.csv");
        Inputccsv res = new Inputccsv();
        res.Outnput();
        res.Input();
        OutnputCar();
        InputCar();
    }

    public static void OutnputCar() throws IOException {
        File car = new File("car.txt");
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(car));
        try {
            car.createNewFile();
            writer.writeObject(new Car("Vaz", "green", 55, 40, 80));

        } finally {
            writer.close();
        }
    }

    public static void InputCar() throws IOException, ClassNotFoundException {
        File car = new File("car.txt");
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(car));
            Car taz = (Car) in.readObject();
            System.out.println(taz);
        } finally {
            in.close();
        }
    }
}
