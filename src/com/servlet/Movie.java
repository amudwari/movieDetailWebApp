package com.servlet;

public class Movie {
	private String name;
	private String year;
	private String description;
	private String director;
	private String duration;
	private String poster;
	private String rating;
	
	public Movie(){		
	}
	
	public Movie(String name, String year, String description, String director, String duration, String poster,
			String rating) {
		this.name = name;
		this.year = year;
		this.description = description;
		this.director = director;
		this.duration = duration;
		this.poster = poster;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public String getYear() {
		return year;
	}

	public String getDescription() {
		return description;
	}

	public String getDirector() {
		return director;
	}

	public String getDuration() {
		return duration;
	}

	public String getPoster() {
		return poster;
	}

	public String getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "movie [name=" + name + ", year=" + year + ", description=" + description + ", director=" + director
				+ ", duration=" + duration + ", poster=" + poster + ", rating=" + rating + "]";
	}
}
