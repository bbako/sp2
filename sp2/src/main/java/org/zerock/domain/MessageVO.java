package org.zerock.domain;

import java.sql.Date;

public class MessageVO {

	
	private String sender;

	private String reciever;
	private String msg;
	private Date regdate;
	private Date readdate;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getReaddate() {
		return readdate;
	}
	public void setReaddate(Date readdate) {
		this.readdate = readdate;
	}
	@Override
	public String toString() {
		return "MessageVO [sender=" + sender + ", reciever=" + reciever + ", msg=" + msg + ", regdate=" + regdate
				+ ", readdate=" + readdate + "]";
	}
	
	
}
