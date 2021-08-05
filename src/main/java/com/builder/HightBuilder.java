package com.builder;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName HightBuilder 高楼
 * @Description TODO
 * @createTime 2021年07月20日 10:21:00
 */
public class HightBuilder extends HouseBuilder {
    @Override
    public void buildingFoundation() {
        house.setFoundation("水泥地基");
        System.out.println("高楼打地基");
    }

    @Override
    public void buildingWall() {
        house.setWall("白墙");
        System.out.println("高楼刷墙");
    }

    @Override
    public void buildingRoof() {
        house.setRoof("瓦片顶");
        System.out.println("高楼封顶");
    }
}
