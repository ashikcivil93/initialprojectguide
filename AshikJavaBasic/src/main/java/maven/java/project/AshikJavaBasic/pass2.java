package maven.java.project.AshikJavaBasic;

public class pass2{
	static void  max(int a[])
				{
			int max=a[0];
			for(int i=1;i<a.length;i++)
			{
				

			if (max<a[i])
			{	
				max=a[i];
			
			System.out.println(max);
			}
		}
	}
					public static void main (String[] args) {
				int a[]= {45,99,20,21};
				max (a);
			}
		
	}


