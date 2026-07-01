class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        int count1 = 0, count2 = 0, major1 = -1, major2 = -1;
        for(int num : nums) {
            if(count1 == 0 && major2 != num) {
                count1 = 1;
                major1 = num;
            } else if (count2 == 0 && major1 != num) {
                count2 = 1;
                major2 = num;
            } else if( num == major1 ) {
                count1++;
            } else if( num == major2 ) {
                count2++;
            } else {
                count1--; count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int num : nums) {
            if (major1 == num) { count1++; }
            else if (major2 == num) { count2++; }
        }

        int min = (int)nums.length/3 + 1;

        if(count1 >= min ) { list.add(major1); }
        if(count2 >= min ) { list.add(major2); }
        return list;
    }
}