package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ht4  reason: default package */
public final class ht4 implements Parcelable {
    public static final Parcelable.Creator<ht4> CREATOR = new j22(25);
    public final String a;
    public final Uri b;
    public final String c;
    public final List o;
    public final byte[] v;
    public final String w;
    public final byte[] x;

    public ht4(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int J = v0g.J(uri, str2);
        boolean z = true;
        if (J == 0 || J == 2 || J == 1) {
            z = str3 != null ? false : z;
            n79.f("customCacheKey must be null for type: " + J, z);
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.o = Collections.unmodifiableList(arrayList);
        this.v = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.w = str3;
        this.x = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : v0g.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ht4)) {
            return false;
        }
        ht4 ht4 = (ht4) obj;
        return this.a.equals(ht4.a) && this.b.equals(ht4.b) && v0g.a(this.c, ht4.c) && this.o.equals(ht4.o) && Arrays.equals(this.v, ht4.v) && v0g.a(this.w, ht4.w) && Arrays.equals(this.x, ht4.x);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        int i = 0;
        String str = this.c;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = (Arrays.hashCode(this.v) + ((this.o.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
        String str2 = this.w;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Arrays.hashCode(this.x) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.o;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.v);
        parcel.writeString(this.w);
        parcel.writeByteArray(this.x);
    }

    public ht4(Parcel parcel) {
        String readString = parcel.readString();
        int i = v0g.a;
        this.a = readString;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((fxe) parcel.readParcelable(fxe.class.getClassLoader()));
        }
        this.o = Collections.unmodifiableList(arrayList);
        this.v = parcel.createByteArray();
        this.w = parcel.readString();
        this.x = parcel.createByteArray();
    }
}
