package Jogo;

import java.util.ArrayList;

public interface Funcionalidade {
  public void treinar();
  public void aprenderMagia();
  public void ataqueEdefesa();
  public void mostrarStatus();
  public void finalizarAcao();
  public void lancarMagia();
  public void andar();
  public void correr();
  public void nadar();
  public void morrer();
  public void pular();
  public void voar();
  public void realizarAtividadePrincipal();
  
  ArrayList<MetodoLuta> metodoLuta = new ArrayList<MetodoLuta>();
}
