package com.hw3.model;

public class Song {

	//鞘靛何
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//积己磊何
	public Song() {
		
	}

	public Song(String title, String album, String composer, int year, int track) {
		super();
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	
	public String show() {
		return "Song [title=" + title + ", album=" + album + ", composer=" + composer + ", year=" + year + ", track="
				+ track + "]";
	}
	
	
	
	
	
	
	
	
}
