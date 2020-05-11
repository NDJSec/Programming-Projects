package Java.Casting;

import java.util.ArrayList;

public class Casting_vals 
{
    public ArrayList<Double> normVals = new ArrayList<Double>();
    public ArrayList<Integer> roundVals = new ArrayList<Integer>();

    public void setVals() 
    {
        normVals.add(10.0);
		normVals.add(10.1);
		normVals.add(10.2);
		normVals.add(10.3);
		normVals.add(10.4);
		normVals.add(10.5);
		normVals.add(10.6);
		normVals.add(10.7);
		normVals.add(10.8);
		normVals.add(10.9);
    }

    public void setRoundVals()
    {
        for (Double d : normVals) 
        {
            roundVals.add((int) (d + 0.5));
        } 
        
    }

    
    
}