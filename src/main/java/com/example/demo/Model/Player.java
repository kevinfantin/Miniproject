package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private String Game;
	private String playername;
	private int age;
	private String role;



	public String getGame() {
		return Game;
	}
	public void setGame(String game) {
		Game = game;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


}
