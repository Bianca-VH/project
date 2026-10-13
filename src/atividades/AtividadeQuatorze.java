package atividades;
import java.util.Random;
public class AtividadeQuatorze {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] num = new int[7];
		
		System.out.print("Números gerados: ");
		for(int i=0; i<num.length; i++) {
			num[i] = rand.nextInt(50)+1;
			System.out.print(num[i]+ " ");
		}
	}

}