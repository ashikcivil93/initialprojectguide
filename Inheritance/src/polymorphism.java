
public class polymorphism extends poly {
	public void ashik()
	{
		System.out.println("Happieeness");
	}

	public static void main(String[] args) {
      		// TODO Auto-generated method stub
      poly p = new polymorphism();  // upcasting
      poly p1 = new poly();
      
      p.ashik();
      p1.ashik();
	}

}
