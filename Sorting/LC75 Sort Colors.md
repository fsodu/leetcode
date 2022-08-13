荷兰国旗包含三种颜色：红、白、蓝。

有三种颜色的球，算法的目标是将这三种球按颜色顺序正确地排列。它其实是`三向切分快速排序`的一种变种，在三向切分快速排序中，每次切分都将数组分成三个区间：小于切分元素、等于切分元素、大于切分元素，而该算法是将数组分成三个区间：等于红色、等于白色、等于蓝色。

---
```JAVA
class Solution {
    public void sortColors(int[] nums) {
        
        int index = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                swap(nums, index++, i);
            }
        }

        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(nums, index++, i);
            }
        }
        
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}
```

time $O(N)$
space $O(1)$

```java 
public void sortColors(int[] nums) {
    int zero = -1, one = 0, two = nums.length;
    while (one < two) {
        if (nums[one] == 0) {
            swap(nums, ++zero, one++);
        } else if (nums[one] == 2) {
            swap(nums, --two, one);
        } else {
            ++one;
        }
    }
}
```

