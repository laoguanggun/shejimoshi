package com.proxy.staticproxy;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName TeacherDaoProxy
 * @Description TODO
 * @createTime 2021年08月03日 09:44:00
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacherDao.teach();
        System.out.println("结束代理");
    }
}
