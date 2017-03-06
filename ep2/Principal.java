public class Principal {
 public static void main (String arg[]){
  Triangulo t = new Triangulo(5,4,1,2,5);
  System.out.println(" Triangulo ");
  System.out.println(" Area : " + t.Area() + "    Perimetro : " + t.Perimetro());
  Quadrado q = new Quadrado(10);
  System.out.println(" Quadrado ");
  System.out.println(" Area : " + q.Area() + "    Perimetro : " + q.Perimetro());
  Retangulo r = new Retangulo(10,5);
  System.out.println(" Retangulo ");
  System.out.println(" Area : " + r.Area() + "    Perimetro : " + r.Perimetro());
  Circuferencia c = new Circuferencia(5);
  System.out.println(" Circuferencia ");
  System.out.println(" Area : " + c.Area() + "    Perimetro : " + c.Perimetro());
  Trapezio p = new Trapezio(10,6,4,7);
  System.out.println(" Circuferencia ");
  System.out.println(" Area : " + p.Area() + "    Perimetro : " + p.Perimetro());



	 
} 	
}
