package com.itb.inf2dm.comercio;

public class Produto {

	
	private Long id;
	private String descricao;
	private String nome;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	public long setId;
	
	
	//public: modificador de acesso livre para todas as classes 
	//private: Modificador de acesso restrito apenas para membros 
	//da propria classe, Entende-se por "membros" (atributos e/ou metodos)
	
	// Métodos Setter's e Getter's : Adicionar e Recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public boolean getStatus() {
		return codStatus;
	}

	public void setStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
}
