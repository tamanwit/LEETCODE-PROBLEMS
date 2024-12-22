class leetcode31{
    public static void reverse(int[]num, int i, int j){
        while(i<j){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
    }
    public static void nextPer(int[]num){
        int br = -1;
        int element = 0;
        for(int i=num.length-1; i>=0; i--){
            if(num[i-1]<num[i]){
                br=i-1;
                element = num[i-1];
                break;
            }
        }
        //if no order found
        if(br==-1){
            reverse(num, 0, num.length-1);
            return;
        }
        int val = Integer.MAX_VALUE;
        int br1=0;
        //swapping and reversing between the closest elements
        for(int i=br; i<num.length; i++){
            if(num[i]>element && num[i]<=val){
                br1=i;
                val = num[i];
            }
        }
        //swapping
        int t = num[br];
        num[br] = num[br1];
        num[br1] = t;

        reverse(num, br+1, num.length-1);
        //printing the array
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + "\t");
        }
        //System.out.println(br);
    }
    public static void main(String[] args) {
        int[] num = {2,3,1,4,3};
        nextPer(num);
    }
}
