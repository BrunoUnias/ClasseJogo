package Modelo1;

import java.util.ArrayList;
import java.util.Scanner;

import Jogo.Missao;

public class Interatividade2 {
	public static void main( String [] args) {
		
		Scanner escritor = new Scanner (System.in);
		
		Cidade cidade = new Cidade();
		Caverna caverna = new Caverna();
		Floresta floresta = new Floresta();
		Habitacao habitacao = new Habitacao();
		Lago lago = new Lago();
		Motanha motanha = new Motanha();
		
		Local local1 = cidade;
		Local local2 = caverna;
		Local local3 = floresta;
		Local local4 = habitacao;
		Local local5 = lago;
		Local local6 = motanha;
		
		ArrayList<Local> locais1 = new ArrayList<Local>();
		ArrayList<Local> locais2 = new ArrayList<Local>();
		ArrayList<Local> locais3 = new ArrayList<Local>();
		ArrayList<Local> locais4 = new ArrayList<Local>();
		ArrayList<Local> locais5 = new ArrayList<Local>();
		ArrayList<Local> locais6 = new ArrayList<Local>();
		
		locais1.add(cidade);
		locais2.add(caverna);
		locais3.add(floresta);
		locais4.add(habitacao);
		locais5.add(lago);
		locais6.add(motanha);
		
		
		boolean write = true;
		ArrayList<Cidade> cidades = new ArrayList<Cidade>();
		ArrayList<Caverna> cavernas = new ArrayList<Caverna>();
		ArrayList<Floresta> florestas = new ArrayList<Floresta>();
		ArrayList<Habitacao> habitacoes = new ArrayList<Habitacao>();
		ArrayList<Lago> lagos = new ArrayList<Lago>();
		ArrayList<Motanha> motanhas = new ArrayList<Motanha>();
		ArrayList<SuperCenario> supercenario = new ArrayList<SuperCenario>();
		ArrayList<SuperCenario> superlocal = new ArrayList<SuperCenario>();
		
		String auxnome = escritor.next();
		String auxcor = escritor.next();
		String auxtipo = escritor.next();
		int auxquantidade = escritor.nextInt();
		float auxtamanho =  escritor.nextFloat();
		
		do {
			int opcoes = 0;
			
			System.out.println("opcoes");
			System.out.println("1- criar cenario 2- deletar cenario 3- mostrar cenario ");
			
		     String f = escritor.next();
		     opcoes = escritor.nextInt();
		     
			if(opcoes  == 1) {
				 int opcao = escritor.nextInt();
				 System.out.println(" opcoes");
				System.out.println("1- cenario 2- tipo ");
				if(opcao == 1) {
			for (int a = 0; a < supercenario.size(); a++) {
				if(f.equals(supercenario.get(a).getSuperCenario())) {
					System.out.println(" quantos cenario vai ter?");
					
					int aux = escritor.nextInt();
					for (int b = 0; b < aux; b++) {
						System.out.println(" digite as caracteristicas do cenario");
						 supercenario.get(b).getListaLocal().add(new Local (escritor.next(), escritor.next(), 
								escritor.nextFloat(), escritor.nextInt(), escritor.next()));
						
						System.out.println("quantos subcenario vai ter?"
								+ supercenario.get(a).getListaLocal().get(b) + "?");
						int aux2 = escritor.nextInt();
						
						 for( int c = 0; c < aux2; c++ ) {
							 System.out.println("Digite um nome para o subcenario"
									 + c);
							   supercenario.get(a).getListaLocal().add(new Local(escritor.next(), escritor.next(), 
								escritor.nextFloat(), escritor.nextInt(), escritor.next()));
						 
						 }
						 
						 System.out.println(" 1- cidade 2- caverna 3- floresta");
								int opcao1 = 0;
								 opcao1 = escritor.nextInt();
						 
								 if(opcao1 == 1) {
									 System.out.println("criar cidade");
									 System.out.println(" cor ");
									 auxcor = escritor.next();
									 System.out.println(" nome ");
									 auxnome = escritor.next();
									 System.out.println(" tipo ");
									 auxtipo = escritor.next();
									 System.out.println(" quantidade ");
									 auxquantidade = escritor.nextInt();
									 System.out.println("tamanho ");
									 auxtamanho = escritor.nextFloat();
									 Cidade AdcCidade = new Cidade(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cidades.add(AdcCidade);
									 
									 
								 }
								 
								 else if(opcao1 == 2) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Caverna AdcCaverna = new Caverna( auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cavernas.add(AdcCaverna);
									 
								 }
								 
								 else if(opcao1 == 3) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Floresta AdcFloresta =  new Floresta(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 florestas.add(AdcFloresta);
									 
								 }
								 
								 else if( opcao1 == 4) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Habitacao AdcHabitacao =  new Habitacao(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 habitacoes.add(AdcHabitacao);
									 
								 }
								 
								 else if( opcao1 == 5 ) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Lago AdcLago =  new Lago(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 lagos.add(AdcLago);
									 
								 }
								 
								 else if( opcao1 == 6) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Motanha AdcMotanha =  new Motanha(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 motanhas.add(AdcMotanha);
									 
								 }
						 
					}	 
							   
							   
						 }
						
					}
				}
		}
		
			
			else if( opcoes == 2) {
				System.out.println("remover do jogo");
				System.out.println(" 1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha ");
				int opcao2 = escritor.nextInt();
				Local removeLocal = new Local();
				
				if(opcao2 == 1) {
				for (int l = 0; l < cidades.size(); l++) {
					if(auxnome.equals(cidades.get(l).getNome())) {
						cidades.remove(l);
						
					}
					
					else {
						System.out.println(" cenario inexistente");
					}
					
				}	
					
				}
				
				else if(opcao2 == 2) {
					for (int v = 0; v < cavernas.size(); v++) {
						if(auxnome.equals(cavernas.get(v).getNome())) {
							cavernas.remove(v);
							
						}
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
				
				else if(opcao2 == 3) {
					for (int x = 0; x < florestas.size(); x++) {
						if (auxnome.equals(florestas.get(x).getNome())) {
							florestas.remove(x);
							
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
				
				else if (opcao2 == 4) {
					for (int g = 0; g < habitacoes.size(); g++) {
						if (auxnome.equals(habitacoes.get(g).getNome())) {
							habitacoes.remove(g);
							
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
					}
				}
				
				else if(opcao2 == 5) {
					for (int e = 0; e < lagos.size(); e++) {
						if(auxnome.equals(lagos.get(e).getNome())) {
							lagos.remove(e);
							
						}
						else {
							System.out.println(" cenario inexistente");
						}
					}
				}
				
				else if(opcao2 == 6) {
					for (int c = 0; c < motanhas.size(); c++) {
						if(auxnome.equals(motanhas.get(c).getNome())) {
							motanhas.remove(c);
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
			}
			
			if (opcoes == 3) {
				for (int p = 0; p < superlocal.size(); p++) {
					superlocal.addAll(supercenario);
					System.out.println(superlocal);
					
					String aux3 = escritor.next();
					for (int i = 0; i < supercenario.size(); i++) {
						if (supercenario.get(i).getNome().equals(aux3)) {
							int opcao1 = escritor.nextInt();
							System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
							if(opcao1 == 1) {
								for (int j = 0; j < cidades.size(); j++) {
									String aux4 = escritor.next();
									
									for (Cidade cidade1 : cidades) {
										if(aux4.equals(cidade.getNome())) {
											supercenario.get(j).getNome();
											supercenario.get(j).getCor();
											supercenario.get(j).getTipo();
											supercenario.get(j).getQuantidade();
											supercenario.get(j).getTamanho();
										}
										
										
									}
									
								}
							}
							
							else if (opcao1 == 2) {
								for (int k = 0; k < cavernas.size(); k++) {
									String aux5 = escritor.next();
									
									for (Caverna caverna1 : cavernas) {
										if (aux5.equals(caverna.getNome())) {
											supercenario.get(k).getNome();
											supercenario.get(k).getCor();
											supercenario.get(k).getTipo();
											supercenario.get(k).getQuantidade();
											supercenario.get(k).getTamanho();
										}
									}
								}
								
							}
							
							else if(opcao1 == 3) {
								for (int l = 0; l < florestas.size(); l++) {
									String aux6 = escritor.next();
									
									for (Floresta floresta1 : florestas) {
										supercenario.get(l).getNome();
										supercenario.get(l).getCor();
										supercenario.get(l).getTipo();
										supercenario.get(l).getQuantidade();
										supercenario.get(l).getTamanho();
									}
								}
							}
							
							else if (opcao1 == 4) {
								for (int m = 0; m < habitacoes.size(); m++) {
									String aux7 = escritor.next();
									
									for (Habitacao habitacao1 : habitacoes) {
										supercenario.get(m).getNome();
										supercenario.get(m).getTipo();
										supercenario.get(m).getQuantidade();
										supercenario.get(m).getTamanho();
										
										
									}
									
								}
							}
							
							else if (opcao1 == 5) {
								for (int n = 0; n < lagos.size(); n++) {
									String aux8 = escritor.next();
									
									for (Lago lago1 : lagos) {
										supercenario.get(n).getNome();
										supercenario.get(n).getCor();
										supercenario.get(n).getTipo();
										supercenario.get(n).getQuantidade();
										supercenario.get(n).getTamanho();
									}
								}
							}
							
							else if (opcao1 == 6) {
								for (int o = 0; o < motanhas.size(); o++) {
									String aux9 = escritor.next();
									
									for (Motanha motanha1 : motanhas) {
										supercenario.get(o).getNome();
										supercenario.get(o).getCor();
										supercenario.get(o).getTipo();
										supercenario.get(o).getQuantidade();
										supercenario.get(o).getTamanho();
									}
									
									
								}
							}
							
						}
					}
				}
			}
			
		}	
		while(write);
			/*int opcoes = 0;
			
			System.out.println("opcoes");
			System.out.println("1- criar cenario 2- deletar cenario 3- mostrar cenario ");
			
			System.out.println("1- criar cenario");

		     String f = escritor.next();
		     opcoes = escritor.nextInt();
            
			if(opcoes  == 1) {
				 int opcao = escritor.nextInt();
				 System.out.println(" opcoes");
				System.out.println("1- cenario 2- tipo ");
				if(opcao == 1) {
			for (int a = 0; a < supercenario.size(); a++) {
				if(f.equals(supercenario.get(a).getSuperCenario())) {
					System.out.println(" quantos cenario vai ter?");
					
					int aux = escritor.nextInt();
					for (int b = 0; b < aux; b++) {
						System.out.println(" digite as caracteristicas do cenario");
						supercenario.get(b).getListaLocal().add(new Local (escritor.next(), escritor.next(), 
								escritor.nextFloat(), escritor.nextInt(), escritor.next()));
						
						System.out.println("quantos subcenario vai ter?"
								+ supercenario.get(a).getListaLocal().get(b) + "?");
						int aux2 = escritor.nextInt();
						
						 for( int c = 0; c < aux2; c++ ) {
							 System.out.println("Digite um nome para o subcenario"
									 + c);
							   supercenario.get(a).getListaLocal().add(new Local(escritor.next(), escritor.next(), 
								escritor.nextFloat(), escritor.nextInt(), escritor.next()));
								
								int opcao1 = 0;
								 opcao1 = escritor.nextInt();
								 
								 if(opcao1 == 1) {
									 System.out.println("criar cidade");
									 System.out.println(" cor ");
									 auxcor = escritor.next();
									 System.out.println(" nome ");
									 auxnome = escritor.next();
									 System.out.println(" tipo ");
									 auxtipo = escritor.next();
									 System.out.println(" quantidade ");
									 auxquantidade = escritor.nextInt();
									 System.out.println("tamanho ");
									 auxtamanho = escritor.nextFloat();
									 Cidade AdcCidade = new Cidade(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cidades.add(AdcCidade);
									 
									 
								 }
								 
								 else if(opcao1 == 2) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Caverna AdcCaverna = new Caverna( auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cavernas.add(AdcCaverna);
									 
								 }
								 
								 else if(opcao1 == 3) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Floresta AdcFloresta =  new Floresta(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 florestas.add(AdcFloresta);
									 
								 }
								 
								 else if( opcao1 == 4) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Habitacao AdcHabitacao =  new Habitacao(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 habitacoes.add(AdcHabitacao);
									 
								 }
								 
								 else if( opcao1 == 5 ) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Lago AdcLago =  new Lago(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 lagos.add(AdcLago);
									 
								 }
								 
								 else if( opcao1 == 6) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Motanha AdcMotanha =  new Motanha(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 motanhas.add(AdcMotanha);
									 
								 }
						 
					}	 
							   
							   
						 }
						
					}
				}
					
								/*System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
								
								int opcao1 = 0;
								 opcao1 = escritor.nextInt();
								 
								 if(opcao1 == 1) {
									 System.out.println("criar cidade");
									 System.out.println(" cor ");
									 auxcor = escritor.next();
									 System.out.println(" nome ");
									 auxnome = escritor.next();
									 System.out.println(" tipo ");
									 auxtipo = escritor.next();
									 System.out.println(" quantidade ");
									 auxquantidade = escritor.nextInt();
									 System.out.println("tamanho ");
									 auxtamanho = escritor.nextFloat();
									 Cidade AdcCidade = new Cidade(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cidades.add(AdcCidade);
									 
									 
								 }
								 
								 else if(opcao1 == 2) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Caverna AdcCaverna = new Caverna( auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 cavernas.add(AdcCaverna);
									 
								 }
								 
								 else if(opcao1 == 3) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Floresta AdcFloresta =  new Floresta(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 florestas.add(AdcFloresta);
									 
								 }
								 
								 else if( opcao1 == 4) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Habitacao AdcHabitacao =  new Habitacao(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 habitacoes.add(AdcHabitacao);
									 
								 }
								 
								 else if( opcao1 == 5 ) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Lago AdcLago =  new Lago(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 lagos.add(AdcLago);
									 
								 }
								 
								 else if( opcao1 == 6) {
									 auxcor = escritor.next();
									 auxtipo = escritor.next();
									 auxquantidade = escritor.nextInt();
									 auxtamanho = escritor.nextFloat();
									 Motanha AdcMotanha =  new Motanha(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
									 motanhas.add(AdcMotanha);
									 
								 }
						 
					}	 
					
				}*/
						 
						
						 
						
			
			//opcoes = escritor.nextInt();
			
			//if(opcoes == 1) {
				//System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
				
				//int opcao1 = 0;
				 //opcao1 = escritor.nextInt();
				 
				 /*if(opcao1 == 1) {
					 System.out.println("criar cidade");
					 System.out.println(" cor ");
					 auxcor = escritor.next();
					 System.out.println(" nome ");
					 auxnome = escritor.next();
					 System.out.println(" tipo ");
					 auxtipo = escritor.next();
					 System.out.println(" quantidade ");
					 auxquantidade = escritor.nextInt();
					 System.out.println("tamanho ");
					 auxtamanho = escritor.nextFloat();
					 Cidade AdcCidade = new Cidade(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 cidades.add(AdcCidade);
					 
					 
				 }
				 
				 else if(opcao1 == 2) {
					 auxcor = escritor.next();
					 auxtipo = escritor.next();
					 auxquantidade = escritor.nextInt();
					 auxtamanho = escritor.nextFloat();
					 Caverna AdcCaverna = new Caverna( auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 cavernas.add(AdcCaverna);
					 
				 }
				 
				 else if(opcao1 == 3) {
					 auxcor = escritor.next();
					 auxtipo = escritor.next();
					 auxquantidade = escritor.nextInt();
					 auxtamanho = escritor.nextFloat();
					 Floresta AdcFloresta =  new Floresta(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 florestas.add(AdcFloresta);
					 
				 }
				 
				 else if( opcao1 == 4) {
					 auxcor = escritor.next();
					 auxtipo = escritor.next();
					 auxquantidade = escritor.nextInt();
					 auxtamanho = escritor.nextFloat();
					 Habitacao AdcHabitacao =  new Habitacao(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 habitacoes.add(AdcHabitacao);
					 
				 }
				 
				 else if( opcao1 == 5 ) {
					 auxcor = escritor.next();
					 auxtipo = escritor.next();
					 auxquantidade = escritor.nextInt();
					 auxtamanho = escritor.nextFloat();
					 Lago AdcLago =  new Lago(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 lagos.add(AdcLago);
					 
				 }
				 
				 else if( opcao1 == 6) {
					 auxcor = escritor.next();
					 auxtipo = escritor.next();
					 auxquantidade = escritor.nextInt();
					 auxtamanho = escritor.nextFloat();
					 Motanha AdcMotanha =  new Motanha(auxcor, auxnome, auxtamanho, auxquantidade, auxtipo);
					 motanhas.add(AdcMotanha);
					 
				 }
				 
			}
			
					}
				
			
			
			/*else if( opcoes == 2) {
				System.out.println("remover do jogo");
				System.out.println(" 1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha ");
				int opcao2 = escritor.nextInt();
				Local removeLocal = new Local();
				
				if(opcao2 == 1) {
				for (int l = 0; l < cidades.size(); l++) {
					if(auxnome.equals(cidades.get(l).getNome())) {
						cidades.remove(l);
						
					}
					
					else {
						System.out.println(" cenario inexistente");
					}
					
				}	
					
				}
				
				else if(opcao2 == 2) {
					for (int v = 0; v < cavernas.size(); v++) {
						if(auxnome.equals(cavernas.get(v).getNome())) {
							cavernas.remove(v);
							
						}
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
				
				else if(opcao2 == 3) {
					for (int x = 0; x < florestas.size(); x++) {
						if (auxnome.equals(florestas.get(x).getNome())) {
							florestas.remove(x);
							
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
				
				else if (opcao2 == 4) {
					for (int g = 0; g < habitacoes.size(); g++) {
						if (auxnome.equals(habitacoes.get(g).getNome())) {
							habitacoes.remove(g);
							
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
					}
				}
				
				else if(opcao2 == 5) {
					for (int e = 0; e < lagos.size(); e++) {
						if(auxnome.equals(lagos.get(e).getNome())) {
							lagos.remove(e);
							
						}
						else {
							System.out.println(" cenario inexistente");
						}
					}
				}
				
				else if(opcao2 == 6) {
					for (int c = 0; c < motanhas.size(); c++) {
						if(auxnome.equals(motanhas.get(c).getNome())) {
							motanhas.remove(c);
						}
						
						else {
							System.out.println(" cenario inexistente");
						}
						
					}
				}
			}*/
			
			
			
			
		//}
		
		boolean editor = true;
		
		/*while(editor) {
			//System.out.println(" criar cenario");			
					
					String aux3 = escritor.next();
					for (int i = 0; i < supercenario.size(); i++) {
						if (supercenario.get(i).getNome().equals(aux3)) {
							int opcao = escritor.nextInt();
							System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
							if(opcao == 1) {
								for (int j = 0; j < cidades.size(); j++) {
									String aux4 = escritor.next();
									
									for (Cidade cidade1 : cidades) {
										if(aux4.equals(cidade.getNome())) {
											supercenario.get(j).getNome();
											supercenario.get(j).getCor();
											supercenario.get(j).getTipo();
											supercenario.get(j).getQuantidade();
											supercenario.get(j).getTamanho();
										}
										
										
									}
									
								}
							}
							
							else if (opcao == 2) {
								for (int k = 0; k < cavernas.size(); k++) {
									String aux5 = escritor.next();
									
									for (Caverna caverna1 : cavernas) {
										if (aux5.equals(caverna.getNome())) {
											supercenario.get(k).getNome();
											supercenario.get(k).getCor();
											supercenario.get(k).getTipo();
											supercenario.get(k).getQuantidade();
											supercenario.get(k).getTamanho();
										}
									}
								}
								
							}
							
							else if(opcao == 3) {
								for (int l = 0; l < florestas.size(); l++) {
									String aux6 = escritor.next();
									
									for (Floresta floresta1 : florestas) {
										supercenario.get(l).getNome();
										supercenario.get(l).getCor();
										supercenario.get(l).getTipo();
										supercenario.get(l).getQuantidade();
										supercenario.get(l).getTamanho();
									}
								}
							}
							
							else if (opcao == 4) {
								for (int m = 0; m < habitacoes.size(); m++) {
									String aux7 = escritor.next();
									
									for (Habitacao habitacao1 : habitacoes) {
										supercenario.get(m).getNome();
										supercenario.get(m).getTipo();
										supercenario.get(m).getQuantidade();
										supercenario.get(m).getTamanho();
										
										
									}
									
								}
							}
							
							else if (opcao == 5) {
								for (int n = 0; n < lagos.size(); n++) {
									String aux8 = escritor.next();
									
									for (Lago lago1 : lagos) {
										supercenario.get(n).getNome();
										supercenario.get(n).getCor();
										supercenario.get(n).getTipo();
										supercenario.get(n).getQuantidade();
										supercenario.get(n).getTamanho();
									}
								}
							}
							
							else if (opcao == 6) {
								for (int o = 0; o < motanhas.size(); o++) {
									String aux9 = escritor.next();
									
									for (Motanha motanha1 : motanhas) {
										supercenario.get(o).getNome();
										supercenario.get(o).getCor();
										supercenario.get(o).getTipo();
										supercenario.get(o).getQuantidade();
										supercenario.get(o).getTamanho();
									}
									
									
								}
							}
							
						}
					}
					
				}*/
			
		
		boolean writer2 = true;
		
	    while( writer2) {
			String aux3 = escritor.next();
			for (int i = 0; i < supercenario.size(); i++) {
				if (supercenario.get(i).getNome().equals(aux3)) {
					int opcao1 = escritor.nextInt();
					System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
					if( opcao1 == 1) {
						for (int j = 0; j < cidades.size(); j++) {
							String aux4 = escritor.next();
							
							for (Cidade cidade1 : cidades) {
								if(aux4.equals(cidade.getNome())) {
									supercenario.get(j).setNome(auxnome);
									supercenario.get(j).setTipo(auxtipo);
									supercenario.get(j).setQuantidade(auxquantidade);
									supercenario.get(j).setTamanho(auxtamanho);
									
								}
								
								
							}
							
						}
					}
					
					else if (opcao1 == 2) {
						for (int k = 0; k < cavernas.size(); k++) {
							String aux5 = escritor.next();
							
							for (Caverna caverna1 : cavernas) {
								if (aux5.equals(caverna.getNome())) {
									supercenario.get(k).setNome(auxnome);
									supercenario.get(k).setTipo(auxtipo);
									supercenario.get(k).setQuantidade(auxquantidade);
									supercenario.get(k).setTamanho(auxtamanho);
								}
							}
						}
						
					}
					
					else if (opcao1 == 3) {
						for (int l = 0; l < florestas.size(); l++) {
							String aux6 = escritor.next();
							
							for (Floresta floresta2 : florestas) {
								supercenario.get(l).setNome(auxnome);
								supercenario.get(l).setTipo(auxtipo);
								supercenario.get(l).setQuantidade(auxquantidade);
								supercenario.get(l).setTamanho(auxtamanho);
								
							}
						}
					}
					
					else if( opcao1 == 4) {
						for (int m = 0; m < habitacoes.size(); m++) {
							String aux7 = escritor.next();
							
							for (Habitacao habitacao2 : habitacoes) {
								supercenario.get(m).setNome(auxnome);
								supercenario.get(m).setTipo(auxtipo);
								supercenario.get(m).setQuantidade(auxquantidade);
								supercenario.get(m).setTamanho(auxtamanho);
								
							}
						}
					}
					
					else if (opcao1 == 5) {
						for (int n = 0; n < lagos.size(); n++) {
							String aux8 = escritor.next();
							
							for (Lago lagos2 : lagos) {
								supercenario.get(n).setNome(auxnome);
								supercenario.get(n).setTipo(auxtipo);
								supercenario.get(n).setQuantidade(auxquantidade);
								supercenario.get(n).setTamanho(auxtamanho);
								
							}
						}
					}
					
					
					else if (opcao1 == 6) {
						for (int o = 0; o < motanhas.size(); o++) {
							String aux9 = escritor.next();
							
							for (Motanha motanha2 : motanhas) {
								supercenario.get(o).setNome(auxnome);
								supercenario.get(o).setTipo(auxtipo);
								supercenario.get(o).setQuantidade(auxquantidade);
								supercenario.get(o).setTamanho(auxtamanho);
								
							}
						}
					}
				}
			}
	    
			}
		
	

			}	
		
	

}


	
								
							
						
					
					
				
			
		
	    
	    
	     /*if (opcoes == 3) {
			for (int p = 0; p < superlocal.size(); p++) {
				superlocal.addAll(supercenario);
				System.out.println(superlocal);
				
				String aux3 = escritor.next();
				for (int i = 0; i < supercenario.size(); i++) {
					if (supercenario.get(i).getNome().equals(aux3)) {
						int opcao1 = escritor.nextInt();
						System.out.println("1- cidade 2- caverna 3- floresta 4- habitacao 5- lago 6- motanha");
						if(opcao1 == 1) {
							for (int j = 0; j < cidades.size(); j++) {
								String aux4 = escritor.next();
								
								for (Cidade cidade1 : cidades) {
									if(aux4.equals(cidade.getNome())) {
										supercenario.get(j).getNome();
										supercenario.get(j).getCor();
										supercenario.get(j).getTipo();
										supercenario.get(j).getQuantidade();
										supercenario.get(j).getTamanho();
									}
									
									
								}
								
							}
						}
						
						else if (opcao1 == 2) {
							for (int k = 0; k < cavernas.size(); k++) {
								String aux5 = escritor.next();
								
								for (Caverna caverna1 : cavernas) {
									if (aux5.equals(caverna.getNome())) {
										supercenario.get(k).getNome();
										supercenario.get(k).getCor();
										supercenario.get(k).getTipo();
										supercenario.get(k).getQuantidade();
										supercenario.get(k).getTamanho();
									}
								}
							}
							
						}
						
						else if(opcao1 == 3) {
							for (int l = 0; l < florestas.size(); l++) {
								String aux6 = escritor.next();
								
								for (Floresta floresta1 : florestas) {
									supercenario.get(l).getNome();
									supercenario.get(l).getCor();
									supercenario.get(l).getTipo();
									supercenario.get(l).getQuantidade();
									supercenario.get(l).getTamanho();
								}
							}
						}
						
						else if (opcao1 == 4) {
							for (int m = 0; m < habitacoes.size(); m++) {
								String aux7 = escritor.next();
								
								for (Habitacao habitacao1 : habitacoes) {
									supercenario.get(m).getNome();
									supercenario.get(m).getTipo();
									supercenario.get(m).getQuantidade();
									supercenario.get(m).getTamanho();
									
									
								}
								
							}
						}
						
						else if (opcao1 == 5) {
							for (int n = 0; n < lagos.size(); n++) {
								String aux8 = escritor.next();
								
								for (Lago lago1 : lagos) {
									supercenario.get(n).getNome();
									supercenario.get(n).getCor();
									supercenario.get(n).getTipo();
									supercenario.get(n).getQuantidade();
									supercenario.get(n).getTamanho();
								}
							}
						}
						
						else if (opcao1 == 6) {
							for (int o = 0; o < motanhas.size(); o++) {
								String aux9 = escritor.next();
								
								for (Motanha motanha1 : motanhas) {
									supercenario.get(o).getNome();
									supercenario.get(o).getCor();
									supercenario.get(o).getTipo();
									supercenario.get(o).getQuantidade();
									supercenario.get(o).getTamanho();
								}
								
								
							}
						}
						
					}
				}
			}
		}*/
		
		
	
		
		

	
			
		
	
		
	




	




