package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zg7  reason: default package */
public final class zg7 extends v5a {
    public final String b;
    public final String c;
    public final int d;

    public zg7(String str, String str2, int i) {
        super(Unit.INSTANCE);
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg7)) {
            return false;
        }
        zg7 zg7 = (zg7) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) zg7.b) && Intrinsics.areEqual((Object) this.c, (Object) zg7.c) && this.d == zg7.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + g63.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirmScreen(verifyToken=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", codeLength=");
        return wj6.l(sb, this.d, ")");
    }
}
