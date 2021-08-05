package com.prototype.deepprototype;


public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepSheep deepSheep = new DeepSheep();
        deepSheep.setName("小红");
        deepSheep.setColor("黑色");
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setAge(10);
        deepPrototype.setDeepSheep(deepSheep);
        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.deepCopy();
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepCopy();
        System.out.println(deepPrototype1.getDeepSheep()==deepPrototype2.getDeepSheep());

    }
}
