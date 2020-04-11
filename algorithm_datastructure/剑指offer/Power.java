/**
	描述：做一个求幂运算的函数，类似于java中Math.Pow()
	方法: 这里利用n=n/2*n/2加快了累积过程，还是有点东西的
*/

public class Power {
    public double power(double base, int exponent) {
        if (exponent > 0) {
            return Power_positive(base, exponent);
        } else if (exponent < 0) {
            return 1 / Power_positive(base, -exponent);
        } else {
            return 1;
        }
  }
    
    public double power_positive(double base, int exponent) {
        int res = 1;
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                res *= base;
            } 
            
            base *= base;
            exponent >>= 1;
        }
        return res;
    }
}