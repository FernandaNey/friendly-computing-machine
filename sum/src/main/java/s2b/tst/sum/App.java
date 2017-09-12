package s2b.tst.sum;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {
    Scanner entrada = new Scanner (System.in);
    System.out.printf("Infome o valor de A:\n");
    double a = entrada.nextDouble();
    System.out.printf("Infome o valor de B:\n");
    double b = entrada.nextDouble();
    entrada.close();
    double r = Sum.sum(a, b);
    System.out.printf("A= %f\n",a);
	System.out.printf("B= %f\n",b);
	System.out.printf("Resposta= %f\n", r);
    	
      
    } 
}
