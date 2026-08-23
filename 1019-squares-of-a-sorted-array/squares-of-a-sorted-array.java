class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> neg =  new ArrayList<>();
        ArrayList<Integer> pos =  new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        // no negative numbers
        if(neg.size()==0){
            for(int i=0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        // no positive numbers
        if(pos.size() == 0){
            for(int i=0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
              
        }

        // both positive and negative
        int i=0, j=0 , id =0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1+n2];

        // square negative and reverse them

        for(int k=0;k<n1;k++){
            neg.set(k,neg.get(k)*neg.get(k));
            
        }
        Collections.reverse(neg);

        // square positives
        for(int k =0 ;k<n2;k++){
            pos.set(k,pos.get(k)*pos.get(k));
        }

        // merge both the list

        while(i<n1 && j<n2){
            if(neg.get(i)<=pos.get(j)){
                res[id] = neg.get(i);
                id++;
                i++;
            }else{
                res[id] = pos.get(j);
                id++;
                j++;
    
            }
        }

        while(i<n1){
            res[id] = neg.get(i);
            i++;
            id++;
        }

        while(j<n2){
            res[id] = pos.get(j);
            j++;
            id++;
        }

    
        return res;
        
    }
  
}