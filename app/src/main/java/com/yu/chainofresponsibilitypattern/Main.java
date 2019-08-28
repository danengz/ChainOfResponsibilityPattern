package com.yu.chainofresponsibilitypattern;

import com.yu.chainofresponsibilitypattern.chain2.Receiver1;
import com.yu.chainofresponsibilitypattern.chain2.Receiver2;
import com.yu.chainofresponsibilitypattern.chain2.Receiver3;
import com.yu.chainofresponsibilitypattern.chain2.ReceiverManager;

public class Main {
    public static void main(String[] args) {

//        打开这边的话，注意导包问题
//        Receiver1 receiver1 = new Receiver1(false);
//        Receiver2 receiver2 = new Receiver2(true);
//        Receiver3 receiver3 = new Receiver3(false);
//
//        receiver1.addNextReceiver(receiver2);
//        receiver2.addNextReceiver(receiver3);
//
//        receiver1.run();

        ReceiverManager receiverManager = new ReceiverManager();
        receiverManager.addReceiver(new Receiver1());
        receiverManager.addReceiver(new Receiver2());
        receiverManager.addReceiver(new Receiver3());
        receiverManager.execute("2", receiverManager);
    }
}
