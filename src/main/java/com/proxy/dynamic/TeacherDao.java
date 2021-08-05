package com.proxy.dynamic;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName TeacherDao
 * @Description TODO
 * @createTime 2021年08月03日 09:44:00
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师在教书");
    }
}
