package Arithmetic;

public class Mode {
    //最直接的方法，自己想的（会超时间）
    public int majorityElement1(int[] nums) {
        int index;
        for(int i=0;i<(nums.length/2+1);i++){
            index=nums[i];
            int num=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==index){
                    num++;
                }
            }
            if(num>=nums.length/2+1)
                return index;
        }
        return 0;
    }
    //排序法，排序完中间的那个就是
    public int majorityElement2(int[] nums){
        return 0;
    }
    //摩尔投票法（经典算法）
    public int majorityElement3(int[] nums){
        int mode=0,num=0;
        for(int i=0;i<nums.length;i++){
            if(num==0){
                mode=nums[i];
                num++;
            }
            else{
                if(mode==nums[i]){
                    num++;
                }
                else
                    num--;
            }
        }
        return mode;

    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        Mode m=new Mode();
       int n= m.majorityElement3(nums);
        System.out.println(n);
    }
}
