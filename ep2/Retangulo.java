public class Retangulo extends FiguraGeometrica {
private int base , h ; 
public Retangulo ( int base, int h){
this.h = h;
this.base = base ;
}
public int Perimetro(){
int peri;
peri= (2*(this.base + this.h));
return peri;
}
public int Area(){
int area;
area = (this.base*this.h);
return area;
}	

}


