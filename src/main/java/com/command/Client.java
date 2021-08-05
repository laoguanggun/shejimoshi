package com.command;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName Client
 * @Description TODO
 * @createTime 2021年08月05日 10:18:00
 */
public class Client {
    public static void main(String[] args) {
        //创建TV基础操作对象
        TVReceiver tvReceiver = new TVReceiver();
        //创建TV开关对象
        TVReceiverOnCommand tvReceiverOnCommand = new TVReceiverOnCommand(tvReceiver);
        TVReceiverOffCommand tvReceiverOffCommand = new TVReceiverOffCommand(tvReceiver);
        //创建命令发送者 并将TV遥控设置
        ReceiverController receiverController = new ReceiverController();
        receiverController.setCommand(0,tvReceiverOnCommand,tvReceiverOffCommand);

        System.out.println("TV开");
        receiverController.onButton(0);
        System.out.println("TV关");
        receiverController.offButton(0);
        System.out.println("撤销");
        receiverController.undoButton();
    }
}
