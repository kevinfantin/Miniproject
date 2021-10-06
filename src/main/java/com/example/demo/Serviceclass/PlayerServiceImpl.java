package com.example.demo.Serviceclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Player;
import com.example.demo.Respository.PlayerRespository;

@Component
public class PlayerServiceImpl implements PlayerService{

	
	@Autowired
	private PlayerRespository PlayerRespo; 
	@Override
	public List<Player> getAllPlayers() {
		
		return PlayerRespo.findAll();
	}

}
