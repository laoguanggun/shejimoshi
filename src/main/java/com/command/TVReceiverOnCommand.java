package com.command;

/**
 * 电视开命令类
 * @author mzb
 * @version 1.0.0
 * @ClassName TVReceiverOnCommand
 * @Description TODO
 * @createTime 2021年08月05日 10:07:00
 */
public class TVReceiverOnCommand implements Command {

    /**
     * 聚合具体操作接口
     */
    private TVReceiver tvReceiver;

    public TVReceiverOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行接口
     */
    public void execute() {
        tvReceiver.on();
    }

    /**
     * 撤销接口
     */
    public void undo() {
        tvReceiver.off();
    }
}
