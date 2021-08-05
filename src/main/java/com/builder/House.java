package com.builder;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName House
 * @Description TODO
 * @createTime 2021年07月20日 10:14:00
 */
public class House {

    /**
     * 地基
     */
    private String foundation;
    /**
     * 墙壁
     */
    private String wall;
    /**
     * 屋顶
     */
    private String roof;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
