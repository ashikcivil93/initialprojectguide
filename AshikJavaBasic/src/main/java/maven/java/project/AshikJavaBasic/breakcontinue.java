package maven.java.project.AshikJavaBasic;

public class breakcontinue

{
	
	public static void main(String[] args) {
		char hi='A';//a=97,A=65
		for(;hi<=90;hi++)
		{
			if(hi==70||hi==65||hi%2==0)
			{
				continue;
			}
			System.out.println(hi);
		}
		
		
	 hi='A';
	 for(;hi<=90;hi++)
	 {
		 if(hi==70)
		 {
			break;
		 }
			 System.out.println(hi);
	 }
	}
}
