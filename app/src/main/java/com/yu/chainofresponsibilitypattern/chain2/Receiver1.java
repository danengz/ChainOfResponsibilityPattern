package com.yu.chainofresponsibilitypattern.chain2;

public class Receiver1 implements IBaseReceiver {
    @Override
    public void execute(String condition, IBaseReceiver receiverManager) {
        if (condition == "1") {
            System.out.println("Receiver1执行了任务");
        }else {
            receiverManager.execute(condition, receiverManager);
        }
    }
}
