package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d48  reason: default package */
public class d48 extends n2 implements Parcelable {
    public static final Parcelable.Creator<d48> CREATOR = new f27(14);
    public final long b;
    public final String c;
    public final String o;
    public final int v;
    public final long w;
    public final String x;
    public final long y;
    public Uri z;

    public d48(int i, long j, String str, String str2, int i2, long j2, String str3, long j3, Uri uri) {
        super(i);
        this.b = j;
        this.c = str;
        this.o = str2;
        this.v = i2;
        this.w = j2;
        this.x = str3;
        this.y = j3;
        this.z = uri;
    }

    public String a() {
        Uri uri = this.z;
        return uri != null ? uri.toString() : this.c;
    }

    public Uri c() {
        Uri uri = this.z;
        if (uri != null) {
            return uri;
        }
        try {
            Uri parse = Uri.parse(this.c);
            this.z = parse;
            return parse;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.a != 1) {
            return false;
        }
        o9a o9a = sq9.b;
        String str = this.x;
        return str != null ? StringsKt__StringsJVMKt.startsWith(str, "image/gif", true) : false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        te8.D(parcel, this.c);
        te8.D(parcel, this.o);
        parcel.writeInt(this.v);
        parcel.writeLong(this.w);
        parcel.writeString(this.x);
        parcel.writeLong(this.y);
        Uri uri = this.z;
        if (te8.E(parcel, uri)) {
            parcel.writeParcelable(uri, i);
        }
    }

    /* JADX WARNING: type inference failed for: r14v3, types: [android.os.Parcelable] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d48(android.os.Parcel r14) {
        /*
            r13 = this;
            int r1 = r14.readInt()
            long r2 = r14.readLong()
            java.lang.String r4 = defpackage.te8.u(r14)
            java.lang.String r5 = defpackage.te8.u(r14)
            int r6 = r14.readInt()
            long r7 = r14.readLong()
            java.lang.String r9 = r14.readString()
            long r10 = r14.readLong()
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r12 = defpackage.te8.o(r14)
            if (r12 == 0) goto L_0x0031
            android.os.Parcelable r14 = r14.readParcelable(r0)
            goto L_0x0032
        L_0x0031:
            r14 = 0
        L_0x0032:
            r12 = r14
            android.net.Uri r12 = (android.net.Uri) r12
            r0 = r13
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d48.<init>(android.os.Parcel):void");
    }
}
