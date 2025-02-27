package es5;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Es5 {
    public static void main(String [] args){
        try {
            Scanner in=new Scanner(System.in);
            PrintWriter w=new PrintWriter(new FileWriter("src/es5/risultati.txt",false));
            BufferedReader r=new BufferedReader(new FileReader("src/es5/risultati.txt"));

            int [] a=new int[5];
            int [] b=new int[a.length];

            for (int i=0;i<a.length;i++){
                System.out.println("Inserire il "+(i+1)+" di a: " );
                a[i]=Integer.parseInt(in.next());
                System.out.println("Inserire il "+(i+1)+" di b: " );
                b[i]=Integer.parseInt(in.next());

                w.println((a[i]+b[i]));
            }
            w.flush();

            int [] somme=new int[a.length];
            int ins=0;
            String n;
            while((n=r.readLine())!=null){
                somme[ins++]=Integer.parseInt(n);
            }

            System.out.println(Arrays.toString(somme));

            in.close();
            w.close();
            r.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
