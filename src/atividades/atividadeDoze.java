package atividades;
import java.util.Scanner;
public class atividadeDoze {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int[] num = new int[5];
		int pares;
		
		for(int i=0;i<4;i++){
			System.out.print("Digite um número par "+(i+1)+": ");
			num[i]=tec.nextInt();
			
			if(num[i]%2==0) {
				pares = num[i];
			}else {
				System.out.print("Número inválido, digite um número par: ");
				i--;
			}
		}
		
		System.out.println("\nResultado:");
		for(int i=0;i<4;i++){
		System.out.println("Números pares digitados: "+num[i]);
		}
	}
}