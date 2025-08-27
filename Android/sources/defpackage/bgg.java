package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: bgg  reason: default package */
public final class bgg extends lo7 {
    public final String c;
    public final String d;

    public bgg(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgg)) {
            return false;
        }
        bgg bgg = (bgg) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) bgg.c) && Intrinsics.areEqual((Object) this.d, (Object) bgg.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFile(url=");
        sb.append(this.c);
        sb.append(", fileName=");
        return wj6.n(sb, this.d, ")");
    }
}
