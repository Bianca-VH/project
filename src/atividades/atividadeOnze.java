package atividades;
import java.util.Scanner;
public class atividadeOnze {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] idade = new int[10];
		int qtdPess = 0;
		
		for(int i=0; i<idade.length; i++) {
			System.out.print("Digite idade "+(i+1)+": ");
			idade[i] = tec.nextInt();
			
			if(idade[i] > 30) {
				qtdPess++;
			}
		}
		
		System.out.print("Quantidade de pessoas com mais de 30 anos: "+qtdPess);

	}

}