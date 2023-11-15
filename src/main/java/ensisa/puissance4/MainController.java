package ensisa.puissance4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MainController {
    @FXML
    private void handleExitButtonAction(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
    @FXML
    private Circle jetonJoueur1;

    @FXML
    private Circle jetonJoueur2;

    // Méthode pour placer le jeton du joueur 1
    public void placerJetonJoueur1() {
        // Logique pour placer le jeton du joueur 1
    }

    // Méthode pour placer le jeton du joueur 2
    public void placerJetonJoueur2() {
        // Logique pour placer le jeton du joueur 2
    }
    @FXML
    private Label labelJoueur1;

    @FXML
    private Label labelJoueur2;

    // Méthode pour initialiser les éléments de jeu
    @FXML
    public void initialiserJeu() {
        labelJoueur1.setText("Joueur 1 :");
        labelJoueur2.setText("Joueur 2 :");
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), this::updateDuration));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    @FXML
    private Label durationLabel;
    private int secondsElapsed = 0;

    // Méthode appelée à chaque intervalle de la Timeline pour mettre à jour la durée
    private void updateDuration(ActionEvent event) {
        secondsElapsed++;
        int minutes = secondsElapsed / 60;
        int seconds = secondsElapsed % 60;
        durationLabel.setText(String.format("Durée: %02d:%02d", minutes, seconds));
    }
}