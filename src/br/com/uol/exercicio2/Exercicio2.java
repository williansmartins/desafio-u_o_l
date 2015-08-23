package br.com.uol.exercicio2;

import java.util.Arrays;

public class Exercicio2 implements Solution{

	@Override
	public int candy(int[] ratings) {
		//ordenar as notas
		Arrays.sort(ratings);
		
		//distribuir as balas
		int entrega = 1;
		int quantidadeDeBalas = 0;
		int notaAtual, notaProxima;
		
		for (int i = 0; i < ratings.length; i++) {
			notaAtual = ratings[i];
			
			//distribui
			quantidadeDeBalas += entrega;
			
			//verifica se tem que aumentar a quantidade
			if(i < ratings.length-1){
				notaProxima = ratings[i+1];
			}else{
				break;
			}
			if(notaAtual != notaProxima ){
				entrega++;
			}
		}
		return quantidadeDeBalas;
	}
	
	public static void main(String[] args) {
		int[] ratings1 = {8, 6, 9, 6};
		int[] ratings2 = {1, 1, 1};
		int[] ratings3 = {1, 0, 0, 0};
		
		System.out.println("A professora deverá distribuir: " + new Exercicio2().candy(ratings1) + " doces.");
		System.out.println("A professora deverá distribuir: " + new Exercicio2().candy(ratings2) + " doces.");
		System.out.println("A professora deverá distribuir: " + new Exercicio2().candy(ratings3) + " doces.");
	}
	
}
