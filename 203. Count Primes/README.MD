### JAVA

#### 暴力法

最开始的想法是排除掉除去2之后的数之外，依次验证剩下的这些数对3，5，7，9 求模，如果都不为0，则加一。很暴力的算法，并且该算法有问题，因为最大的缺陷是有些数的因子是最简质数的组合，所以此法失效

```java
 public static int countPrimes_01(int n) {
        if (n<=2)
            return 0;
        int res;
        if (n<=3)
            return 1;
        else if (n<=5)
            return 2;
        else if (n<=7)
            return 3;
        else if (n<=10)
            return 4;
        else {
            res =4;
            for (int i=11;i<n;i+=2){
                if (i%3!=0 && i%5!=0 && i%7 != 0 && i%9 != 0 ){
                    res++;
                    System.out.println(i);
                }
            }
        }
        return res;
    }
```

#### 埃拉托斯特尼筛法

wiki地址：https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95

具体操作：先将 2~n 的各个数放入表中，然后在2的上面画一个圆圈，然后划去2的其他倍数；第一个既未画圈又没有被划去的数是3，将它画圈，再划去3的其他倍数；现在既未画圈又没有被划去的第一个数 是5，将它画圈，并划去5的其他倍数……依次类推，一直到所有小于或等于 n 的各数都画了圈或划去为止。这时，表中画了圈的以及未划去的那些数正好就是小于 n 的素数。

!()[https://upload.wikimedia.org/wikipedia/commons/b/b9/Sieve_of_Eratosthenes_animation.gif]

**java 代码**
```java
        boolean[] isPrimes = new boolean[n];

        if (n<2)
            return 0;

        int count =0;

        for (int i=2;i<n;i++){

            if (!isPrimes[i])
            {
                count++;
                //针对当前选中的质数，去掉除它自己外，在 小于 n 的范围内的其他的倍数
                for (int j=2;i*j<n;j++){
                    isPrimes[i*j] = true;
                }
            }
        }
        return count;
```


