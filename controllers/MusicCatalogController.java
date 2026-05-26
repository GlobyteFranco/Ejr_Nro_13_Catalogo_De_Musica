package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Durable;
import repositories.SongsRepository;

public class MusicCatalogController {
    SongsRepository songsRepository;

    public MusicCatalogController(SongsRepository songsRepository) {
        this.songsRepository = songsRepository;
    }

    public List<String> bringMusic() {
        List<String> listSongs = new ArrayList<>();
        for (Durable songFromRepositorie : songsRepository.getMusicCatalog()) {
            listSongs.add(songFromRepositorie.toString());
        }
        return listSongs;
    }
}
