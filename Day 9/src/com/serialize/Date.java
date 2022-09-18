package com.serialize;

import java.io.Serializable;

public class Date implements Serializable{
	int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Date ["+this.dd+"-"+this.mm+"-"+this.yy+"]";
	}
	
}
