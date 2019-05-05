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

