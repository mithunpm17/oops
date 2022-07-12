import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopyExample
{
public static void main(String[] args)
{
try 
{
FileReader fr=new FileReader("input.txt");
BufferedReader br=new BufferedReader(fr);
FileWriter fw=new FileWriter("output1.txt",true);
String s;
while((s=br.readLine())!=null) 
{ 
fw.write(s); // write to output file
fw.flush();
}
br.close();
fw.close();
System.out.println("file copied");
} 
catch (IOException e) 
{
e.printStackTrace();
}
}
}
