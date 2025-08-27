package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: ny  reason: default package */
public final class ny extends MediaCodec.Callback {
    public final Object a = new Object();
    public final HandlerThread b;
    public Handler c;
    public final e13 d;
    public final e13 e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public tn8 o;

    public ny(HandlerThread handlerThread) {
        this.b = handlerThread;
        this.d = new e13();
        this.e = new e13();
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        e13 e13 = this.d;
        e13.b = e13.a;
        e13 e132 = this.e;
        e132.b = e132.a;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        vc5 vc5;
        synchronized (this.a) {
            this.d.a(i2);
            tn8 tn8 = this.o;
            if (!(tn8 == null || (vc5 = tn8.a.P0) == null)) {
                vc5.a();
            }
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        vc5 vc5;
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i2);
                this.f.add(bufferInfo);
                tn8 tn8 = this.o;
                if (!(tn8 == null || (vc5 = tn8.a.P0) == null)) {
                    vc5.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
