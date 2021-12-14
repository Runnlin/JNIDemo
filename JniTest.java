

import java.lang.System;

public class JniTest {

    static {
        System.loadLibrary("Jni-test");
    }

    public static void main(String args[]) {
        JniTest jniTest = new JniTest();
        System.out.println(jniTest.get());
        jniTest.set("Hello JNIWorld!");
    }

    public native String get();
    public native void set(String str);

}