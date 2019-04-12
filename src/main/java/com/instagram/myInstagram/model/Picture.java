package com.instagram.myInstagram.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Picture {
	@Id
	private String picId;
	private String picTitle;
	private String picDescription;
	public String getPicId() {
		return picId;
	}
	public String getPicTitle() {
		return picTitle;
	}
	public String getPicDescription() {
		return picDescription;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	public void setPicTitle(String picTitle) {
		this.picTitle = picTitle;
	}
	public void setPicDescription(String picDescription) {
		this.picDescription = picDescription;
	}
}
