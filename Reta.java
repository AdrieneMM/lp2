class Reta{
 private Ponto p1 ,p2 ;
   public void setP1( Ponto p){
     this.p1 = p;
   }
   public void setP2( Ponto p ){
     this.p2 = p;
   }
   public Ponto getP1(){
       return this.p1;
   }

   public Ponto getP2(){
       return this.p2;
   }

 public double Area ( double  a, double b, double c, double d  ) {
       double c1 ,c2 , w,l , m ;
      c1=d-b;
      c2=c-a;
      l=(c1*c2)/2;
      w=b*c2;
      m=l+w;

   return m;
 }

}

