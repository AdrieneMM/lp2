public class Circuferencia extends FiguraGeometrica{
private double raio ;
public Circuferencia(double raio ){
this.raio = raio;
}
public double Perimetro(){
double peri ; 
double pi;
pi = 3.14;
peri = 2*pi*raio;
return peri;
}
public double Area(){
double area;
double pi;
pi = 3.14;
area = pi*(raio*raio);
return area;
}



}
