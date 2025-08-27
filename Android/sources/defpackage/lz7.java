package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lz7  reason: default package */
public interface lz7 {
    boolean f(lz7 lz7) {
        return getItemId() == lz7.getItemId();
    }

    long getItemId();

    int i();

    Object l(Object obj) {
        return null;
    }

    boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, obj);
    }
}
