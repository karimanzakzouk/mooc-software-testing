package tudelft.ghappy;
import java.util.Scanner;
import java.lang.String;

public class GHappy {

    public boolean gHappy(String str)
    {
        assert str!=null;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'g' && str.length() > 2 )
            {
                if (i >= 0 && str.charAt(i-1) == 'g')
                {
                    continue;
                }
                if (i+1 < str.length() && str.charAt(i+1) == 'g')
                {
                    continue;
                }
                return false;
            }
            else if (str.charAt(i) == 'g' && str.length() == 1 )
            {
                return false;
            }
        }

        return true;
    }

}
