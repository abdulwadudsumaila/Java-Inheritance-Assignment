
class Rectangle{   // this is the parent class
  int length;
  int breadth;

  public Rectangle(int l, int b){ //initializing the constructor
    length = l;
    breadth = b;
  }

  public void printArea(){  // calling of the first method
    System.out.println(length*breadth);
  }

  public void printPerimeter(){  // calling of the second method
    System.out.println(2*(length+breadth));
  }
}

class Square extends Rectangle{ //this is the child class inherited from parent
  int side;
  public Square(int s){
    super(s,s);
  }
}

public class Q3 {
  public static void main(String[] args){
    Rectangle r = new Rectangle(3,7);
    r.printArea();
    r.printPerimeter();

    Square s = new Square(3);
    s.printArea();
    s.printPerimeter();
  }
}	

