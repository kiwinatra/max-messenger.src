package defpackage;

import android.os.Bundle;

/* renamed from: v6b  reason: default package */
public final class v6b implements jv7, odd {
    public lv7 a;
    public ndd b;
    public boolean c;
    public Bundle o;

    public static final void a(v6b v6b, zx3 zx3, zx3 zx32, ey3 ey3, fy3 fy3) {
        if (zx3 == zx32 && !fy3.b && ey3.d() && zx32.getView() != null) {
            lv7 lv7 = v6b.a;
            ndd ndd = null;
            if ((lv7 == null ? null : lv7).d == iu7.v) {
                if (lv7 == null) {
                    lv7 = null;
                }
                lv7.e(hu7.ON_PAUSE);
                Bundle bundle = new Bundle();
                v6b.o = bundle;
                ndd ndd2 = v6b.b;
                if (ndd2 != null) {
                    ndd = ndd2;
                }
                ndd.c(bundle);
                v6b.c = true;
            }
        }
    }

    public final ju7 getLifecycle() {
        lv7 lv7 = this.a;
        if (lv7 == null) {
            return null;
        }
        return lv7;
    }

    public final mdd getSavedStateRegistry() {
        ndd ndd = this.b;
        if (ndd == null) {
            ndd = null;
        }
        return ndd.b;
    }
}
