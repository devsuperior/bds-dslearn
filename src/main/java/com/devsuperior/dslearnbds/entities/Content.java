package com.devsuperior.dslearnbds.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

	private String textContent;
	private String videoUri;
	
	public Content() {
	}

	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
}
