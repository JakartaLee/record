/**
	描述：将数组中奇数放到前面，偶数放到后面，并且不改变他们的顺序
	方法：这里用的是双子针法，这里特别要注意子针可能越界的问题，小心放越界条件
*/
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        int i = 0;
        int j;
        while (i < array.length) {
            j = i + 1;
            if ((array[i] & 1) == 0) {
                while (j < array.length && (array[j] & 1) == 0) {
                    j++;
                }
                if (j >= array.length) {
                    return;
                }
                int temp = array[i];
                array[i] = array[j];
                int count = j - i;
                while (count > 1) {
                    array[i+count] = array[i+count-1];
                    count--;
                }
                array[i+1] = temp;
            }
            i++;
        }
    }
}