public class FabricaDeCarro{
  public static FabricaDeCarro instancia;
  protected int totalCarroFiat;
  protected int totalCarroFord;
  
  private FabricaDeCarro(){
	  
  }	
  public static FabricaDeCarro getInstancia(){
	 if(instancia==null)
	    instancia=new FabricaDeCarro();
	    return instancia;	 
	   
 
}
}
