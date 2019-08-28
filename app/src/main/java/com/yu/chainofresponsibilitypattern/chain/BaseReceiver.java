package com.yu.chainofresponsibilitypattern.chain;

public abstract class BaseReceiver {

    /**
     * 是否处理任务
     */
    private boolean isExecute;

    /**
     * 下一个任务接收者
     */
    private BaseReceiver nextReceiver;

    public BaseReceiver(boolean isExecute) {
        this.isExecute = isExecute;
    }

    /**
     * 绑定下一个任务接收者
     * @param receiver
     */
    public void addNextReceiver(BaseReceiver receiver) {
        nextReceiver = receiver;
    }

    /**
     * 处理任务
     */
    public abstract void execute();

    /**
     * 任务流，每个任务判断自己是否执行，不执行就传递给下一个任务
     */
    public void run() {
        if (isExecute) {
            execute();
        }else if (nextReceiver != null) {
            nextReceiver.run();
        }
    }

}
