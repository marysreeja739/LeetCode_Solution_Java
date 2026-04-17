class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
