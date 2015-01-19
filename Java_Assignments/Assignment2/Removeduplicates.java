import java.util.HashSet;
import java.util.Set;


public class Removeduplicates
{
	public static void main(String[] args) 
	{
		
		String input = "I came I Saw I conquered I went";
		String splitedlist[] = input.split(" ");
		Set<String> unique = new HashSet<>();
		for (String duplicateRemovedList : splitedlist)
		{
			unique.add(duplicateRemovedList);
		}
		
		for (String output: unique)
		{
			System.out.println(output);
		}
		
	}
}
