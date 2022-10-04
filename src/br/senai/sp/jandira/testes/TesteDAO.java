package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDAO {

    public static void main(String[] args) {

        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "AdvancedArray");
        PlanoDeSaude plano5 = new PlanoDeSaude();

        System.out.println(PlanoDeSaude.getContador());

        System.out.println(plano1.getCodigo());
        System.out.println(plano5.getCodigo());

        PlanoDeSaudeDAO.gravar(plano1);
        PlanoDeSaudeDAO.gravar(plano2);
        PlanoDeSaudeDAO.gravar(plano3);
        PlanoDeSaudeDAO.gravar(plano4);
        PlanoDeSaudeDAO.gravar(plano5);

        //eu quero criar um plano de saude para cada plano que estiver na lista
        System.out.println("--------------------------------------------------");
        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
            System.out.println("codigo: " + p.getCodigo());
            System.out.println("operadora: " + p.getOperadora());
            System.out.println("----------------------------------------------");
        }

//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		
//		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
//		dao2.gravar(plano3);
//		dao2.gravar(plano4);
//		
//		System.out.println("---------------------------");
//		for(PlanoDeSaude plano : dao.listarTodos()) {
//			System.out.println(plano.getOperadora());
//		}
//		
    }

}
