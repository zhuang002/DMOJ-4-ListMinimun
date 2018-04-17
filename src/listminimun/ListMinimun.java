/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listminimun;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class ListMinimun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] list=new int[n];
        for (int i=0;i<n;i++) list[i]=sc.nextInt();
        int m=n;
        
        for (int i=0;i<n;i++) {
            int min=list[0];
            int k=0;
            for (int j=1;j<m;j++) {
                if (min>list[j]) {
                    min=list[j];
                    k=j;
                }
            }
            System.out.println(min);
            for (int l=k;l<m-1;l++){
                list[l]=list[l+1];
            }
            m--;
        }
    }
}
