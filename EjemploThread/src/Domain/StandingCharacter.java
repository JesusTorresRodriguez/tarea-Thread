package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 * Clase que contrar el papadeo de la imagen
 * @author Jesus Torres
 */
public class StandingCharacter extends Character {

    public StandingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    /**
     * Guarda y selecciona las imagenes en un arreglo
     * @throws FileNotFoundException 
     */
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        for(int i = 0; i < 4; i++){
            sprite.add(new Image(new FileInputStream("src/Assets/Standing"+i+".png")));
            
            
        }
        super.setSprite(sprite);
    }

    /**
     * Corre los thread que por pixeles
     */
    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        
        while (true) {
            try {
                for (int i = 0; i < 4; i++) {
                super.setImage(sprite.get(i));
                Thread.sleep(700);
                }
            } 
            catch (InterruptedException ex) { }
        }
    }
}
