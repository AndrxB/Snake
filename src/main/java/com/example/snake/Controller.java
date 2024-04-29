package com.example.snake;

public class Controller {
    double lastX, lastY;
    public Controller(View view) {
        view.canvas.setFocusTraversable(true); // Ensure canvas can receive key events
        view.canvas.requestFocus(); // Set focus on canvas to receive key events

        view.canvas.setOnKeyPressed(e->{
            Model.world.getPlayer().setState(e.getCode());
            System.out.println(Model.world.getPlayer().getState());
        });





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