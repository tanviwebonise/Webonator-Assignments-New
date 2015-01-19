import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException; 
import java.io.InputStreamReader;

class Buffer{
	
	
	void fileType(File fin) throws IOException 
	{
		FileInputStream fis = new FileInputStream(fin); 
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
		String line = null; 
		while ((line = br.readLine()) != null) 
		{
			if(line.contains("public void main"))
			{
				System.out.println("It is a JAVA File");
				Javafile jf=new Javafile();
				jf.funJava(fin);
			}
			else if(line.contains("public static void main"))
			{
				System.out.println("It is a JAVA File");					
				Javafile jf=new Javafile();
				jf.funJava(fin);
			}
			else if(line.contains("<?php"))
			{
				System.out.println("It is a PHP File");					
				Phpfile ph=new Phpfile();
				ph.funPhp(fin);
			}
			else if(line.matches("end"))
			{
				System.out.println("It is a Ruby File");
				Rubyfile rb=new Rubyfile();
				rb.funRuby(fin);
			}
	}

}
}

public class Interpreter {

	public static void main(String[] args) throws IOException
	{
		Buffer bf=new Buffer();
		File fn1=new File("myClass.php");
		bf.fileType(fn1);
	}
}