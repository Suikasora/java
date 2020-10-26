import java.util.*;
public class Main{
	public static void main(String[] args){
		Instrument ins = new Instrument();
		ins.main(null);
		
	}
}
class Instrument {
  public void play() {
    System.out.println ("演奏乐器: ");
  }
  public static void main (String[] args) {
    Instrument i;
		Scanner sc = new Scanner(System.in);
		String insname=sc.next();
    Wind w = new Wind(insname);
    i = w;
    i.play();
  }
}

//管乐器
class Wind extends Instrument {
	private String name;
  public void play() {
    System.out.println ("演奏乐器: "+getname());
  }
	public String getname(){
		return this.name;
	}
	public Wind(String name) {
    this.name = name;
  }
}
