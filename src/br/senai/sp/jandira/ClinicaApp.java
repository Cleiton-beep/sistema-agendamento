package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		// Especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao("Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos.");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");
		
		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínica geral");
		
		// Plano
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.setTipoDoPlano("Bronze");
		
		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Bradesco");
		plano2.setTipoDoPlano("Ouro");
		
		//Endereços
		
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumeroFundos("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setComplemento("Escola");
		endereco1.setPontoDeReferencia("Em frente á prefeitura.");
		endereco1.setCep("06600-025");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av. Barão de Limeira");
		endereco2.setNumeroFundos("158");
		endereco2.setBairro("Santa Cecília");
		endereco2.setCidade("São Paulo");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Escola");
		endereco2.setCep("06658-006");
		
		// Médicos
		Medico medico1 = new Medico();
		medico1.setNome("Ana Paula");
		medico1.setCrm("8956-98");
		medico1.setSexo("Feminino");
		medico1.setDataDeNascimento(LocalDate.of(1997, 5, 15));
		
		// A Dra. Ana é Clínica Geral e Fisioterapeuta
		Especialidade[] especialidades1 = {especialidade3, especialidade5};
		medico1.setEspecialidades(especialidades1);
		
//		System.out.println(especialidade3.getNome());
//		System.out.println(especialidades[0].getNome());
//		System.out.println(especialidades[0].getDescricao());
		
		// Criar o Dr. Pedro Oliveira, nascido em 20/08/1984 e
		// que trabalha com cardiologia, fiioterapia e clínica geral
		Medico medico2 = new Medico();
		medico2.setNome("Pedro Oliveira");
		medico2.setCrm("1234-5");
		medico2.setSexo("Masculino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20));
		
		Especialidade[] especialidades2 = {
				especialidade1, 
				especialidade3, 
				especialidade5
				};
		medico2.setEspecialidades(especialidades2);
		
		//	Criar 2 pacientes, um que mora no endereço1
		// e outro no endereço2. pode ser você,
		// e o outro o seu colega
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Pedro alvares Cabral");
		paciente1.setEmail("PedrinhoAlvares@gmail.com");
		paciente1.setRg("48.151.623-42");
		paciente1.setCpf("451.423.909.36");
		paciente1.setTelefone("(11)91645-7892");
		paciente1.setGenero(Genero.MASCULINO);
		paciente1.setTipoSanguineo("O+");
		paciente1.setPlanoDeSaude(plano1);
		paciente1.setEndereco(endereco1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Jose Fernando");
		paciente2.setEmail("JoseFernando@gmail.com");
		paciente2.setRg("38.176.474-12");
		paciente2.setCpf("736.250.434.24");
		paciente2.setTelefone("(41)91365-7269");
		paciente2.setGenero(Genero.MASCULINO);
		paciente2.setTipoSanguineo("AB-");
		paciente2.setPlanoDeSaude(plano2);
		paciente2.setEndereco(endereco2);
		
		// Exibir os dados dos pacientes:
		// nome:
		// Cidade:
		// Estado:
		// Telefone:
		// Operadora do plano de Saúde
		
//		System.out.println("Nome: " + paciente1.getNome());
//		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
//		System.out.println("Estado: " + paciente1.getEndereco().getEstado());
//		System.out.println("Telefone: " + paciente1.getTelefone());
//		System.out.println("Operadora do Plano de Saúde: " + paciente1.getPlanoDeSaude().getOperadora());
//		System.out.println("--------------------------------------------------------");
//		System.out.println("Nome: " + paciente2.getNome());
//		System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
//		System.out.println("Estado: " + paciente2.getEndereco().getEstado());
//		System.out.println("Telefone: " + paciente2.getTelefone());
//		System.out.println("Operadora do Plano de Saúde: " + paciente2.getPlanoDeSaude().getOperadora());
	
		// Fazer um agendamento de consulta para o paciente1
		// O paciente1 precisa passar com um Clínico geral
		// No dia 22/09/2022, ás 15h25
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade5);
		agenda1.setMedico(medico2);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
		agenda1.setObservacao("Paciente reclamando de dor nas costas.");
		
		// Exibir os dados do agendamento
		// Nome do paciente:
		// Especialidade:
		// Nome do médico:
		// Data e hora do atendimento:
		// Observações:
		// Plano de saúde:
		
		System.out.println();
		System.out.println("---------------------AGENDA1---------------------");
		System.out.println("Nome do paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Nome do Médico: " + agenda1.getMedico().getNome());
		System.out.println("Data do atendimento: " + agenda1.getDataDaConsulta() + " - " +  agenda1.getHoraDaConsulta());
		System.out.println("Observações: " + agenda1.getObservacao());
		System.out.println("Plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade1);
		agenda2.setMedico(medico2);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda2.setHoraDaConsulta(LocalTime.of(15, 25));
		agenda2.setObservacao("Paciente tossindo muito.");
		
		System.out.println();
		System.out.println("---------------------AGENDA2---------------------");
		System.out.println("Nome do paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Nome do Médico: " + agenda2.getMedico().getNome());
		System.out.println("Data do atendimento: " + agenda2.getDataDaConsulta() + " - " +  agenda1.getHoraDaConsulta());
		System.out.println("Observações: " + agenda2.getObservacao());
		System.out.println("Plano de saúde: " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());
	}

}
