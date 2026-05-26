import controllers.MusicCatalogController;
import repositories.SongsRepository;
import utilities.SongUtil;
import views.MusicCatalogView;;

public class App {
    public static void main(String[] args) {
        // Inicializar todo y ejecutar la funcion que muestra todo

        MusicCatalogView musicView = new MusicCatalogView(
                new MusicCatalogController(new SongsRepository(SongUtil.obtainCatalog())));
        musicView.startProgram();
    }
}
