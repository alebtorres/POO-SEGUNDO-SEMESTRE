package Biblioteca_pelicula;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MovieController {
    private MovieView view;
    private MovieModel model;

    public MovieController(MovieView view, MovieModel model) {
        this.view = view;
        this.model = model;

        JButton nextButton = new JButton("Siguiente");
        view.add(nextButton, BorderLayout.SOUTH);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Movie nextMovie = model.getNextMovie();
                view.displayMovie(nextMovie);
            }
        });
    }
}