package com.command;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName TVReceiverOffCommand
 * @Description TODO
 * @createTime 2021年08月05日 10:09:00
 */
public class TVReceiverOffCommand implements Command {

    /**
     * 聚合具体操作接口
     */
    private TVReceiver tvReceiver;

    public TVReceiverOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行接口
     */
    public void execute() {
        tvReceiver.off();
    }

    /**
     * 撤销接口
     */
    public void undo() {
        tvReceiver.on();
    }
}
