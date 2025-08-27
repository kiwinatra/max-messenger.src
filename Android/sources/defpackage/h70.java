package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: h70  reason: default package */
public final class h70 extends dcd {
    public final md4 e;
    public final j60 f;
    public final ba4 g;
    public final ba4 h;
    public final u40 i;
    public final w40 j;
    public final ea6 k;
    public boolean l;
    public long m;

    public h70(ea6 ea6, ea6 ea62, hrf hrf, e05 e05, tb7 tb7, wc8 wc8, f43 f43, g0a g0a, ni3 ni3) {
        super(ea6, g0a);
        u40 u40 = new u40(wc8, tb7);
        this.i = u40;
        this.k = ea62;
        this.j = u40.i(e05, ea62);
        j60 j60 = ((h60) u40.f).d;
        this.f = j60;
        n79.n(!j60.equals(j60.e));
        ba6 ba6 = new ba6();
        String str = hrf.b;
        if (str == null) {
            str = ea6.n;
            str.getClass();
        }
        ba6.m = vq9.l(str);
        ba6.B = j60.a;
        ba6.A = j60.b;
        ba6.C = j60.c;
        ba6.i = ea62.j;
        ea6 ea63 = new ea6(ba6);
        ba6 a = ea63.a();
        a.m = vq9.l(dcd.i(ea63, g0a.b.C(1)));
        md4 m2 = f43.m(new ea6(a));
        this.e = m2;
        this.g = new ba4(0);
        this.h = new ba4(0);
        ea6 ea64 = m2.c;
        if (!v0g.a(ea63.n, ea64.n)) {
            yy a2 = hrf.a();
            a2.b(ea64.n);
            hrf = a2.a();
        }
        ni3.e(hrf);
    }

    public final gu6 j(e05 e05, ea6 ea6, int i2) {
        if (this.l) {
            return this.i.i(e05, ea6);
        }
        this.l = true;
        n79.n(ea6.equals(this.k));
        return this.j;
    }

    public final ba4 k() {
        ba4 ba4 = this.h;
        md4 md4 = this.e;
        ByteBuffer c = md4.c();
        ba4.v = c;
        MediaCodec.BufferInfo bufferInfo = null;
        if (c == null) {
            return null;
        }
        if (md4.f(false)) {
            bufferInfo = md4.a;
        }
        bufferInfo.getClass();
        ba4.x = bufferInfo.presentationTimeUs;
        ba4.b = 1;
        return ba4;
    }

    public final ea6 l() {
        md4 md4 = this.e;
        md4.f(false);
        return md4.j;
    }

    public final boolean m() {
        return this.e.d();
    }

    public final boolean n() {
        boolean z;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean z2 = true;
        u40 u40 = this.i;
        long j2 = -9223372036854775807L;
        if (u40.b) {
            z = true;
        } else {
            boolean z3 = u40.a;
            yb4 yb4 = (yb4) u40.e;
            if (!z3) {
                try {
                    yb4.d((j60) u40.g);
                    u40.a = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                    throw ExportException.b(e2, "Error while configuring mixer");
                }
            }
            u40.b = true;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) u40.d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                t40 t40 = (t40) arrayList.get(i2);
                if (t40.b == -1) {
                    w40 w40 = t40.a;
                    try {
                        w40.l();
                        long j3 = w40.e.get();
                        if (j3 == -9223372036854775807L) {
                            u40.b = false;
                        } else if (j3 != Long.MIN_VALUE) {
                            t40.b = yb4.a(w40.a, j3);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                        throw ExportException.b(e3, "Unhandled format while adding source " + t40.b);
                    }
                }
                i2++;
            }
            z = u40.b;
        }
        if (!z) {
            byteBuffer = m60.a;
        } else {
            if (!((yb4) u40.e).e()) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) u40.d;
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    t40 t402 = (t40) arrayList2.get(i3);
                    int i4 = t402.b;
                    yb4 yb42 = (yb4) u40.e;
                    yb42.c();
                    SparseArray sparseArray = yb42.c;
                    if (v0g.l(sparseArray, i4)) {
                        w40 w402 = t402.a;
                        if (!w402.m() && w402.d.isEmpty() && (w402.l == j2 ? w402.j || w402.k : w402.o && (w402.j || w402.k))) {
                            yb42.c();
                            long j4 = yb42.l;
                            SparseArray sparseArray2 = yb42.c;
                            n79.m("Source not found.", v0g.l(sparseArray2, i4));
                            yb42.l = Math.max(j4, ((xb4) sparseArray2.get(i4)).a);
                            sparseArray.delete(i4);
                            t402.b = -1;
                            u40.c++;
                        } else {
                            try {
                                yb42.f(i4, w402.l());
                            } catch (AudioProcessor$UnhandledAudioFormatException e4) {
                                throw ExportException.b(e4, "AudioGraphInput (sourceId=" + i4 + ") reconfiguration");
                            }
                        }
                    }
                    i3++;
                    j2 = -9223372036854775807L;
                }
            }
            if (!((ByteBuffer) u40.h).hasRemaining()) {
                yb4 yb43 = (yb4) u40.e;
                yb43.c();
                if (yb43.e()) {
                    byteBuffer2 = m60.a;
                } else {
                    long j5 = yb43.k;
                    if (yb43.c.size() == 0) {
                        j5 = Math.min(j5, yb43.l);
                    }
                    for (int i5 = 0; i5 < yb43.c.size(); i5++) {
                        j5 = Math.min(j5, ((xb4) yb43.c.valueAt(i5)).a);
                    }
                    if (j5 <= yb43.j) {
                        byteBuffer2 = m60.a;
                    } else {
                        ur1 ur1 = yb43.g[0];
                        long min = Math.min(j5, ur1.b);
                        ByteBuffer duplicate = ((ByteBuffer) ur1.c).duplicate();
                        duplicate.position(((int) (yb43.j - ur1.a)) * yb43.e.d).limit(((int) (min - ur1.a)) * yb43.e.d);
                        ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
                        if (min == ur1.b) {
                            ur1[] ur1Arr = yb43.g;
                            ur1 ur12 = ur1Arr[1];
                            ur1Arr[0] = ur12;
                            ur1Arr[1] = yb43.b(ur12.b);
                        }
                        yb43.j = min;
                        yb43.i = Math.min(yb43.k, min + ((long) yb43.f));
                        order.remaining();
                        LinkedHashMap linkedHashMap = p94.a;
                        synchronized (p94.class) {
                        }
                        byteBuffer2 = order;
                    }
                }
                u40.h = byteBuffer2;
            }
            if (((h60) u40.f).f()) {
                boolean h2 = u40.h();
                h60 h60 = (h60) u40.f;
                if (h2) {
                    h60.h();
                } else {
                    h60.i((ByteBuffer) u40.h);
                }
                byteBuffer = ((h60) u40.f).d();
            } else {
                byteBuffer = (ByteBuffer) u40.h;
            }
        }
        if (!this.e.e(this.g)) {
            return false;
        }
        u40 u402 = this.i;
        h60 h602 = (h60) u402.f;
        if (h602.f() ? h602.e() : u402.h()) {
            p94.a();
            ba4 ba4 = this.g;
            ByteBuffer byteBuffer3 = ba4.v;
            byteBuffer3.getClass();
            if (byteBuffer3.position() != 0) {
                z2 = false;
            }
            n79.n(z2);
            long j6 = this.m;
            j60 j60 = this.f;
            ba4.x = ((j6 / ((long) j60.d)) * 1000000) / ((long) j60.a);
            ba4.a(4);
            ba4.C();
            this.e.g(ba4);
            return false;
        } else if (!byteBuffer.hasRemaining()) {
            return false;
        } else {
            ba4 ba42 = this.g;
            ByteBuffer byteBuffer4 = ba42.v;
            byteBuffer4.getClass();
            int limit = byteBuffer.limit();
            byteBuffer.limit(Math.min(limit, byteBuffer4.capacity() + byteBuffer.position()));
            byteBuffer4.put(byteBuffer);
            long j7 = this.m;
            j60 j602 = this.f;
            ba42.x = ((j7 / ((long) j602.d)) * 1000000) / ((long) j602.a);
            this.m = j7 + ((long) byteBuffer4.position());
            ba42.b = 0;
            ba42.C();
            byteBuffer.limit(limit);
            this.e.g(ba42);
            return true;
        }
    }

    public final void o() {
        u40 u40;
        ArrayList arrayList;
        int i2 = 0;
        while (true) {
            u40 = this.i;
            arrayList = (ArrayList) u40.d;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((t40) arrayList.get(i2)).a.h.j();
            i2++;
        }
        arrayList.clear();
        yb4 yb4 = (yb4) u40.e;
        yb4.c.clear();
        yb4.d = 0;
        j60 j60 = j60.e;
        yb4.e = j60;
        yb4.f = -1;
        yb4.g = new ur1[0];
        yb4.h = -9223372036854775807L;
        yb4.i = -1;
        long j2 = 0;
        yb4.j = 0;
        yb4.k = LongCompanionObject.MAX_VALUE;
        if (yb4.a) {
            j2 = Long.MAX_VALUE;
        }
        yb4.l = j2;
        ((h60) u40.f).j();
        u40.c = 0;
        u40.h = m60.a;
        u40.g = j60;
        this.e.h();
    }

    public final void p() {
        this.e.i();
    }
}
