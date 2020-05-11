package Java.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Opt extends JPanel implements ActionListener
{
    private JLabel CurrencyCounter;
    private JTextField tfCurrency;
    private JButton USD; 
    private JButton Euro;
    private JButton Pounds;
    private JButton CAD;
    private JButton Exit;
    private double count = 0;
    private double raw = 0.0;
    private String amount;

    public GUI_Opt(JFrame frame)
    {
        frame.setLayout(new GridLayout(0,1,15,40));
        
        JPanel f = new JPanel();
        f.setLayout(new GridLayout(6,0,15,10));
      
        CurrencyCounter = new JLabel("Currency Counter (In USD)", SwingConstants.CENTER);
        CurrencyCounter.setFont(new Font("Source Sans Pro", Font.BOLD, 15));  
        f.add(CurrencyCounter);                   
        tfCurrency = new JTextField(count + "", 10); 
        tfCurrency.setEditable(true);  
        f.add(tfCurrency);  

        USD = new JButton("USD");
        f.add(USD);                
        USD.addActionListener(this);

        Euro = new JButton("EUR");
        f.add(Euro);
        Euro.addActionListener(this);

        Pounds = new JButton("GBP");
        f.add(Pounds);
        Pounds.addActionListener(this);

        CAD = new JButton("CAD");
        f.add(CAD);
        CAD.addActionListener(this);

        Exit = new JButton("Exit");
        f.add(Exit);
        Exit.addActionListener(this);

                    
        frame.add(f);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        //Currency conversion as of 5/11/2020
        switch (e.getActionCommand())
        {
            case "USD":
                amount = tfCurrency.getText();
                if(amount.contains(":USD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":EUR"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw /= 0.9239;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":GBP"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw /= 0.8119;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":CAD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw /= 1.3984;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else
                {
                    raw = Double.parseDouble(amount);
                    count = Math.round(raw * 100.0) / 100.0;
                }
                
                tfCurrency.setText(count + "" + ":USD");
                
                break;
            case "EUR":
                amount = tfCurrency.getText();
                if(amount.contains(":USD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 0.924851;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":EUR"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    count = Math.round(raw * 100.0) / 100.0;
                    
                }
                else if(amount.contains(":GBP"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *=  1.1380;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":CAD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 0.6607;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else
                {
                    raw = Double.parseDouble(amount);
                    raw *= 0.924851;
                    count = Math.round(raw * 100.0) / 100.0;
                }

                tfCurrency.setText(count + "" + ":EUR");

                break;
            case "GBP":
                amount = tfCurrency.getText();
                if(amount.contains(":USD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 0.8119;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":EUR"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 0.8788;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":GBP"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":CAD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 0.5806;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else
                {
                    raw = Double.parseDouble(amount);
                    raw *= 0.8119;
                    count = Math.round(raw * 100.0) / 100.0;
                }

                tfCurrency.setText(count + "" + ":GBP");

                break;
            case "CAD":
                amount = tfCurrency.getText();
                if(amount.contains(":USD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 1.3984;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":EUR"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 1.5136;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":GBP"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    raw *= 1.7224;
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else if(amount.contains(":CAD"))
                {
                    amount = amount.substring(0, amount.indexOf(":"));
                    raw = Double.parseDouble(amount);
                    count = Math.round(raw * 100.0) / 100.0;
                }
                else
                {
                    raw = Double.parseDouble(amount);
                    raw *= 1.3984;
                    count = Math.round(raw * 100.0) / 100.0;
                }

                tfCurrency.setText(count + "" + ":CAD");

                break;
            case "Exit":
                System.exit(0);
                break;
            default:

                break;
        }
    
            
        
    }
    
}