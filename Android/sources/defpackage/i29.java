package defpackage;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i29  reason: default package */
public final class i29 extends m29 {
    public final h29 X;
    public final g29 Y;
    public final vk5 Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String v;
    public final int v0 = 1;
    public final CharSequence w;
    public final CharSequence x;
    public final String y;
    public final String z;

    public i29(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, h29 h29, g29 g29, vk5 vk5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
        this.y = str5;
        this.z = str6;
        this.X = h29;
        this.Y = g29;
        this.Z = vk5;
        Parcelable.Creator<eg2> creator = eg2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i29)) {
            return false;
        }
        i29 i29 = (i29) obj;
        return this.a == i29.a && this.b == i29.b && this.c == i29.c && Intrinsics.areEqual((Object) this.o, (Object) i29.o) && Intrinsics.areEqual((Object) this.v, (Object) i29.v) && Intrinsics.areEqual((Object) this.w, (Object) i29.w) && Intrinsics.areEqual((Object) this.x, (Object) i29.x) && Intrinsics.areEqual((Object) this.y, (Object) i29.y) && Intrinsics.areEqual((Object) this.z, (Object) i29.z) && this.X == i29.X && Intrinsics.areEqual((Object) this.Y, (Object) i29.Y) && this.Z == i29.Z;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        String str = this.o;
        int d = g63.d(wj6.e(this.x, wj6.e(this.w, g63.d((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.v), 31), 31), 31, this.y);
        String str2 = this.z;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int hashCode = this.X.hashCode();
        return this.Z.hashCode() + ((this.Y.hashCode() + ((hashCode + ((d + i2) * 31)) * 31)) * 31);
    }

    public final int i() {
        return this.v0;
    }

    public final long j() {
        return this.c;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        return "File(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", previewUrl=" + this.o + ", title=" + this.v + ", uploadTime=" + this.w + ", fileSize=" + this.x + ", attachLocalId=" + this.y + ", localPath=" + this.z + ", type=" + this.X + ", state=" + this.Y + ", extension=" + this.Z + ")";
    }
}
