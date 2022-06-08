package it.prova.buildpatternexample.buildpattern;

import it.prova.buildpatternexample.model.Fruttivendolo;

public class FruttivendoloBuilder {

	private Long id;
	private String nome;
	private String cognome;
	private int stipendio;

	public FruttivendoloBuilder(Long id) {
		this.id = id;
	}

	public FruttivendoloBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public FruttivendoloBuilder cognome(String cognome) {
		this.cognome = cognome;
		return this;
	}

	public FruttivendoloBuilder stipendio(int stipendio) {
		this.stipendio = stipendio;
		return this;
	}
	
	public Fruttivendolo build() {
		return new Fruttivendolo(id, nome, cognome, stipendio);
	}
	
	public static FruttivendoloBuilder newBuilder(Long id) {
		return new FruttivendoloBuilder(id);
	}
}
