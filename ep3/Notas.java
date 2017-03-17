import java.util.Arrays;
public class  Notas implements Comparable <Notas>{
	private double valor;
	private Aluno aluno;
	private Disciplina disciplina;
public Notas( double valor ,Aluno aluno,Disciplina disc){
		this.valor = valor;
		this.aluno = aluno;
		this.disciplina = disc;
}

public void setValor(double valor){
	this.valor=valor;
}
public double getValor(){
	return valor;
}
public void setAluno(Aluno aluno){
	this.aluno=aluno;
}
public Aluno getAluno(){
	return aluno;
}
public void setDisciplina( Disciplina disc){
	this.disciplina=disc;
}
public Disciplina getDisciplina(){
	return disciplina;
}
public int compareTo(Notas outro){
	if(this.valor < outro.getValor()){
		return 1;
	}else if (this.valor > outro.getValor()){
		return -1;
	}else{
		return 0;
	}
}
}
