package models;

import java.time.LocalDate;
import java.util.List;

public class Album implements Durable {
    private String name;
    private LocalDate dateRelease;
    private List<Song> songs;

    @Override
    public float obtainDuration() {
        float totalDuration = 0f;
        for (Song song : songs) {
            totalDuration += song.obtainDuration();
        }
        return totalDuration;
    }

    public Album(String name, LocalDate dateRelease, List<Song> songs) {
        this.name = name;
        this.dateRelease = dateRelease;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(LocalDate dateRelease) {
        this.dateRelease = dateRelease;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String showSelf() {
        return toString();
    }

    @Override
    public String toString() {// toString tambien hardcodeado con IA jejej
        StringBuilder sb = new StringBuilder();

        sb.append("💿 ÁLBUM: ").append(name.toUpperCase()).append("\n");
        sb.append("   📅 Lanzamiento: ").append(dateRelease)
                .append("  |  ⏱️ Duración Total: ").append(obtainDuration()).append(" min\n");

        sb.append("   --- Tracklist ---\n");
        if (songs == null || songs.isEmpty()) {
            sb.append("   [No hay canciones registradas en este álbum]\n");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                Song song = songs.get(i);
                sb.append("   ").append(i + 1).append(". 🎵 ")
                        .append(song.showSelf() + "\n\n");
            }
        }
        sb.append("   -----------------");

        return sb.toString();
    }

}
