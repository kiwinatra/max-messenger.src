package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ab4  reason: default package */
public final class ab4 {
    public final String a;
    public final ra4 b;
    public final Bundle c;
    public final za4 d;
    public final xa4 e;
    public final ya4 f;

    public ab4(String str, ra4 ra4, Bundle bundle, za4 za4, xa4 xa4, ya4 ya4) {
        this.a = str;
        this.b = ra4;
        this.c = bundle;
        this.d = za4;
        this.e = xa4;
        this.f = ya4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab4)) {
            return false;
        }
        ab4 ab4 = (ab4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ab4.a) && Intrinsics.areEqual((Object) this.b, (Object) ab4.b) && Intrinsics.areEqual((Object) this.c, (Object) ab4.c) && this.d == ab4.d && Intrinsics.areEqual((Object) this.e, (Object) ab4.e) && Intrinsics.areEqual((Object) this.f, (Object) ab4.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeepLinkScreen(name=" + this.a + ", route=" + this.b + ", deepLinkBundle=" + ("DeepLinkBundle(bundle=" + this.c + ")") + ", mode=" + this.d + ", animations=" + this.e + ", screenFactory=" + this.f + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ab4(java.lang.String r8, defpackage.ra4 r9, android.os.Bundle r10, defpackage.za4 r11, defpackage.xa4 r12, defpackage.ya4 r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0006
            za4 r11 = defpackage.za4.a
        L_0x0006:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0010
            xa4 r12 = new xa4
            r12.<init>()
        L_0x0010:
            r5 = r12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab4.<init>(java.lang.String, ra4, android.os.Bundle, za4, xa4, ya4, int):void");
    }
}
