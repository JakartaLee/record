
/**

	描述：在旋转数组中找寻最小的数
	何为旋转数组：在排序数组中在某一个点旋转一下呗，类似于[3,4,5,1,2]
	方法：类二分查找问题呀，很简单的，要注意细节
	
*/
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] < array[right]) {
                right = mid;
            } else if (array[mid] > array[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return array[left];
    }
}