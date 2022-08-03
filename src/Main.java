import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            System.out.println(car);
            drive();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finally is on");
        }
    }


        public static void drive () {
            System.out.println("Машина журуп жатат");
            System.out.println("it's going, no matter where :) ");
            System.out.println("                   _______________");
            System.out.println("                   |to the Moon! |");
            System.out.println("      _________    |_____________|");
            System.out.println("  ---/ []   [] \\___|");
            System.out.println("8|     {    }      \\\\3       ");
            System.out.println("  =====O------O=====           ");
        }
    }