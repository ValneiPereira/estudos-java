package estudosjavabasico.aplicacaoenum;

import estudosjavabasico.enumerador.DiaSemana;

public class TesteEnum2 {

  public static void main(String[] args) {
    DiaSemana dia =Enum.valueOf(DiaSemana.class, "DOMINGO");
    System.out.println(dia);

    
    

  }
}
