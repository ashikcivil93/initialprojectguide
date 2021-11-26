package maven.java.project.AshikJavaBasic;

public class duplicate {
	public static void main(String[] args) {
		int a[]=new int[] {1,22,11,22,44,66,55,2,1,10,4};
		System.out.println("dublicate array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}
}

