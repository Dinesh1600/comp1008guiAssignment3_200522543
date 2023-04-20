import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;

public class dineshController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextArea c1;

    @FXML
    private TextArea c2;

    @FXML
    private TextArea c3;

    @FXML
    private TextArea c4;

    @FXML
    private TextArea c5;

    @FXML
    private TextArea c6;

    @FXML
    private TextArea c7;

    @FXML
    private TextArea c8;

    @FXML
    private TextArea c9;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    private TextField txt4;

    @FXML
    private TextField txt5;

    @FXML
    private TextField txt6;

    @FXML
    private TextField txt7;

    @FXML
    private TextField txt8;

    @FXML
    private TextField txt9;

    @FXML
    private TextField txtName;

    String[] color = { "red", "blue", "green", "yellow", "brown", "black", "orange", "violet", "pink" };
    private ArrayList<Integer> arry = new ArrayList<>();
    private ArrayList<String> colorEnd = new ArrayList<>();
    private final int cons = 9;

    public void initialize(URL url, ResourceBundle rBundle) {

        comboBox.getItems().addAll(color);
        comboBox.setPromptText("Color");
    }

    @FXML
    void onAddStudent(ActionEvent event) {
        if (txtName.getText() == "") {
            Alert a = new Alert(AlertType.ERROR);
            a.setTitle("Error Message");
            a.setContentText("textfield value never be empty");
            a.show();
        } else {
            String name = txtName.getText();
            if (arry.size() < 9) {
                int ran = (int) (Math.random() * cons);
                while (check(ran)) {
                    ran = (int) (Math.random() * cons);
                }
                switch (ran) {
                    case 0:
                        txt1.setText(name);
                        checkColorC1();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 1:
                        txt2.setText(name);
                        checkColorC2();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 2:
                        txt3.setText(name);
                        checkColorC3();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 3:
                        txt4.setText(name);
                        checkColorC4();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 4:
                        txt5.setText(name);
                        checkColorC5();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 5:
                        txt6.setText(name);
                        checkColorC6();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 6:
                        txt7.setText(name);
                        checkColorC7();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 7:
                        txt8.setText(name);
                        checkColorC8();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    case 8:
                        txt9.setText(name);
                        checkColorC9();
                        arry.add(ran);
                        txtName.clear();
                        break;
                    default:
                        Alert a = new Alert(AlertType.ERROR);
                        a.setTitle("Error Message");
                        a.setContentText("Something went Wrong !!"+ran);
                        a.show();  
                }
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("All Seats are filled !!");
                a.show();
            }
        }

    }

    public boolean check(int j) {
        boolean a = false;
        if (arry.contains(j)) {
            a = true;
        }
        return a;
    }

    public void setColorC1(String c){
        c1.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC2(String c){
        c2.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC3(String c){
        c3.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC4(String c){
        c4.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC5(String c){
        c5.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC6(String c){
        c6.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC7(String c){
        c7.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC8(String c){
        c8.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }
    public void setColorC9(String c){
        c9.setStyle("-fx-background-color: "+c+";");
        colorEnd.add(c);
    }

    public void checkColorC1(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC1("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC1("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC1("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC1("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC1("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC1("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC1("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC1("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC1("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt1.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC1(tempColor);
        }
        
    }

    public void checkColorC2(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC2("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC2("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC2("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC2("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC2("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC2("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC2("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC2("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC2("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt2.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC2(tempColor);
        }
        
    }

    public void checkColorC3(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC3("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC3("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC3("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC3("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC3("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC3("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC3("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC3("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC3("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt3.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC3(tempColor);
        }
        
    }

    public void checkColorC4(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC4("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC4("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC4("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC4("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC4("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC4("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC4("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC4("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC4("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt4.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC4(tempColor);
        }
        
    }

    public void checkColorC5(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC5("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC5("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC5("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC5("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC5("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC5("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC5("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC5("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC5("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt5.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC5(tempColor);
        }
        
    }

    public void checkColorC6(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC6("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC6("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC6("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC6("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC6("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC6("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC6("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC6("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC6("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt6.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC6(tempColor);
        }
        
    }

    public void checkColorC7(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC7("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC7("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC7("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC7("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC7("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC7("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC7("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC7("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC7("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt7.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC7(tempColor);
        }
        
    }

    public void checkColorC8(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC8("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC8("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC8("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC8("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC8("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC8("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC8("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC8("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC8("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt8.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC8(tempColor);
        }
        
    }

    public void checkColorC9(){
        if(comboBox.getSelectionModel().getSelectedIndex()>-1){
            if (comboBox.getSelectionModel().getSelectedIndex()==0&&(!(colorEnd.contains("red")))){
                setColorC9("red");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==1&&(!(colorEnd.contains("blue")))){
                setColorC9("blue");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==2&&(!(colorEnd.contains("green")))){
                setColorC9("green");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==3&&(!(colorEnd.contains("yellow")))){
                setColorC9("yellow");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==4&&(!(colorEnd.contains("brown")))){
                setColorC9("brown");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==5&&(!(colorEnd.contains("black")))){
                setColorC9("black");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==6&&(!(colorEnd.contains("orange")))){
                setColorC9("orange");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==7&&(!(colorEnd.contains("voilet")))){
                setColorC9("voilet");
            }
            else if (comboBox.getSelectionModel().getSelectedIndex()==8&&(!(colorEnd.contains("pink")))){
                setColorC9("pink");
            }
            else{
                Alert a = new Alert(AlertType.ERROR);
                a.setTitle("Error Message");
                a.setContentText("Color Already taken !");
                a.show();
                txt9.clear();
            }
                
        }
        else{
            int r = (int)(Math.random()*cons);
            String tempColor = color[r];
            while (colorEnd.contains(tempColor)){
                r = (int)(Math.random()*cons);
                tempColor = color[r];
            }
            setColorC9(tempColor);
        }
        
    }

}
