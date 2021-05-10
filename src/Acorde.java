import java.util.ArrayList;

public class Acorde {

	private ArrayList<EscalaCromatica> escalaCromatica ;
	private boolean bemol;
	private boolean menor;
	private boolean diminuta;
	private Usuario tomUsuario; //Recebe tom que o user digitou
	
	
	public Acorde() {
		this.escalaCromatica.clear();//Perguntar professor
		this.bemol = false;
		this.menor = false;
		this.diminuta = false;
		this.tomUsuario.getTomUser();		
	}


	
	//Get e Set
	public ArrayList<EscalaCromatica> getEscalaCromatica() {
		return escalaCromatica;
	}


	public void setEscalaCromatica(ArrayList<EscalaCromatica> escalaCromatica) {
		this.escalaCromatica = escalaCromatica;
	}


	public boolean isBemol() {
		return bemol;
	}


	public void setBemol(boolean bemol) {
		this.bemol = bemol;
	}


	public boolean isMenor() {
		return menor;
	}


	public void setMenor(boolean menor) {
		this.menor = menor;
	}


	public boolean isDiminuta() {
		return diminuta;
	}


	public void setDiminuta(boolean diminuta) {
		this.diminuta = diminuta;
	}


	public Usuario getTomUsuario() {
		return tomUsuario;
	}


	public void setTomUsuario(Usuario tomUsuario) {
		this.tomUsuario = tomUsuario;
	}
	
		
}
