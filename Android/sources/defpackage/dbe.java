package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.View;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: dbe  reason: default package */
public final class dbe implements zi6, a07, qk3, mze, wpe, nsb, an8, ybg, fn8, srf {
    public static final dbe b = new dbe(1);
    public static final dbe c = new dbe(2);
    public static final dbe o = new dbe(3);
    public static final dbe v = new dbe(4);
    public static wtd w = new Object();
    public static final /* synthetic */ dbe x = new dbe(6);
    public final /* synthetic */ int a;

    public /* synthetic */ dbe(int i) {
        this.a = i;
    }

    public static MediaCodec d(dn8 dn8) {
        dn8.a.getClass();
        String str = dn8.a.a;
        String valueOf = String.valueOf(str);
        m5a.f(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        m5a.s();
        return createByCodecName;
    }

    public static kpc g(int i) {
        Object obj;
        Iterator it = kpc.x0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kpc) obj).ordinal() == i) {
                break;
            }
        }
        return (kpc) obj;
    }

    public long a() {
        throw new NoSuchElementException();
    }

    public void accept(Object obj) {
        hga.d.getClass();
        z68.b(hga.f, "putAnalyticsEntries: failed", (Throwable) obj);
    }

    public Object apply(Object obj) {
        p4g a2;
        switch (this.a) {
            case 1:
                lfd lfd = (lfd) obj;
                return (lfd) ((kbf) ((jbf) xd3.g.getValue())).e.getValue();
            default:
                cu4 cu4 = (cu4) obj;
                tt4 tt4 = cu4.a;
                st4 st4 = new st4(tt4.a, tt4.b);
                i20 i20 = cu4.e;
                if (i20 == null) {
                    a2 = null;
                } else {
                    i20 i202 = new i20(1);
                    i202.a = i20.a;
                    i202.c = i20.c;
                    i202.b = i20.b;
                    i202.d = i20.d;
                    a2 = i202.a();
                }
                p4g p4g = a2;
                return new au4(st4, cu4.b, cu4.c, cu4.d, p4g);
        }
    }

    public long b() {
        throw new NoSuchElementException();
    }

    public void c(View view, float f) {
        if (f < c44.DEFAULT_ASPECT_RATIO) {
            view.setScrollX((int) (((float) view.getWidth()) * f));
        } else if (f > c44.DEFAULT_ASPECT_RATIO) {
            view.setScrollX(-((int) (((float) view.getWidth()) * (-f))));
        } else {
            view.setScrollX(0);
        }
    }

    public s7h e(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = m9d.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? hsg.o(bundle) : hsg.o((Object) null);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [o5h, hn8, java.lang.Object] */
    public hn8 f(dn8 dn8) {
        MediaCodec mediaCodec = null;
        try {
            MediaCodec d = d(dn8);
            m5a.f("configureCodec");
            d.configure(dn8.b, dn8.d, dn8.e, 0);
            m5a.s();
            m5a.f("startCodec");
            d.start();
            m5a.s();
            ? obj = new Object();
            obj.a = d;
            if (t0g.a < 21) {
                obj.b = d.getInputBuffers();
                obj.c = d.getOutputBuffers();
            }
            return obj;
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public trf h(Context context, m53 m53, rx0 rx0, k6g k6g, t9a t9a, List list, long j) {
        return new qrf(context, m53, rx0, k6g, t9a, list, j);
    }

    public boolean j() {
        return true;
    }

    public boolean next() {
        return false;
    }

    public long p() {
        return System.currentTimeMillis();
    }

    public boolean test(Object obj) {
        return true;
    }

    public boolean z(long j) {
        return System.currentTimeMillis() < j;
    }
}
