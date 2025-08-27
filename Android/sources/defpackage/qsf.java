package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* renamed from: qsf  reason: default package */
public final class qsf {
    public static volatile u54 e;
    public final lzf a;
    public final lzf b;
    public final kfd c;
    public final zyf d;

    public qsf(lzf lzf, lzf lzf2, kfd kfd, zyf zyf, zog zog) {
        this.a = lzf;
        this.b = lzf2;
        this.c = kfd;
        this.d = zyf;
        zog.getClass();
        zog.a.execute(new qof(14, zog));
    }

    public static qsf a() {
        u54 u54 = e;
        if (u54 != null) {
            return (qsf) u54.x.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [t54, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (qsf.class) {
                try {
                    if (e == null) {
                        ? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final psf c(i55 i55) {
        Set set;
        byte[] bArr;
        if (i55 instanceof i55) {
            ((ax0) i55).getClass();
            set = Collections.unmodifiableSet(ax0.d);
        } else {
            set = Collections.singleton(new l65("proto"));
        }
        g6d a2 = tc0.a();
        i55.getClass();
        a2.b = "cct";
        ax0 ax0 = (ax0) i55;
        String str = ax0.a;
        String str2 = ax0.b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = g63.j("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bArr;
        return new psf(set, a2.k(), this);
    }
}
