package com.jvm.gc;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public static int number=1;

    public void isAlive() {
        System.out.println("yes,i am still alive：)");
    }

    @
            Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize mehtod executed！");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        Integer b=0;
        for (int i=0;i<100;i++){
            b=b+i;
        }

        System.out.println("this is a testing");
        SAVE_HOOK = new FinalizeEscapeGC();
        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        //因为finalize方法优先级很低，所以暂停0.5秒以等待它
        System.out.println("sleep 500");
        Thread.sleep(500);
        b=0;
        System.out.println("after sleep 500");
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,i am dead：(");
        }
        //下面这段代码与上面的完全相同，但是这次自救却失败了
        SAVE_HOOK = null;
        System.gc();
        //因为finalize方法优先级很低，所以暂停0.5秒以等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,i am dead：(");
        }
    }

}
