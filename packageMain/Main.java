import java.util.InputMismatchException;
import java.util.Scanner;

import pacakageAccount.Account;
import packageException.DomainException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("DIGITE O NÚMERO DA CONTA: ");
            Integer numberAccount = sc.nextInt();

            System.out.print("DIGITE O NOME DO PROPRIETÁRIO DA CONTA: ");
            String holderName = sc.next();

            System.out.print("DIGITE O MONTANTE INICIAL: ");
            double initialBalance = sc.nextDouble();

            System.out.println("DIGITE O LIMITE DE SAQUE: ");
            double withDrawLimit = sc.nextDouble();

            Account conta = new Account(numberAccount, holderName, initialBalance, withDrawLimit);

        } catch (InputMismatchException e) {
            e.printStackTrace();

        } catch (DomainException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
