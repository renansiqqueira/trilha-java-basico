import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.printf("Por favor, entre com o número da conta: ");
        int conta = scanner.nextInt();

        System.out.printf("Por favor, entre com a agência: ");
        var agencia = scanner.next();

        System.out.printf("Por favor, entre com o nome do cliente: ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque",nomeCliente,agencia,conta,saldo);
    }
}