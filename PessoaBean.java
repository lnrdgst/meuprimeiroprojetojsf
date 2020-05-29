package br.com.cursojsf;

import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpServlet;

@ManagedBean(name = "pessoaBean")
public class PessoaBean extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
