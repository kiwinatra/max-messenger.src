package defpackage;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c29  reason: default package */
public final class c29 extends m29 {
    public final int X = 3;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final ome z;

    public c29(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, xme xme) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
        this.y = str5;
        this.z = xme;
        Parcelable.Creator<eg2> creator = eg2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c29)) {
            return false;
        }
        c29 c29 = (c29) obj;
        return this.a == c29.a && this.b == c29.b && this.c == c29.c && Intrinsics.areEqual((Object) this.o, (Object) c29.o) && Intrinsics.areEqual((Object) this.v, (Object) c29.v) && Intrinsics.areEqual((Object) this.w, (Object) c29.w) && Intrinsics.areEqual((Object) this.x, (Object) c29.x) && Intrinsics.areEqual((Object) this.y, (Object) c29.y) && Intrinsics.areEqual((Object) this.z, (Object) c29.z);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.z.hashCode() + g63.d(g63.d(g63.d(g63.d(g63.d(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
    }

    public final int i() {
        return this.X;
    }

    public final long j() {
        return this.c;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        return "Audio(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", attachLocalId=" + this.o + ", audioUrl=" + this.v + ", audioArtist=" + this.w + ", subtitle=" + this.x + ", playerTitle=" + this.y + ", state=" + this.z + ")";
    }
}
