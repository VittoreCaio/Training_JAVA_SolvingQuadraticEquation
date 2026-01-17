import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
  // Cria o objeto Scanner para ouvir o teclado (System.in)
   Scanner keyboardOne = new Scanner(System.in);
   System.out.print("Insira o valor de a: ");
   Double a = keyboardOne.nextDouble();
   
 
   
   Scanner keyboardTwo = new Scanner(System.in);
   System.out.print("Insira o valor de b: ");
   Double b = keyboardTwo.nextDouble();
   
   
   Scanner keyboardThree = new Scanner(System.in);
   System.out.print("Insira o valor de c: ");
   Double c = keyboardThree.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
  System.out.println("\nO valor de delta é: " + delta + "\n");
 
  if(delta<0){
   System.out.println("Não há raiz real para essa equação");  
  }
  else{
      if(delta==0){
           var x1 = (-b - Math.sqrt(delta))/2*a;
                System.out.println("Só há 1 raiz real igual a " + x1);
      }
     

            else{
                var x1 = (-b - Math.sqrt(delta))/2*a;
                var x2 = (-b + Math.sqrt(delta))/2*a;
                System.out.println("O valor da raiz x1 é: " + x1 + "\nO valor da raiz x2 é: " + x2);
            }
  }
 



keyboardOne.close();
keyboardTwo.close();
keyboardThree.close();
}
}