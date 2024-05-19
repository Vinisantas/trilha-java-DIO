package Estudos.DIO.Exercício;

import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o seu nome? ");
		String Nome = scanner.nextLine();

		System.out.println("Qual é a sua agência? ");
		int Agencia = scanner.nextInt();

		System.out.println("Qual é a sua conta? ");
		int Conta = scanner.nextInt();

		System.out.println("quanto quer sacar?");
		double Saldo = scanner.nextInt();


		
		
		System.out.println("Olá" + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é" + Agencia + ", conta"+Conta+" e seu saldo" + Saldo + "já está disponível para saque");

		scanner.close();
    }
}