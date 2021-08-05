package com.prototype.deepprototype;

import java.io.*;

public class DeepPrototype implements Cloneable,Serializable {

    private int age;
    private DeepSheep deepSheep;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepSheep getDeepSheep() {
        return deepSheep;
    }

    public void setDeepSheep(DeepSheep deepSheep) {
        this.deepSheep = deepSheep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //自身克隆
        DeepPrototype deepPrototype = null;
        deepPrototype = (DeepPrototype) super.clone();
        //克隆下级对象
        deepPrototype.deepSheep = (DeepSheep) deepSheep.clone();
        return deepPrototype;
    }

    public Object deepCopy() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
