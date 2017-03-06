public class Quadrado extends FiguraGeometrica {
private int a;
public Quadrado ( int a){
this.a=a;
}
public int Perimetro(){
int peri;
peri= 4*this.a;
return peri;
}
public int Area(){
int area;
area = (2*(this.a*this.a));
return area;
}	

}
