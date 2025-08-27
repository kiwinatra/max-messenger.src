package defpackage;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lt3  reason: default package */
public final class lt3 implements oa4 {
    public final /* synthetic */ int a;
    public final Lazy b;

    public /* synthetic */ lt3(int i, Lazy lazy) {
        this.a = i;
        this.b = lazy;
    }

    public final wa4 a() {
        switch (this.a) {
            case 0:
                return mt3.b;
            default:
                return (ic8) this.b.getValue();
        }
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        i iVar;
        switch (this.a) {
            case 0:
                if (!mt3.b.a.contains(ra4)) {
                    return null;
                }
                if (Intrinsics.areEqual((Object) ra4, (Object) mt3.c)) {
                    iVar = new i(6);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) mt3.d)) {
                    iVar = new it3(0, this);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) mt3.e)) {
                    return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new i(7), 24);
                } else {
                    throw new IllegalStateException(tr1.i("unknown route ", ra4));
                }
                return new ab4(str, ra4, bundle, za4.c, (xa4) null, iVar, 16);
            default:
                if (!((ic8) this.b.getValue()).a.contains(ra4)) {
                    return null;
                }
                ic8.b.getClass();
                if (Intrinsics.areEqual((Object) ra4, (Object) ic8.c) || Intrinsics.areEqual((Object) ra4, (Object) ic8.d) || Intrinsics.areEqual((Object) ra4, (Object) ic8.e) || Intrinsics.areEqual((Object) ra4, (Object) ic8.f)) {
                    return new ab4(str, ra4, bundle, (za4) null, (xa4) null, new hc8(ra4, bundle), 24);
                }
                throw new IllegalStateException(tr1.i("unknown route ", ra4));
        }
    }
}
