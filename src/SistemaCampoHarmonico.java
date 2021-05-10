
public class SistemaCampoHarmonico {
	
	private EscalaCromatica escalaCromatica;
	private Acorde acorde;
	private EscalaCampoHarmonico escalaCampoHarmonico;
	private RelativaCampoHarmonico relativaCampoHarmonico;
	private Usuario usuario;

	public SistemaCampoHarmonico() {
		
	}
	
	public void cadastrarAluno(String userName, String senha, String email) {
		Usuario user = new Usuario();
		
		user.setNome(userName); 
		user.setSenha(senha);
		user.setEmail(email);
		
	}
	
	
	
	//Get e Set
	public EscalaCromatica getEscalaCromatica() {
		return escalaCromatica;
	}

	public void setEscalaCromatica(EscalaCromatica escalaCromatica) {
		this.escalaCromatica = escalaCromatica;
	}

	public Acorde getAcorde() {
		return acorde;
	}

	public void setAcorde(Acorde acorde) {
		this.acorde = acorde;
	}

	public EscalaCampoHarmonico getEscalaCampoHarmonico() {
		return escalaCampoHarmonico;
	}

	public void setEscalaCampoHarmonico(EscalaCampoHarmonico escalaCampoHarmonico) {
		this.escalaCampoHarmonico = escalaCampoHarmonico;
	}

	public RelativaCampoHarmonico getRelativaCampoHarmonico() {
		return relativaCampoHarmonico;
	}

	public void setRelativaCampoHarmonico(RelativaCampoHarmonico relativaCampoHarmonico) {
		this.relativaCampoHarmonico = relativaCampoHarmonico;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
