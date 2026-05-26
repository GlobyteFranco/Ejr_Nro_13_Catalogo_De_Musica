package views;

import controllers.MusicCatalogController;

public class MusicCatalogView {
    MusicCatalogController controller;

    public MusicCatalogView(MusicCatalogController controller) {
        this.controller = controller;
    }

    public void startProgram() {
        System.out.println("Welcome!! Next you will be seing the entire music catalog... \n");
        showMusicCatalog();

    }

    public void showMusicCatalog() {
        for (String element : controller.bringMusic()) {
            System.out.println(element + "\n\n\n");
        }

    }
}
