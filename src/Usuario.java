import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private ArrayList<EscalaCampoHarmonico> escalaCampoHarmonicoUser;
	private String tomUser; //Tom que o usuário vai informar para gerar o campo
	private ArrayList<String> acordesTomGerado; //Acordes que o usuário vai escolher para trocar o tom;
	
	
	public Usuario() {
		this.nome = "";
		this.email = "";
		this.senha = "";
		this.escalaCampoHarmonicoUser.clear();
		this.tomUser = "";
		this.acordesTomGerado.clear();
	}
	
	
	
	//Get e Set
	public void setNome(String nome) {
		this.nome = nome; 
	}
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<EscalaCampoHarmonico> getEscalaCampoHarmonicoUser() {
		return escalaCampoHarmonicoUser;
	}
	public void setEscalaCampoHarmonicoUser(ArrayList<EscalaCampoHarmonico> escalaCampoHarmonicoUser) {
		this.escalaCampoHarmonicoUser = escalaCampoHarmonicoUser;
	}
	public String getTomUser() {
		return tomUser;
	}
	public void setTomUser(String tomUser) {
		this.tomUser = tomUser;
	}
	public ArrayList<String> getAcordesTomGerado() {
		return acordesTomGerado;
	}
	public void setAcordesTomGerado(ArrayList<String> acordesTomGerado) {
		this.acordesTomGerado = acordesTomGerado;
	}
		
	
}
