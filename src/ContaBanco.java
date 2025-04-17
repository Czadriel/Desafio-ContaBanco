//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ContaBanco {
        public class ContaTerminal {
            public static void main(String[] args) {
                // Criação do objeto Scanner para ler dados do terminal
                Scanner scanner = new Scanner(System.in);

                // Solicita e lê os dados do usuário
                System.out.println("Por favor, digite o número da Agência:");
                String agencia = scanner.nextLine();

                System.out.println("Por favor, digite o número da Conta:");
                int numeroConta = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente

                System.out.println("Por favor, digite o nome do cliente:");
                String nomeCliente = scanner.nextLine();

                System.out.println("Por favor, digite o saldo da conta:");
                double saldo = scanner.nextDouble();

                // Exibe a mensagem final formatada
                System.out.println("Olá " + nomeCliente +
                        ", obrigado por criar uma conta em nosso banco. " +
                        "Sua agência é " + agencia +
                        ", conta " + numeroConta +
                        " e seu saldo R$" + saldo + " já está disponível para saque.");

                // Fecha o scanner
                scanner.close();
        }
    }
}