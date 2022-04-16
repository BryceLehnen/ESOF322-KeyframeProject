import java.io.*;
import java.util.Scanner;
//Colby Roberts - Made driver
public class Driver {
	
	public static void main(String[] args){
		boolean done = false;
		while(!done){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter one of the following system:\n\tq - quit\n\tkf - keyframe\n");
			String choice = in.nextLine();
			if(choice.equals("kf")){
				System.out.println("Enter day to display keyframes of (format mmddyyy w/0's):\n");
				String day = in.nextLine() + ".txt";
				in.close();
				try(BufferedReader reader = new BufferedReader(new FileReader(day))){
					String line = reader.readLine();
					while(line!=null){
						line = reader.readLine();
						
					}
				}	
				catch(IOException e){
					System.out.println(e);
				}
			}
			else{
				done = true;
				in.close();
			}
		}
	}

}
