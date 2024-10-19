package com.unu.proyecto2.models;
import java.util.ArrayList;
import java.util.List;

import com.unu.proyecto2.beans.Autor;
public class AutoresModel {
	
	
	public List<Autor> listaAutores(){
		ArrayList<Autor> autores=new ArrayList<>();
		autores.add(new Autor(1, "Garcia Marquez", "Colombia"));
		autores.add(new Autor(2, "Borges", "Argentina"));
		autores.add(new Autor(3, "Allende", "Chilena"));
		return autores;
	}
}
