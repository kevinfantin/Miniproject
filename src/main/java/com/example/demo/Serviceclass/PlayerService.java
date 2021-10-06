package com.example.demo.Serviceclass;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Player;

@Service
public interface PlayerService {
	
	List<Player> getAllPlayers();

}
