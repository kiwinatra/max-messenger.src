package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eg7  reason: default package */
public final class eg7 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final go1 d;
    public final do1 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public eg7(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        bs0.p(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = m5a.F(new ut0(atomicReference, 5));
        do1 do1 = (do1) atomicReference.get();
        do1.getClass();
        this.e = do1;
    }

    public final void a() {
        do1 do1 = this.e;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, 0, 0, 0, 0);
                do1.b((Object) null);
            } catch (IllegalStateException e2) {
                do1.d(e2);
            }
        }
    }

    public final void b() {
        do1 do1 = this.e;
        ByteBuffer byteBuffer = this.c;
        if (!this.f.getAndSet(true)) {
            try {
                this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
                do1.b((Object) null);
            } catch (IllegalStateException e2) {
                do1.d(e2);
            }
        }
    }
}
