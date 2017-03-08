public class Aluno{
   private String nome ; 
   private Integer idade ; 
   
   public Aluno (){
	 this.idade = 0;  
   } 
   
   public void setIdade( Integer idade){
	   this.idade = idade;
	}
   	public Integer  getIdade(){
		return this.idade;
	}
	 public void setNome( String nome){
	   this.nome = nome;
	}
   	public String  getNome(){
		return this.nome;
	}
	
}
