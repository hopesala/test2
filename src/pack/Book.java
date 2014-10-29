package pack;
import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String ISBN,Title,Publisher, PublishDate, AuthorID,Price;
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getPublisher() {
	return Publisher;
}
public void setPublisher(String publisher) {
	Publisher = publisher;
}
public String getPublishDate() {
	return PublishDate;
}
public void setPublishDate(String publishDate) {
	PublishDate = publishDate;
}
public String getAuthorID() {
	return AuthorID;
}
public void setAuthorID(String authorID) {
	AuthorID = authorID;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
