package com.builder;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName HouseBuilder 房屋建造抽象类
 * @Description TODO
 * @createTime 2021年07月20日 10:18:00
 */
public abstract class HouseBuilder {

    protected House house = new House();


    /**
     * 打地基
     */
    public abstract void buildingFoundation();

    /**
     * 建墙壁
     */
    public abstract void buildingWall();

    /**
     * 盖屋顶
     */
    public abstract void buildingRoof();

    public House getHouse() {
        return house;
    }

}
