package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* renamed from: bz4  reason: default package */
public final class bz4 implements zy4 {
    public static final b8d a = new b8d(new Object());
    public static final Set b = Collections.singleton(vy4.d);

    public final DynamicRangeProfiles a() {
        return null;
    }

    public final Set b() {
        return b;
    }

    public final Set c(vy4 vy4) {
        boolean equals = vy4.d.equals(vy4);
        bs0.m("DynamicRange is not supported: " + vy4, equals);
        return b;
    }
}
