package problems;

public class Occurrence
{
/*	public static void main(String[] args)
	{

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) != 'p')
                continue;
            	numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
*/
public static void main(String[] args) {
		
		String s ="abracadabra";
		int total =0;
		
		for(int i =0; i<s.length();i++){
				if(s.charAt(i)== 'a'){
				total= total+1;
				
	}
				
		}System.out.println(total);
		 
		
		}
	}