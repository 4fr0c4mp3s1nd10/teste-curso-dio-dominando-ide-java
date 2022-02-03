package com.dio;

import br.com.dio.Gata;

public class PrimeiroProgramaJavaEclipse {

	public static void main(String[] args) {
	Gata gata = new Gata();
	Livros livros = new Livros();
	
	System.out.println(gata);
	System.out.println(livros);
	
	}	
		/*int a = 2;
		int b = 3;
		
		System.out.println("Hello world! " + (a+b) );*/
	}



class Livros {
	private String nome;
	private String npag;
}