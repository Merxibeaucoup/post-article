package com.edgar.article.models;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // post id , auto generated
	
	@Column(nullable = false)// not null
	private String title; // post title
	
	
	@Column(nullable = false)// not null
	private String body; // post body
	
	
	@CreationTimestamp // sets to current vm time stamp
	@Temporal(TemporalType.DATE)// get sql time stamp 
	@JsonFormat(pattern ="MM-dd-yyyy")
	private Date date; // date created
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	 @CollectionTable(name = "Post_tag", joinColumns = @JoinColumn(name = "post_id"))
	private Set<Tag> tags ;
	
	
	//constructors 
	public Post() {
		
	}


	public Post(int id, String title, String body, Date date, Set<Tag> tags) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.date = date;
		this.tags = tags;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Set<Tag> getTags() {
		return tags;
	}


	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}


	@Override
	public int hashCode() {
		return Objects.hash(body, date, id, tags, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(body, other.body) && Objects.equals(date, other.date) && id == other.id
				&& Objects.equals(tags, other.tags) && Objects.equals(title, other.title);
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", date=" + date + ", tags=" + tags + "]";
	}



	
	
	




}
