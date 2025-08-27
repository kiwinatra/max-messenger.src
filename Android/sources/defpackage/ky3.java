package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ky3  reason: default package */
public final class ky3 implements dy3 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public ky3(String str, yr0 yr0, yr0 yr02) {
        this.a = str;
        this.b = yr0;
        this.c = yr02;
    }

    public final void a(zx3 zx3, zx3 zx32, boolean z) {
        if (Intrinsics.areEqual((Object) zx3 != null ? zx3.getInstanceId() : null, (Object) this.a) && z) {
            this.b.invoke();
        }
    }

    public final void b(zx3 zx3, zx3 zx32, boolean z) {
        if (Intrinsics.areEqual((Object) zx32 != null ? zx32.getInstanceId() : null, (Object) this.a) && !z) {
            this.c.invoke();
        }
    }
}
