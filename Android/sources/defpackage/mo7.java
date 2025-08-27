package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mo7  reason: default package */
public final class mo7 implements oo7 {
    public final String a;
    public final String b;

    public mo7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo7)) {
            return false;
        }
        mo7 mo7 = (mo7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) mo7.a) && Intrinsics.areEqual((Object) this.b, (Object) mo7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return wj6.n(sb, this.b, ")");
    }
}
