package exercicioII;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      double C = 0;
      double F = 0;
      
      Scanner entrada = new Scanner (System.in);
      
      System.out.println("informe o valor em Celsius a ser convertido para Fahrenheit"); C = entrada.nextDouble()
;
      F = (9 * C + 160)/ 5;
    		  ;
    		  System.out.println("temperatura em Celsius:" + C + "°" ); 
    		  System.out.println("temperatura em fahrenheit:" + F + "°");
	}

}
