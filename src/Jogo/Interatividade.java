package Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Interatividade {
 public static void main(String [] args) {
	 Scanner leitor = new Scanner(System.in);
	 MetodoLuta teste = new MetodoLuta();
	 
	 Mago mago = new Mago(); 
	 Ninja ninja = new Ninja();
	 Cavaleiro cavaleiro = new Cavaleiro("Miliardo", "Humana", 200.0f);
	 Barbaro barbaro = new Barbaro("Bravok", "Humana", 300.0f);
	 Mestre mestre = new Mestre();
	 
	 Lutador lutador1 = mago;
	 Lutador lutador2 = ninja;
	 Lutador lutador3 = cavaleiro;
	 Lutador lutador4 = barbaro;
	 
	 ArrayList<Lutador> lutadores1 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores2 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores3 = new ArrayList<Lutador>();
	 ArrayList<Lutador> lutadores4 = new ArrayList<Lutador>();
	 
	 lutadores1.add(mago);
	 lutadores2.add(ninja);
	 lutadores3.add(cavaleiro);
	 lutadores4.add(barbaro);
	 
	 boolean read = true;
	 ArrayList<Mago> magos = new ArrayList<Mago>();
	 ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
	 ArrayList<Cavaleiro>cavaleiros = new ArrayList<Cavaleiro>();
	 ArrayList<Barbaro> barbaros = new ArrayList<Barbaro>();
	 ArrayList<MetodoLuta> metodos = new ArrayList<MetodoLuta>();
	 ArrayList<Luta> lutas = new ArrayList<Luta>(); 
	 ArrayList<Missao> missoes = new ArrayList<Missao>();
	 ArrayList<Mestre> mestres = new ArrayList<Mestre>();
	 
	 /*while(read) {
		 int opcao = 0;
		 System.out.println("Opcoes");
		 System.out.println("1- mago 2 ninja 3- cavaleiro 4- barbaro");
		 
		 opcao = leitor.nextInt();
		 if(opcao == 1) {
			 for(Lutador lutadoresM : lutadores1 ) {
				 lutadoresM.atividadeLutador();
				 
			 }
			 break;
			 
		 }
		 
		 else if(opcao == 2){
			for(Lutador lutadorN : lutadores2) { 
				lutadorN.atividadeLutador();
				
			}
			break;
			
		 }
		 
		 else if(opcao == 3) {
			 for(Lutador lutadorC : lutadores3) {
				 lutadorC.atividadeLutador();
				 
			 }
			 break;
			 
		 }
		 
		 else if(opcao == 4) {
			 for(Lutador lutadorB : lutadores4) {
				 lutadorB.atividadeLutador();
				 
			 }
			 break;
			 
		 }
		 
		 
	 }
		 
 }*/
	    String auxnome = leitor.next();
		String auxraca = leitor.next();
		float auxvida = leitor.nextFloat();

	 while(read) {
		 int opcoes = 0;
		System.out.println("Opcoes");
		System.out.println("1- criar guerreiro 2- deletar guerreiro 3- mostrar guerreiro 4- mestre");
		
		opcoes = leitor.nextInt();
		if(opcoes == 1) {
			
			System.out.println("1- criar mago 2- criar ninja 3- criar cavaleiro 4- criar barbaro");
			
			int opcao1 = leitor.nextInt();
			
			if(opcao1 == 1) {
				
				System.out.println("1- criar mago");
				auxnome = leitor.next();
				auxraca = leitor.next();
				auxvida = leitor.nextFloat();
				Mago AdcMago = new Mago(auxnome,auxraca,auxvida);
				magos.add(AdcMago);
				
			}
			
			else if(opcao1 == 2) {
				System.out.println("criar ninja");
				auxnome = leitor.next();
				auxraca = leitor.next();
				auxvida = leitor.nextFloat();
				Ninja AdcNinja = new Ninja(auxnome,auxraca,auxvida);
				ninjas.add(AdcNinja);
			}
			
			else if(opcao1 == 3) {
				System.out.println("criar cavaleiro");
				 auxnome = leitor.next();
				 auxraca = leitor.next();
			    auxvida = leitor.nextFloat();
				Cavaleiro AdcCavaleiro = new Cavaleiro(auxnome,auxraca,auxvida);
				cavaleiros.add(AdcCavaleiro);
				
			}
			
			else if(opcao1 == 4) {
				System.out.println("criar barbaro");
				 auxnome = leitor.next();
				 auxraca = leitor.next();
				 auxvida = leitor.nextFloat();
				Barbaro AdcBarbaro = new Barbaro(auxnome,auxraca,auxvida);
				barbaros.add(AdcBarbaro);
				
			}
		
		}
		
		
		
		/*else if(opcoes == 2) {
			System.out.println("criar ninja");
			String auxnome = leitor.next();
			String auxraca = leitor.next();
			float auxvida = leitor.nextFloat();
			Ninja AdcNinja = new Ninja(auxnome,auxraca,auxvida);
			ninjas.add(AdcNinja);
		}
		
		else if(opcoes == 3) {
			System.out.println("criar cavaleiro");
			String auxnome = leitor.next();
			String auxraca = leitor.next();
			float auxvida = leitor.nextFloat();
			Cavaleiro AdcCavaleiro = new Cavaleiro(auxnome,auxraca,auxvida);
			cavaleiros.add(AdcCavaleiro);
			
		}
		
		else if(opcoes == 4) {
			System.out.println("criar barbaro");
			String auxnome = leitor.next();
			String auxraca = leitor.next();
			float auxvida = leitor.nextFloat();
			Barbaro AdcBarbaro = new Barbaro(auxnome,auxraca,auxvida);
			barbaros.add(AdcBarbaro);
			
		}*/
		
		else if(opcoes == 2) {
			System.out.println(" Remover do jogo.");
			System.out.println("1- mago 2- ninja 3- cavaleiro 4- barbaro.");
			 auxnome = leitor.next();
			 int opcao2 = leitor.nextInt();
			Lutador removeLutador = new Lutador(auxnome, auxraca, auxvida);
			if(opcao2 == 1) {
				for (int i = 0; i < magos.size(); i++) {
					if (auxnome.equals(magos.get(i).getNome())) {
						magos.remove(i);
					}
					
			}
				if(opcao2 == 3) {
					for (int i = 0; i < ninjas.size(); i++) {
						if (auxnome.equals(ninjas.get(i).getNome())) {
							ninjas.remove(i);
						}
				}
					if(opcao2 == 1) {
						for (int i = 0; i < cavaleiros.size(); i++) {
							if (auxnome.equals(cavaleiros.get(i).getNome())) {
								cavaleiros.remove(i);
							}
					}
						if(opcao2 == 1) {
							for (int i = 0; i < cavaleiros.size(); i++) {
								if (auxnome.equals(cavaleiros.get(i).getNome())) {
									cavaleiros.remove(i);
								}
						}
					
		}
		
					}
				}
			}
			
			
			
		}
		
		else if(opcoes == 4) {
			int opcao4 = 0;
			
			System.out.println(" 1- criar mestre 2- deletar mestre 3- mostrar nome do mestre "
					+ "4- criar jogo 5- adicionar jogadores 6- criar missoes");
			if( opcao4 == 1) {
				mestre.setNome(auxnome);
				
			}
			
			else if( opcao4 == 2) {
				for (int a = 0; a < mestres.size(); a++) {
					if (auxnome.equals(mestres.get(a).getNome())) {
						mestres.remove(a);
						
					}
				}
			}
			
			else if( opcao4 == 3) {
				mestre.getNome();
				
			}
			
			else if(opcao4 == 4) {
				
				System.out.println(" criar metodo ");
				String d = leitor.next();
				
				for(int i = 0; i <= metodos.size(); i++) {
					if(d.equals(metodos.get(i).getMetodoLuta())) {
						System.out.println("Quantas luta vai ter?");
						int aux2 = leitor.nextInt();
						for(int r = 0; r < aux2; r++) {
							System.out.println("Digite o nome do jogo");
							  missoes.get(i).getMetodo().get(r).getMissao().get(r).getListaluta().add(new Luta(leitor.next()));
							 
			            
							  System.out.println("Quantas sub-lutas vai ter?"
										 + missoes.get(i).getMetodo().get(r).getListaluta().get(r).getMissao() + " ?");
								 int aux3 = leitor.nextInt();
								 for( int k = 0; k < aux3; k++ ) {
									 System.out.println("Digite um nome para sub-luta"
											 + k);
									      missoes.get(i).getMetodo().get(r).getListaluta(
									    		).get(k).getMissao().add( new Missao( leitor.next()));
							 }
					
						}
						
					}
				}
				
			}
			
			else if( opcao4 == 5) {
				System.out.println("Digite o nome do jogo: ");
				String aux4 = leitor.next();
				for(int p = 0; p < metodos.size(); p++) {
					if(metodos.get(p).getDescricao().equals(aux4)) {
					int opcao = leitor.nextInt();
					System.out.println("1- mago 2- ninja 3- cavaleiro 4- barbaro");
					if(opcao == 1) {
						System.out.println("Digite o nome do mago");
						for (int f = 0; f < magos.size(); f++) {
							String aux5 = leitor.next();
							for (Lutador lutador : lutadores1 ) {
								if(aux5.equals( lutador.getNome())) {
									metodos.get(p).setNome(auxnome);
								}
							}
							
						}
					}
					
					else if( opcao == 2) {
						System.out.println("Digite o nome do ninja");
						for (int g = 0; g < ninjas.size(); g++) {
							String aux6 = leitor.next();
							for (Lutador lutador : lutadores2) {
								if(aux6.equals(lutador.getNome())) {
									metodos.get(p).setNome(auxnome);
								}
							}
						}
					}
					
					else if(opcao == 3) {
						System.out.println("Digite o nome do cavaleiro");
						for (int h = 0; h < cavaleiros.size(); h++) {
							String aux7 = leitor.next();
							for (Lutador lutador : lutadores3) {
								if(aux7.equals(lutador.getNome())) {
									metodos.get(p).setNome(auxnome);
								}
							}
						}
					}
					
					else if(opcao == 4) {
						System.out.println("Digite o nome do barbaro");
						for (int m = 0; m < barbaros.size(); m++) {
							String aux8 = leitor.next();
							for (Lutador lutador : lutadores4) {
								metodos.get(m).setNome(auxnome);
							}
						}
					}
					
				}
					
			}
			
		}
			
			else if(opcao4 == 6) {
				System.out.println("digite o nome do jogo");
				String aux9 = leitor.next();
				for (int n = 0; n < missoes.size(); n++) {
					if(metodos.get(n).getDescricao().equals(aux9)) {
						System.out.println("Digite o nome da missao");
						String aux10 = leitor.next();
						for (Missao missao : missoes) {
							missoes.get(n).setTipo();
							
							
						}
					}
				}
			}
		
	 }
	 
	 
 }
	 

	 
 
 }


	

 
}
