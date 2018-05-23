import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class QUESTÃO08 {
    public static void main (String[]arg){
         Scanner input = new Scanner(System.in);
         int y;
         System.out.println("Digite um numero N");
         int x = input.nextInt();
         System.out.println("Numeros Par");
         for (y=0; y<=x; y++){
             if (y%2==0){
                 System.out.println(y);
             }
         }
         System.out.println("Numeros Impar");
         for (y=0; y<=x; y++){
             if (y%2!=0){
                 System.out.println(y);
             }
             
         }
        
    }
    
    
}
