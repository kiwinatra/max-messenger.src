package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z0b  reason: default package */
public final class z0b implements Parcelable {
    public static final Parcelable.Creator<z0b> CREATOR = new ia9(22);
    public static final z0b w = new z0b(p0b.a, "", (CharSequence) null, v0b.a, new n0b(0, 0, 7));
    public final s0b a;
    public final CharSequence b;
    public final CharSequence c;
    public final y0b o;
    public final n0b v;

    public z0b(s0b s0b, CharSequence charSequence, CharSequence charSequence2, y0b y0b, n0b n0b) {
        this.a = s0b;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = y0b;
        this.v = n0b;
    }

    public static z0b a(z0b z0b, s0b s0b, CharSequence charSequence, CharSequence charSequence2, y0b y0b, n0b n0b, int i) {
        if ((i & 1) != 0) {
            s0b = z0b.a;
        }
        s0b s0b2 = s0b;
        if ((i & 2) != 0) {
            charSequence = z0b.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = z0b.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            y0b = z0b.o;
        }
        y0b y0b2 = y0b;
        if ((i & 16) != 0) {
            n0b = z0b.v;
        }
        z0b.getClass();
        return new z0b(s0b2, charSequence3, charSequence4, y0b2, n0b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0b)) {
            return false;
        }
        z0b z0b = (z0b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z0b.a) && Intrinsics.areEqual((Object) this.b, (Object) z0b.b) && Intrinsics.areEqual((Object) this.c, (Object) z0b.c) && Intrinsics.areEqual((Object) this.o, (Object) z0b.o) && Intrinsics.areEqual((Object) this.v, (Object) z0b.v);
    }

    public final int hashCode() {
        int e = wj6.e(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        return this.v.hashCode() + ((this.o.hashCode() + ((e + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + this.b + ", caption=" + this.c + ", right=" + this.o + ", params=" + this.v + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.o, i);
        this.v.writeToParcel(parcel, i);
    }
}
