# CALCULATOR-PROJECT
This Java Swing code creates a basic calculator with a graphical user interface (GUI). 
The calculator allows users to perform simple arithmetic operations such as addition, subtraction, multiplication, and division.

The code starts by importing necessary Java packages such as java.awt and javax.swing. 
Then, the Calse class is defined which implements the ActionListener interface.

The Calse class contains several instance variables which store the state of the calculator, including whether an operator has been clicked, whether a particular arithmetic operator is in use, and the old and new values.

The constructor of the Calse class creates a new JFrame object which represents the main window of the calculator. 
It sets the size and position of the window and sets its layout to null, which allows the buttons and labels to be positioned manually.

Next, the constructor creates several buttons and a label for the display.
Each button is a JButton object with a label indicating its value (e.g. "1" or "+").
The buttons are given various attributes such as font size and color, and are added to the window using the add method.

The ActionListener interface is used to handle user interactions with the calculator. When a button is clicked,
the actionPerformed method of the Calse class is called, which updates the state of the calculator and updates the display accordingly.

For example, when a numeric button is clicked, its value is added to the display label. 
When an operator button is clicked, the corresponding operator is set as active and the old value is stored for later use.

Finally, the constructor sets the window to be visible by calling setVisible(true). This makes the calculator window appear on the screen and allows the user to interact with it.
