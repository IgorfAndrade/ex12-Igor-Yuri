package Busca_Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import ProdutoDTO;

public class ProdutoDAO {
	public List<ProdutoDTO> getProdutos(){
        Connection con;
		try {
			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\11204307\\produto");
			Statement sta = con.createStatement();
	        String sql = "select * from produtos";
			PreparedStatement comando = con.prepareStatement(sql);
			ResultSet resultado = comando.executeQuery();
			while(!resultado.next()){
				
			ProdutoDTO aux = new ProdutoDTO(n, c, p, dt, i)	
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        //TODO testar o resultado


        
   return resultado;     
	}
	
	public void insertProduto(){
		//TODO
		
	}
	
}