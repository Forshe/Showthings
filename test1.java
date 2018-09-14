public class Story 
{
	public static void main(String[] args) 
	{
		int num=99;
		for(int bottle_num=num;bottle_num>=1;bottle_num--)
		{	
			int left_num=bottle_num-1;
			System.out.print(bottle_num+"bottles of beer on the wall."+bottle_num+"bottles of beer.Take one down."+left_num+"bottles of beer on the wall\n" );
		}
		
	}

}