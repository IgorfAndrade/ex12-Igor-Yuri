package Busca_Produtos;

public class ProdutoDTO {
	private int id;
	private String nome;
	private String dataInclusao;	
	private String categoria;
	private String local;
	private Double preco;

	
	/*@ requires i != null && i >= 1;
	  @ requires n != null && n != (""); 
	  @ requires dt != null && dt != (""); 
	  @ requires c != null && c != (""); 
	  @ requires l != null && l != (""); 
	  @ requires p != null && p >= 0.01;
	 */ 	
	public ProdutoDTO(int i, String n, String dt, String c, String l, Double p ){
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

	public Double getPreco() {
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

	@Override
	public String toString() {
		return "ProdutoDTO [id=" + id + ", nome=" + nome + ", dataInclusao=" + dataInclusao + ", categoria=" + categoria
				+ ", local=" + local + ", preco=" + preco + "]";
	}
	
	
}
