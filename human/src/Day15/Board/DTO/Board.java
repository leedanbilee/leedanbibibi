package Day15.Board.DTO;

import java.sql.Date;

public class Board {

	private int board_no;
	private String title;
	private String content;
	private String writer;
	private Date reg_Date;
	private Date upd_Date;
	
	
	public Board() {
	}


	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}


	public int getBoard_no() {
		return board_no;
	}


	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}


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


	public Date getReg_Date() {
		return reg_Date;
	}


	public void setReg_Date(Date reg_Date) {
		this.reg_Date = reg_Date;
	}


	public Date getUpd_Date() {
		return upd_Date;
	}


	public void setUpd_Date(Date upd_Date) {
		this.upd_Date = upd_Date;
	}


	@Override
	public String toString() {
		return "Board [board_no=" + board_no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", reg_Date=" + reg_Date + ", upd_Date=" + upd_Date + "]";
	}
	
	
	
	
	
}
