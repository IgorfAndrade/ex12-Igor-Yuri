package Busca_Produtos;

public class Main {

	public static void main(String[] args) {
	ProdutoDAO prod = new ProdutoDAO();
        ArrayList<PrudutoDTO> prodCad = prod.getProdutos();
		
		for (int i = 1; i<= prodCad.size(); i++){
			
			System.out.print(prodCad.get(i).toString());
		}
	}

}
