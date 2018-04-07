package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int news_id;
	public String content;
	private String news_time;
	private String news_adress;
	private String news_img;
	private int news_type;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getNews_time() {
		return news_time;
	}
	public void setNews_time(String news_time) {
		this.news_time = news_time;
	}
	public String getNews_adress() {
		return news_adress;
	}
	public void setNews_adress(String news_adress) {
		this.news_adress = news_adress;
	}
	public String getNews_img() {
		return news_img;
	}
	public void setNews_img(String news_img) {
		this.news_img = news_img;
	}
	public int getNews_type() {
		return news_type;
	}
	public void setNews_type(int news_type) {
		this.news_type = news_type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((news_adress == null) ? 0 : news_adress.hashCode());
		result = prime * result + ((news_img == null) ? 0 : news_img.hashCode());
		result = prime * result + ((news_time == null) ? 0 : news_time.hashCode());
		result = prime * result + news_type;
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
		News other = (News) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (news_adress == null) {
			if (other.news_adress != null)
				return false;
		} else if (!news_adress.equals(other.news_adress))
			return false;
		if (news_img == null) {
			if (other.news_img != null)
				return false;
		} else if (!news_img.equals(other.news_img))
			return false;
		if (news_time == null) {
			if (other.news_time != null)
				return false;
		} else if (!news_time.equals(other.news_time))
			return false;
		if (news_type != other.news_type)
			return false;
		return true;
	}
	
	
}
