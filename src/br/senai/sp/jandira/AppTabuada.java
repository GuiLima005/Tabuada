package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(44, 185, 204);
		tela.fonteDosLabels = new Font("Calibri", Font.BOLD, 15);
		tela.corDoBotao = new Color (140, 240, 250);
//		tela.corDeTextoDoBotao = new Color(0, 0, 0);
		tela.criarTela();
		
		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 2;
		tabuada.minimoMultiplicador = 8;
		tabuada.maximoMultiplicador = 14;
		
		String[] resultado = tabuada.getTabuada();
		
		int contador = 0;
		while (contador < resultado.length) {
			System.out.println(resultado[contador]);
			contador++;
		}
		
		System.out.println("------------Fim---------------");
		
	}
	
}
