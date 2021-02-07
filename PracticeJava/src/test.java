import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public int[] sum(List<Integer> arrA,List<Integer> arrB){
		
		
		int[] answer = {};
		return answer;
	}
	
	public static int[] solution(int[] arrA,int[] arrB) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		for(int e:arrA) {
			if(!list.contains(e)) {
				list.add(e);
			}
		}
		System.out.println(list);
		
		for(int e:arrB) {
			if(!bList.contains(e)) {
				bList.add(e);
			}
		}
		System.out.println(bList);
		
		
		
		int[] answer= {list.size(),bList.size()};
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] arrA= {1,2,3,2};
		int[] arrB= {1,3};
		
		
	}
	
}
