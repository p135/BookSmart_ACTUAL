/*********************************************************************
 * Register.java
 *
 * This class allows the user to register into our program
 * @author  Pranav Kalsi
 * @since   2020-11-04
 ********************************************************************
*/

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.File;
import java.util.Scanner;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        // Check if files needed exist
        // if it is not redirect
        if (!isDataPresent()) {
            // create folder UserData just in case
            new File("UserData").mkdir();

            // create Users.txt & SurveyData.txt
            try {
                FileWriter fw = new FileWriter("UserData/Users.txt", true);
                fw.close();

                FileWriter pw = new FileWriter("UserData/SurveyData.txt", true);
                pw.close();
            } catch (Exception e) {
                //if no match was found just output a dialog box saying so
                JOptionPane.showMessageDialog(null, "Internal Error\n You will be redirected to previous screen", "Error",
                JOptionPane.ERROR_MESSAGE);

                //open firstScreen page
                new firstScreen().setVisible(true);

                //dispose this window
                this.dispose();
            }//end of try catch
        }//end if

        //run Netbeans auto-generated code
        initComponents();

        //set the JTextField password and rePassword to has text that is visible
        password.setEchoChar((char) 0);
        rePassword.setEchoChar((char) 0);
    }//end of constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * This method creates all of the front end elements
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        rePassword = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);

        firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstName.setText("Enter First Name");
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });

        lastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastName.setText("Enter Last Name");
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("Enter Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("Enter Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Register");

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Enter Password");
        password.setToolTipText("");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        rePassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rePassword.setText("Re-enter Password");
        rePassword.setToolTipText("");
        rePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rePasswordFocusLost(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("logos/logo.png"))); // NOI18N
        logo.setText("Place holder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(318, 318, 318))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(102, 102, 102)
                                                                        .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 144, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method checks if all the files need for this program to work exist.
     */
    private boolean isDataPresent(){
        //String [] to store the diectories this file needs
        String [] dirs = {"UserData/Users.txt", "UserData/SurveyData.txt"};

        //for loop to traverse through dirs
        for(String dir : dirs){
            //check if the file path doesn't exist
            if(!(new File(dir).exists())){
                //return false
                return false;
            }//end if
        }//end for loop

        //return true
        return true;
    }//end isDataPresent

    /**
     * This method is peformed when the register button is clicked
     * @param evt The Action event
     */
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        //Check if the password field and rePassword field are the same
        if (password.getText().equals(rePassword.getText())) {
            //Array to store the placeholders of all of the fields
            String[] defaults = {"Enter First Name", "Enter Last Name", "Enter Username", "Re-enter Password", "", "Enter Email"};

            //Put all of the fields in an array
            JTextField[] fields = {firstName, lastName, username, password, rePassword, email};

            //String to store any error
            String errors = "";

            //int i to keep count
            int i = 0;

            //for loop to traverse through defaults
            for (String s : defaults) {
                //Check if the field value equals the default text
                //Add the fields the problematic fields to String errors
                if (s.equals(fields[i].getText())) {
                    //add the appropriate JTextField name to the String errors
                    errors += defaults[i] + "\n";
                }//end if

                //increment i
                i++;
            }//end for loop

            //if statment to check is any errors were found
            if (errors.length() > 0) {
                //Tell user which fields are problematic
                JOptionPane.showMessageDialog(null, "The following field(s) have not been filled out:\n" + errors, "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                //Check if the user exists in the system
                int doesUsrExist = userExists(username.getText(), email.getText());

                //Check if user existed
                if(doesUsrExist == -1){
                    //run method to store the user in the data
                    storeUser(username.getText(), firstName.getText(), lastName.getText(), email.getText(), password.getText());

                    //tell user they have successfull registered
                    JOptionPane.showMessageDialog(null, "You have successfully registered!");

                    //go to bookSurvey page
                    new bookSurvey().setVisible(true);

                    //hide this page
                    this.dispose();
                }else{
                    //String to store error message
                    String message = "";

                    //Swith to formulate error message
                    switch (doesUsrExist) {
                        case 2:
                            message = "Your username and email are not unique please change them!";
                            break;

                        case 1:
                            message = "Your username is not unique please change it!";
                            break;

                        case 0:
                            message = "Your email is not unique please change it!";
                            break;

                        default:
                            message = "There was some internal error, sorry about that!";
                            break;
                    }//end switch

                    //Dialog box to show error
                    JOptionPane.showMessageDialog(null, message, "Error",
                            JOptionPane.ERROR_MESSAGE);
                }//end if else
            }//end if else
        } else {
            //JTexTArea to display the error message
            JTextArea textArea = new JTextArea();

            //Set textArea's attributes, to display error message properly
            textArea.setText("Password and Password Confirmation Don't Match");
            textArea.setSize(300, Short.MAX_VALUE); // limit = width in pixels, e.g. 500
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);
            textArea.setEditable(false);

            //JOptionPane to display error message
            JOptionPane.showMessageDialog(null, textArea, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }//end if else
    }//end method registerButtonActionPerformed

    /**
     * This method stores the registration information that the user has inputed
     * @param username The user's username
     * @param firstName The user's firstName
     * @param lastName The user's lastName
     * @param email The user's email
     * @param password The user's password
     */
    public void storeUser(String username, String firstName, String lastName, String email, String password){
        //The filepath to our user data
        final String FILENAME = "UserData/Users.txt";

        //FileWrite to append to user data
        FileWriter fw;

        //try-catch to add user to user data
        try{
            //Initialize fw to append to file
            fw = new FileWriter(FILENAME, true);

            //Append
            fw.write(username + "," + firstName + "," + lastName + "," + email + "," + password + "\n");

            //close fw
            fw.close();

            //PrintWriter to store file
            PrintWriter pw = new PrintWriter("stars/" + username + "-rated.txt");

            //close printwriter
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }//end of try catch
    }//end of method store user

    /**
     * Method to check is the user exists
     * @param enteredUsername the username the user entered
     * @param enteredEmail the email the user entered
     * @return 2 for change username and email, return 1 for change username, return 0 for change email, return -1 for all good
     */
    public int userExists(String enteredUsername, String enteredEmail){
        //file path to the user data
        final String FILENAME = "UserData/Users.txt";

        //DEV NOTE: only the username and email have to be unique
        File file = new File(FILENAME);
        Scanner reader = null;

        //try catch to initialize the Scanner
        try{
            reader = new Scanner(file);
        }catch(Exception e){
            e.printStackTrace();
        }//end of try catch

        //while loop to traverse through file
        while(reader.hasNextLine()){
            //String [] to represent the line (comma deliniated)
            String [] line = reader.nextLine().split(",");

            //for loop to strip each element in line
            for(int i = 0; i < line.length; i++){
                line[i] = line[i].strip();
            }//end of for loop

            //DEV NOTE: line format is: username,first name, last name, email, password
            //Check if the username and email exists
            if(line[0].equalsIgnoreCase(enteredUsername) && line[3].equalsIgnoreCase(enteredEmail)){
                return 2;
            } else if(line[0].equalsIgnoreCase(enteredUsername)){
                return 1;
            } else if(line[3].equalsIgnoreCase(enteredEmail)){
                return 0;
            }//end if else
        }//end of while loop

        //if nothing found then retunr -1
        return -1;
    }//end of method userExists

    /**
     * This method is called the when focus is lost from JTextField firstName
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        //if this firstName JTextField is enpty reset it to its initial value
        if (firstName.getText().equals("")) {
            firstName.setText("Enter First Name");
        }//end if
    }//end method rePasswordFocusLost

    /**
     * This method is called the when focus is gained from JTextField firstName
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained
        //if the firstName JTextField value is the default value than clear
        if (firstName.getText().equals("Enter First Name")) {
            firstName.setText("");
        }//end if
    }//end method firstNameFocusGained

    /**
     * This method is called the when focus is gained from JTextField lastName
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusGained
        //if the lastName JTextField value is the default value than clear
        if (lastName.getText().equals("Enter Last Name")) {
            lastName.setText("");
        }//end if
    }//end method lastNameFocusGained

    /**
     * This method is called the when focus is lost from JTextField lastName
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        //if this lastName JTextField is enpty reset it to its initial value
        if (lastName.getText().equals("")) {
            lastName.setText("Enter Last Name");
        }//end if
    }//end method lastNameFocusLost

    /**
     * This method is called the when focus is lost from JTextField username
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        //if this username JTextField is enpty reset it to its initial value
        if (username.getText().equals("")) {
            username.setText("Enter Username");
        }//end if
    }//end method usernameFocusLost

    /**
     * This method is called the when focus is gained from JTextField username
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        //if the username JTextField value is the default value than clear
        if (username.getText().equals("Enter Username")) {
            username.setText("");
        }//end if
    }//end method usernameFocusGained

    /**
     * This method is called the when focus is gained from JTextField email
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        //if the email JTextField value is the default value than clear
        if (email.getText().equals("Enter Email")) {
            email.setText("");
        }//end if
    }//end method emailFocusGained

    /**
     * This method is called the when focus is lost from JTextField email
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        //if this email JTextField is enpty reset it to its initial value
        if (email.getText().equals("")) {
            email.setText("Enter Email");
        }//end if
    }//end method emailFocusLost

    /**
     * This method is called the when focus is gained from JTextField password
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        //if this password JTextField's value is the initial value, then clear JTextField and hide text
        if (password.getText().equals("Enter Password")) {
            password.setText("");
            password.setEchoChar('*');
        }//end if
    }//end method passwordFocusGained

    /**
     * This method is called the when focus is lost from JTextField password
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        //check what value of rePassword it and hide, show, and reset text depending on in
        if (password.getText().equals("Enter Password") || password.getText().equals("")) {
            password.setText("Enter Password");
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }//end if else
    }//end method passwordFocusLost

    /**
     * This method is called the when focus is gained from JTextField rePassword
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void rePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePasswordFocusGained
        //if this rePassword JTextField's value is the initial value, then clear JTextField and hide text
        if (rePassword.getText().equals("Re-enter Password")) {
            rePassword.setText("");
            rePassword.setEchoChar('*');
        }//end if
    }//end method rePasswordFocusGained

    /**
     * This method is called the when focus is lost from JTextField rePassword
     * @param evt The action event java.awt.event.FocusEvent
     */
    private void rePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rePasswordFocusLost
        //check what value of rePassword it and hide, show, and reset text depending on in
        if (rePassword.getText().equals("Re-enter Password") || rePassword.getText().equals("")) {
            rePassword.setText("Re-enter Password");
            rePassword.setEchoChar((char) 0);
        } else {
            rePassword.setEchoChar('*');
        }//end of if else
    }//end method rePasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField rePassword;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}//end of class Register