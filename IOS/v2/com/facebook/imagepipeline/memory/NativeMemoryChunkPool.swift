package com.facebook.imagepipeline.memory;

@cr4
public class NativeMemoryChunkPool extends d69 {
    @cr4
    public NativeMemoryChunkPool(g69 g69, pqb pqb, qqb qqb) {
        super(g69, pqb, qqb);
    }

    public final Object a(int i) {
        return new NativeMemoryChunk(i);
    }
}
