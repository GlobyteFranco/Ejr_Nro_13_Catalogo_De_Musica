package utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import models.Author;
import models.Song;
import models.Album;
import models.Durable;

public class SongUtil {

    public static List<Durable> obtainCatalog() { // Metodo claramente hardcodeado por IA (gracias Gemini, perdon
                                                  // Copilot)
        List<Durable> catalog = new ArrayList<>();

        Author charly = new Author("Charly", "García", 74, "1.2M");
        Author cerati = new Author("Gustavo", "Cerati", 55, "3.5M");
        Author spinetta = new Author("Luis Alberto", "Spinetta", 62, "800K");

        Song nosSiguenPegando = new Song.SongBuilder("Nos Siguen Pegando Abajo")
                .setDateRelease(LocalDate.of(1983, 11, 5))
                .setDuration(3.30f)
                .setLirics("Mire el dinero en su mano...")
                .setAuthor(charly)
                .buildSong();

        Song demoliendoHoteles = new Song.SongBuilder("Demoliendo Hoteles")
                .setDateRelease(LocalDate.of(1984, 5, 10))
                .setDuration(4.15f)
                .setLirics("Yo nací en el año cincuenta y uno...")
                .setAuthor(charly)
                .buildSong();

        Song crimen = new Song.SongBuilder("Crimen")
                .setDateRelease(LocalDate.of(2006, 4, 4))
                .setDuration(4.32f)
                .setLirics("La espera me agotó...")
                .setAuthor(cerati)
                .buildSong();

        Song puente = new Song.SongBuilder("Puente")
                .setDateRelease(LocalDate.of(1999, 6, 1))
                .setDuration(4.33f)
                .setLirics("Cruza el amor por el puente...")
                .setAuthor(cerati)
                .buildSong();

        Song seguirViviendo = new Song.SongBuilder("Seguir Viviendo Sin Tu Amor")
                .setDateRelease(LocalDate.of(1991, 10, 15))
                .setDuration(3.40f)
                .setLirics("Y hoy que enloquecido vuelvo...")
                .setAuthor(spinetta)
                .buildSong();

        List<Song> listaRockNacional = new ArrayList<>();
        listaRockNacional.add(nosSiguenPegando);
        listaRockNacional.add(crimen);
        listaRockNacional.add(seguirViviendo);

        Album compiladoRock = new Album("Grandes Éxitos del Rock", LocalDate.of(2020, 1, 1), listaRockNacional);

        List<Song> listaBocanada = new ArrayList<>();
        listaBocanada.add(puente);

        Song paseoInmoral = new Song.SongBuilder("Paseo Inmoral")
                .setDateRelease(LocalDate.of(1999, 6, 1))
                .setDuration(4.50f)
                .setLirics("Pasaje de mi vida...")
                .setAuthor(cerati)
                .setFeat("Leo García")
                .buildSong();
        listaBocanada.add(paseoInmoral);

        Album bocanada = new Album("Bocanada", LocalDate.of(1999, 6, 1), listaBocanada);

        catalog.add(demoliendoHoteles);
        catalog.add(compiladoRock);
        catalog.add(bocanada);

        return catalog;
    }
}