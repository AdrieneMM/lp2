public class Disciplina{
private String nome ; 
private String professor; 

public Disciplina(String nome , String prof ){
this.nome = nome;
this.professor = prof ;   
} 

public void setNome( String nome){
this.nome = nome;
}
public String getNome(){
return this.nome;
}
public void setProfessor( String prof){
this.professor = prof;
}
public String  getProfessor(){
return this.professor;
}

}
