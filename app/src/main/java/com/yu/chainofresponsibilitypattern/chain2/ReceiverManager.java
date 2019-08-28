package com.yu.chainofresponsibilitypattern.chain2;

import java.util.ArrayList;
import java.util.List;

public class ReceiverManager implements IBaseReceiver {

    /**
     * 接收者集合
     */
    private List<IBaseReceiver> receivers = new ArrayList<>();

    /**
     * 添加接收者
     * @param receiver
     */
    public void addReceiver(IBaseReceiver receiver) {
        receivers.add(receiver);
    }

    /**
     * 当前接收者角标
     */
    private int index = 0;

    /**
     * 每次调用一次就会进行index++操作，用这种方式实现了接收者的向下传递
     * @param condition 判断任务是否执行的条件
     * @param receiverManager 接受者管理器，也实现了IBaseReceiver
     */
    @Override
    public void execute(String condition, IBaseReceiver receiverManager) {

        if (receivers.isEmpty()) return;

        if (index >= receivers.size()) return;

        IBaseReceiver receiver = receivers.get(index);

        index++;

        receiver.execute(condition, receiverManager);
    }
}
