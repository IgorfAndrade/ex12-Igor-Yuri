package Busca_Produtos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ProdutoDAO prod = new ProdutoDAO();
        ArrayList<ProdutoDTO> prodCad = (ArrayList<ProdutoDTO>) prod.getProdutos();
		
		for (ProdutoDTO c : prodCad){
			
			System.out.println(c.toString());
		}
	}

}
