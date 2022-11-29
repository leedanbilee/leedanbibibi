package Day13.Ex01_Collection;

import java.util.Date;

public class Board {

	// 제목, 내용, 작성자, 등록일자, 수정일자
	String title;
	String content;
	String writer;
	Date update;
	Date regdate;
	

	
	public Board() {
		this("제목없음", "", "이름없음", new Date(), new Date());
	}

	public Board(String title, String content, String writer, Date update, Date regdate) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.update = update;
		this.regdate = regdate;
	}

	// getter,setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	// to string

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + ", update=" + update
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
	
	
	
}
