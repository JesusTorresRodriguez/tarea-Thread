package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 * Clase que controla los saltos de las imagenes 
 * @author Jesus Torres
 */
public class JumpingCharacter extends Character {
     
    public JumpingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    /**
     * Sleeciona las imagenes y las guarda en un arraylist
     * @throws FileNotFoundException 
     */
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        
        for (int i = 0; i < 3; i++) {
            sprite.add(new Image(new FileInputStream("src/Assets/Jumping"+i+".png")));
        }
    }

    /**
     * Recorre y da movimiento  las imagenes
     */
    @Override
    public void run() {
 
        while (true) {
            try {
                for (int j = 270; j < 365; j++) {
                    ArrayList<Image> sprite = super.getSprite();
                    super.setImage(sprite.get(1));
                    Thread.sleep(10);
                    this.setY(j);

                }


                ArrayList<Image> sprite2 = super.getSprite();
                super.setImage(sprite2.get(2));
                this.setY(365);
                Thread.sleep(400);
               

                for (int j = 365; j  > 270; j--) {
                    ArrayList<Image> sprite1 = super.getSprite();
                    super.setImage(sprite1.get(0));
                    Thread.sleep(10);
                    this.setY(j);
                }
                
            }catch (InterruptedException ex) {} 
        }
    }
}
