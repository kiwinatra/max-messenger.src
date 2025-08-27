package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yq8  reason: default package */
public final class yq8 implements hr8 {
    public final long a;
    public final long b;
    public final o00 c;
    public final p87 o;
    public final boolean v;
    public final String w;
    public final long x;
    public final int y;

    public yq8(long j, long j2, o00 o00, p87 p87, String str, int i) {
        boolean z = p87.e;
        if ((i & 32) != 0 && (str = p87.k) == null) {
            str = "";
        }
        this.a = j;
        this.b = j2;
        this.c = o00;
        this.o = p87;
        this.v = z;
        this.w = str;
        String str2 = p87.k;
        this.x = str2 != null ? (long) str2.hashCode() : 0;
        this.y = cra.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq8)) {
            return false;
        }
        yq8 yq8 = (yq8) obj;
        return this.a == yq8.a && this.b == yq8.b && Intrinsics.areEqual((Object) this.c, (Object) yq8.c) && Intrinsics.areEqual((Object) this.o, (Object) yq8.o) && this.v == yq8.v && Intrinsics.areEqual((Object) this.w, (Object) yq8.w);
    }

    public final long getItemId() {
        return this.x;
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
        return this.w.hashCode() + g63.e((this.o.hashCode() + ((this.c.hashCode() + i) * 31)) * 31, 31, this.v);
    }

    public final int i() {
        return this.y;
    }

    public final long j() {
        return this.b;
    }

    public final long m() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", imageAttachConfig=");
        sb.append(this.o);
        sb.append(", isGif=");
        sb.append(this.v);
        sb.append(", localId=");
        return wj6.n(sb, this.w, ")");
    }

    public final String v() {
        return this.w;
    }
}
