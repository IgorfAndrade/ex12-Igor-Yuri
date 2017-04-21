package Busca_Produtos;

public class ProdutoDTO {
	private int id;
	private String nome;
	private String dataInclusao;	
	private String categoria;
	private String local;
	private double preco;


	
	
	public ProdutoDTO(int i, String n, String dt, String c, String l, double p ){
		nome = n;
		categoria = c;
		preco = p;
		dataInclusao = dt;
		local = l;
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
	
	public String getLocal() {
		return local;
	}
	
	
}
