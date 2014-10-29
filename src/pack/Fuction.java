package pack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import com.opensymphony.xwork2.ActionSupport;

public class Fuction extends ActionSupport
{
	/**
	 * 
	 */
	int tmp;
	int tmpstudentid=1,tmpteacherid=1;
	private static final long serialVersionUID = 1L;
	private Teachertime tmpteachertime;
	
	
	public Teachertime getTmpteachertime() {
		return tmpteachertime;
	}

	public void setTmpteachertime(Teachertime tmpteachertime) {
		this.tmpteachertime = tmpteachertime;
	}

	public int getTmptime() {
		return tmptime;
	}

	public void setTmptime(int tmptime) {
		this.tmptime = tmptime;
	}

	private int tmptime,tmpteachertimeid;
	public int getTmpteachertimeid() {
		return tmpteachertimeid;
	}

	public void setTmpteachertimeid(int tmpteachertimeid) {
		this.tmpteachertimeid = tmpteachertimeid;
	}

	private String name;
	private int tmpday,tmpstudenttimeid,tmptime1,tmptime2,tmptime3,tmptime4;
	public int getTmptime1() {
		return tmptime1;
	}

	public void setTmptime1(int tmptime1) {
		this.tmptime1 = tmptime1;
	}

	public int getTmptime2() {
		return tmptime2;
	}

	public void setTmptime2(int tmptime2) {
		this.tmptime2 = tmptime2;
	}

	public int getTmptime3() {
		return tmptime3;
	}

	public void setTmptime3(int tmptime3) {
		this.tmptime3 = tmptime3;
	}

	public int getTmptime4() {
		return tmptime4;
	}

	public void setTmptime4(int tmptime4) {
		this.tmptime4 = tmptime4;
	}

	public int getTmpstudenttimeid() {
		return tmpstudenttimeid;
	}

	public void setTmpstudenttimeid(int tmpstudenttimeid) {
		this.tmpstudenttimeid = tmpstudenttimeid;
	}

	public int getTmpday() {
		return tmpday;
	}

	public void setTmpday(int tmpday) {
		this.tmpday = tmpday;
	}

	public String tmpTitle, tmpPublisher, tmpPublishDate, tmpAuthorID,
			tmpPrice;


	ArrayList<String> List1 = new ArrayList<String>();
	ArrayList<Teacher> list2= new ArrayList<Teacher>();
	public ArrayList<Studenttime> getList4() {
		return list4;
	}

	public void setList4(ArrayList<Studenttime> list4) {
		this.list4 = list4;
	}

	ArrayList<Teachertime> list3= new ArrayList<Teachertime>();
	ArrayList<Studenttime> list4= new ArrayList<Studenttime>();
	public ArrayList<Teachertime> getList3() {
		return list3;
	}

	public void setList3(ArrayList<Teachertime> list3) {
		this.list3 = list3;
	}

	public ArrayList<Teacher> getList2() {
		return list2;
	}

	public void setList2(ArrayList<Teacher> list2) {
		this.list2 = list2;
	}


	public String getTmpTitle() {
		return tmpTitle;
	}

	public void setTmpTitle(String tmpTitle) {
		this.tmpTitle = tmpTitle;
	}

	public String getTmpPublisher() {
		return tmpPublisher;
	}

	public void setTmpPublisher(String tmpPublisher) {
		this.tmpPublisher = tmpPublisher;
	}

	public String getTmpPublishDate() {
		return tmpPublishDate;
	}

	public void setTmpPublishDate(String tmpPublishDate) {
		this.tmpPublishDate = tmpPublishDate;
	}

	public String getTmpAuthorID() {
		return tmpAuthorID;
	}

	public void setTmpAuthorID(String tmpAuthorID) {
		this.tmpAuthorID = tmpAuthorID;
	}

	public String getTmpPrice() {
		return tmpPrice;
	}

	public void setTmpPrice(String tmpPrice) {
		this.tmpPrice = tmpPrice;
	}

	public String bookn, tmpISBN;

	public String getTmpISBN() {
		return tmpISBN;
	}

	public void setTmpISBN(String tmpISBN) {
		this.tmpISBN = tmpISBN;
	}

	dbconnection d = new dbconnection();
	Connection t = d.getConnection();

	public Book getTarget_book() {
		return target_book;
	}

	public void setTarget_book(Book target_book) {
		this.target_book = target_book;
	}

	public Author getTarget_author() {
		return target_author;
	}

	public void setTarget_author(Author target_author) {
		this.target_author = target_author;
	}

	public Book target_book;
	public Author target_author;

	public String getBookn() {
		return bookn;
	}

	public void setBookn(String bookn) {
		this.bookn = bookn;
	}

	public ArrayList<String> getList1() {
		return List1;
	}

	public void setList1(ArrayList<String> list) {
		List1 = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String searchauthor() throws SQLException {

		int i = -1, m = 0;
		Statement stmt = t.createStatement();
		ResultSet set = stmt.executeQuery("select * from author where name=\""
				+ name + "\"");
		while (set.next()) {
			m++;
			i = set.getInt(1);
		}
		set = stmt.executeQuery("select count(*) from author;");
		while (set.next()) {
			m = set.getInt(1);
		}

		if (i != -1) {
			System.out.println("succeed3");
			tmpAuthorID = String.valueOf(i);
			return "SUCCESS";
		} else {
			tmpAuthorID = String.valueOf(m + 1);
			return "fa";
		}
	}

	public String searchbook() throws SQLException {

		int i;
		Statement stmt = t.createStatement();
		ResultSet set = stmt.executeQuery("select * from author where name=\""
				+ name + "\"");
		while (set.next()) {
			i = set.getInt(1);
			System.out.println(set.getInt(1));
			Statement stmt1 = t.createStatement();
			ResultSet set1 = stmt1
					.executeQuery("select * from book where AuthorID=\"" + i
							+ "\"");
			while (set1.next()) {
				System.out.println(set1.getString(2));

			}
		}
		System.out.println("succeed");
		return SUCCESS;
	}
	public String detail() throws SQLException {

		Statement stmt = t.createStatement();
		ResultSet set2 = stmt.executeQuery("select * from book where Title='"
				+ bookn + "'");
		if (set2.next()) {

			target_book = new Book();
			target_book.setISBN(set2.getString(1));
			target_book.setTitle(set2.getString(2));
			target_book.setAuthorID(set2.getString(3));
			System.out.println("id = " + target_book.AuthorID);
			target_book.Publisher = set2.getString(4);
			target_book.PublishDate = set2.getString(5);
			target_book.Price = set2.getString(6);
			ResultSet set3 = stmt
					.executeQuery("select * from author where AuthorID="
							+ target_book.AuthorID);
			if (set3.next()) {
				target_author = new Author();
				target_author.Name = set3.getString(2);
				target_author.Age = set3.getString(3);
				target_author.Country = set3.getString(4);
			}
		}
		return SUCCESS;
	}

	public String deletebook() throws SQLException {
		Statement stmt = t.createStatement();
		System.out.println(tmpISBN);
		stmt.executeUpdate("delete from book where ISBN='" + tmpISBN + "'");
		return SUCCESS;
	}

	public String addbook() throws SQLException {
		// System.out.println(tmpISBN+tmpTitle+tmpPublisher+
		// tmpPublishDate+tmpAuthorID+tmpPrice);
		Statement stmt = t.createStatement();
		stmt.executeUpdate(" insert into book values('" + tmpISBN + "','"
				+ tmpTitle + "','" + tmpAuthorID + "','" + tmpPublisher + "','"
				+ tmpPublishDate + "','" + tmpPrice + "');");
		System.out.println("sdsdsd");
		return SUCCESS;
	}

	public String searchteacher() throws SQLException {
		int i;
		i = 0;
		Statement stmt = t.createStatement();
		System.out.println(name);
		ResultSet set = stmt.executeQuery("select * from teacher where name=\""
				+ name + "\"");
		while (set.next()) {
			System.out.println(set.getString(1) + set.getString(2)
					+ set.getString(3) + set.getString(4));
			i=set.getInt(2);
			System.out.println(i);
			Teacher teacher1 = new Teacher();
			teacher1.setUsername(set.getString(1));
			teacher1.setTeacherid(set.getString(2));
			teacher1.setPassword(set.getString(3));
			teacher1.setName(set.getString(4));
			list2.add(teacher1);
		}
		Statement stmt1 = t.createStatement();
		ResultSet set1 = stmt1.executeQuery("select * from teachertime where teacherid=\"" + i
						+ "\"");
		while (set1.next()) {
			System.out.println(set1.getString(1) + set1.getString(2)
					+ set1.getString(3) + set1.getString(4));
			Teachertime teachertime1 = new Teachertime();
			teachertime1.setDay(set1.getInt(2));
			teachertime1.setTeacherid(set1.getInt(3));
			teachertime1.setTime1(set1.getInt(4));	
			teachertime1.setTime2(set1.getInt(5));
			teachertime1.setTime3(set1.getInt(6));
			teachertime1.setTime4(set1.getInt(7));
			teachertime1.setTime1ed(set1.getInt(8));
			teachertime1.setTime2ed(set1.getInt(9));
			teachertime1.setTime3ed(set1.getInt(10));
			teachertime1.setTime4ed(set1.getInt(11));
			teachertime1.setTeachertimeid(set1.getInt(1));
			list3.add(teachertime1);
			System.out.println(set1.getString(1));
		}
		
		System.out.println("succeed");
		return SUCCESS;
	}
	public String listbook() throws SQLException {
		int i;
		int j = 0;
		String tmpteachername;
		i = 0;
		Statement stmt = t.createStatement();
		ResultSet set = stmt.executeQuery("select * from studenttime where studentid=\""
				+ tmpstudentid + "\"");
		while (set.next()) {
			System.out.println(set.getString(1) + set.getString(2)
					+ set.getString(3)+set.getString(4));
			i=set.getInt(3);//teachertimeid
			tmpday=set.getInt(1);//tmpday
			tmptime=set.getInt(4);//tmpclass
			Statement stmt2 = t.createStatement();
			ResultSet set2 = stmt2.executeQuery("select * from teachertime where teachertimeid=\"" + i
							+ "\"");
			while (set2.next()) {
				
				System.out.println(set2.getString(1) + set2.getString(2)
						+ set2.getString(3) + set2.getString(4));
			         j=set2.getInt(3);//tmpteacherid
			}
			Statement stmt1 = t.createStatement();
			ResultSet set1 = stmt1.executeQuery("select * from teacher where teacherid=\"" + j
							+ "\"");
			while (set1.next()) {
				System.out.println(set1.getString(1) + set1.getString(2)
						+ set1.getString(3) + set1.getString(4));
				tmpteachername=set1.getString(4);
				Studenttime studenttime1 = new Studenttime();
				studenttime1.setTeachertimeid(i);
				studenttime1.setStudentid(tmpstudentid);
				studenttime1.setDay(tmpday);
				studenttime1.setTeachername(tmpteachername);
				studenttime1.setTime(tmptime);
				System.out.println(tmpday+" "+tmpteachername+" "+tmptime);
				list4.add(studenttime1);
			}
			
		}
		
		System.out.println("succeed");
	return SUCCESS;
	}
	
	
	public String listbook1() throws SQLException {
		
		Statement stmt1 = t.createStatement();
		ResultSet set1 = stmt1.executeQuery("select * from teachertime where teacherid=\""
				+ tmpteacherid + "\"");
		
		while (set1.next()) {
			System.out.println(set1.getString(1) + set1.getString(2)
					+ set1.getString(3) + set1.getString(4));
			Teachertime teachertime1 = new Teachertime();
			teachertime1.setDay(set1.getInt(2));
			teachertime1.setTeacherid(set1.getInt(3));
			teachertime1.setTime1(set1.getInt(4));	
			teachertime1.setTime2(set1.getInt(5));
			teachertime1.setTime3(set1.getInt(6));
			teachertime1.setTime4(set1.getInt(7));
			teachertime1.setTime1ed(set1.getInt(8));
			teachertime1.setTime2ed(set1.getInt(9));
			teachertime1.setTime3ed(set1.getInt(10));
			teachertime1.setTime4ed(set1.getInt(11));
			teachertime1.setTeachertimeid(set1.getInt(1));
			list3.add(teachertime1);
			System.out.println(set1.getString(1));
		}
		
		System.out.println("succeed");
		return SUCCESS;
	}
	
	public String booktime() throws SQLException {
		System.out.println(tmptime);
		System.out.println(tmpteachertimeid);
		int i= tmptime,time,timed,tmpstudentid2,tmpclass2;
		Statement stmt2 = t.createStatement();
		ResultSet set2 = stmt2.executeQuery("select * from studenttime where teachertimeid=\""
				+ tmpteachertimeid + "\"");
		while (set2.next()) {
			System.out.println(set2.getString(1) + set2.getString(2)
					+ set2.getString(3)+set2.getString(4));
			tmpstudentid2=set2.getInt(2);//tmpstudentid
			tmpclass2=set2.getInt(4);//tmpclass
			
			if(tmpstudentid2 == tmpstudentid && tmpclass2== tmptime) {
				return "fa2";
			}
		}
		Statement stmt1 = t.createStatement();
		ResultSet set1 = stmt1.executeQuery("select * from teachertime where teachertimeid=\""
				+ tmpteachertimeid + "\"");
		while (set1.next()) {
			System.out.println(set1.getString(1) + set1.getString(2)
					+ set1.getString(3)+set1.getString(4));
			time=set1.getInt(i+3);//time
			timed=set1.getInt(i+7);//timed
			if(timed >= time) {
				return "fa1";
			}
		}
		Statement stmt = t.createStatement();
		stmt.executeUpdate(" insert into studenttime values('" + tmpday + "','" + tmpstudentid + "','"+
				+ tmpteachertimeid + "','" + tmptime + "');");
        if(tmptime == 1) {
        stmt.executeUpdate("update  teachertime set time1ed = time1ed + 1 where teachertimeid=\"" + tmpteachertimeid
						+ "\"");
        }
        else if(tmptime == 2) {
            stmt.executeUpdate("update  teachertime set time2ed = time2ed + 1 where teachertimeid=\"" + tmpteachertimeid
    						+ "\"");
            }
        else if(tmptime == 3) {
            stmt.executeUpdate("update  teachertime set time3ed = time3ed + 1 where teachertimeid=\"" + tmpteachertimeid
    						+ "\"");
            }
        else  {
            stmt.executeUpdate("update  teachertime set time4ed = time4ed + 1 where teachertimeid=\"" + tmpteachertimeid
    						+ "\"");
            }
		
	
		return "success";
	}
	
	
	
	public String deleteone() throws SQLException {
		System.out.println(tmptime);
		System.out.println(tmpteachertimeid);
		System.out.println(tmpstudentid);
		Statement stmt = t.createStatement();
	    if(tmptime == 1) {
	        stmt.executeUpdate("update  teachertime set time1ed = time1ed - 1 where teachertimeid=\"" + tmpteachertimeid
							+ "\"");
	        }
	        else if(tmptime == 2) {
	            stmt.executeUpdate("update  teachertime set time2ed = time2ed - 1 where teachertimeid=\"" + tmpteachertimeid
	    						+ "\"");
	            }
	        else if(tmptime == 3) {
	            stmt.executeUpdate("update  teachertime set time3ed = time3ed - 1 where teachertimeid=\"" + tmpteachertimeid
	    						+ "\"");
	            }
	        else  {
	            stmt.executeUpdate("update  teachertime set time4ed = time4ed - 1 where teachertimeid=\"" + tmpteachertimeid
	    						+ "\"");
	            }
		Statement stmt1 = t.createStatement();
		stmt1.executeUpdate("delete  from studenttime where studentid=\""
				+ tmpstudentid + "\" and teachertimeid=\"" + tmpteachertimeid + "\" and class=\""+ tmptime + "\"" );
		 return SUCCESS;
	
	}




public String edit() throws SQLException {
 
	System.out.println(tmptime1);
	System.out.println(tmptime2);
	System.out.println(tmptime3);
	System.out.println(tmptime4);
	System.out.println("tmp="+tmp);
	System.out.println(tmpteachertimeid);
	Statement stmt = t.createStatement();

        stmt.executeUpdate("update  teachertime set time1 = \"" + tmptime1
						+ "\" where teachertimeid=\"" + tmpteachertimeid
						+ "\"");
        stmt.executeUpdate("update  teachertime set time2 = \"" + tmptime2
						+ "\" where teachertimeid=\"" + tmpteachertimeid
				+ "\""); 
        stmt.executeUpdate("update  teachertime set time3 = \"" + tmptime3
						+ "\" where teachertimeid=\"" + tmpteachertimeid
						+ "\"");
        stmt.executeUpdate("update  teachertime set time4 = \"" + tmptime4
						+ "\" where teachertimeid=\"" + tmpteachertimeid
								+ "\"");
  
	 return SUCCESS;

}
public String set() throws SQLException {
     tmp=tmpteachertimeid;
     System.out.println("tmp1="+tmp);
	 return SUCCESS;
}



}
