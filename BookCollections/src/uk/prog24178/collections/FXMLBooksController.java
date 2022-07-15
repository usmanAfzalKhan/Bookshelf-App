/**
 * Controller class all imports are used.
 */
package uk.prog24178.collections;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * Controller class which contains 5 methods for each button which the user interacts with,
 * imports radio button for 3 characters from the FXML,
 * imports 4 text area for each characters and for allBooks from FXML,
 * imports 2 text fields which are the title and the description from FXML.
 * @author Usman
 */
public class FXMLBooksController implements Initializable {

    @FXML
    private RadioButton albert, balthasar, cassidy;

    @FXML
    private TextArea albertBookOutput, balthasarBookOutput, cassidyBookOutput, allBooks;

    @FXML
    private TextField bkTitle, bkDesc;

    @FXML
    private CheckBox incDesc;
    ArrayList<String> albertInput = new ArrayList<String>();
    ArrayList<String> balthasarInput = new ArrayList<String>();
    ArrayList<String> cassidyInput = new ArrayList<String>();
    @FXML
    private void printAll(ActionEvent event) {
        String a = (albertBookOutput.getText()+ "\n"+ balthasarBookOutput.getText() +"\n"+cassidyBookOutput.getText() );
        ArrayList<String> allBook = new ArrayList<String>();
        allBook.add(a);
        Collections.sort(allBook);
        for (String string : allBook) {
           allBooks.setText(string); 
        }
    }
    @FXML
    private void sort(ActionEvent event) {
        if (albert.isSelected()) {
            Collections.sort(albertInput);
            bkTitle.clear();
            albertBookOutput.setText("Sorted Book:");
            for (String a : albertInput) {
                albertBookOutput.setText(albertBookOutput.getText() + "\n" + a);
            }
        }
        if (balthasar.isSelected()) {
            Collections.sort(balthasarInput);
            bkTitle.clear();
            balthasarBookOutput.setText("Sorted Book:");
            for (String a : balthasarInput) {
                balthasarBookOutput.setText(balthasarBookOutput.getText() + "\n" + a);
            }
        }
        if (cassidy.isSelected()) {
            Collections.sort(cassidyInput);
            bkTitle.clear();
            cassidyBookOutput.setText("Sorted Book:");
            for (String a : cassidyInput) {
                cassidyBookOutput.setText(cassidyBookOutput.getText() + "\n" + a);
            }
        }
    }

    @FXML
    private void saveBook(ActionEvent event) {
        if (albert.isSelected()) {
            String albertBooks = bkTitle.getText();
            albertInput.add(albertBooks);
            String albertB = albertBookOutput.getText();
            albertBookOutput.setText(albertB + "\n" + albertBooks);
            bkTitle.clear();
        }
        if (albert.isSelected() && incDesc.isSelected()) {
            String albertBooks = bkTitle.getText();
            String albertDesc = bkDesc.getText();
            albertInput.add(albertBooks);
            albertInput.add(albertDesc);
            String albertB = albertBookOutput.getText();
            String albertD = albertBookOutput.getText();
            albertBookOutput.setText(albertB + ": \n\t" + albertDesc);
            bkTitle.clear();
            bkDesc.clear();
        }
        if (balthasar.isSelected()) {
            String balthasarBooks = bkTitle.getText();
            balthasarInput.add(balthasarBooks);
            String balthasarB = balthasarBookOutput.getText();
            balthasarBookOutput.setText(balthasarB + "\n" + balthasarBooks);
            bkTitle.clear();
        }
        if (balthasar.isSelected() && incDesc.isSelected()) {
            String balthasarBooks = bkTitle.getText();
            String balthasarDesc = bkDesc.getText();
            balthasarInput.add(balthasarBooks);
            balthasarInput.add(balthasarDesc);
            String balthasarB = balthasarBookOutput.getText();
            String balthasarD = balthasarBookOutput.getText();
            balthasarBookOutput.setText(balthasarB + ": \n\t" + balthasarDesc);
            bkTitle.clear();
            bkDesc.clear();
        }

        if (cassidy.isSelected()) {
            String cassidyBooks = bkTitle.getText();
            cassidyInput.add(cassidyBooks);
            String cassidyB = cassidyBookOutput.getText();
            cassidyBookOutput.setText(cassidyB + "\n" + cassidyBooks);
            bkTitle.clear();
        }
        if (cassidy.isSelected() && incDesc.isSelected()) {
            String cassidyBooks = bkTitle.getText();
            String cassidyDesc = bkDesc.getText();
            cassidyInput.add(cassidyBooks);
            cassidyInput.add(cassidyDesc);
            String cassidyB = cassidyBookOutput.getText();
            String cassidyD = cassidyBookOutput.getText();
            cassidyBookOutput.setText(cassidyB + ": \n\t" + cassidyDesc);
            bkTitle.clear();
            bkDesc.clear();
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        if (albert.isSelected()) {
            albertBookOutput.clear();
            balthasar.setSelected(false);
            bkTitle.clear();
            bkDesc.clear();
            allBooks.clear();
        }
        if (balthasar.isSelected()) {
            balthasarBookOutput.clear();
            balthasar.setSelected(false);
            bkTitle.clear();
            bkDesc.clear();
            allBooks.clear();
        }
        if (cassidy.isSelected()) {
            cassidyBookOutput.clear();
            cassidy.setSelected(false);
            bkTitle.clear();
            bkDesc.clear();
            allBooks.clear();
        }
        incDesc.setSelected(false);
    }

    @FXML
    private void quit(ActionEvent event) {
        Platform.exit();
    }
    /**
     * Initiliazes the controller class.
     * @param url
     * @param rb 
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
