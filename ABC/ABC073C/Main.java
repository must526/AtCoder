/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc073c;
import java.util.HashSet;
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
        HashSet<Integer> set = new HashSet();
        
        for(int i=0;i<N;i++){
            int s = sc.nextInt();
            if( set.contains(s) ){
                set.remove(s);
            }else{
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
    
}
