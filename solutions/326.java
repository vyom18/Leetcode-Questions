class Solution {
    
    public boolean isPowerOfThree(int n) {
       
        int h=n;
        
        if(h==0 || h<0)
        {
            return false;
        }
        while(h>0)
        {
            if(h==1)
            {
                return true;
            }
            if((h%3)!=0)
            {
                return false;
            }
           // System.out.println(h);
            h=h/3;
        }
        return false;
    }
}
