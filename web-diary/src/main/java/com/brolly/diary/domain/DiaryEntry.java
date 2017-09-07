package com.brolly.diary.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.brolly.diary.utils.CustomDateSerializer;


/**
 * 
Diary entries should be recorded in database system of your choice, but keep in mind that every record should contain:

 - Date of entry
 - List of tags
 - Text of entry (multiline string)
 * @author Bane
 *
 */

@XmlRootElement
//@XmlType(propOrder={"text", "date", "tags"}) /*uncomment to enforce order*/
public class DiaryEntry implements Serializable{

	
	private Integer id;

	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z") /*MUST use Jacksone 2.0+ version*/
	private Date date;

	/*private List<String> tags; */

	private String tags;


	private String text;

	public DiaryEntry() {
		// TODO Auto-generated constructor stub
	}

	/*
	public DiaryEntry(Date date, List<String> tags, String text) {
		this.date = date;
		this.tags = tags;
		this.text = text;
	}
	 */



	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getDate() {
		return date;
	}



	public DiaryEntry(Date date, String tags, String text) {
		this.date = date;
		this.tags = tags;
		this.text = text;
	}

	//@JsonIgnore
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/*
	@XmlElementWrapper(name = "tags")
	@XmlElement(name = "tag")
	public List<String> getTags() {
		return tags;
	}
	 */

	/*
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	 */

	/*
	@XmlElementWrapper(name = "tags")
	@XmlElement(name = "tag")
	public List<String> getTags() {
	    return Arrays.asList(tags.split(";"));
	}
	 */

/*	@XmlElementWrapper(name = "tags")
	@XmlElement(name = "tag")*/
	public String getTags() {
		//List<String> asList = Arrays.asList(tags.split(";"));
		return tags;
	}

	/**
	 * append ";" between each tag and perists tag as String in format : <tag1>;<tag2>;<tag3>
	 * example: produces: market;car;job*/
	public void setTags(final String tag){

		StringBuilder sb = new StringBuilder();
		if(tags == null){
			sb.append(tag);
		} else {
			sb.append(tags);
			sb.append(";");
			sb.append(tag);
		}
		tags = sb.toString();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaryEntry other = (DiaryEntry) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiaryEntry [date=" + date + ", tags=" + tags + ", text=" + text
				+ "]";
	}


}	
