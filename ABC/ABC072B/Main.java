/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc72b;

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
        String str = sc.next();
        //Stringだとメモリオーバーする
        StringBuffer ans = new StringBuffer();
        
        
        for (int i=0;i<str.length();i++){
            if (i % 2 == 0){
                ans.append(str.substring(i, i+1));
            }
        }
        
        System.out.println(ans);
    }
    
}
