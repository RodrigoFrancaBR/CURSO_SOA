package br.com.caelum.estoque.rmi;

import java.io.Serializable;

public class ItemEstoque implements Serializable {

	/**
	 * 
	 */
	// private static final long serialVersionUID = -8648799748985969989L;
	private static final long serialVersionUID = 1L;
	private String codigo;
	private Integer quantidade;

	public ItemEstoque(String codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemEstoque [codigo=" + codigo + ", quantidade=" + quantidade + "]";
	}

}
