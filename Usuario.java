/**
 * 
 */
package br.org.lasalle.semana4;

import java.util.ArrayList;

/**
 * @nome Maryana
 * @matricula 0050008500
 *
 */
public class Usuario {

	/**
	 * 
	 */
	private String login, senha;
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public void addTweet(String tweet) {
		Tweet t = new Tweet();
		t.setTweet(tweet);
		tweets.add(t);
	}

	public void listarTweets() {
		// TODO Auto-generated method stub
		for (Tweet t : tweets) {
			System.out.println(t.getTweet());
		}
	}

}
