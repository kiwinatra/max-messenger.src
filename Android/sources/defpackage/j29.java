package defpackage;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j29  reason: default package */
public final class j29 extends m29 {
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String v;
    public final CharSequence w;
    public final CharSequence x;
    public final int y = 2;

    public j29(long j, long j2, long j3, String str, String str2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.v = str2;
        this.w = charSequence;
        this.x = charSequence2;
        Parcelable.Creator<eg2> creator = eg2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j29)) {
            return false;
        }
        j29 j29 = (j29) obj;
        return this.a == j29.a && this.b == j29.b && this.c == j29.c && Intrinsics.areEqual((Object) this.o, (Object) j29.o) && Intrinsics.areEqual((Object) this.v, (Object) j29.v) && Intrinsics.areEqual((Object) this.w, (Object) j29.w) && Intrinsics.areEqual((Object) this.x, (Object) j29.x);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.o;
        int d = g63.d((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.v);
        CharSequence charSequence = this.w;
        int hashCode = (d + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.x;
        if (charSequence2 != null) {
            i2 = charSequence2.hashCode();
        }
        return hashCode + i2;
    }

    public final int i() {
        return this.y;
    }

    public final long j() {
        return this.c;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        return "Link(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", previewUrl=" + this.o + ", title=" + this.v + ", subtitle=" + this.w + ", link=" + this.x + ")";
    }
}
