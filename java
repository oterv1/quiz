import javax.swing.*;
import java.awt.*;

public class BonusQuestion extends JPanel {

	private JLabel question;
	private JRadioButton answer1;
	private JRadioButton answer2;
	private JRadioButton answer3;
	private JRadioButton answer4;
	private ButtonGroup bg;
	
	public BonusQuestion() {
		
		setLayout(new GridLayout(5,1));
		
		question = new JLabel("How you create a field or method that does not belong to any instance of a class?");
		answer1 = new JRadioButton("Creating a public field.");
		answer2 = new JRadioButton("Creating a protected field.");
		answer3 = new JRadioButton("Creating a private field.");
		answer4 = new JRadioButton("Creating an static field.");
		
		bg = new ButtonGroup();
		
		bg.add(answer1);
		bg.add(answer2);
		bg.add(answer3);
		bg.add(answer4);
		
		setBorder(BorderFactory.createTitledBorder("Bonus Question"));
		
		add(question);
		add(answer1);
		add(answer2);
		add(answer3);
		add(answer4);
		
		
		
		
		
	}
	
	//Return the right question with the points
	public double getPoints11() {
		double points = 0.0;
		if(answer4.isSelected())
			points = 10.0;
		else
			points = 0.0;
		
		
		return points;
		
	}
}





// intro class

import javax.swing.*;
/**
 * 
 * @author Vladimir Otero
 * Introduction Panel
 *
 */
public class Introduction extends JPanel {

	private JLabel intro;
	
	
	//constructor
	public Introduction() {
		//intro label
		intro = new JLabel("General Java Knowledge Quiz");
		
		//add to panel
		add(intro);
		
	}
	
}

//Question1 Class


import java.io.*;

import java.util.Scanner;



import javax.swing.*;
import java.awt.*;

//Question1
public class Question1 extends JPanel {

	
	
	private JLabel question;
	private JRadioButton answer1;
	private JRadioButton answer2;
	private JRadioButton answer3;
	private JRadioButton answer4;
	private ButtonGroup bg;
	
	public Question1() {
		
		setLayout(new GridLayout(5,1));
		
		
		
		question = new JLabel("How is the BorderLayout Manager divided?");
		answer1 = new JRadioButton("Right, Left, Top, Down and Center.");
		answer2 = new JRadioButton("Section1, Section2, Section3, Section4.");
		answer3 = new JRadioButton("Regions North, South, East and Center.");
		answer4 = new JRadioButton("It is divided by colums and rows.");
		
		bg = new ButtonGroup();
		
		bg.add(answer1);
		bg.add(answer2);
		bg.add(answer3);
		bg.add(answer4);
		
		setBorder(BorderFactory.createTitledBorder("Question1"));
		
	    add(question);
		add(answer1);
		add(answer2);
		add(answer3);
		add(answer4);
		
		
		
		
		
	}
	
	//Return the right question with the points
	public double getPoints1()  {
		double points = 0.0;
		if(answer3.isSelected()) {
			points = 10.0;
		
		}
		else
			points = 0.0;
		
		return points;
	
		
			 
			 
			}
		}
	
	
	

//Question2 Class


import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question2 extends JPanel {

	private JLabel question;
	private JRadioButton answer1;
	private JRadioButton answer2;
	private JRadioButton answer3;
	private JRadioButton answer4;
	private ButtonGroup bg;
	
	public Question2() {
		
		setLayout(new GridLayout(5,1));
		
		question = new JLabel("When does aggregation occurs?");
		answer1 = new JRadioButton("When a class overrides another class");
		answer2 = new JRadioButton("When an instance of a class is a field in another class.");
		answer3 = new JRadioButton("When an object reference a variable.");
		answer4 = new JRadioButton("When a class is called by a parent class.");
		
		bg = new ButtonGroup();
		
		bg.add(answer1);
		bg.add(answer2);
		bg.add(answer3);
		bg.add(answer4);
		
		setBorder(BorderFactory.createTitledBorder("Question2"));
		
		add(question);
		add(answer1);
		add(answer2);
		add(answer3);
		add(answer4);
		
		
		
		
		
	}
	
	//Return the right question with the points
	public double getPoints2()  {
		double points = 0.0;
		if(answer2.isSelected()) {
			points = 10.0;
		
		}
		else
			points = 0.0;
		
		return points;
}
}


// There are 8 more Questions
//Quiz Calculator Class


import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//Test Calculator
public class QuizCalculator extends JFrame {

	private Question1 qu1;
	private Question2 qu2;
	private Question3 qu3;
	private Question4 qu4;
	private Question5 qu5;
	private Question6 qu6;
	private Question7 qu7;
	private Question8 qu8;
	private Question9 qu9;
	private Question10 qu10;
	private BonusQuestion bq;
	private JPanel buttonPanel;
	private JButton calculate;
	private JButton quit;
	
	public QuizCalculator() {
		
		this.setTitle("Quiz Calculator");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(6,2));
		
		qu1 = new Question1();
		qu2 = new Question2();
		qu3 = new Question3();
		qu4 = new Question4();
		qu5 = new Question5();
		qu6 = new Question6();
		qu7 = new Question7();
		qu8 = new Question8();
		qu9 = new Question9();
		qu10 = new Question10();
		bq = new BonusQuestion();
		
		
		buildButtonPanel();
		
		add(qu1);
		add(qu2);
		add(qu3);
		add(qu4);
		add(qu5);
		add(qu6);
		add(qu7);
		add(qu8);
		add(qu9);
		add(qu10);
		add(bq);
		add(buttonPanel);
		
		
	    pack();
		this.setVisible(true);
		
		
		
		
		
	}
	
	private void buildButtonPanel() {
		
		buttonPanel = new JPanel();
		
		calculate = new JButton("Submit");
		quit = new JButton("Quit");
		
		
		calculate.addActionListener(new CalculateButtonListener());
		quit.addActionListener(new QuitButtonListener());
		
		buttonPanel.add(calculate);
		buttonPanel.add(quit);
	}
	
	private class CalculateButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e)  {
		
			
			
			char grade = 0;
			//Validate with the Exception in case of numeric Error 
		try {	
			pointsGet();
			
		} catch(InputMismatchException e1) {
			
			JOptionPane.showMessageDialog(null, "Error: the points value is not a numeric data type.");
		} 
			
			
				if(pointsGet() >= 90)
					grade ='A';
				else if (pointsGet() >= 80)
					grade = 'B';
				else if(pointsGet() >= 70)
					grade = 'C';
				else if(pointsGet() >= 60)
					grade = 'D';
				else
					grade = 'F';
		
			
			
			
				
				
					JOptionPane.showMessageDialog(null, " Your Quiz score is " + pointsGet() + " points\n" +
					                                    " Your grade is " + grade);
				
				
				if(bq.getPoints11() == 10.0)
					JOptionPane.showMessageDialog(null, "Congratulations, you got the bonus points");
				else
					JOptionPane.showMessageDialog(null, "Sorry, you didn't get the bonus");
				
				String results = null;
				
				results = JOptionPane.showInputDialog( "If you want to check the results they are is the file (quiz.txt): press Y for yes.");
				
				
				if(results.equals("Y") || results.equals("y")) {
				//File error Exception
				try {
					showResults();
				} catch (FileNotFoundException e1) {
					
					System.out.println("Error: file not found. Try againg");
				}
				}
				
		}
		
		public double pointsGet()   {
			
		
			double points = qu1.getPoints1() + qu2.getPoints2() + qu3.getPoints3() + qu4.getPoints4() + qu5.getPoints5() + qu6.getPoints6() +
					 qu7.getPoints7() + qu8.getPoints8() + qu9.getPoints9() + qu10.getPoints10() + bq.getPoints11();
		  
		return points;
		
		}
            public void showResults() throws FileNotFoundException {
            	JFileChooser chooser = new JFileChooser();
        	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        	        "Text file", "txt");
        	    chooser.setFileFilter(filter);
        	    int returnVal = chooser.showOpenDialog(null);
        	    String line;
        	    if(returnVal == JFileChooser.APPROVE_OPTION) {
        	    	File file=chooser.getSelectedFile();
        	       System.out.println("You chose to open this file: " +
        	            chooser.getSelectedFile().getName());
        	 
        	       Scanner input=new Scanner(file);
        	      // lname=JOptionPane.showInputDialog("Type name");
        	       while(input.hasNextLine()) {
        	    	   
        	    	   line=input.nextLine();
        	    	   JOptionPane.showMessageDialog(null,line);
        	       }
        	       input.close();
        	  
        	    }
            
			}
	}
	private class QuitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new QuizCalculator();
	}
}

