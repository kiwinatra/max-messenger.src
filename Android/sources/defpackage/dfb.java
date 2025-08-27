package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: dfb  reason: default package */
public final class dfb implements Parcelable {
    public static final Parcelable.Creator<dfb> CREATOR = new w0b(5);
    public final Uri a;
    public final Uri b;
    public final d44 c;
    public final h05 o;
    public final Uri v;
    public final Uri w;

    public dfb(Uri uri, Uri uri2, d44 d44, h05 h05, Uri uri3, Uri uri4) {
        this.a = uri;
        this.b = uri2;
        this.c = d44;
        this.o = h05;
        this.v = uri3;
        this.w = uri4;
    }

    public static Uri a(dfb dfb, d48 d48) {
        if (dfb == null) {
            return Uri.parse(d48.a());
        }
        Uri uri = dfb.w;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = dfb.b;
        if (uri2 != null) {
            return uri2;
        }
        Uri uri3 = dfb.a;
        return uri3 != null ? uri3 : Uri.parse(d48.a());
    }

    public static boolean b(dfb dfb, d48 d48) {
        if (dfb == null) {
            return false;
        }
        return (dfb.o == null && dfb.c == null && a(dfb, d48).equals(Uri.parse(d48.a()))) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kwd, java.lang.Object] */
    public final kwd c() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.v;
        obj.f = this.w;
        return obj;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dfb.class != obj.getClass()) {
            return false;
        }
        dfb dfb = (dfb) obj;
        if (Objects.equals(this.a, dfb.a) && Objects.equals(this.b, dfb.b) && Objects.equals(this.c, dfb.c) && Objects.equals(this.o, dfb.o) && Objects.equals(this.v, dfb.v)) {
            return Objects.equals(this.w, dfb.w);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        d44 d44 = this.c;
        int hashCode3 = (hashCode2 + (d44 != null ? d44.hashCode() : 0)) * 31;
        h05 h05 = this.o;
        int hashCode4 = (hashCode3 + (h05 != null ? h05.hashCode() : 0)) * 31;
        Uri uri3 = this.v;
        int hashCode5 = (hashCode4 + (uri3 != null ? uri3.hashCode() : 0)) * 31;
        Uri uri4 = this.w;
        if (uri4 != null) {
            i = uri4.hashCode();
        }
        return hashCode5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.o, i);
        parcel.writeParcelable(this.v, i);
        parcel.writeParcelable(this.w, i);
    }
}
