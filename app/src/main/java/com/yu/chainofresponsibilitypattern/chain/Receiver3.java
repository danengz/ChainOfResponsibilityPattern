package com.yu.chainofresponsibilitypattern.chain;

public class Receiver3 extends BaseReceiver {

    public Receiver3(boolean isExecute) {
        super(isExecute);
    }

    @Override
    public void execute() {
        System.out.println("Receiver3执行了");
    }
}
