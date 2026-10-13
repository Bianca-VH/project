package atividades;

public class atividadeDois {

	public static void main(String[] args) {
		//Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:
		//0 a 9 (5 a 50)
		
		int vet [ ] = new int[10];
		int cont = 5;
		
		for(int i = 0; i <= 9; i++) {
			vet[i] = cont;
			cont += 5;
			
			System.out.println(vet[i]);
		}

	}

}