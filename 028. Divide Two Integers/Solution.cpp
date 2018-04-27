class Solution {
public:
	int divide(int dividend, int divisor) {
		//��¼�������
		int flag = 1;
		if (dividend < 0)
			flag =-flag;
		if (divisor < 0)
			flag =-flag;
		//�Ա������ͳ����ֱ�ȡ����ֵ���㣬��������long long�������Է�ֹ���
		long long num1 = abs((long long)dividend);
		long long num2 = abs((long long)divisor);
		//�����������
		if (num1 < num2)
			return 0;
		if (divisor == 0)
			return INT_MAX;
		long long  result = 0;//���������long long�������� INT_MAX��INT_MIN
		while (num1 >= num2)
		{
			long long temp = num2;
			int count = 0;
			while (temp <= num1)
			{
				temp = temp << 1;
				count++;
			}
			result = result + ((long long)1 << (count - 1));//�˴���1��Ҫǿ��ת��Ϊlong long������Ĭ�ϳ���INT_MAX �����
			num1 = num1 - (num2 << (count - 1));//������ÿ�μ�ȥ 2^(count-1)*����
		}
		//����������
		if (flag == 1 && result > INT_MAX)
			return INT_MAX;
		if (flag == -1 && result > INT_MAX)
			return INT_MIN;
		return result*flag;
	}
};