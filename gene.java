public class gene{
	public static void main(String[] args){
		karakuta zero = new karakuta();
		zero.a = 1;
		zero.t();
	}

}
class top{
	public int a;
}
class karakuta extends top{
	void t(){
		System.out.println(a);
	}
}
