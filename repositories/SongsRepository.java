package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Durable;

public class SongsRepository {
    private List<Durable> musicCatalog = new ArrayList<>();

    public SongsRepository() {

    }

    public SongsRepository(List<Durable> musicCatalogParam) {
        this.musicCatalog = musicCatalogParam;
    }

    @Override
    public String toString() {
        return "SongsRepository [musicCatalog=" + musicCatalog + "]";
    }

    public List<Durable> getMusicCatalog() {
        return musicCatalog;
    }

    public void setMusicCatalog(List<Durable> musicCatalog) {
        this.musicCatalog = musicCatalog;
    }

    public void addDurable(Durable durable) {
        musicCatalog.add(durable);
    }

}
