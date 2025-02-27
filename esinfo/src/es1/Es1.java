package es1;

import java.io.*;

public class Es1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader1=new BufferedReader(new FileReader("src/es1/primo.txt"));
            BufferedReader reader2=new BufferedReader(new FileReader("src/es1/secondo.txt"));
            PrintWriter writer=new PrintWriter(new FileWriter("src/es1/terzo.txt",false));
            String next1,next2;
            while ((next1=reader1.readLine())!=null) //Lettura file primo.txt
                writer.println(next1);
            while ((next2=reader2.readLine())!=null) //Lettura file secondo.txt
                writer.println(next2);
            writer.flush();
            writer.close();
            reader1.close();
            reader2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}