package models;

import java.time.LocalDate;

public class Song implements Durable {
    private final String name;
    private final LocalDate dateRelease;
    private final Float duration;
    private final String lirics;
    private final String feat;
    private final Author author;

    private Song(SongBuilder songBuilder) {
        this.name = songBuilder.songName;
        this.dateRelease = songBuilder.dateRelease;
        this.duration = songBuilder.duration;
        this.lirics = songBuilder.lirics;
        this.feat = songBuilder.feat;
        this.author = songBuilder.author;
    }

    // *Boilerplate */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {// toString hardcodeado con IA jeje
        String nombreAutor = (author != null) ? author.getName() + " " + author.getLastName() : "Desconocido";
        String infoFeat = (feat != null && !feat.trim().isEmpty()) ? " (ft. " + feat + ")" : "";

        String resumenLetra = (lirics != null && lirics.length() > 30) ? lirics.substring(0, 30) + "..." : lirics;

        return "🎵 CANCIÓN: " + name + "\n" +
                "   👤 Artista: " + nombreAutor + infoFeat + "\n" +
                "   ⏱️ Duración: " + obtainDuration() + " min  |  📅 Lanzamiento: " + dateRelease + "\n" +
                "   📝 Letra: \"" + resumenLetra + "\"";
    }

    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public Float getDuration() {
        return duration;
    }

    public String getLirics() {
        return lirics;
    }

    public String getFeat() {
        return feat;
    }

    public Author getAuthor() {
        return author;
    }

    public static class SongBuilder {
        // Atributos obligatorios
        private String songName;

        // Atributos en teoria opcionales
        private LocalDate dateRelease;
        private Float duration = 0f;
        private String lirics = "";
        private String feat = "";
        private Author author;

        public SongBuilder(String songName) {
            this.songName = songName;
        }

        public SongBuilder setDateRelease(LocalDate date) {
            dateRelease = date;
            return this;
        }

        public SongBuilder setDuration(Float duration) {
            this.duration = duration;
            return this;
        }

        public SongBuilder setLirics(String lirics) {
            this.lirics = lirics;
            return this;
        }

        public SongBuilder setFeat(String feat) {
            this.feat = feat;
            return this;
        }

        public SongBuilder setAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Song buildSong() {
            return new Song(this);
        }

    }

    @Override
    public float obtainDuration() {
        return this.duration;
    }

    @Override
    public String showSelf() {
        return toString();
    };
}
