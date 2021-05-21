
class parent{ 
    public void inheri() {
		System.out.println("This is parent class");
	}
}
    
class subclass extends parent{
	public void inheri1() {
	System.out.println("This is child class");	
	}
	}

public class Q1 {
	public static void main(String[] args) {
	   parent x = new parent();
      subclass y = new subclass();
        x.inheri();
        y.inheri1();
        y.inheri();
	}

}
