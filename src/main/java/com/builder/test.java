package com.builder;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName test 测试类
 * @Description TODO
 * @createTime 2021年07月20日 10:30:00
 */
public class test {

    public static void main(String[] args) {
        HightBuilder hightBuilder = new HightBuilder();
        HouseDirector houseDirector = new HouseDirector(hightBuilder);
        House house = houseDirector.buildingHouse();
        System.out.println(house);

        StringBuilder stringBuilder = new StringBuilder();
    }
}
