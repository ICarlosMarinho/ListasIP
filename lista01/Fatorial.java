package lista01;

import java.io.InputStream;

public class Fatorial 
{
    public long efetuarFatorial(long num)
    {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        else 
        {
            for (long i = num; i > 1;)
            {
                num = num * (i - 1);
                
                i--;
            }
            
            return num;
        }
    }

    void efetuarFatorial(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
