import ch.aplu.turtle.*;
public class MakeSwirlSquare{
  Turtle t1=new Turtle();
  public void make(int size, int bigger , int turns , double degree){
     int nBigger=2;
     for(int i=0;i<turns;i++){
       if(i%nBigger!=0){
         size+=bigger;
       }
       t1.fd(size);
       t1.rt(degree);
     }
  }
  public static void main(String[] args){
    MakeSwirlSquare q = new MakeSwirlSquare();
      q.makeSwirlSquare(28,18,20,90.0);
   }  
}
