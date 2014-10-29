package pack;

public class Studenttime {
	   public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	   int day;
	   int time;
	
	public int getTeachertimeid() {
		return teachertimeid;
	}
	public void setTeachertimeid(int teachertimeid) {
		this.teachertimeid = teachertimeid;
	}

	int studentid,teachertimeid;
	   public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	String teachername;
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
}
