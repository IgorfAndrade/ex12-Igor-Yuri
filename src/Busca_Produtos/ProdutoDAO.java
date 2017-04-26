package Busca_Produtos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	public List<ProdutoDTO> getProdutos(){
        Connection con;
		ArrayList<ProdutoDTO> produtos = new ArrayList<ProdutoDTO>();
		try {
			con = DriverManager.getConnection("jdbc:derby:C:\\Users\\11204307\\produto");
			Statement sta = con.createStatement();
	        String sql = "select * from produtos";
			PreparedStatement comando = con.prepareStatement(sql);
			ResultSet resultado = comando.executeQuery();

			while(resultado.next())
			{
				int i 		= resultado.getInt(1);
             	String n	= resultado.getString(2);
				String d 	= resultado.getString(3);
				String l 	= resultado.getString(4);
				String c 	= resultado.getString(5);
				double p 	= resultado.getDouble(6);
				
			ProdutoDTO aux = new ProdutoDTO(i, n, d, l, c,p);	
			produtos.add(aux);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produtos;
	}

	
}