public class ProgramaExcetion2{
	
	 public static void main(String[]args){
      teste();	 
	 }
   public static void teste() throws NullPointerException{
	   int[] vetor1 = new int[5];
	   try {
		 vetor1[6]=10;   
	   }   
	   catch(Exception e){
		throw new NullPointerException(); 
	   }
	   
   }	
}

