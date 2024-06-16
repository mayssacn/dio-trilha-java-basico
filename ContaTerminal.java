import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados inseridos pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
        
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechamento do objeto Scanner
        scanner.close();
    }
}
