import java.util.*;
import java.io.*;

public class throwClause {

	public static void main(String[] args) throws FileNotFoundException {
		{
			
			Scanner input = new Scanner(new File("boysgirls.txt"));
			int count =0;
			while (input.hasNext()) {
				count++;
			}
			System.out.println("total words =" + count);
		}
		
		
	}

}
