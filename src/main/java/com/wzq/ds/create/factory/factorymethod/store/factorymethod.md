# 工厂方法模式

定义了一个创建对象的接口，内部工厂方法定义创建行为，但由子类决定要实例化的是哪一个工厂并实现工厂方法，工厂方法让类把实例化推迟到子类

与简单工厂的区别：  
简单工厂在一个类中把全部的事情处理完毕，而工厂方法是创建一个框架，让子类决定如何实现。