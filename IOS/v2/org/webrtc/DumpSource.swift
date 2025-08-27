package org.webrtc;

public enum DumpSource {
    IN_ENTER_PROCESSING(10),
    IN_AFTER_NS(20),
    IN_AFTER_ANIMOJI(21),
    IN_EXIT_PROCESSING(30),
    OUT_ENTER_PROCESSING(1000),
    OUT_EXIT_PROCESSING(1010);
    
    final int key;

    private DumpSource(int i) {
        this.key = i;
    }
}
