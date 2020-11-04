package br.com.caelum.estoque.ws;

public class ItemEstoque {
	private String codigo;
	private Integer quantidade;

	public ItemEstoque() {
		// TODO Auto-generated constructor stub
	}

	public ItemEstoque(String codigo, Integer quantidade) {
		super();
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

}
