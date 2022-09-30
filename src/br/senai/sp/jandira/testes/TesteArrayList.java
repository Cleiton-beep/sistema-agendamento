package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) { //arguments
		
//		// Vetor com 3 plano de saúde
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//		
//		PlanoDeSaude[] planos = {
//				plano1, 
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "Ouro")};
//		
//		
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//		
//		int[] notas = new  int[3];
//		notas[0] = 5;
//		notas[1] = 8;
//		notas[2] = 7;
//
//		int[] precos = {8, 10, 2, 5, 9, 28};
//		
//		// Utilização do ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuíba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.get(5));
//		
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		planos2.add(new PlanoDeSaude("Notredame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//	
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//		
//		planos2.add(planoNovo);
//		
//		// Adicionar o tipo do plano no plano Notredame
//		planos2.get(0).setTipoDoPlano("Basic");
//		
//		System.out.println(planos2.get(4).getDadosDoPlano());
//		System.out.println(planos2.get(0).getDadosDoPlano());
//	
//		Integer nota = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precoList = new ArrayList<>();
//		precoList.add(5.9);
	
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "AdvancedArray");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		int i = 0;
		
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		System.out.println("Saiu do looping!!");
		
		// Looping FOR
//		for(contador;condição;acumulador) {
//			
//		}
		System.out.println("----------------- UTILIZANDO FOR -------------------");
		for(int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		System.out.println("------------ FOR EACH - PARA CADA ---------------");
		// Iteração em listas - ArrayList<>
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		// Criar 3 especialidades, guardar as especialidades em um arraylist
		// e exibir o nome das especialidades usando for each
		
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração.");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Otorrino");
		e2.setDescricao("Cuida do ouvido.");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos ossos e músculos.");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		
		for(Especialidade e : especialidades) {
			System.out.printf("%s --> %s\n", e.getNome(), e.getDescricao());
		}
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO(plano1);
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
	}

}
