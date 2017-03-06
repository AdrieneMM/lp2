class No{
private int item ;
private No ant;
private No prox;


public No(){
this.item = 0 ;
this.prox= null;
this.ant = null;
}

public int getItem(){
return this.item;
}

public void setItem( int item ){
this.item = item;
}

public No getProx(){
return this.prox;
}

public void setProx(No prox){
this.prox = prox;
}

public No getAnt(){
return this.ant;
}

public void setAnt(No ant){
this.ant = ant;
}

}

public class Lista{
private No inicio  ;
private int tam ; 

public Lista(){
this.inicio = null;
this.tam = 0; 	
}

public void Inserir( int num ){
	if ( inicio == null){
		this.inicio = new No();
		this.inicio.setItem(num) ;
	        tam++;
	}else{
		No aux = this.inicio;
	      	No aux1 = new No();
	     	while( aux.getProx() != null ){
		      aux = aux.getProx();
	}
	aux1.setItem(num);
	aux1.setAnt(aux);
	aux.setProx(aux1);
	tam++;
	}
} 
	public boolean Pesquisar(int num){
	
		No cursor= this.inicio;
		
		for(int i=0;i<tam;i++){
			
		if(cursor.getItem()==num){

		return true;
			
	}
		
	cursor=cursor.getProx();

	}
		
	return false;
	
	}

	public void Remover(){
		
		No aux1=this.inicio;
		
		while(aux1.getProx() !=null){
			
			aux1=aux1.getProx();
		
		}
		
		aux1.getAnt().setProx(null);
		
		aux1.setAnt(null);
	
		tam--;
	
	}

}


