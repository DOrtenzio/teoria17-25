package es4;

import java.io.*;

public class Es4 {
    public static void main(String [] args){
        try {
            BufferedWriter w=new BufferedWriter(new FileWriter("src/es4/risultati.txt",false));
            for (int i=-10;i<=10;i++) {
                w.write(Integer.toString((int) (Math.pow(i, 2) - 10 * i + 4)));
                w.write("\n");
            }
            w.flush();
            w.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
