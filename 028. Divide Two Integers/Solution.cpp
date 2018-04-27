class Solution {
public:
	int divide(int dividend, int divisor) {
		//记录结果符号
		int flag = 1;
		if (dividend < 0)
			flag =-flag;
		if (divisor < 0)
			flag =-flag;
		//对被除数和除数分别取绝对值计算，并保存在long long变量中以防止溢出
		long long num1 = abs((long long)dividend);
		long long num2 = abs((long long)divisor);
		//两种特殊情况
		if (num1 < num2)
			return 0;
		if (divisor == 0)
			return INT_MAX;
		long long  result = 0;//结果保存在long long中来处理 INT_MAX和INT_MIN
		while (num1 >= num2)
		{
			long long temp = num2;
			int count = 0;
			while (temp <= num1)
			{
				temp = temp << 1;
				count++;
			}
			result = result + ((long long)1 << (count - 1));//此处的1需要强制转换为long long，否则默认超过INT_MAX 后溢出
			num1 = num1 - (num2 << (count - 1));//被除数每次减去 2^(count-1)*除数
		}
		//处理溢出情况
		if (flag == 1 && result > INT_MAX)
			return INT_MAX;
		if (flag == -1 && result > INT_MAX)
			return INT_MIN;
		return result*flag;
	}
};