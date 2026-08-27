class Solution {
    public int totalFruit(int[] fruits) {
        int low =0;
        int res =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int high =0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);

            while(map.size()>2){
                int left = fruits[low];

                map.put(left,map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                low++;

            }
            if(map.size() <= 2){
                int len  = high-low+1;
                res = Math.max(res,len);
            }
        }
        return res;


        
        
    }
}