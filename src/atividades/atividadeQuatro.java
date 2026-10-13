package atividades;

public class atividadeQuatro {

	public static void main(String[] args) {
		// Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:
		//0 a 9 (5 e 3)
		
		int vet[] = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			
			if(i%2 == 0) {
				vet[i] = 5;
			}else {
				vet[i] = 3;
			}
		}

	}

}