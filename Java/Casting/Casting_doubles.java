package Java.Casting;

public class Casting_doubles 
{
    Casting_vals vals = new Casting_vals();

    public void pNormVals()
    {
        vals.setVals();

        for (int i = 0; i < vals.normVals.size(); i++) 
        {
            System.out.println("Value_" + i + ": " + vals.normVals.get(i));
        }

    }

    public void pRoundVals()
    {
        vals.setRoundVals();

        for (int i = 0; i < vals.roundVals.size(); i++) 
        {
            System.out.println("Value_" + i + "Rounded : " + vals.roundVals.get(i));
        }

    }
    
}