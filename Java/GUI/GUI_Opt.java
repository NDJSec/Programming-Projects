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
    private JButton Clear;
    private JButton Exit;
    private double count = 0;
    private double raw = 0.0;
    private String amount;

    public GUI_Opt(JFrame frame)
    {
        frame.setLayout(new GridLayout(0,1,15,0));
        
        JPanel f = new JPanel();
        f.setLayout(new GridLayout(5,2,15,5));
      
        CurrencyCounter = new JLabel("Currency Counter (In USD)", SwingConstants.CENTER);
        CurrencyCounter.setFont(new Font("Source Sans Pro", Font.BOLD, 15));  
        f.add(CurrencyCounter);                   
        tfCurrency = new JTextField(count + "", 10); 
        tfCurrency.setEditable(true);  
        f.add(tfCurrency);  

        USD = new JButton("USD");
        USD.setOpaque(true);
        USD.setBackground(Color.BLUE);
        USD.setForeground(Color.WHITE);
        f.add(USD);                
        USD.addActionListener(this);

        Euro = new JButton("EUR");
        Euro.setOpaque(true);
        Euro.setBackground(Color.YELLOW);
        Euro.setForeground(Color.BLACK);
        f.add(Euro);
        Euro.addActionListener(this);

        Pounds = new JButton("GBP");
        Pounds.setOpaque(true);
        Pounds.setBackground(Color.GREEN);
        Pounds.setForeground(Color.BLACK);
        f.add(Pounds);
        Pounds.addActionListener(this);

        CAD = new JButton("CAD");
        CAD.setOpaque(true);
        CAD.setBackground(Color.RED);
        CAD.setForeground(Color.WHITE);
        f.add(CAD);
        CAD.addActionListener(this);

        frame.add(f);

        JPanel c = new JPanel();
        c.setLayout(new FlowLayout());
        Clear = new JButton("Clear");
        Clear.setOpaque(true);
        Clear.setBackground(Color.RED);
        Clear.setForeground(Color.WHITE);
        c.add(Clear);
        Clear.addActionListener(this);
        Clear.setAlignmentX(Component.RIGHT_ALIGNMENT);
        frame.add(c);

        JPanel e = new JPanel();
        e.setLayout(new FlowLayout());
        Exit = new JButton("Exit");
        Exit.setOpaque(true);
        Exit.setBackground(Color.BLACK);
        Exit.setForeground(Color.WHITE);
        e.add(Exit);
        Exit.addActionListener(this);
        Exit.setAlignmentX(Component.RIGHT_ALIGNMENT);
        frame.add(e);


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

            case "Clear":
                count = 0;
                tfCurrency.setText(count + "");
                break;
            case "Exit":
                System.exit(0);
                break;
            default:

                break;
        }
    
            
        
    }
    
}