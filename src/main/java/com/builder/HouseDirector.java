package com.builder;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName HouseDirector 建造模式指挥者
 * @Description TODO
 * @createTime 2021年07月20日 10:28:00
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildingHouse() {
        houseBuilder.buildingFoundation();
        houseBuilder.buildingRoof();
        houseBuilder.buildingWall();
        return houseBuilder.getHouse();
    }
}
