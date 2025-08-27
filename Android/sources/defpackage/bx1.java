package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: bx1  reason: default package */
public final class bx1 {
    public static final la0 i = new la0(Integer.TYPE, (Object) null, "camerax.core.captureConfig.rotation");
    public static final la0 j = new la0(Integer.class, (Object) null, "camerax.core.captureConfig.jpegQuality");
    public static final la0 k = new la0(Range.class, (Object) null, "camerax.core.captureConfig.resolvedFrameRate");
    public final List a;
    public final je3 b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final a9f g;
    public final it1 h;

    public bx1(ArrayList arrayList, c5b c5b, int i2, boolean z, ArrayList arrayList2, boolean z2, a9f a9f, it1 it1) {
        this.a = arrayList;
        this.b = c5b;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = a9f;
        this.h = it1;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.b.k(zzf.s0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.k(zzf.t0, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
