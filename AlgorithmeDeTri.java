/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zine dine
 */
import java.util.Arrays;
import java.io.StreamCorruptedException;
import java.util.Scanner;
public class AlgorithmeDeTri {
    
    private static void echanger(int tab[],int i,int j)
    {
        int memo = tab[i];
        tab[i]=tab[j];
        tab[j]=memo;
    }
   
    }
    public static void Tri (int tab[])
    {
        int l=(tab.length-1);
        while(l>0)
        {
            int min=0;
            for(int i=1;i<=l;i++)
            {
                if(tab[i]<tab[min])min=i;
            }
            echanger(tab,min,l);
            l--;
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner im = new Scanner(System.in);
        System.out.println("Entrer la taille n  de tableau");
        n=im.nextInt();
       int C[]= new int [n];
        for (int i=0;i<=n;i++){
            System.out.println("Entrer le C["+(i+1)+"]");
            C[i]=im.nextInt();
        }
        int P[]= new int[n];
        for (int i=0;i<=n;i++){
            System.out.println("Entrer le P["+(i+1)+"]");
            P[i]=im.nextInt();
        }
        int Tab[]=new int[n];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=0;j++){
                
                Tab[i]= C[i]/P[i];  
            }
        }
         
        System.out.println("Avant le Tri");
        System.out.println(Arrays.toString(Tab));
        
        Tri(Tab);
        System.out.println("Aprés le Tri");
        System.out.println(Arrays.toString(Tab));
    }
    
}
