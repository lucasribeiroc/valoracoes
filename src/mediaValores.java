
public class mediaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] valorAcao = new double [28];
		valorAcao[0] = 9.60;
		valorAcao[1] = 7.63;
		valorAcao[2] = 10.89;
		valorAcao[3] = 32.76;
		valorAcao[4] = 73.30;
		valorAcao[5] = 37.84;
		valorAcao[6] = 12.33;
		valorAcao[7] = 14.56;
		valorAcao[8] = 11.32;
		valorAcao[9] = 54.88;
		valorAcao[10] = 41.38;
		valorAcao[11] = 13.62;
		valorAcao[12] = 3.32;
		valorAcao[13] = 4.50;
		valorAcao[14] = 21.80;
		valorAcao[15] = 119.78;
		valorAcao[16] = 55.00;
		valorAcao[17] = 67.12;
		valorAcao[18] = 56.42;
		valorAcao[19] = 32.00;
		valorAcao[20] = 84.50;
		valorAcao[21] = 93.62;
		valorAcao[22] = 109.76;
		valorAcao[23] = 200.70;
		valorAcao[24] = 107.02;
		valorAcao[25] = 16.73;
		valorAcao[26] = 82.60;
		valorAcao[27] = 2.62;
		
		double mediaMensal = 0;
			for (int i = 0; i < valorAcao.length; i++) {
			mediaMensal += valorAcao[i];
			}
			
		double mediaPrimeiraSemana = (valorAcao[0] + valorAcao[1] + valorAcao[2] + valorAcao[3] + valorAcao[4] + valorAcao[5] + valorAcao[6]) / 7;
		double mediaSegundaSemana = (valorAcao[7] + valorAcao[8] + valorAcao[9] + valorAcao[10] + valorAcao[11] + valorAcao[12] + valorAcao[13]) / 7;
		double mediaTerceiraSemana = (valorAcao[14] + valorAcao[15] + valorAcao[16] + valorAcao[17] + valorAcao[18] + valorAcao[19] + valorAcao[20]) / 7;
		double mediaQuartaSemana = (valorAcao[21] + valorAcao[22] + valorAcao[23] + valorAcao[24] + valorAcao[25] + valorAcao[26] + valorAcao[27]) / 7;

		double maiorMedia = 0.0;
		double menorMedia = 100;
		
		if(mediaPrimeiraSemana > mediaSegundaSemana) {
			menorMedia = mediaSegundaSemana;
		}
		
		if(mediaTerceiraSemana < mediaQuartaSemana) {
			maiorMedia = mediaQuartaSemana;
		}
		
		double totalMensal = (double)mediaMensal / (double)valorAcao.length;
		
		System.out.printf("A média dos valores das ações do último mês é de: %.2f %n", (totalMensal));
		System.out.printf("A média dos valores das ações da primeira semana é de: %.2f %n", (mediaPrimeiraSemana));
		System.out.printf("A média dos valores das ações da segunda semana é de: %.2f %n", (mediaSegundaSemana));
		System.out.printf("A média dos valores das ações da terceira semana é de: %.2f %n", (mediaTerceiraSemana));
		System.out.printf("A média dos valores das ações da quarta semana é de: %.2f %n" , (mediaQuartaSemana));
		System.out.printf("A maior média entre as 4 semanas foi: %.2f %n", (maiorMedia));
		System.out.printf("A menor média entre as 4 semanas foi: %.2f", (menorMedia));
	}

}
