
public class Q4{
  public static void main(String[] args){
    Rectangle r = new Rectangle(3,7);
    r.printArea();
    r.printPerimeter();

    Square s = new Square(3);
    s.printArea();
    s.printPerimeter();

    Square[] a = new Square[10];
    int k = 5;
    for(int i = 0;i<10;i++){
      a[i] = new Square(k);
      k++;
    }

    for(int i = 0;i<10;i++){
      a[i].printArea();
      a[i].printPerimeter();
    }
  }
}	

