import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class EjerciciosJava {

    public static void main(String[] args) {
        //2.15
        //Definir variables
        double p,r=4,i;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de la Intensidad:");
        i=lt.nextDouble();

        //Proceso
        p=r*Math.pow(i, 4);

        //Datos de salida 
        System.out.println("La potencia es:"+p);
    }
}