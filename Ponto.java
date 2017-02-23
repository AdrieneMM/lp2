public class Ponto{
 private double x,y;
  public Ponto(){
  System.out.println("Construtor 1 - " + this) ;
 }
  public Ponto(double x , double y){
     System.out.println("Construtor 2 - ");
     this.x = x;
     this.y=y;
 }
public void setX (double x){
	this.x = x;
}
public double getX(){
	return x;
}
public void setY(double y){
	this.y=y;
}
public double getY(){
	return y;
}
public static void  main (String [] args){
	double a,b,c,d;
	Ponto p1 = new Ponto();
	Ponto p2 =new Ponto();	
    Ponto p4 = new Ponto(4,00);
	p1.setX(4);
	p1.setY(5);
	p1.getX();
	p1.getY();
	p2.setX(5);
	p2.setY(3);
	p2.getX();
	p2.getY();
  a = p2.getY()-p1.getY();
  b = p2.getX()-p1.getX();
 d= Math.pow(a,2)+Math.pow(b,2);
c=Math.sqrt(d);
System.out.println(c);

    Reta r1 =new Reta();
     r1.setP1(p1);
     r1.setP2(p2);

     r1.getP1().getX();  
     r1.getP2().getY();

 System.out.println(" P1 x : " +r1.getP1().getX()+ "  "+  " P2 y : " + r1.getP2().getY()) ; 
     p1.setX(15);
     p2.setY(50);
     p1.setY(30);
     p2.setX(40);
 System.out.println (" Troca de valores : ");
 System.out.println(" P1 x  : "+r1.getP1().getX()+ "  "+ "P2 y :"+ r1.getP2().getY() +"  "+ " P1 y :"+ r1.getP1().getY() +"  " + " P2 x :"+ r1.getP2().getX()) ; 
   System.out.println( " Area do triangulo ");
System.out.println (r1.Area(r1.getP1().getX() , r1.getP1().getY(),r1.getP2().getX(), r1.getP2().getY())) ;
    
   
}
}
