/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc073b;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int l[] = new int[N];
        int r[] = new int[N];
        int people = 0;
        
        for (int i=0;i<N;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            people += r[i] - l[i] + 1;
        }
        System.out.println(people);
    }
    
}
