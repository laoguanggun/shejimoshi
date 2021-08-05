package com.command;

/**
 * 命令发布者
 * @author mzb
 * @version 1.0.0
 * @ClassName ReceiverController
 * @Description TODO
 * @createTime 2021年08月05日 10:11:00
 */
public class ReceiverController {

    /**
     * 开按钮数组
     */
    private Command[] commandOns;

    /**
     * 关按钮数组
     */
    private Command[] commandOffs;

    /**
     * 撤销对象
     */
    private Command undoCommand;


    /**
     * 初始化遥控器
     */
    public ReceiverController() {
        //默认有五组开关
        commandOns = new Command[5];
        commandOffs = new Command[5];
        for (int i = 0; i < 5; i++) {
            commandOns[i] = new NoCommand();
            commandOffs[i] = new NoCommand();
        }
    }

    /**
     * 设置遥控器
     * @param no 遥控器的序号
     * @param onCommand 开按钮
     * @param offCommand 关按钮
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        commandOns[no] = onCommand;
        commandOffs[no] = offCommand;
    }

    /**
     * 开按钮
     * @param no 按钮的组号
     */
    public void onButton(int no) {
        commandOns[no].execute();
        //做出记录方便撤销
        undoCommand = commandOns[no];
    }

    /**
     * 关按钮
     * @param no 按钮的组号
     */
    public void offButton(int no) {
        commandOffs[no].execute();
        undoCommand = commandOffs[no];
    }

    /**
     * 撤销操作，撤销上一步操作
     */
    public void undoButton() {
        undoCommand.undo();
    }
}
