import java.util.Random;


public class ArrayOverview {
	public static void main(String[] args) {
		int x = 25;
		Random gen = new Random();
		
		
		int[] data = new int[1000];		//indexed from 0 to 999
		String[] names = new String[50];	//indexed from 0 to 49
		
		data[200] = 987;
		names[25] = "Rob";
		
//		data[1001] = 123;		//bounds exception
		
//		for (int index = 0, index < 1000; index++)
//			data[index]	=	gen.nextInt(500) +1;
		for(int value : data)
			System.out.println(value);
		
	}

}
