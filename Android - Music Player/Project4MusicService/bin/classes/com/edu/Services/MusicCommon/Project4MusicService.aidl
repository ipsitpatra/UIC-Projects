package com.edu.Services.MusicCommon;

interface Project4MusicService {
	void playSong(int id, int action);
	boolean isPlaying();
	List<String> getLog();
	void clearLog();
}