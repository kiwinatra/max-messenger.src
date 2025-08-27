package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* renamed from: u6b  reason: default package */
public final class u6b extends Lambda implements Function3 {
    public final /* synthetic */ v6b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u6b(v6b v6b) {
        super(3);
        this.a = v6b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zx3 zx3 = (zx3) obj;
        ey3 ey3 = (ey3) obj2;
        fy3 fy3 = (fy3) obj3;
        v6b v6b = this.a;
        if (v6b.a != null) {
            v6b.a(v6b, zx3, zx3, ey3, fy3);
        }
        return Unit.INSTANCE;
    }
}
