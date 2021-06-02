package com.rest.mongodb;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class User {
	@Id private String id;
	private String title;
	private String name;
	private ArrayList<String> tags;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
  
}
