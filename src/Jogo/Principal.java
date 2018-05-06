package Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
 public static void main(String [] args) {
	 //System.out.println("Nada criado.");
	 Scanner leitor = new Scanner(System.in);
	 int millis = 0;
	 
	 Mago mago = new Mago("Mithandir", "Humana", 150.0f); 
	 Ninja ninja = new Ninja("Kusanagi", "Humana", 120.0f);
	 Cavaleiro cavaleiro = new Cavaleiro("Miliardo", "Humana", 200.0f);
	 Barbaro barbaro = new Barbaro("Bravok", "Humana", 300.0f);
	 Lutador lutador1 = mago;
	 Lutador lutador2 = ninja;
	 Lutador lutador3 = cavaleiro;
	 Lutador lutador4 = barbaro;
	 
	 ArrayList<Lutador> lutadores1 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores2 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores3 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores4 = new ArrayList<Lutador>();
	 
	 Fera fera1 = new Fera("Warg", "Lobo", 150.0f);
	 ArrayList<Fera> monstros = new ArrayList<Fera>();
	 monstros.add(fera1);

	 //Magia magia1 = new Magia(5.0f, "firega");
	 //Magia magia2 = new Magia(4.0f,"trundaga");
	 ArrayList<Magia>magia = new ArrayList<Magia>();
	 //magia.add(magia1);
	 //magia.add(magia2);
	 
	 lutadores1.add(mago);
	 lutadores2.add(ninja);
	 lutadores3.add(cavaleiro);
	 lutadores4.add(barbaro);
	 
	 //lutadores1.add(lutador1);
	 //lutadores2.add(lutador2);
	 //lutadores3.add(lutador3);
	 //lutadores4.add(lutador4);
	 
	 boolean b = false;
	 
	 while(!b) {
		 System.out.println("1- mago 2- ninja 3- cavaleiro 4- barbaro 5- warg");
		 
		 switch(leitor.nextInt()) {
		 case 1:
			 for(Lutador lutador : lutadores1) {
				 lutador.atividadeLutador();
				 
			 }
			 break;
			 
		 case 2:
			 for(Lutador lutadorN : lutadores2) {
				 lutadorN.atividadeLutador();
				 
			 }
			 break;
			 
		 case 3:
			 for(Lutador lutadorC : lutadores3) {
				 lutadorC.atividadeLutador();
			 }
			 break;
			 
		 case 4:
			 for(Lutador lutadorB : lutadores4) {
				 lutadorB.atividadeLutador();
				 
			 }
			 break;
			 
		case 5:
			 for(Fera feras : monstros) {
				 feras.atividadeFera();
				 
			 }
			 break;
			 
		 }
		 
	 }
			 
		 /*for(Magia magias : magia) {
			 magias.lancarMagia();;
			 
		 }*/
   }
 
   
 }
 
 

