package atividades;
import java.util.Scanner;
public class atividadeNove {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double[] altura = new double[10];
		String[] gen = new String[10];
		
		//entrada altura
		for(int i=0; i<=9; i++) {
			System.out.print("Digite a altura "+(i+1)+": ");
			altura[i]=tec.nextDouble();
			
			tec.nextLine();
			
			System.out.print("Digite o sexo (M/F) "+(i+1)+": ");
			gen[i] = tec.nextLine().trim().toUpperCase();
		}
		
		int sexF = 0, sexM = 0;
		double maiorAlt = altura[0];
		String maiorGen = gen[0];
		
		for(int i=0; i<=9; i++) {
			if(gen[i].equals("M")){
				sexM++;
			} else if(gen[i].equals("F")) {
				sexF++;
			}

			if(altura[i] > maiorAlt) {
				maiorAlt = altura[i];
				maiorGen = gen[i];
			}
		}
		
		System.out.println("\nQuantidade de homens: "+sexM);
		System.out.println("Quantidade de mulheres: "+sexF);
		System.out.printf("Maior altura: %.2f%n", maiorAlt);
		System.out.printf("Sexo da pessoa mais alta: "+ maiorGen);
	}

}