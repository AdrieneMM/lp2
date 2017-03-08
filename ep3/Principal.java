import java.util.ArrayList;
import java.util.Arrays;

public class Principal{
 public static void main (String arg[]){
	 
	 Aluno alu = new Aluno();
	  Aluno alu1 = new Aluno();
	   Aluno alu2 = new Aluno();
	    Aluno alu3 = new Aluno();
	     Aluno alu4 = new Aluno();
	 alu.setNome("A");
	 alu1.setNome("B");
	 alu2.setNome("C");
	 alu3.setNome("D");
	 alu4.setNome("E");
	
	 alu.setIdade(13);
	 alu1.setIdade(14);
	 alu2.setIdade(15);
	 alu3.setIdade(16);
	 alu4.setIdade(17);
  	  ArrayList< Aluno > valores = new ArrayList<Aluno>();
  	
    valores.add(alu);
    valores.add(alu1);
    valores.add(alu2);
    valores.add(alu3);
    valores.add(alu4);
    
    
 }
}
