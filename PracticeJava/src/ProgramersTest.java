import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProgramersTest {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i =0;
		 while(i<completion.length) {
			 if(!completion[i].equals(participant[i])) {
				 answer = participant[i];
				 break;
			 }else {
				 i++;
			 }
		 }
		 
		 if(answer.equals("")) {
			answer =  participant[participant.length-1];
		 }
		 
		
	        return answer;
	}
	public static void main(String[] args) {

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko","ana", "mislav"};
		System.out.println(solution(participant,completion));
		
		
	}

}
