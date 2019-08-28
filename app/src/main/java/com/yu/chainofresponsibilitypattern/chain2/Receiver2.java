package com.yu.chainofresponsibilitypattern.chain2;

public class Receiver2 implements IBaseReceiver {
    @Override
    public void execute(String condition, IBaseReceiver receiverManager) {
        if (condition == "2") {
            System.out.println("Receiver2执行了任务");
        }else {
            receiverManager.execute(condition, receiverManager);
        }
    }
}
