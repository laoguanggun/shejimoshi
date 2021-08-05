package com.flyweight;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月02日 10:51:00
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSite("网站");
        User a = new User("a");
        webSite.use(a);

        WebSite webSite1 = webSiteFactory.getWebSite("博客");
        webSite1.use(new User("b"));

        WebSite webSite2 = webSiteFactory.getWebSite("公众号");
        webSite2.use(new User("c"));

        WebSite webSite3 = webSiteFactory.getWebSite("公众号");
        webSite3.use(new User("d"));

        System.out.println(webSiteFactory.getCount());
    }
}
