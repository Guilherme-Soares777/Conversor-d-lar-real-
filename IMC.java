import java.util.Scanner;
public class IMC { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        
        System.out.println("Insira a quantidade de morangos em kg: "); 

        double quantidade = teclado.nextDouble(); 

        double precoPorkg = 0.0; 

        if (quantidade<= 5) {
             precoPorkg = 2.50; 
        }else if (quantidade>5){
             precoPorkg = 2.20;
        } 
        double valor_final = precoPorkg * quantidade; 
        System.out.printf("O valor total a ser pago é de R$%.2f%n", valor_final);

        
        
         teclado.close();
    }
    
}
