import java.util.Scanner;

public class ejercicioJava {
    public static void main(String[] args) {
        //Definir Variable
        double a, b, c;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el lado a:");
        a=lt.nextDouble();
        System.out.println("ingrese el lado b:");
        b=lt.nextDouble();
        //Datos de proceso
        c=Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
        //Datos de salida 
        System.out.println("la hipotenusa:"+c);

        



        
    }
    


}
