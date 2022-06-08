package it.prova.buildpatternexample;

import it.prova.buildpatternexample.buildpattern.FruttivendoloBuilder;
import it.prova.buildpatternexample.model.Fruttivendolo;

public class TestFruttivendolo {
	public static void main(String[] args) {

		Fruttivendolo fruttivendoloBuilded = FruttivendoloBuilder.newBuilder(1L).nome("mario").cognome("fruttirossi")
				.stipendio(1200).build();
		
		System.out.println(fruttivendoloBuilded);

	}
}
