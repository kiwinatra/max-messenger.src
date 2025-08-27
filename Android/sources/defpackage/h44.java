package defpackage;

import android.content.Context;
import android.media.MediaCodec;

/* renamed from: h44  reason: default package */
public final class h44 {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public Object j;

    public h44(t6e t6e, Context context, te1 te1, voc voc) {
        this.a = t6e;
        this.b = context;
        this.d = te1;
        this.e = voc;
        this.i = new ykb();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [wsb, java.lang.Object] */
    public h44(int i2) {
        Object obj;
        switch (i2) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                if (v0g.a >= 24) {
                    ? obj2 = new Object();
                    obj2.a = cryptoInfo;
                    obj2.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                    obj = obj2;
                } else {
                    obj = null;
                }
                this.j = obj;
                return;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = t0g.a >= 24 ? new ata(cryptoInfo2) : null;
                return;
        }
    }
}
