package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h55  reason: default package */
public final class h55 implements g55 {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer o;
    public final go1 v;
    public final do1 w;
    public final AtomicBoolean x = new AtomicBoolean(false);

    public h55(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.o = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.v = m5a.F(new ut0(atomicReference, 2));
        do1 do1 = (do1) atomicReference.get();
        do1.getClass();
        this.w = do1;
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
        do1 do1 = this.w;
        if (!this.x.getAndSet(true)) {
            try {
                this.a.releaseOutputBuffer(this.c, false);
                do1.b((Object) null);
            } catch (IllegalStateException e) {
                do1.d(e);
            }
        }
    }

    public final ByteBuffer s() {
        if (!this.x.get()) {
            MediaCodec.BufferInfo bufferInfo = this.b;
            int i = bufferInfo.offset;
            ByteBuffer byteBuffer = this.o;
            byteBuffer.position(i);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            return byteBuffer;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    public final long size() {
        return (long) this.b.size;
    }
}
