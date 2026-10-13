package aulas;
public class AulaArray {

	public static void main(String[] args) {
		double[] alturas = new double[3];
		
		alturas[0] = 1.72;
		alturas[1] = 2.03;
		alturas[2] = 0.8;
		
		//System.out.println(alturas[0]);
		
		//for (int i = 0; i <= 2; i++) {
		//	System.out.println("Altura: " + alturas[i]);
		//}

		for (double alt : alturas) {
			System.out.println(alturas);
		}
	}
}