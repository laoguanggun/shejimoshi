package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author mzb
 * @version 1.0.0
 * @ClassName WebSiteFactory
 * @Description TODO
 * @createTime 2021年08月02日 10:47:00
 */
public class WebSiteFactory {

    private Map<String,ConcreteWebSite> factory = new HashMap<String,ConcreteWebSite>();

    public WebSite getWebSite(String type) {
        if (factory.containsKey(type)) {
            return factory.get(type);
        } else {
            factory.put(type,new ConcreteWebSite(type));
            return factory.get(type);
        }
    }

    public Integer getCount() {
        return factory.size();
    }
}
