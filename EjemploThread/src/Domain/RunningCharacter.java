package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;
/**
 * Clase que controla las imagenes de correr
 * @author Jesus Torres 
 */
public class RunningCharacter extends Character {

    public RunningCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }

    /**
     * Selecciona las imagenes a cambiar y los guarda en un arreglo
     * @throws FileNotFoundException 
     */
    public void setSprite() throws FileNotFoundException {
        ArrayList<Image> sprite = super.getSprite();
        for (int i = 0; i < 8; i++) {
            sprite.add(new Image(new FileInputStream("src/Assets/Running" + i + ".png")));
        }

    }

    /**
     * Corre el thread cambiandola imagen y pixeles
     */
    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();

        while (true) {
            try {
                int j = 0;
                for (int i = 60; i <= 700; i += 25) {
                    if (j >= 8){
                       j = 0;
                    }
                    super.setImage(sprite.get(j));
                    super.setX(i);
                    Thread.sleep(100);
                    j++;   
                }

            } catch (InterruptedException ex) {
            }
        }
    }
}
