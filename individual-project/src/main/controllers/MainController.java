package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import main.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button btnBills;

    @FXML
    private Button btnIssued;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnProducts;

    @FXML
    private Button btnVendors;

    @FXML
    private AnchorPane page;

    // when form loads
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadPage("fxml/products.fxml");
    }

    // when sidebar btn is clicked
    @FXML
    void pgButtonClicked(ActionEvent event) {
        if (event.getSource() == btnProducts){
            loadPage("fxml/products.fxml");
        }
        if (event.getSource() == btnVendors){
            loadPage("fxml/vedondors.fxml");
        }
        if (event.getSource() == btnOrders){
            loadPage("fxml/orders.fxml");
        }
        if (event.getSource() == btnBills){
            loadPage("fxml/bills.fxml");
        }
        if (event.getSource() == btnIssued){
            loadPage("fxml/isssued.fxml");
        }
    }


    private void loadPage(String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource(resource));
            setNode(loader.load());
        } catch (IOException exc) {
            exc.printStackTrace();
            setNode(null);
        }
    }

    // Align item in pane
    private void setNode(Node node) {
        AnchorPane.setBottomAnchor(node, (double) 0);
        AnchorPane.setTopAnchor(node, (double) 0);
        AnchorPane.setLeftAnchor(node, (double) 0);
        AnchorPane.setRightAnchor(node, (double) 0);

        page.getChildren().setAll(node);
    }

}
