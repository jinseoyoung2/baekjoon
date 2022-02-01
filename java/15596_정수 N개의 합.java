import java.util.*;
public class Test {
    long sum(int[] a) {
        long res = 0;
        for(int i=0; i<a.length; i++){
            res+=a[i];
        }
        return res;
    }
}
