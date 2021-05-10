import java.util.ArrayList;

public class EscalaCampoHarmonico {
	
	private ArrayList<Acorde> sequenciaAcordes;
	private ArrayList<Usuario> acordesUser;
	
	public EscalaCampoHarmonico() {
		this.sequenciaAcordes = new ArrayList<Acorde>();
		this.acordesUser = new ArrayList<Usuario>();
	}

	
	
	//get e set
	public ArrayList<Acorde> getSequenciaAcordes() {
		return sequenciaAcordes;
	}

	public void setSequenciaAcordes(ArrayList<Acorde> sequenciaAcordes) {
		this.sequenciaAcordes = sequenciaAcordes;
	}

	public ArrayList<Usuario> getAcordesUser() {
		return acordesUser;
	}

	public void setAcordesUser(ArrayList<Usuario> acordesUser) {
		this.acordesUser = acordesUser;
	}
	
	
	
	
}
