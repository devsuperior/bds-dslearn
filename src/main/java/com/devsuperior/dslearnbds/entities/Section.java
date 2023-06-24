package com.devsuperior.dslearnbds.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_section")
public class Section {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	
	@ManyToOne
	@JoinColumn(name = "resource_id")
	private Resource resource;
	
	@ManyToOne
	@JoinColumn(name = "prerequisite_id")
	private Section prerequisite;
	
	public Section() {
	}

	public Section(Long id, String title, String description, Integer position, String imgUri, Resource resource,
			Section prerequisite) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.resource = resource;
		this.prerequisite = prerequisite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Section getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(Section prerequisite) {
		this.prerequisite = prerequisite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Section other = (Section) obj;
		return Objects.equals(id, other.id);
	}
}
