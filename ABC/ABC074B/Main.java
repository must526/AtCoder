/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc074b;

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
        int K = sc.nextInt();
        int x[] = new int[N];
        int move = 0;
        for (int i=0;i<N;i++){
            x[i] = sc.nextInt();
            if (x[i] > (K/2)){
                move += (K - x[i])*2;
            }else{
                move += x[i] * 2;
            }
        }
        System.out.println(move);
    }
}
