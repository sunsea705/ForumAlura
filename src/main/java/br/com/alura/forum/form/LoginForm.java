package br.com.alura.forum.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginForm {

	private String email;
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "LoginForm [email=" + email + ", senha=" + senha + "]";
	}

	public UsernamePasswordAuthenticationToken toLogin() {
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}