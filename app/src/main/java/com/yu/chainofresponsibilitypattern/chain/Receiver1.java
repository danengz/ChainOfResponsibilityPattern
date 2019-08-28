package com.yu.chainofresponsibilitypattern.chain;

public class Receiver1 extends BaseReceiver {

    public Receiver1(boolean isExecute) {
        super(isExecute);
    }

    @Override
    public void execute() {
        System.out.println("Receiver1执行了");
    }
}
