class Solution {
    public int[] calculateCandiesArray(int[] ratings) {
        int[] arr = new int[ratings.length];
        Arrays.fill(arr, 1);
        for(int i = 1 ; i < ratings.length ; i++) {
            if(ratings[i] > ratings[i-1]) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr;
    }
    public int candy(int[] ratings) {
        int[] rats = new int[ratings.length];
        for(int i = ratings.length - 1 ; i >= 0 ; i--) {
            rats[ratings.length - (i + 1)] = ratings[i];
        }
        ratings = calculateCandiesArray(ratings);
        rats = calculateCandiesArray(rats);
        int sum = 0;
        for(int i = 0 ; i < ratings.length ; i++) {
            sum += Math.max(ratings[i], rats[ratings.length - (i+1)]);
        }
        return sum;
    }
}