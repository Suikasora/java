import java.io.*;

public class Append {
  public static void main (String[] args) {
    String InFile;
    String OutFile;
    InFile = args[0];
    OutFile = args[1];
    try {
      //File Source = new File (InFile);
      //File Target = new File (OutFile);
      //if (!Source.exists() || !Target.exists() )
        //throw new FileNotFoundException();
			BufferedReader In = new BufferedReader(new FileReader(InFile));
			BufferedWriter Out = new BufferedWriter(new FileWriter(OutFile));
			//InputStreamReader streamIn = new InputStreamReader(new FileReader(Target));
			String line;
			while ((line=In.readLine())!=null) {
				Out.write(line);
				Out.write("\n");
			}
			In.close();
			Out.close();

    } catch (IOException e) {
			System.out.println("发生IO异常!");
    }
  }
}
