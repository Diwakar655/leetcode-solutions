class Solution {
    public int digitsum(int num){
        int sum =0;
        while(num>0){ 
        int lastdigit = num%10;
        sum = sum+lastdigit;
        num = num/10;
        }
        return sum;

    }
    public int addDigits(int num) {
        while(num>9){
            num=digitsum(num);
        }
        return num;
        
    }
}