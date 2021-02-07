package chapter10;

public class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
	}

	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate m1 = (MyDate)obj;
			if(this.day == m1.day) {
				if(this.month ==m1.month) {
					if(this.year ==m1.year) {
						return true;
					}else {
						return false;
					}
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		
		return false;
	}*/
	


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.day == date.day && this.month ==date.month && this.year == date.year) {
				return true;
			}else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day*1 +  month*100+ year * 10000;
	}
	
}
