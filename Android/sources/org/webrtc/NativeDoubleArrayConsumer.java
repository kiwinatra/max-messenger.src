package org.webrtc;

public class NativeDoubleArrayConsumer {
    private final Consumer consumer;

    public interface Consumer {
        void consume(Double[] dArr);
    }

    public NativeDoubleArrayConsumer(Consumer consumer2) {
        this.consumer = consumer2;
    }

    @CalledByNative
    public void consume(Double[] dArr) {
        this.consumer.consume(dArr);
    }
}
