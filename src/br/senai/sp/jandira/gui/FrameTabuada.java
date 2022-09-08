package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.AppTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoBotao;
	public Color corDoBotao2;
//	public Color corDeTextoDoBotao;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);										
		
		// Obter a instância do painel de conteúdo(container)
		Container painel = tela.getContentPane();
	
		// Crias os componentes da tela e colocar no painel(container)
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(70, 10, 600, 30);
		labelTabuada.setFont(new Font("Inter", Font.BOLD, 25));
		labelTabuada.setForeground(Color.red);
		
		JLabel labelTexto = new JLabel();
		labelTexto.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!\r\n"+ "");
		labelTexto.setBounds(70, 45, 600, 30);
		labelTexto.setFont(new Font("Calibri", Font.BOLD, 12));
//		labelTexto.setForeground(Color.black);
		
//		JLabel labelIcon = new JLabel();
//		labelIcon.setIcon("");
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(121, 100, 600, 30);
		labelMultiplicando.setFont(fonteDosLabels);
		labelMultiplicando.setForeground(Color.black);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(250, 100, 200, 30);
		
		JLabel labelminimoMultiplicador = new JLabel();
		labelminimoMultiplicador.setText("Mínimo Multiplicador:");
		labelminimoMultiplicador.setBounds(70, 150, 600, 30);
		labelminimoMultiplicador.setFont(fonteDosLabels);
		labelminimoMultiplicador.setForeground(Color.black);
		
		JTextField textFieldminimoMultiplicador = new JTextField();
		textFieldminimoMultiplicador.setBounds(250, 150, 200, 30);
		
		JLabel labelmaximoMultiplicador = new JLabel();
		labelmaximoMultiplicador.setText("Máximo Multiplicador:");
		labelmaximoMultiplicador.setBounds(70, 200, 600, 30);
		labelmaximoMultiplicador.setFont(fonteDosLabels);
		labelmaximoMultiplicador.setForeground(Color.black);
		
		JTextField textFieldmaximoMultiplicador = new JTextField();
		textFieldmaximoMultiplicador.setBounds(250, 200, 200, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(70, 250, 200, 30);
		buttonCalcular.setBackground(corDoBotao);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(300, 250, 150, 30);
		buttonLimpar.setBackground(corDoBotao2);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(70, 290, 600, 30);
		labelResultado.setFont(fonteDosLabels);
		labelResultado.setForeground(Color.black);
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("calculadora.png"));
		JLabel icon = new JLabel(imagem);
		icon.setBounds(30, 70, 30, 30);
		
		//Lista da tabuada
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		
		scroll.setBounds(70, 320, 470, 220);
		
		// Eventos de click
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minimoMultiplicador = Integer.parseInt(textFieldminimoMultiplicador.getText());
				tabuada.maximoMultiplicador = Integer.parseInt(textFieldmaximoMultiplicador.getText());
				
				String[] resultado = tabuada.getTabuada();
				lista.setListData(resultado);
				
				scroll.setVisible(true);
				
			}
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				scroll.setVisible(false);
				textFieldMultiplicando.setText("");
				textFieldminimoMultiplicador.setText("");
				textFieldmaximoMultiplicador.setText("");
				
			}
		});
		
		
		
		// Adicionar componentes ao painel(container)
		painel.add(labelTabuada);
		painel.add(labelTexto);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelminimoMultiplicador);
		painel.add(textFieldminimoMultiplicador);
		painel.add(labelmaximoMultiplicador);
		painel.add(textFieldmaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(icon);
		
		
		
		tela.setVisible(true);
		
	}

	
}
