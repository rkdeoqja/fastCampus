package collection.treeSet;

import java.util.Comparator;

public class Member implements Comparator<Member>{		//Comparable<Member> //정렬인터페이스 두종류
	private int memberID;
	private String memberName;
	
	public Member() {}
	public Member(int memberID,String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName +"회원님의 아이디는 "+memberID+"입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberID == member.memberID);
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberID;
	}
	/*@Override												//Comparable<T> 오버라이딩 메서드 구현
	public int compareTo(Member member) {
		//양수반환 오름차순 음수반환 내림차순
		//return (this.memberID -member.memberID)*(-1);    	- 비교대상이 숫자일때 내림차순 정렬
		//return (member.memberID - this.memeber)			- 비교대상이 숫자일때 내림차순 정렬
		  
		//return (this.memberID - member.memberID) 			- 비교대상이 숫자일때 오름차순 정렬
		  
		//int num1= this.memberName.compareTo(member.getMemberName());
		//int num2 = member.memberName.compareTo(this.getMemberName());
		//System.out.println("this: "+num1+", member: "+num2);
		//return this.memberName.compareTo(member.getMemberName()); //-비교대상 String 오름차순
		//return member.memberName.compareTo(this.getMemberName()); //-비교대상 String 내림차순
	}*/
	@Override												//Comparator<T> 오버라이딩 메서드 구현
	public int compare(Member member1, Member member2) {	//첫번째로 넘어온 member1이 this라고 보면된다.
		return (member1.memberID -member2.memberID);		//오름차순 정렬
	}
	
	
}
