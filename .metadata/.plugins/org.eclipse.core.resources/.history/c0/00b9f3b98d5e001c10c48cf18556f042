package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Exodia");
		listaEmpresa.add(empresa1);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Kaiba");
		
		listaEmpresa.add(empresa2);
	}

	public void adicionaEmpresa(Empresa empresa) {
		listaEmpresa.add(empresa);
		
	}

	public static List<Empresa> getListaEmpresa() {
		return Banco.listaEmpresa;
	}

	
	

}
