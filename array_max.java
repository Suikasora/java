public class array_max{
	public static void main(String[] args){
		int[] a = new int[] {1,4,2,3,5};
		int[] b = new int[] {1,4,2,3,5};
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}
		System.out.println(a[max]);

		System.arraycopy(a,0,b,0,a.length);
		//System.arraycopy(a,1,b,2,3);

		int[][] array = new int[10][];

		String s = "abcd" + "why";
		System.out.println(s.length());
		s.setCharAt(0,'a');
	}
	private static void myString(){
		String s = new String("We will go further to modify a String by copy!");
		System.out.println("From String\"" + s + "\"");
		String sub1 = s.substring(20);
		String sub2 = s.substring(0,19);
		System.out.println("Get a sub sting from index 20 to the end:" + sub1);;
		System.out.println("Get a sub sting from index 0 to 19" + sub2);
		String cons = sub2.concat(sub1);
		System.out.println("Concat two sub sting into one:\n" + cons);
	}
}
