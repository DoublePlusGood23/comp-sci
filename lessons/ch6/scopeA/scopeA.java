/*
  Ethan R. Jones
  10-31-2014
  360 No-Scope
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton, etc. 

public class scopeA extends JApplet
{
    
    JTextArea outputArea;
    int x = 1; // Global variable
    
    public void init()
    {
	outputArea = new JTextArea();
	Container form1 = getContentPane();

	form1.add(outputArea);
    }

    // One of the five built-in methods for Applets
    // Called after init()
    public void start()
    {
	int x = 5; // Local variable - Shadows the scope for the global x.
	outputArea.append("\nstart(B)Local x = " + x);

	useLocal();
	useField();

	useLocal();
	useField();

	outputArea.append("\nstart(E) Local x = " + x);
    }
    
    public void useLocal()
    {
	int x = 25; // Local to this method.

	outputArea.append("\nuseLocal(B) Local x = " + x);
	x++;
	outputArea.append("\nuseLoca(E) Local x = " + x);
    }

    public void useField()
    {
	// Uses global 'x.'
        outputArea.append("\nuseField(B) Local x = " + x);
	x++;
	outputArea.append("\nuseLoca(E) Local x = " + x); 
    }
}
