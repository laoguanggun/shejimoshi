package com.flyweight;

/**
 * 内部状态
 * @author mzb
 * @version 1.0.0
 * @ClassName ConcreteWebSite
 * @Description TODO
 * @createTime 2021年08月02日 10:44:00
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 要创建的网站类型
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型" + type + "创建人"+user.getName());
    }
}
