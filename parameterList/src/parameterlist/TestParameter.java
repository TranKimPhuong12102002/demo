/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterlist;


public class TestParameter {
    public static int Sum(int ...arr){
        int s=0;
        int p = arr.length;
        for(int i = 0, i<= p,i++){
            s=s+arr[i];
        }
        return s;
    }
    
}
