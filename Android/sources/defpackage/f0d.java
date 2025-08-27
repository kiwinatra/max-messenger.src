package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f0d  reason: default package */
public final class f0d implements Parcelable {
    public static final Parcelable.Creator<f0d> CREATOR = new w0b(27);
    public final String a;
    public final String b;
    public final String c;
    public final String o;
    public final Long v;

    public f0d(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = str4;
        this.v = l;
    }

    public static f0d a(f0d f0d, Long l) {
        String str = f0d.a;
        String str2 = f0d.b;
        String str3 = f0d.c;
        String str4 = f0d.o;
        f0d.getClass();
        return new f0d(str, str2, str3, str4, l);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0d)) {
            return false;
        }
        f0d f0d = (f0d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) f0d.a) && Intrinsics.areEqual((Object) this.b, (Object) f0d.b) && Intrinsics.areEqual((Object) this.c, (Object) f0d.c) && Intrinsics.areEqual((Object) this.o, (Object) f0d.o) && Intrinsics.areEqual((Object) this.v, (Object) f0d.v);
    }

    public final int hashCode() {
        int d = g63.d(g63.d(g63.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o);
        Long l = this.v;
        return d + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "RegistrationData(token=" + this.a + ", phone=" + this.b + ", name=" + this.c + ", surname=" + this.o + ", photoId=" + this.v + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        Long l = this.v;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
