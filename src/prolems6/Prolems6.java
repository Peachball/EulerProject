/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolems6;

/**
 *
 * @author s-koos
 */
public class Prolems6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        problem7.main(args);
        return;
        int sum = 0;
        int sums = 0;
        int sumes = 0;
        // TODO code application logic here
        for (int i = 1; i <= 100; i++) {
            sum = i * i + sum;

        }
        for (int i = 1; i <= 100; i++) {
            sums = i + sums;
            sumes = sums * sums;
        }
        System.out.println(sumes - sum);

        int nm = 6 % 7;
        System.out.println(nm);
    }

}
