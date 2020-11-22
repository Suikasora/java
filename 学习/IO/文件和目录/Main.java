import java.io.*;
public class Main {
  public static void main (String[] args) {
    File file = new File ("a.out");
    if (!file.exists() ) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println (file.exists() );
    System.out.println (file.isFile() );
    System.out.println (file.isDirectory() );
    System.out.println (file.getName() );
    System.out.println (file.getPath() );
    System.out.println (file.getAbsolutePath() );
    //返回long类型，与1970年1月1日之间的毫秒数相差
    System.out.println (file.lastModified() );
    //以字节为单位的文件的长度
    System.out.println (file.length() );
    //
    {
      if (file.isDirectory() ) {
        File[] files = file.listFiles();
        for (File f : files) {
          if (f.isHidden() )
            System.out.println ("文件：" + f);
          else
            System.out.println ("目录：" + f);
        }
      }
    }
    //filter
    {
      if (file.exists() && file.isDirectory() ) {
        //"new"接口
        String[] fileNames = file.list (new FilenameFilter() {
          //实现accept方法
          public boolean accept (File dir, String name) {
            //只获取html和htm文件
            return (name.endsWith (".html") || name.endsWith (".htm") );
          }
        });
        for (String fileName : fileNames)
          System.out.println (fileName);
      }
    }
    //InputStream
    {
      FileInputStream fi = null;
      try {
        fi = new FileInputStream ("a.out");
        int value = fi.read();
        System.out.println ("文件中第一个字符的内容是：" + (char) value);
      } catch (FileNotFoundException e1) {
        e1.printStackTrace();
      } catch ( IOException e2 ) {
        e2.printStackTrace();
      }
      finally{
        try {
          fi.close();
        } catch (IOException e3) {
          e3.printStackTrace();
        }
      }
    }
    //OutputStream
    {
      FileOutputStream fo = null;
      try {
        fo = new FileOutputStream ("a.out");
        for (int i = 0 ; i < 10 ; i++ )
          fo.write (65);
      } catch (FileNotFoundException ex) {
        ex.printStackTrace();
      } catch (IOException exx) {
        exx.printStackTrace();
      }
      finally{
        try {
          fo.close();
        } catch (IOException exxx) {
          exxx.printStackTrace();
        }
      }
    }
		{
			BufferedInputStream bi = null;
			try {
				bi = BufferedInputStream();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
  }
}
