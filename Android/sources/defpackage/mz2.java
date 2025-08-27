package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mz2  reason: default package */
public final class mz2 {
    public final e9d a;

    public mz2(e9d e9d) {
        this.a = e9d;
    }

    public final zx3 a() {
        i9d i9d = (i9d) CollectionsKt.firstOrNull(this.a.e());
        if (i9d != null) {
            return i9d.a;
        }
        return null;
    }

    public final String b() {
        i9d i9d = (i9d) CollectionsKt.firstOrNull(this.a.e());
        if (i9d != null) {
            return i9d.b;
        }
        return null;
    }

    public final void c(String str, Function0 function0) {
        if (!Intrinsics.areEqual((Object) b(), (Object) str)) {
            i9d i9d = new i9d((zx3) function0.invoke(), (String) null, (ey3) null, (ey3) null, false, -1);
            i9d.d(str);
            this.a.R(i9d);
        }
    }
}
