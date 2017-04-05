class Principal{
public static void main(String arg[]) {

FabricaDeCarro f1 = FabricaDeCarro.getInstancia();
FabricaDeCarro f2 = FabricaDeCarro.getInstancia();
FabricaDeCarro f3 = FabricaDeCarro.getInstancia();
FabricaDeCarro f4 = FabricaDeCarro.getInstancia();
FabricaDeCarro f5 = FabricaDeCarro.getInstancia();
       f1.totalCarroFiat = 10;
       f1.totalCarroFord = 20;
       System.out.println("f2 " + f2.totalCarroFiat );	
}	
}
