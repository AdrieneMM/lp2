public class ProgramaException{
      private int variavel1;
      
      public static void main(String [] args){
		
		testeException1();
		testeException2();
		testeException3();
		
	  }	
	  
	  public static void testeException1(){
		int [] vetor1 = new int[5];
		System.out.println("Teste Exception1");
		try{
		  vetor1[6] = 10;
		  	System.out.println("Teste Exception1 - Após o ERRO");
		}
		 catch(Exception e){
		   System.out.println("Um erro ocorreu.E esse ERRO foi : ");
		   
		   e.printStackTrace();
		   
		 } 
		 System.out.println(" ");
	  }
	  
	   public static void testeException2(){
		int [] vetor1 = new int[5];
		System.out.println("Teste Exception2");
		try{
		  vetor1[6] = 10;
		  	System.out.println("Teste Exception2; - Após o ERRO");
		}
		 catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("Um erro ocorreu de ArrayIndexOutOfBounds ");
		   
		 } 
		 System.out.println(" ");
		
	  }
         public static void testeException3(){
		int [] vetor1 = new int[5];
		System.out.println("Teste Exception3");
		try{
		  vetor1[6] = 10;
		  	System.out.println("Teste Exception3; - Após o ERRO");
		}
		 catch(NullPointerException e){
		   System.out.println("Um erro ocorreu de NullPointer");
		   
		 } 
		 finally{
			 System.out.println("TESTE EXCEPTION 3 - apos o catch");
			 
			 }
		 System.out.println(" ");
	  }
}
