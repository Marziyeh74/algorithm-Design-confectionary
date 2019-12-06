
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

public class Cake implements Comparable<Cake> {
	public long t;
	public long s;
	public int number;

    public int compareTo(Cake o) {
       // throw new UnsupportedOperationException("Not supported yet.");
       long  f1 = t * o.s;
	   long f2 = o.t * s;
       if(f1>=f2)
            return 1;
        else

            return -1;

    }

}
