package com.example.snake;


import javafx.scene.input.KeyCode;

public class Controller {
    double lastX, lastY;
    boolean pause = false;

    public Controller(View view, World world) {
        addOtherListeners(view);

        view.canvas.setOnKeyPressed(e-> {
            if (e.getCode() == KeyCode.ESCAPE)
                pause = !pause;




            if(!pause){
                world.run(view.gc, e.getCode());
                view.redraw();
            }
        });


    }


    private void addOtherListeners(View view){
        view.canvas.setFocusTraversable(true); // Ensure canvas can receive key events
        view.canvas.requestFocus(); // Set focus on canvas to receive key events
        //TODO fix not working when double clicking
        view.primaryStage.widthProperty().addListener(e->{
            view.canvas.setHeight(view.primaryStage.getHeight());
            view.redraw();
        });

        view.primaryStage.heightProperty().addListener(e->{
            view.canvas.setWidth(view.primaryStage.getWidth());
            view.redraw();
        });
    }

}