package logic;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage());
		
		int[] array = {5,4,3,2,1};
		
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(){
		// TODO Implement this method to return string "Hello GitHub".
		return "Hello GitHub";
	}
	
	public static int[] bubbleSort(int[] array){
		// TODO Implement this method to sort the given array in an ascending order and return the sorted array.
		Boolean check;
		
		for(int lastIndex = array.length-1;lastIndex>=1;lastIndex--) {
			for(int k =0;k<lastIndex;k++) {
				if(array[k]>array[k+1]) {
					double t = array[k];
					array[k = array]
				}
			}
		}
		return array;
	}
	
	public static String arrayToString(String title,int[] array){
		
		String str = title + " : ";
		for (int i = 0;i < array.length;i++)
		{
			str += array[i] + " ";
		}
		return str;
	}
}
