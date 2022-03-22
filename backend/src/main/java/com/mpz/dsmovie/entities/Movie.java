package com.mpz.dsmovie.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {

	// Os tipos das váriaveis que são classe são melhores para popularem bancos de dados, já que aceitam valores nulos, heranças e etc.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	
	//No muitos para muitos, para garantir que não vá ter dados repetidos se utiliza o set ao invés do list.
	//No mappedBy é necessário informar o nome corretamente, nesse caso na classe Score tem um ScorePK com nome id, e no ScorePK tem a relação com o
	//filmes(movie), dessa forma é possível acessar todas as avaliações de um certo filme a partir do objeto de filme.
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();
	
	public Movie() {
	}

	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Score> getScores() {
		return scores;
	}
}