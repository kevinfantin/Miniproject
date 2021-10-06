package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Player;

public interface PlayerRespository extends JpaRepository<Player, Long>{
	


}
