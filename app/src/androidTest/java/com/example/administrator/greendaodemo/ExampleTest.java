package com.example.administrator.greendaodemo;

import android.test.InstrumentationTestCase;

/**
 * InstrumentationTestCase 单元测试需要继承的类，测试类必须继承TestCase或者其子类AndroidTestCase、InstrumentationTestCase
 * 需要的测试的方法 ，测试类中的方法，必须以小写的test开头
 */
public class ExampleTest extends InstrumentationTestCase {
    MyClass myClass=new MyClass();
    public void test(){
        int num=myClass.add(4,5);
        assertEquals(9, num);
    }
}
