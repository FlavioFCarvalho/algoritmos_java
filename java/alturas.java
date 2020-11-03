import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores, nmaiores65;
	    double alturatotal, alturamedia, percentualMenores, percentualMaiores65;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }

		nmenores = 0;
		nmaiores65 = 0;
		alturatotal = 0;
		percentualMaiores65 =0;
	    for (int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	            nmenores++;
	        }
	        if(idades[i] >= 65) {
	        	nmaiores65++;
	        }
	        alturatotal = alturatotal + alturas[i];
	    }

	    alturamedia = alturatotal / n;
	    percentualMenores = ((double)nmenores / n) * 100.0;
	    percentualMaiores65 =  ((double)nmaiores65 / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturamedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
	    System.out.printf("Pessoas maiores de 65 anos: %.1f%%\n", percentualMaiores65);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("Menores de idade: %s\n ", nomes[i]);
	        }
	    }

		sc.close();
	}
}
