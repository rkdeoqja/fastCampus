import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProgramersTest {

	public static String solution(String[] participant, String[] completion) {
		  int k = 0;
	        for(int i = 0; i < participant.length; i++){
	             for(int j = 0; j < participant.length -1; j++){
	                    if(participant[i].equals(completion[j])){
	                        participant[i] = "null";
	                        break;
	                    }       
	             }
	        }
	        while(true){
	            if(!participant[k].equals("null")){
	                break;
	            }
	            k++;
	        }
	        return participant[k];
	}
	public static void main(String[] args) {

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko","ana", "mislav"};
		System.out.println(solution(participant,completion));
		
		
	}

}
