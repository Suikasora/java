public class ArraySort{
	public static void main(String[] args){
		int[] a = {1,3,4,2,5};
		sortChoose(a);
		System.out.println("out:");
		//增强型for循环
		for( int i : a ){
			System.out.print(i);
		}
	}
	public static void sortChoose(int num[]){
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			int index = 0;
			for (int j = 0;j < num.length-i ;j++ ) {
				if (num[j] > num[index]) {
					index = j;
				}
				int temp = num[num.length-i-1];
				num[num.length-i-1] = num[index];
				num[index] = temp;
			}
		}
	}
}
