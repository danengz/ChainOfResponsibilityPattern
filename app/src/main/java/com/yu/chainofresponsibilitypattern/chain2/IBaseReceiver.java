package com.yu.chainofresponsibilitypattern.chain2;

public interface IBaseReceiver {

    /**
     *
     * @param condition 判断任务是否执行的条件
     * @param receiverManager 接受者管理器，也实现了IBaseReceiver
     */
    public void execute(String condition, IBaseReceiver receiverManager);

}
