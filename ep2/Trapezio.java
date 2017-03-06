public class Trapezio extends FiguraGeometrica{
private int baseMenor , baseMaior ,h , lado ;

public Trapezio ( int baseMaior , int baseMenor , int h, int lado ){
this.baseMaior = baseMaior;
this.baseMenor = baseMenor;
this.h = h;
this.lado = lado;
}
public int Perimetro(){
int peri;
peri= baseMaior + baseMenor + h + lado;
return peri;
}
public int Area(){
int area;
area = (((this.baseMenor + this.baseMaior )*h)/2);
return area;
}	

}
