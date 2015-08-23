package br.com.uol.exercicio1;

public class Exercicio1 implements Solution{

	@Override
	public boolean isUnique(String input) {
		int repetidos = 0;
		for (int i = 0; i < input.length(); i++) {
			char ponteiro1 = input.charAt(i);
			
			for (int j = 0; j < input.length(); j++) {
				char ponteiro2 = input.charAt(j);
				
				if( ponteiro1 == ponteiro2 ){
					repetidos++;
				}
			}
			if(repetidos>1){
				return false;
			}else{
				repetidos = 0;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input1 = "abcde";
		String input2 = "abcbe";
		System.out.println( new Exercicio1().isUnique(input1) );
		System.out.println( new Exercicio1().isUnique(input2) );
	}

}
