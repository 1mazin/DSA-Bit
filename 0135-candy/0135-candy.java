class Solution {   
    public int candy(int[] ratings) {
        int[] cnt = new int[ratings.length];


        Arrays.fill(cnt, 1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1])cnt[i]=Math.max(cnt[i],cnt[i-1]+1);
        }
         for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])cnt[i]=Math.max(cnt[i],cnt[i+1]+1);
        }
       
        int sum = 0;
        for(int i = 0 ; i < ratings.length ; i++) {
            sum +=cnt[i];
        }
        return sum;
    }
}