package com.devsuperior.dslearnbds.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.devsuperior.dslearnbds.entities.enums.ResourceType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_resource")
public class Resource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	private ResourceType type;
	
	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;

	@OneToMany(mappedBy = "resource")
	private List<Section> sections = new ArrayList<>();
	
	public Resource() {
	}

	public Resource(Long id, String title, String description, Integer position, String imgUri, ResourceType type,
			Offer offer) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.type = type;
		this.offer = offer;
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

	public ResourceType getType() {
		return type;
	}

	public void setType(ResourceType type) {
		this.type = type;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
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
		Resource other = (Resource) obj;
		return Objects.equals(id, other.id);
	}
}
