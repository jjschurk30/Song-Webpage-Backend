package com.everyflavormusic.song.controllers;

import java.util.ArrayList;
import java.util.List;


import com.everyflavormusic.song.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.everyflavormusic.song.models.Song;

@RestController
@RequestMapping("/api/v1/songs")
public class SongsController {
    @Autowired
    private SongRepository songRepository;

    @GetMapping
    public List<Song> list() {
        return songRepository.findAll();

    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Song song){
        songRepository.save(song);
    }

    @GetMapping("/{id}")
    public Song get(@PathVariable("id") long id){
        return songRepository.getOne(id);
    }
}
