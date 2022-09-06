package br.senai.sp.jandira.model;

public class Tabuada {

	// Resolução da tabuada
	
			public int multiplicando;
			public int minimoMultiplicador;
			public int maximoMultiplicador;
			
			public String[] getTabuada() {
				
				int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
				String tabuada[] = new String[tamanho];
				
				int contador = 0;
				
				while(contador < tamanho) {
					
				   int produto = multiplicando * minimoMultiplicador;
				   // 2 X 8 = 16
				   
				   String resultado = multiplicando + " X " + minimoMultiplicador + " = " + produto;
				   tabuada[contador] = resultado;
				   
				   contador++;
				   minimoMultiplicador++;
					
				}
				
				return tabuada;
			}

}
