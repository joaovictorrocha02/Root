import java.util.Scanner;

public class RootWhile {
    public static void main(String args[])
    {
    System.out.print("Digite um número inteiro não negativo: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();

	while (number < 0) {
	    System.out.print("Número inválido, tente novamente: ");
	    number = console.nextInt();
	}

	System.out.println("A raiz quadrada de " + number +" é " + Math.sqrt(number));
        
        //Digite um número inválido
        //Quando um número válido for digitado, sua raiz quadrada será executada
            
        }
   
    }
    

