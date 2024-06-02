package utility;

import com.example.snake.Model;
import javafx.scene.image.Image;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.Random;

public class HelperMethod {

//    public static Integer[] getRandomCoord(){
//        int x = new Random().nextInt(Model.world.getSize());
//        int y = new Random().nextInt(Model.world.getSize());
//
//        while(Model.world.isOccupied(x,y)){
//            x = new Random().nextInt(Model.world.getSize());
//            y = new Random().nextInt(Model.world.getSize());
//        }
//
//        return new Integer[]{x,y};
//    }

    public static Image getImage(String image){
        for (File file : Objects.requireNonNull(
                new File("src/main/resources/images").listFiles()))
            if(file.getName().equals(image))
                return new Image(file.getAbsolutePath());


        throw new UncheckedIOException(
                new FileNotFoundException(image + " does not exist in dir")
        );
    }

}
