	package com.pack.Class;
	
	import java.util.Date;
	
	public class RoomVacant {
		int roomNo;
		String tid;
		String bookStatus;
		String bookedBy;
		Date bookFrom;
		Date bookTo;
		Double price;
	
		public RoomVacant() {
			// TODO Auto-generated constructor stub
		}
	
		public int getRoomNo() {
			return roomNo;
		}
	
		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}
	
		public String getTid() {
			return tid;
		}
	
		public void setTid(String tid) {
			this.tid = tid;
		}
	
		public String getBookStatus() {
			return bookStatus;
		}
	
		public void setBookStatus(String bookStatus) {
			this.bookStatus = bookStatus;
		}
	
		public String getBookedBy() {
			return bookedBy;
		}
	
		public void setBookedBy(String bookedBy) {
			this.bookedBy = bookedBy;
		}
	
		public Date getBookFrom() {
			return bookFrom;
		}
	
		public void setBookFrom(Date bookFrom) {
			this.bookFrom = bookFrom;
		}
	
		public Date getBookTo() {
			return bookTo;
		}
	
		public void setBookTo(Date bookTo) {
			this.bookTo = bookTo;
		}
	
		public Double getPrice() {
			return price;
		}
	
		public void setPrice(Double price) {
			this.price = price;
		}
	
	}