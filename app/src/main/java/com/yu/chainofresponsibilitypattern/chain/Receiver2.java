package com.yu.chainofresponsibilitypattern.chain;

public class Receiver2 extends BaseReceiver {

    public Receiver2(boolean isExecute) {
        super(isExecute);
    }

    @Override
    public void execute() {
        System.out.println("Receiver2执行了");
    }
}
