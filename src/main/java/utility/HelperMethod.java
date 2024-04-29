package utility;

import com.example.snake.Model;
import com.example.snake.World;

import java.util.Random;

public class HelperMethod {

    public static Integer[] getRandomCoord(){
        int x = new Random().nextInt(Model.world.getSize());
        int y = new Random().nextInt(Model.world.getSize());

        while(Model.world.isOccupied(x,y)){
            x = new Random().nextInt(Model.world.getSize());
            y = new Random().nextInt(Model.world.getSize());
        }

        return new Integer[]{x,y};
    }

}
