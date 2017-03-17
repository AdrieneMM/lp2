import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Principal{
public static void main (String arg[]){

Aluno alu5 = new Aluno();
Aluno alu1 = new Aluno();
Aluno alu2 = new Aluno();
Aluno alu3 = new Aluno();
Aluno alu4 = new Aluno();

Disciplina disc1 = new Disciplina("Web","Marcelo");
Disciplina disc2 = new Disciplina("Lp2","Hebert");

alu5.setNome("A");
alu1.setNome("B");
alu2.setNome("C");
alu3.setNome("D");
alu4.setNome("E");

alu5.setIdade(13);
alu1.setIdade(14);
alu2.setIdade(15);
alu3.setIdade(16);
alu4.setIdade(17);
ArrayList< Aluno > valores = new ArrayList<Aluno>();
valores.add(alu5);
valores.add(alu1);
valores.add(alu2);
valores.add(alu3);
valores.add(alu4);
Notas n1 = new Notas(1 , alu5 ,disc1 );
Notas n2 = new Notas(2 , alu5,disc2);
Notas n3 = new Notas(3, alu1 ,disc1 );
Notas n4 = new Notas(4, alu1,disc2);
Notas n5 = new Notas(5,alu2,disc1);
Notas n6 = new Notas(6, alu2,disc2 );
Notas n7 = new Notas(7, alu3,disc1);
Notas n8 = new Notas(8, alu3,disc2);
Notas n9 = new Notas(9, alu4,disc1);
Notas n10 = new Notas(10,alu4, disc2);
ArrayList<Notas> n = new ArrayList<Notas>();
n.add(n1);
n.add(n2);
n.add(n3);
n.add(n4);
n.add(n5);
n.add(n6);
n.add(n7);
n.add(n8);
n.add(n9);
n.add(n10);
Collections.sort(n);	
            	System.out.println(n.get(0).getValor() + "  " + n.get(0).getDisciplina().getNome() + "  " + n.get(0).getAluno().getNome());
		

		for(int i=0; i<10; i++){
			if (n.get(i).getDisciplina().getNome().compareTo("Lp2")==0){
				System.out.println(n.get(i).getValor()+" "+n.get(i).getAluno().getNome());
				i=10;
			}
		}
}
}
