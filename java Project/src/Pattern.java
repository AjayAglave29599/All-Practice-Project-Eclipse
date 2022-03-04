
public class Pattern {
	public static void main(String [] args)
	{
		for (int i = 0; i <4; i++) 
		{
			for (int j = 0; j <7; j++) 
			{
				if(j+i<=3)
				{
					System.out.print((char)(j+65));
				}
				else if(j-i>=3)
				{
					System.out.print((char)(71-j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
