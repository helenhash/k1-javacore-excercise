package com.gl;
public class DemoFinalVar {
    final int MAX_SPEED = 90; // biến final

    void run() {
//        MAX_SPEED = 400;
    }

    public static void main(String args[]) {
        DemoFinalVar obj = new DemoFinalVar();
        obj.run();
    }
}