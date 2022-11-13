
import java.util.Scanner;

public class Rectangulo {
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        float base = sc.nextFloat();
        System.out.println("Altura: ");
        float altura = sc.nextFloat();
        if(base < 0 || altura < 0) System.out.println("Error. Valores no válidos");
        else System.out.println("Area: " + base*altura);
    }
}
