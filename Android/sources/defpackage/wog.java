package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wog  reason: default package */
public final class wog {
    public final String a;
    public final int b;

    public wog(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wog)) {
            return false;
        }
        wog wog = (wog) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wog.a) && this.b == wog.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return tr1.k(sb, this.b, ')');
    }
}
