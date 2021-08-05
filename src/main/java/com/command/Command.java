package com.command;

/**
 * 命令执行接口
 * @author mzb
 * @version 1.0.0
 * @ClassName Command
 * @Description TODO
 * @createTime 2021年08月05日 10:05:00
 */
public interface Command {

    /**
     * 执行方法
     */
    public void execute();

    /**
     * 撤销方法
     */
    public void undo();
}
