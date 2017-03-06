 public class Triangulo extends FiguraGeometrica {
 private float base,h  , a,b,c  ; 
 
 public Triangulo(float base,float h, float a,float b,float c ){
 this.base = base ;
 this.h=h;
 this.a=a;
 this.b=b;
 this.c=c;
 }
 public float Perimetro(){
 float peri ; 
 peri = this.a+ this.b + this.c;
 return peri;
 }
 public float Area(){
 float area;
 area = ((this.base*this.h)/2);
 return area;
 }
 
 
 
 
 }
