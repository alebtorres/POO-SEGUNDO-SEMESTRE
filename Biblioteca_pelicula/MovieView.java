package Biblioteca_pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MovieView extends JFrame {
    private JLabel titleLabel;
    private JLabel directorLabel;
    private JLabel coverLabel;
    private JTextArea synopsisText;

    public MovieView() {
        super("Movie Details");
        setLayout(new GridLayout(4, 1));

        titleLabel = new JLabel();
        directorLabel = new JLabel();
        coverLabel = new JLabel();
        synopsisText = new JTextArea();

        add(titleLabel);
        add(directorLabel);
        add(coverLabel);
        add(synopsisText);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void displayMovie(Movie movie) {
        titleLabel.setText("Title: " + movie.getTitle());
        directorLabel.setText("Director: " + movie.getDirector());

        try {
            File coverFile = new File(movie.getCoverImagePath());
            BufferedImage coverImage = ImageIO.read(coverFile);
            coverLabel.setIcon(new ImageIcon(coverImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        synopsisText.setText("Synopsis:\n" + movie.getSynopsis());
    }
}