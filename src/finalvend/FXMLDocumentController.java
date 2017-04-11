/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvend;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static java.util.stream.StreamSupport.doubleStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author albert
 */
public class FXMLDocumentController implements Initializable, ControlledScreen {
    /**
     * Instantiate variables
     */
    @FXML private CheckBox coke;
    @FXML private CheckBox pepsi;
    @FXML private CheckBox fanta;
    @FXML private CheckBox sprite;
    @FXML private CheckBox rootbeer;
    @FXML private CheckBox icedtea;
    @FXML private Button vend;
    @FXML private TextField moneyField;
    @FXML private TextField changeField;
     private double moneyInputed, change;
     private double sum;
     
   
    private ArrayList <Double> selections = new ArrayList<Double>();
    NumberFormat formatter = new DecimalFormat("#0.00");
   
    /**
     * method will check if check boxes were selected, and add the selected items to selections array
     */
    public void selectedItems(){
        
        if (coke.isSelected() == true)
            selections.add(1.25);
        if(pepsi.isSelected() == true){
          selections.add(1.25);
        }
        if(fanta.isSelected() == true){
          selections.add(1.25);
        }
        if(sprite.isSelected() == true){
          selections.add(1.25);
        }
        if(rootbeer.isSelected() == true){
          selections.add(1.25);
        }
        if(icedtea.isSelected() == true){
          selections.add(1.25);
        }
        if(icedtea.isSelected() == false && rootbeer.isSelected() == false && sprite.isSelected() == false && fanta.isSelected() == false && pepsi.isSelected() == false && coke.isSelected() == false){
            String errorMessage = "Please Make a Selection";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * method getFindTotal
     * @return double sum
     */
    public double getFindTotal(){
        return sum;
    }
    /**
     * loops through array to find total of selections and stores it in global variable sum
     */ 
    public void setFindTotal(){
        
        for (double total : selections){
          sum  = sum + total;
          
    }
        
    }
    /**
     * method to find change from money inputted subtracting the sum, and validates change variable is greater than 0.
     */
    public void setChange(){
        
       change =  moneyInputed - sum;
       
       if(change <= 0){
           String errorMessage = "You do not have enough money for this purchase";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            
            change = 0;
           // throw new IllegalArgumentException("Please insert more money.");
       }else{
           
       }
    }
    /**
     * method returns double change
     * @return 
     */
    public double getChange(){
        return change;
    }
    /**
     * method returns double moneyInputed
     * @return 
     */
    public double getMoney(){
        return moneyInputed;
    }
    /**
     * method that takes money field, formats and checks if change is greater than 5 cents.
     */
    public void setMoney(){
     String tempMoney = moneyField.getText();

        double tempMoneyDouble = Double.parseDouble(tempMoney);
         
        if((tempMoneyDouble/0.05) % 1 == 0){ 
       moneyInputed = tempMoneyDouble;
    }else{
            String errorMessage = "This machine does not accept change smaller than 5 cent coins";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.INFORMATION_MESSAGE);
         //throw new IllegalArgumentException("Money inputed must be greater than $0.05");
        }
      
    }
    /**
     * clears all selections made
     */
    public void clear(){
        sum = 0;
        change = 0;
        selections.clear();
    }
    /**
     * method to format money
     * @return String formattedMoneyField
     */
    public String formatMoney(){
        double tempMoneyField = Double.parseDouble(moneyField.getText());
        String formattedMoneyField = formatter.format(tempMoneyField);
        
        return formattedMoneyField;
    }
    /**
     * method to format change
     * @return String formattedChangeText
     */
    public String formatChange(){
        String formattedChangeText = formatter.format(change);
        return formattedChangeText;
    }
    /**
     * method to get text fields
     */
    public void setTextFields(){
        changeField.setText(formatChange());
    moneyField.setText(formatMoney());
    }
    /**
     * method to run methods: clear(), setMoney(), selectedItems(), findTotal(), setChange(), setTextFields()
     * @param event vend
     */
    public void vend(ActionEvent event)
    {
        
     clear();
     setMoney();
     selectedItems();
     setFindTotal();
     setChange();
     setTextFields();
    }
    
    
    
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
    }    
    
    ScreensController myController;
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    private void goToCandy(ActionEvent event){
        myController.setScreen(ScreensFramework.screen2ID);
    }
    
    
    
}
