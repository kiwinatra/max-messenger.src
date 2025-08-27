package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zqg  reason: default package */
public final class zqg {
    public final yqg a;
    public final crg b;
    public final arg c;
    public final brg d;

    public zqg(yqg yqg, crg crg, arg arg, brg brg) {
        this.a = yqg;
        this.b = crg;
        this.c = arg;
        this.d = brg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqg)) {
            return false;
        }
        zqg zqg = (zqg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zqg.a) && Intrinsics.areEqual((Object) this.b, (Object) zqg.b) && Intrinsics.areEqual((Object) this.c, (Object) zqg.c) && Intrinsics.areEqual((Object) this.d, (Object) zqg.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WritebarColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
