# 策略模式

##### 定义算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户

结构：接口（或类）A内含有 接口B的实例变量，在运行时通过构造器或者set方法使实例变量B动态指向对应的实现类，在A的实现类中(或A中)调用对应的方法，实际调用的是类型B实例的方法。

```java
public class A {
    B b;

    public A(B b) {
        this.b = b;
    }

    public void doJob() {
        b.action();
    }

    public void setB(B b) {
        this.b = b; // 此处是整个算法都交给算法族B实现
    }
}

public interface B {
    void action();
}

public class BImpl implements B {
    @Override
    public void action() {
        System.out.println("action impl");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.doJob();
    }
}
```

Duck作为客户，拥有了不同类型的动作（算法族）， 不同动作又有不同的实现（算法实现）， 这样创建一个新的Duck时就不必继承抽象Duck导致代码大量重复， 只需选择（并设置）对应的算法族实现即可