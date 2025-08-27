package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vt0  reason: default package */
public final class vt0 implements g55 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final do1 c;

    public vt0(g55 g55) {
        MediaCodec.BufferInfo G = g55.G();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, G.size, G.presentationTimeUs, G.flags);
        this.b = bufferInfo;
        ByteBuffer s = g55.s();
        MediaCodec.BufferInfo G2 = g55.G();
        s.position(G2.offset);
        s.limit(G2.offset + G2.size);
        ByteBuffer allocate = ByteBuffer.allocate(G2.size);
        allocate.order(s.order());
        allocate.put(s);
        allocate.flip();
        this.a = allocate;
        AtomicReference atomicReference = new AtomicReference();
        m5a.F(new ut0(atomicReference, 0));
        do1 do1 = (do1) atomicReference.get();
        do1.getClass();
        this.c = do1;
    }

    public final MediaCodec.BufferInfo G() {
        return this.b;
    }

    public final boolean J() {
        return (this.b.flags & 1) != 0;
    }

    public final long Z() {
        return this.b.presentationTimeUs;
    }

    public final void close() {
        this.c.b((Object) null);
    }

    public final ByteBuffer s() {
        return this.a;
    }

    public final long size() {
        return (long) this.b.size;
    }
}
