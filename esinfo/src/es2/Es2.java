package es2;

import java.io.*;

public class Es2 {
    public static void main(String [] args){
        try {
            BufferedReader r=new BufferedReader(new FileReader("src/es2/numeri.txt"));
            int somma=0;
            String n;
            while((n=r.readLine())!=null) somma+=Integer.parseInt(n);
            System.out.println("La somma è: "+somma);
            r.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
