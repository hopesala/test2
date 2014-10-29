package pack;

public class Teachertime {

			   public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public int getTime1ed() {
		return time1ed;
	}
	public void setTime1ed(int time1ed) {
		this.time1ed = time1ed;
	}
	public int getTime2() {
		return time2;
	}
	public void setTime2(int time2) {
		this.time2 = time2;
	}
	public int getTime2ed() {
		return time2ed;
	}
	public void setTime2ed(int time2ed) {
		this.time2ed = time2ed;
	}
	public int getTime3() {
		return time3;
	}
	public void setTime3(int time3) {
		this.time3 = time3;
	}
	public int getTime3ed() {
		return time3ed;
	}
	public void setTime3ed(int time3ed) {
		this.time3ed = time3ed;
	}
	public int getTime4() {
		return time4;
	}
	public void setTime4(int time4) {
		this.time4 = time4;
	}
	public int getTime4ed() {
		return time4ed;
	}
	public void setTime4ed(int time4ed) {
		this.time4ed = time4ed;
	}
	public String getWeek() {
		int i;
		i =getDay();
		if(i == 1) {
		return "Monday";
		}
		else if(i == 2) {
			return "Tuesday";
		}
		else {
			return "Wendesday";
		}
	}
			   private int day ;
			   private int teacherid ;
			   private int time1 ;
			   private int time1ed ;
			   private int time2 ;			   
			   private int time2ed ;
			   private int time3 ;
			   private int time3ed ;
			   private int time4 ;
			   private int time4ed;
			   private int teachertimeid;
 	           public int getTeachertimeid() {
				return teachertimeid;
			}
			public void setTeachertimeid(int teachertimeid) {
				this.teachertimeid = teachertimeid;
			}
			@SuppressWarnings("unused")
			   private String week;
		

}
