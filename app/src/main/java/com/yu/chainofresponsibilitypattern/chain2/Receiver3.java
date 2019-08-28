package com.yu.chainofresponsibilitypattern.chain2;

public class Receiver3 implements IBaseReceiver {
    @Override
    public void execute(String condition, IBaseReceiver receiverManager) {
        if (condition == "3") {
            System.out.println("Receiver3执行了任务");
        }else {
            receiverManager.execute(condition, receiverManager);
        }
    }
}
