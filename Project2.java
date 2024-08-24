
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

//************************************************************************
//  StyleOptionsPane.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//************************************************************************

public class Project2 extends VBox 
{
    private Text phrase;
    private Text price;
    private CheckBox pepperoni, mushrooms, onions, anchovies, pineapple;
    private RadioButton small, medium, large;
    private int cost = 0;

    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and check boxes that
    //  determine the style of the text font.
    //--------------------------------------------------------------------
    public Project2() 
    {
        phrase = new Text("Pizza Selection");
        phrase.setFont(new Font("Helvetica", 36));
       
        ToggleGroup group = new ToggleGroup();
        
        small = new RadioButton("Small");
        small.setSelected(true);
        small.setToggleGroup(group);
        small.setOnAction(this::processCheckBoxAction);
        
        medium = new RadioButton("Medium");
        medium.setSelected(true);
        medium.setToggleGroup(group);
        medium.setOnAction(this::processCheckBoxAction);
        
        large = new RadioButton("Large");
        large.setSelected(true);
        large.setToggleGroup(group);
        large.setOnAction(this::processCheckBoxAction);
        
        pepperoni = new CheckBox("Pepperoni");
        pepperoni.setOnAction(this::processCheckBoxAction);
        
        mushrooms = new CheckBox("Mushrooms");
        mushrooms.setOnAction(this::processCheckBoxAction);
        
        onions = new CheckBox("Onions");
        onions.setOnAction(this::processCheckBoxAction);
        
        anchovies = new CheckBox("Anchovies");
        anchovies.setOnAction(this::processCheckBoxAction);
        
        pineapple = new CheckBox("Pineapple");
        pineapple.setOnAction(this::processCheckBoxAction);
        
        VBox topping = new VBox(pepperoni, mushrooms, onions, anchovies,pineapple);
        topping.setAlignment(Pos.CENTER_LEFT);
        topping.setSpacing(20);
        
        VBox size = new VBox(small,medium,large);
        size.setAlignment(Pos.CENTER_LEFT);
        size.setSpacing(40);
       
        HBox options = new HBox(size, topping);
        options.setAlignment(Pos.CENTER);
        options.setSpacing(40);  // between the check boxes
        
       
        
        setSpacing(20);  // between the text and the check boxes
       
        price = new Text("Pizza Cost: "+ cost);
        price.setFont(new Font("Helveteca", 36));
        
        getChildren().addAll(phrase, options, price);
        
     
        
        
        
        
        
    }
    
    //--------------------------------------------------------------------
    //  Updates the font style of the displayed text.
    //--------------------------------------------------------------------
    public void processCheckBoxAction(ActionEvent event)
    {
        int top = 0;
    	int sml = 10;
    	int med = 14;
    	int lar = 18;
    	int pri = 0;
    	
    	if (small.isSelected())
    		pri = sml;
    	else if (medium.isSelected())
    		pri = med;
    	else if (large.isSelected())
    		pri = lar;
    		
    	if (pepperoni.isSelected())
           top = top+1;
        
        if (mushrooms.isSelected())
        	top = top+1;
       
        if (onions.isSelected())
           top = top+1; 
        
        if (anchovies.isSelected())
        	top = top+1; 
       
        if (pineapple.isSelected())
        	top = top+1; 
            
       cost = pri + top;
       
       price.setText("Pizza Cost: "+ cost);
     
    }
  
         
    	
    	
    }
 
	


		
	
    


