public class test{
	public static void main(String[] args){
		b one = new b(1,2);
		one.check();
	}
}
class a{
	private int num;
	public a(int num){
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void check(){
		System.out.println("num = "+num);
	}
}
class b extends a{
	private int hum;
	public b(int num,int hum){
		super(num);
		this.hum=hum;
	}
	public void check(){
		System.out.println("num = "+getNum());
		System.out.println("hum = "+hum);
	}
}
