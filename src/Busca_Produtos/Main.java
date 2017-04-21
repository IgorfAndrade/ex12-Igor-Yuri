package Busca_Produtos;

public class Main {

	public static void main(String[] args) {
	ProdutoDAO prod = new ProdutoDAO();
	System.out.print(prod.getProdutos().toString());
	
	}

}
