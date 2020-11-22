import java.io.*;

public class Merge {
  public static void main (String[] args) {
    String Source1, Source2, Target;
    Source1 = args[0];
    Source2 = args[1];
    Target = args[2];
    try {
      BufferedReader S1 = new BufferedReader (new FileReader (Source1) );
      BufferedReader S2 = new BufferedReader (new FileReader (Source2) );
      BufferedWriter T = new BufferedWriter (new FileWriter (Target) );
			String line;
			while ((line=S1.readLine())!=null) {
				T.write(line);
				T.write("\n");
				System.out.println(line);
			}
			while ((line=S2.readLine())!=null) {
				T.write(line);
				T.write("\n");
				System.out.println(line);
			}
			T.flush();
			S1.close();
			S2.close();
			T.close();
    } catch (IOException e) {
			System.out.println("发生IO异常!");
    }
  }
}
