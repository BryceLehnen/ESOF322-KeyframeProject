package keyframe;

// Colby Roberts - Made, Edited and Commented driver
// Nathan Johnson - Edited driver to secure proper function and ideal formatting

import java.io.*;
import java.util.Scanner;

/*
	Overall, the point of this driver is to ask the user for a date which coresponds to a collection of gathered data
	which is in the form of a text file for the sake of the proto type (in this case we only have 04152022 and 04182022).
	The driver will then goe through this data line by line and arrange the important information into an instance of HomeData
	in an acceptable format. As you can see from the format of the text documents, the potential data that can be gathered is:
	1. The timestamp of the important frame
	2. The existance of an audio or video disturbance
	3. The need to share the gathered data 
	4. The type of device used in data collection
	5. Additional information for notes on the distrubances.
	This process continues until the use choses the q (quit) option from the main user entry.
*/

public class Driver {

	public static void main(String[] args) {
		boolean done = false;
		while(!done) {
			//here we initialize instances of HomeData, which we will later put all of the gathered information into,
			//and the Scanner for use choice intake.
            HomeData hd = new HomeData();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter one of the following system:\n\tq - quit\n\tkf - keyframe\n");
			String choice = in.nextLine();
			//this is when the user chooses to ask for possible keyframes
			if(choice.equals("kf")) {
				//the format of the user input is important here because it has to match the name of the valid data file
				System.out.println("Enter day to display keyframes of (format mmddyyyy w/0's):\n");
				String day = in.nextLine() + ".txt";
				try(BufferedReader reader = new BufferedReader(new FileReader(day))) {
					//this line is to skip the first line of the data file where we display the arrangement of the data.
					String line = reader.readLine();
					while(line != null) {
						//here we split the read line into an array for processing 
						String[] l = line.split(", ");
						//this statement checks to see if there is any relevant data in this line. The process is as follows
						//because we know that if there was no disturbance recorded visually or audibly, then there will be no
						//data to process. On a side note, we cast l[1] and l[2] to booleans because they are always true or false
						if(Boolean.parseBoolean(l[1]) || Boolean.parseBoolean(l[2])) {
							//this is the timestamp
							hd.getTime(l[0]);
							//this is the boolean representing if a Video disturbance occured
							hd.getVideo(Boolean.parseBoolean(l[1]));
							//this is the boolean representing if a audio disturbance occured
							hd.getAudio(Boolean.parseBoolean(l[2]));
							//this is any note that goes along with the data collected
							hd.getAdditional(l[3]);
							//this is the decive type which will always be NULL unless there is data collected
							hd.getDeviceType(l[4]);
							//this is whether this data will be shared to the neighborhood
							hd.getShareInformation(Boolean.parseBoolean(l[5]));
                            System.out.println("");
						}
						line = reader.readLine();
					}
				}	
				catch(IOException e) {
					System.out.println(e);
				}
			}
			else {
                in.close();
				done = true;
			}
		}
	}
}