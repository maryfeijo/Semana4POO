/**
 * 
 */
package br.org.lasalle.semana4;

import java.util.Scanner;

/**
 * @nome Maryana
 * @matricula 0050008500
 *
 */
public class TestTweet {

	/**
	 * @param args
	 */
	private static String continua = "n";
	
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("login:");
		usuario.setLogin(input.nextLine());
		System.out.println("senha:");
		usuario.setSenha(input.nextLine());
		
		System.out.println("senha" + usuario.getSenha());
		if (usuario.getSenha().equals("poo")) {
			System.out.println("Acesso OK!");
			System.out.println("Entre com um tweet: ");
			usuario.addTweet(input.nextLine());
			
			System.out.println("Deseja continuar? (s/n)");
			setContinua(input.nextLine());
			while (getContinua().equalsIgnoreCase("s")) {
				System.out.println("Entre com um tweet: ");
				usuario.addTweet(input.nextLine());

				System.out.println("Deseja continuar? (s/n)");
				setContinua(input.nextLine());
			}
			
			usuario.listarTweets();
		} else {
			System.out.println("Acesso invalido!");
		}
		input.close();

	}

	public static String getContinua() {
		return continua;
	}

	public static void setContinua(String param) {
		continua = param;
	}

}
