package tictactoe;
// importing modules

//this is a regular tictactoe game for two players 
// who ever gets three boxes of same color vertically, diagonally, or horizontally  first wins
                         
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
// extending jframe
public class TicTacToe extends JFrame {

    private Container content; // assigning the container frame to content
    // jb1-9 buttons for the tictactoe tiles
    // start button for start, about button for information, quit to end games
    private JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, start, about, quit;

    public TicTacToe() { // tictactoe constructor
        super("TICTACTOE"); // makinf title
        content = getContentPane();
        content.setLayout(new FlowLayout()); // setting container to flow layout
        content.setBackground(Color.white); // setting container background color white

        jb1 = new JButton();// creating first button
        jb1.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height

        jb2 = new JButton();// creating second button
        jb2.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb3 = new JButton();// creating third button
        jb3.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb4 = new JButton(); // creating fourth button
        jb4.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb5 = new JButton();// creating fifth button
        jb5.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb6 = new JButton();// creating sixth button
        jb6.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb7 = new JButton();// creating seventh button
        jb7.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb8 = new JButton();// creating eight button
        jb8.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        jb9 = new JButton();// creating nineth button
        jb9.setPreferredSize(new Dimension(100, 100)); // setting size to 100 in width and height
        start = new JButton("Start"); //  creating start button
        about = new JButton("About"); // creating about button
        quit = new JButton("Quit"); //  creating quit button

        content.add(jb1); // adding button1 to container

        content.add(jb2); // adding button2 to container
        content.add(jb3); // adding button3 to container
        content.add(jb4); // adding button4 to container
        content.add(jb5); // adding button5 to container
        content.add(jb6); // adding button6 to container
        content.add(jb7); // adding button7 to container
        content.add(jb8); // adding button8 to container
        content.add(jb9); // adding button9 to container
        content.add(start); // adding start button to container
        content.add(about); // adding about button to container
        content.add(quit); // adding quit buton to container

        setVisible(true); // setting container visible
        setSize(360, 400); // setting size of container width and height

        Toe tac = new Toe(); // creating button handler object
        jb1.addActionListener(tac); // adding button handler to button1
        jb2.addActionListener(tac); // adding button handler to button2
        jb3.addActionListener(tac); // adding button handler to button3
        jb4.addActionListener(tac); // adding button handler to button4
        jb5.addActionListener(tac); // adding button handler to button5
        jb6.addActionListener(tac); // adding button handler to button6
        jb7.addActionListener(tac); // adding button handler to button7
        jb8.addActionListener(tac); // adding button handler to button8
        jb9.addActionListener(tac); // adding button handler to button9
        start.addActionListener(tac); // adding button handler to start button
        about.addActionListener(tac); // adding button handler to about button
        quit.addActionListener(tac); // adding button handler to  quit button

    }

    private class Toe implements ActionListener {

        int click = 0; // varibale for number of clicks
        int row1 = 0; // variable for row1 when it all blue
        int row2 = 0; // variable for row2 when it all blue
        int row3 = 0; // variable for row3 when its all blue
        int col1 = 0; // variable for column1 when its all blue
        int col2 = 0;// variable for column2 when its all blue
        int col3 = 0; // variable for column3 when its all blue
        int diag1 = 0; // variable for diagonal boxes from the left when its all blue
        int diag2 = 0; // vcariable for diagonal boxes from the right when its all blue
        int Rrow1 = 0; // variable for row1 when it all red
        int Rrow2 = 0;// variable for row2 when it all red
        int Rrow3 = 0;// variable for row3 when its all red
        int Rcol1 = 0;// variable for column1 when its all red
        int Rcol2 = 0;// variable for column2 when its all red
        int Rcol3 = 0;// variable for column3 when its all red
        int Rdiag1 = 0;// variable for diagonal boxes from the left when its all red
        int Rdiag2 = 0;// vcariable for diagonal boxes from the right when its all red

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == start) { // when button clicked is start
                // it sets all the variables to zero
                click = 0;
                row1 = 0;
                row2 = 0;
                row3 = 0;
                col1 = 0;
                col2 = 0;
                col3 = 0;
                diag1 = 0;
                diag2 = 0;
                Rrow1 = 0;
                Rrow2 = 0;
                Rrow3 = 0;
                Rcol1 = 0;
                Rcol2 = 0;
                Rcol3 = 0;
                Rdiag1 = 0;
                Rdiag2 = 0;
               // sets all the buttons background color white
                jb1.setBackground(Color.white);
                jb2.setBackground(Color.white);
                jb3.setBackground(Color.white);
                jb4.setBackground(Color.white);
                jb5.setBackground(Color.white);
                jb6.setBackground(Color.white);
                jb7.setBackground(Color.white);
                jb8.setBackground(Color.white);
                jb9.setBackground(Color.white);
                // enabling all disabled buttons
               jb1.setEnabled(true);
               jb2.setEnabled(true);
               jb3.setEnabled(true);
               jb4.setEnabled(true);
               jb5.setEnabled(true);
               jb6.setEnabled(true);
               jb7.setEnabled(true);
               jb8.setEnabled(true);
               jb9.setEnabled(true);
               

            } else if (click < 9) { // checks if click is less than 9

                if (e.getSource() == jb1 && click % 2 == 0) { // checks if click is even and button 1
                    jb1.setBackground(Color.blue); // sets background color blue
                    click++; // increments click
                    row1++; // increments row1 blue
                    col1++; // increments col1 blue
                    diag1++; // increments diagonal from left blue
                    jb1.setEnabled(false);
                } else if (e.getSource() == jb2 && click % 2 == 0) {// checks if click is even and button 2
                    jb2.setBackground(Color.blue);
                    click++;// increments click
                    row1++; // incremenst row1 blue
                    col2++; // increments col2 blue
                    jb2.setEnabled(false);
                    
                } else if (e.getSource() == jb3 && click % 2 == 0) {// checks if click is even and button 3
                    jb3.setBackground(Color.blue);
                    click++;// increments click
                    row1++;// incremenst row1 blue
                    col3++;// increments col3 blue
                    diag2++;// increments diagonal from rigth blue
                    jb3.setEnabled(false);
                } else if (e.getSource() == jb4 && click % 2 == 0) {// checks if click is even and button 4
                    jb4.setBackground(Color.blue);
                    click++;// increments click
                    row2++;// incremenst row2 blue
                    col1++;// increments col1 blue
                    jb4.setEnabled(false);
                } else if (e.getSource() == jb5 && click % 2 == 0) {// checks if click is even and button 5
                    jb5.setBackground(Color.blue);
                    click++;// increments click
                    row2++;// incremenst row2 blue
                    col2++;// increments col2 blue
                    diag1++;// increments diagonal from left blue
                    diag2++;// increments diagonal from right blue
                    jb5.setEnabled(false);
                } else if (e.getSource() == jb6 && click % 2 == 0) {// checks if click is even and button 6
                    jb6.setBackground(Color.blue);
                    click++;// increments click
                    row2++;// incremenst row2 blue
                    col3++;// increments col3 blue
                    jb6.setEnabled(false);
                } else if (e.getSource() == jb7 && click % 2 == 0) {// checks if click is even and button 7
                    jb7.setBackground(Color.blue);
                    click++;// increments click
                    row3++; // incremenst row3 blue
                    col1++;// increments col1 blue
                    diag2++;// increments diagonal from right blue
                    jb7.setEnabled(false);
                } else if (e.getSource() == jb8 && click % 2 == 0) {// checks if click is even and button 8
                    jb8.setBackground(Color.blue);
                    click++;// increments click
                    row3++;// incremenst row3 blue
                    col2++;// increments col2 blue
                    jb8.setEnabled(false);
                } else if (e.getSource() == jb9 && click % 2 == 0) {// checks if click is even and button 9
                    jb9.setBackground(Color.blue);
                    click++;// increments click
                    row3++; // incremenst row3 blue
                    col3++;// increments col3 blue
                    diag1++; // increments diagonal from left blue
                    jb9.setEnabled(false);
                } else if (e.getSource() == jb1 && click % 2 != 0) {// checks if click is even and button 1
                    jb1.setBackground(Color.red);
                    click++;// increments click
                    Rrow1++;// incremenst row1 red
                    Rcol1++; // increments col1 red
                    Rdiag1++;// increments diagonal from left red
                    jb1.setEnabled(false);
                } else if (e.getSource() == jb2 && click % 2 != 0) {// checks if click is odd and button 2
                    jb2.setBackground(Color.red);
                    click++;// increments click
                    Rrow1++;// incremenst row1 red
                    Rcol2++;// increments col2 red
                    jb2.setEnabled(false);
                } else if (e.getSource() == jb3 && click % 2 != 0) {// checks if click is odd and button 3
                    jb3.setBackground(Color.red);
                    click++;// increments click
                    Rrow1++;// incremenst row1 red
                    Rcol3++;// incremenst row1 red
                    Rdiag2++;// increments diagonal from right red
                    jb3.setEnabled(false);
                } else if (e.getSource() == jb4 && click % 2 != 0) {// checks if click is odd and button 4
                    jb4.setBackground(Color.red);
                    click++;// increments click
                    Rrow2++;// incremenst row2 red
                    Rcol1++;// increments col1 red
                    jb4.setEnabled(false);
                } else if (e.getSource() == jb5 && click % 2 != 0) {// checks if click is odd and button 5
                    jb5.setBackground(Color.red);
                    click++;// increments click
                    Rrow2++;// incremenst row2 red
                    Rcol2++;// increments col2red
                    Rdiag1++;// increments diagonal from left red
                    Rdiag2++;// increments diagonal from right red
                    jb5.setEnabled(false);
                } else if (e.getSource() == jb6 && click % 2 != 0) {// checks if click is odd and button 6
                    jb6.setBackground(Color.red);
                    click++;// increments click
                    Rrow2++;// incremenst row2 red
                    Rcol3++;// increments col3 red
                    jb6.setEnabled(false);
                } else if (e.getSource() == jb7 && click % 2 != 0) {// checks if click is odd and button 7
                    jb7.setBackground(Color.red);
                    click++;// increments click
                    Rrow3++;// incremenst row3 red
                    Rcol1++;// increments col1 red
                    Rdiag2++;// increments diagonal from right red
                    jb7.setEnabled(false);
                } else if (e.getSource() == jb8 && click % 2 != 0) {// checks if click is odd and button 8
                    jb8.setBackground(Color.red);
                    click++;// increments click
                    Rrow3++;// incremenst row3 red
                    Rcol2++;// increments col2 red
                    jb8.setEnabled(false);
                } else if (e.getSource() == jb9 && click % 2 != 0) {// checks if click is odd and button 9
                    jb9.setBackground(Color.red);
                    click++;// increments click
                    Rrow3++;// incremenst row3 red
                    Rcol3++;// increments col3 red
                    Rdiag1++;// increments diagonal from left red
                    jb9.setEnabled(false);
                } else if (e.getSource() == quit) {
                    System.exit(0); // exit when quit is clicked
                } else if (e.getSource() == about) {
                    JOptionPane.showMessageDialog(null, "this is a regular tictactoe game for two players \n"+
                            "who ever gets three boxes of same color vertically, diagonally, or horizontally first, wins\n"+
                            "good luck!");

                }
                if (row1 == 3 || row2 == 3 || row3 == 3 || col1 == 3 || col2 == 3 || col3 == 3 || diag1 == 3 || diag2 == 3) {
                    JOptionPane.showMessageDialog(null, "Blue won!"); // checks if all rows or columns or diagonals are all blue returns winner
                    click = 9; // sets click to 9 so buttons are unclickable
                } else if (Rrow1 == 3 || Rrow2 == 3 || Rrow3 == 3 || Rcol1 == 3 || Rcol2 == 3 || Rcol3 == 3 || Rdiag1 == 3 || Rdiag2 == 3) {
                    JOptionPane.showMessageDialog(null, "Red won!");// checks if all rows or columns or diagonals are all red returns winner
                    click = 9;// sets click to 9 so buttons are unclickable
                } else if (click == 9) { // checks buttons have been clicked 9 times means there is no winner
                    JOptionPane.showMessageDialog(null, "Nobody won this round");
                }

            }
        }

    }

    public static void main(String[] args) {
        TicTacToe tic = new TicTacToe(); // creating and initializing a tictactoe object
        tic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit program when exit is clicked
        

    }

}
