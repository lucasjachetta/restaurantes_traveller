package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import model.Restaurantes;

public class RestauranteDAO implements DAO<Restaurantes>{

	private DataSource dataSource;
	
	public RestauranteDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}
	
    /* --- metodo READ --- */
	@Override
	public Restaurantes read(Restaurantes object) {
		// TODO Auto-generated method stub
		try {
// declaro a STRING SQL correspondente ao comando
// substituindo os valores pelo caractere “?”
			String SQL = "SELECT * FROM RESTAURANTES";
// gero o Statement a partir da conexao
			PreparedStatement stm = 
  					dataSource.getConnection()
         .prepareStatement(SQL);

			stm.setString(1, object.getNome_Restaurante());
			stm.setString(2, object.getEndereco());

			ResultSet rs = stm.executeQuery();


			if (rs.next()) {
				Restaurantes restaurante = new Restaurantes(0, SQL, SQL, 0, SQL, SQL, SQL, SQL, SQL);
				restaurante.setNome_Restaurante(rs.getString("Nome"));
				restaurante.setEndereco(rs.getString("Endereço"));
				restaurante.setAvaliacao(rs.getInt("Avaliação"));
				restaurante.setTelefone(rs.getString("Telefone"));
				restaurante.setTipo_Comida(rs.getString("Tipo de Comida"));
				restaurante.setSite(rs.getString("Site"));
				restaurante.setFuncionamento(rs.getString("Funcionamento"));
				restaurante.setFaixa_Preco(rs.getString("Faixa de Preço"));


				return restaurante;
			}
			else {
				return null;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("UsuarioDAO.READ = "+
                    ex.getMessage());
		}
		return null;
	}

	@Override
	public void create(Restaurantes object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Restaurantes object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delet(Restaurantes object) {
		// TODO Auto-generated method stub
		
	}

}