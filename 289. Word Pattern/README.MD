### java

本来自己也是按照 hashmap 来匹配的，不过我写的算法不能通过一些测试用例

```
 这种情况无法AC：
        String pattern ="abba";
        String str = "dog dog dog dog";
```

后来去 discuss 区看了大神写的算法,也是采用的一个hashmap ，非常的精简

```java
  if (pattern == null || str == null)
            return false;
        String [] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;

        Map map = new HashMap();

        //此处的循环处必须要时Integer 才可以通过全部测试用例
        //因为在 map 中存储的是Integer ，此处并没有自动装箱，只能使用对象类型
        for (Integer i=0;i<words.length;i++){
            if (map.put(pattern.charAt(i),i)!= map.put(words[i],i))
                return false;
        }
        return true;
```