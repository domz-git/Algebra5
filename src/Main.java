import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double celsius;

        System.out.print("Unesi x dužinu:");
        x = scanner.nextDouble();

        System.out.print("Unesi y dužinu:");
        y = scanner.nextDouble();

        System.out.println("Povrsina je: "+IzracunPovrsine(x,y));

        System.out.print("Stupnjeve u celsius:");
        celsius = scanner.nextDouble();

        double[] convertedScales = CelToFehNKelv(celsius);

        System.out.println("Celsius u faraheit: " + convertedScales[0]);
        System.out.println("Celsius u kelvin: " + convertedScales[1]);

        FizzBuzz();
    }

    public static double IzracunPovrsine(double x, double y){
        return (x * y);
    }

    public static double[] CelToFehNKelv(double celsius){
        double faranheit = (celsius * (9.0/5.0) + 32);
        double kelvin = (celsius + 273.25);

        double[] tempScales = {faranheit, kelvin};

        return tempScales;
    }

    public static void FizzBuzz(){
        for (int i = 0; i < 100; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }


}
