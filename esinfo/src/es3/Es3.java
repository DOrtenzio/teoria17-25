package es3;

import java.io.*;

public class Es3 {
    public static void main(String [] args){
        try {
            BufferedReader r=new BufferedReader(new FileReader("src/es3/numeri.txt"));
            String n;
            int min=Integer.MAX_VALUE;
            while((n=r.readLine())!=null) {
                if (Integer.parseInt(n)<min)
                     min=Integer.parseInt(n);
            }
            System.out.println("Il minimo è: "+min);
            r.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
