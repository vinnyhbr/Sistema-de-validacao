package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {} 
	
	static void imprimirSelecionados() {
		//comming soon
	}
	
	static void selecaoCandidatos() {	
		String [] candidatos = {"ANA","MARCELO", "JOAO", "MARCOS", "MARIA", "JOSE", "VITOR", "VANESSA", "JOEL", "LAURA"};
	
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5  && candidatoAtual < candidatos.length) {
		String candidato = candidatos[candidatoAtual];
		double salarioPretendido = valorPretendido();
		
		System.out.println("O candidato" + candidato + "Solicitou este valor de salario" + salarioPretendido);
		if (salarioBase >= salarioPretendido) {
			candidatosSelecionados++;
			System.out.println("O candidato"+ candidato + "foi selecionado para a vaga");
		}
		candidatoAtual++;
	 }
		}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido ) {
			System.out.println("LIGAR PARA CANDIDATO!");
			}
		
		else if (salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDADO COM CONTRA PROPOSTA");
			}
		
		else{
			System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
		}
		
	}
	}