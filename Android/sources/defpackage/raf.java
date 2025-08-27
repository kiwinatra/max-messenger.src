package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: raf  reason: default package */
public final class raf extends qaf {
    public final String w;
    public final String x;

    public raf(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.w = str4;
        this.x = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raf) || !super.equals(obj)) {
            return false;
        }
        raf raf = (raf) obj;
        return Intrinsics.areEqual((Object) this.w, (Object) raf.w) && Intrinsics.areEqual((Object) this.x, (Object) raf.x);
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        int i = 0;
        String str = this.w;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.x;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder m = g63.m(raf.class.getSimpleName(), "{error='");
        m.append(this.b);
        m.append("', message='");
        m.append(this.c);
        m.append("', title='");
        m.append(this.w);
        m.append("', description='");
        m.append(this.x);
        m.append("', localizedMessage='");
        return wj6.n(m, this.o, "'}");
    }
}
