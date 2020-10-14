public class Main1{
	public static void main(String[] args){
		Ring r = new Ring(5,4);
		System.out.println(r.area());
		
	}
}
class Ring {
	double innerRadius;
	double outerRadius;
	String color;
	public Ring(double innerRadius,double outerRadius){
		this.innerRadius = innerRadius;
		this.outerRadius = outerRadius;
	}
	double area(){
		return Math.PI * (Math.pow(outerRadius,2) - Math.pow(innerRadius,2));
	}
}


public class Circle extends Shape{
	Circle(double dim){
	}
}

//所有的方法只有签名没有方法体
//public static final 默认的变量
//public abstract 默认的方法

public interface Multi{
	public static final double PI = 1;
	public void callArea();
}

//接口的使用
public class Myclass implements MyInterface{


}
