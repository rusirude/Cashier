package com.leaf.cashier;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.leaf.cashier.bl.SysUserBL;
import com.leaf.cashier.dto.ResponseDTO;
import com.leaf.cashier.enums.ResponseCodeEnum;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {
    
    @FXML
    private JFXTextField txtUsername;
    
    @FXML
    private JFXPasswordField txtPassword;
    
    @FXML
    private void btnSignInAction(ActionEvent event) throws Exception{        
        ResponseDTO responseDTO = SysUserBL.login(txtUsername.getText(), txtPassword.getText());
        if(ResponseCodeEnum.SUCCESS.getCode().equals(responseDTO.getCode())){
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Dashboard.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
        }
        else{
        }
        
    }
    @FXML
    private void btnExitAction(ActionEvent event) throws Exception{
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
