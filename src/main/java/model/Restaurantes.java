package model;

public class Restaurantes{
	private int id_restaurante;
	private String Nome_Restaurante;
	private String Endereco;
	private int Avaliacao;
	private String Telefone;
	private String Tipo_Comida;
	private String Site;
	private String Funcionamento;
	private String Faixa_Preco;
	
	
	
	
	
	public Restaurantes(int id_restaurante, String nome_Restaurante, String endereco, int avaliacao, String telefone,
			String tipo_Comida, String site, String funcionamento, String faixa_Preco) {
		super();
		this.id_restaurante = id_restaurante;
		Nome_Restaurante = nome_Restaurante;
		Endereco = endereco;
		Avaliacao = avaliacao;
		Telefone = telefone;
		Tipo_Comida = tipo_Comida;
		Site = site;
		Funcionamento = funcionamento;
		Faixa_Preco = faixa_Preco;
	}
	public int getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(int id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	public String getNome_Restaurante() {
		return Nome_Restaurante;
	}
	public void setNome_Restaurante(String nome_Restaurante) {
		Nome_Restaurante = nome_Restaurante;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public int getAvaliacao() {
		return Avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		Avaliacao = avaliacao;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getTipo_Comida() {
		return Tipo_Comida;
	}
	public void setTipo_Comida(String tipo_Comida) {
		Tipo_Comida = tipo_Comida;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public String getFuncionamento() {
		return Funcionamento;
	}
	public void setFuncionamento(String funcionamento) {
		Funcionamento = funcionamento;
	}
	public String getFaixa_Preco() {
		return Faixa_Preco;
	}
	public void setFaixa_Preco(String faixa_Preco) {
		Faixa_Preco = faixa_Preco;
	}
	
	
}