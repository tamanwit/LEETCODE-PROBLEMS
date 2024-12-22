class missingnum {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<=n;i++){
            ans=ans^i;
        }
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3};
        missingNumber(num);
    }
}
