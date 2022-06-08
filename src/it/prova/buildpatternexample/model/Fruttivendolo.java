package it.prova.buildpatternexample.model;

public class Fruttivendolo {
	private Long id;
	private String nome;
	private String cognome;
	private int stipendio;

	public Fruttivendolo() {

	}

	public Fruttivendolo(Long id, String nome, String cognome, int stipendio) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Fruttivendolo [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", stipendio=" + stipendio + "]";
	}
	
	
}
