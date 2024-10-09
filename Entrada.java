import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a sua o seu ano de nascimento:"); 
        int anoNascimento = teclado.nextInt(); 

        int Ano_atual = 2024; 

       int  entrada = Ano_atual - anoNascimento; 


        if (entrada >= 18){
            System.out.println("Pode entrar");
        }else if (entrada < 18) {
            System.out.println("Entrada proibida");
        }
        
        teclado.close();

    }
}
