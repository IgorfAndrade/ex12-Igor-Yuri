package Busca_Produtos;

public class ProdutoDTO {

	private String nome;
	private String categoria;
	private double preco;
	private String dataInclusao;
	private int id;
	
	public ProdutoDTO(String n, String c, double p, String dt, int i){
		nome = n;
		categoria = c;
		preco = p;
		dataInclusao = dt;
		id = i;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPreco() {
		return preco;
	}

	public String getDataInclusao() {
		return dataInclusao;
	}

	public int getId() {
		return id;
	}
	
	
}
