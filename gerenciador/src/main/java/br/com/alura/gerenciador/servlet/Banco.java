package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresa = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Exodia");
		empresa1.setId(chaveSequencial++);
		listaEmpresa.add(empresa1);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Kaiba");
		empresa2.setId(chaveSequencial++);
		listaEmpresa.add(empresa2);
	}

	public void adicionaEmpresa(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		listaEmpresa.add(empresa);
		
	}

	public static List<Empresa> getListaEmpresa() {
		return Banco.listaEmpresa;
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresa.iterator();
		
		while(it.hasNext()){
			Empresa empresa = it.next();
			if(empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscapeloid(Integer id) {
		for(Empresa empresa: listaEmpresa) {
			
			if(empresa.getId() == id) {
				return empresa;
			}
			
	}
		
		return null;
	}



	
	

}
