package com.everyflavormusic.song.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everyflavormusic.song.models.Song;

public interface SongRepository extends JpaRepository<Song, Long> {

}