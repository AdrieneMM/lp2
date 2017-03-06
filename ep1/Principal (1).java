public class Principal{

	public static void main(String arg[]) {
		
	Lista confere = new Lista();
		
	confere.Inserir(49);
		
	if (confere.Pesquisar(49)){
			
		System.out.println("Pertence a lista");

	} else {
			
		System.out.println("Nao pertence a lista");

	}
				
	confere.Inserir(97);
		
	if (confere.Pesquisar(97)) {
                       
 		System.out.println("Pertence a lista");
    
        } else {
                        
		System.out.println("Nao pertence a lista");
                
	}
	
	confere.Remover();
	
	if (confere.Pesquisar(97)) {
                        
		System.out.println("Pertence a lista");
                
	} else {
                       
 		System.out.println(" Nao pertence a lista");
          
     	}

	
}


}




