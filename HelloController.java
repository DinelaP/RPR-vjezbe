package com.example.demo2;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class HelloController {
    public TextField fldIme;
    public TextField fldPrezime;
    public TextField fldMail;
    public TextField fldKorisnickoIme;
    public PasswordField fldLozinka;
    public ListView listaKorisnika;

    private KorisnikModel model; // bolji nacin da se radi preko konstruktora


    public HelloController(KorisnikModel model) {
        this.model = model;
    }

    @FXML
    public void initialize() {
        listaKorisnika.setItems(model.getKorisnici());
        listaKorisnika.getSelectionModel().selectedItemProperty().addListener((obv, o, n) -> {
            model.setTrenutniKorisnik((Korisnik) n);
            listaKorisnika.refresh();
        });
        model.trenutniKorisnikProperty().addListener((obv, o, n) -> {
            if(o != null){
                fldIme.textProperty().unbindBidirectional(o.imeProperty());
                fldPrezime.textProperty().unbindBidirectional(o.prezimeProperty());
                fldMail.textProperty().unbindBidirectional(o.eMailProperty());
                fldKorisnickoIme.textProperty().unbindBidirectional(o.korisnickoImeProperty());
                fldLozinka.textProperty().unbindBidirectional(o.lozinkaProperty());
            }
            if(n == null){ 
                fldIme.setText("");
                fldPrezime.setText("");
                fldMail.setText("");
                fldKorisnickoIme.setText("");
                fldLozinka.setText("");
            }else{

                fldIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                fldPrezime.textProperty().bindBidirectional(model.trenutniKorisnikProperty().get().prezimeProperty());
                fldMail.textProperty().bindBidirectional(model.trenutniKorisnikProperty().get().eMailProperty());
                fldKorisnickoIme.textProperty().bindBidirectional(model.trenutniKorisnikProperty().get().korisnickoImeProperty());
                fldLozinka.textProperty().bindBidirectional(model.trenutniKorisnikProperty().get().lozinkaProperty());

            }
        });
    }

    public void Kraj(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }
    public void actionDodaj(ActionEvent actionEvent){
        ObservableList<Korisnik> priv = model.getKorisnici();
        Korisnik novi = new Korisnik("", "", "", "", "");
        priv.add(novi);
        model.setKorisnici(priv);
        model.setTrenutniKorisnik(novi);
    }

}