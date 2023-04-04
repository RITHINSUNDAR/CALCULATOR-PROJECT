import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ShapeGraphicAttribute;
import java.text.NumberFormat.Style;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calse implements ActionListener {
	
	boolean isAddOperatorClicked=false;
	boolean isMinOperatorClicked=false;
	boolean isDivOperatorClicked=false;
	boolean isMulOperatorClicked=false;

	boolean checkAdd=false;
	boolean checkMin=false;
	boolean checkDiv=false;
	boolean checkMul=false;
	
	String oldValue;
	String newValue;
	
	float result;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,zeroButton;
	JButton eightButton,nineButton;
	JButton sixButton,fiveButton,fourButton,threeButton,twoButton;
	JButton oneButton,dotButton,divButton,mulButton,addButton,minButton;
	JButton equalButton,clearButton;
	
	public Calse() {
	    jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(500,100);
		
		 displayLabel=new JLabel();
		 displayLabel.setFont(new Font("verdana", Font.PLAIN, 40));
		 displayLabel.setBounds(30, 30, 540, 60);
		 displayLabel.setBackground(Color.darkGray);
		 displayLabel.setOpaque(true);
		 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		 displayLabel.setForeground(Color.YELLOW);
		 jf.add(displayLabel);
		 
	    sevenButton=new JButton("7");	
	    sevenButton.setFont(new Font("verdana", Font.PLAIN, 40));
	    sevenButton.setBackground(Color.DARK_GRAY);
	    sevenButton.setOpaque(true);
	    sevenButton.setForeground(Color.YELLOW);
		sevenButton.setBounds(30, 100,80 , 80);
		sevenButton.setContentAreaFilled(true);
		sevenButton.setFocusPainted(true);
		sevenButton.setBorderPainted(true);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setFont(new Font("verdana", Font.PLAIN, 40));
		eightButton.setBackground(Color.DARK_GRAY);
		eightButton.setOpaque(true);
		eightButton.setForeground(Color.YELLOW);
		eightButton.setBounds(130, 100,80 , 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
	    nineButton=new JButton("9");
	    nineButton.setFont(new Font("verdana", Font.PLAIN, 40));
	    nineButton.setBackground(Color.DARK_GRAY);
	    nineButton.setOpaque(true);
	    nineButton.setForeground(Color.YELLOW);
		nineButton.setBounds(230, 100,80 , 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
	    fourButton=new JButton("4");	
	    fourButton.setFont(new Font("verdana", Font.PLAIN, 40));
	    fourButton.setBackground(Color.DARK_GRAY);
	    fourButton.setOpaque(true);
	    fourButton.setForeground(Color.YELLOW);
		fourButton.setBounds(30, 190,80 , 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");	
		fiveButton.setFont(new Font("verdana", Font.PLAIN, 40));
		fiveButton.setBackground(Color.DARK_GRAY);
		fiveButton.setOpaque(true);
		fiveButton.setForeground(Color.YELLOW);
		fiveButton.setBounds(130, 190,80 , 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");	
		sixButton.setFont(new Font("verdana", Font.PLAIN, 40));
		sixButton.setBackground(Color.DARK_GRAY);
		sixButton.setOpaque(true);
		sixButton.setForeground(Color.YELLOW);
		sixButton.setBounds(230, 190,80 , 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);

		oneButton=new JButton("1");	
		oneButton.setFont(new Font("verdana", Font.PLAIN, 40));
		oneButton.setBackground(Color.DARK_GRAY);
		oneButton.setOpaque(true);
		oneButton.setForeground(Color.YELLOW);
		oneButton.setBounds(30, 280,80 , 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");	
		twoButton.setFont(new Font("verdana", Font.PLAIN, 40));
		twoButton.setBackground(Color.DARK_GRAY);
		twoButton.setOpaque(true);
		twoButton.setForeground(Color.YELLOW);
		twoButton.setBounds(130, 280,80 , 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setFont(new Font("verdana", Font.PLAIN, 40));
		threeButton.setBackground(Color.DARK_GRAY);
		threeButton.setOpaque(true);
		threeButton.setForeground(Color.YELLOW);
		threeButton.setBounds(230, 280,80 , 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		

		dotButton=new JButton(".");
		dotButton.setFont(new Font("verdana", Font.PLAIN, 40));
		dotButton.setBackground(Color.DARK_GRAY);
		dotButton.setOpaque(true);
		dotButton.setForeground(Color.YELLOW);
		dotButton.setBounds(30, 380,80 , 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setFont(new Font("verdana", Font.PLAIN, 40));
		zeroButton.setBackground(Color.DARK_GRAY);
		zeroButton.setOpaque(true);
		zeroButton.setForeground(Color.YELLOW);
		zeroButton.setBounds(130, 380,80 , 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setFont(new Font("verdana", Font.PLAIN, 40));
		equalButton.setBackground(Color.DARK_GRAY);
		equalButton.setOpaque(true);
		equalButton.setForeground(Color.YELLOW);
		equalButton.setBounds(230, 380,80 , 80);
		equalButton.addActionListener(this);	
		jf.add(equalButton);
		
		divButton=new JButton("/");	
		divButton.setFont(new Font("verdana", Font.PLAIN, 40));
		divButton.setBackground(Color.DARK_GRAY);
		divButton.setOpaque(true);
		divButton.setForeground(Color.YELLOW);
		divButton.setBounds(330, 100,80 , 80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");	
		mulButton.setFont(new Font("verdana", Font.PLAIN, 40));
		mulButton.setBackground(Color.DARK_GRAY);
		mulButton.setOpaque(true);
		mulButton.setForeground(Color.YELLOW);
		mulButton.setBounds(330, 190,80 , 80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		addButton=new JButton("+");	
		addButton.setFont(new Font("verdana", Font.PLAIN, 40));
		addButton.setBackground(Color.DARK_GRAY);
		addButton.setOpaque(true);
		addButton.setForeground(Color.YELLOW);
		addButton.setBounds(330, 280,80 , 80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		minButton=new JButton("-");	
		minButton.setFont(new Font("verdana", Font.PLAIN, 40));
		minButton.setBackground(Color.DARK_GRAY);
		minButton.setOpaque(true);
		minButton.setForeground(Color.YELLOW);
		minButton.setBounds(330, 380,80 , 80);
		minButton.addActionListener(this);
		jf.add(minButton);
		
		clearButton=new JButton("CLEAR");
		/*clearButton.setFont(new Font("Serif",Font.PLAIN,40));*/
		clearButton.setBackground(Color.DARK_GRAY);
		clearButton.setOpaque(true);
		clearButton.setForeground(Color.YELLOW);
		clearButton.setBounds(420, 380,80 , 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
	
	
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calse();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("7");
		}else {
			  displayLabel.setText(displayLabel.getText()+"7");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				
		}else if(e.getSource()==eightButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("8");
		}else {
			  displayLabel.setText(displayLabel.getText()+"8");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==nineButton) {
			if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("9");
		}else {
			  displayLabel.setText(displayLabel.getText()+"9");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==sixButton) {
		      if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("6");
	    }else {
			  displayLabel.setText(displayLabel.getText()+"6");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==fiveButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("5");
		}else {
			  displayLabel.setText(displayLabel.getText()+"5");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==fourButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("4");
	    }else {
			  displayLabel.setText(displayLabel.getText()+"4");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==threeButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("3");
	    }else {
			  displayLabel.setText(displayLabel.getText()+"3");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==twoButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("2");
		}else {
			  displayLabel.setText(displayLabel.getText()+"2");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
		}else if(e.getSource()==oneButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("1");
	    }else {
			  displayLabel.setText(displayLabel.getText()+"1");
			  }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==zeroButton) {
			  if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText("0");
		}else {
		      displayLabel.setText(displayLabel.getText()+"0");
		      }try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==dotButton) {
	          if(isAddOperatorClicked||isMulOperatorClicked||isDivOperatorClicked||isMinOperatorClicked) {
			  displayLabel.setText(".");
		}
	          else {
			  displayLabel.setText(displayLabel.getText()+".");
			  }	try {
					Thread.sleep(100);
			 		
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
			
		}else if(e.getSource()==addButton) {
			isAddOperatorClicked=true;
		    oldValue=displayLabel.getText();
		    checkAdd=true;
			
		}else if(e.getSource()==minButton) {
			isMinOperatorClicked=true;
		    oldValue=displayLabel.getText();
		    checkMin=true;
			
		 
		}else if(e.getSource()==mulButton) {
			isMulOperatorClicked=true;
		    oldValue=displayLabel.getText();
		    checkMul=true;
		
		}else if(e.getSource()==divButton) {
			isDivOperatorClicked=true;
		    oldValue=displayLabel.getText();
		    checkDiv=true;
			
			
		}else if(e.getSource()==equalButton){
			 newValue=displayLabel.getText();
			    Float oldValueF=Float.parseFloat(oldValue);
				Float newValueF=Float.parseFloat(newValue);
				
			if(checkAdd) {
			 result=oldValueF+newValueF;
				displayLabel.setText(result+"");
			}else if(checkMin) {
				 result=Math.abs(newValueF-oldValueF);
					displayLabel.setText(result+"");
				
			}else if(checkMul) {
				 result=(oldValueF*newValueF);
					displayLabel.setText(result+"");
			}else if(checkDiv) {
				 result=oldValueF/newValueF;
					displayLabel.setText(result+"");
			}
			try {
				Thread.sleep(100);
 		
			}catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			
		}else if(e.getSource()==clearButton){
			displayLabel.setText("");
			
			}	try {
			Thread.sleep(100);
	 		
		}catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		
			
		
		// TODO Auto-generated method stub
		
	}

} 
