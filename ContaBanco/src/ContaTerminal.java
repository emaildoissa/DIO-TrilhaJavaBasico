import java.text.NumberFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String saldo = NumberFormat.getCurrencyInstance().format(5000.00);
        
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o nome da agencia: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é "+ agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
       

    }
}
