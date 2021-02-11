package collection.treeSet;

import java.util.Comparator;

public class Member implements Comparator<Member>{		//Comparable<Member> //�����������̽� ������
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
		return memberName +"ȸ������ ���̵�� "+memberID+"�Դϴ�.";
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
	/*@Override												//Comparable<T> �������̵� �޼��� ����
	public int compareTo(Member member) {
		//�����ȯ �������� ������ȯ ��������
		//return (this.memberID -member.memberID)*(-1);    	- �񱳴���� �����϶� �������� ����
		//return (member.memberID - this.memeber)			- �񱳴���� �����϶� �������� ����
		  
		//return (this.memberID - member.memberID) 			- �񱳴���� �����϶� �������� ����
		  
		//int num1= this.memberName.compareTo(member.getMemberName());
		//int num2 = member.memberName.compareTo(this.getMemberName());
		//System.out.println("this: "+num1+", member: "+num2);
		//return this.memberName.compareTo(member.getMemberName()); //-�񱳴�� String ��������
		//return member.memberName.compareTo(this.getMemberName()); //-�񱳴�� String ��������
	}*/
	@Override												//Comparator<T> �������̵� �޼��� ����
	public int compare(Member member1, Member member2) {	//ù��°�� �Ѿ�� member1�� this��� ����ȴ�.
		return (member1.memberID -member2.memberID);		//�������� ����
	}
	
	
}
