package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: yv4  reason: default package */
public final class yv4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<yv4> CREATOR = new j22(28);
    public final wv4[] a;
    public int b;
    public final String c;
    public final int o;

    public yv4(String str, ArrayList arrayList) {
        this(str, false, (wv4[]) arrayList.toArray(new wv4[0]));
    }

    public final yv4 a(String str) {
        return v0g.a(this.c, str) ? this : new yv4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        wv4 wv4 = (wv4) obj;
        wv4 wv42 = (wv4) obj2;
        UUID uuid = zw0.a;
        return uuid.equals(wv4.b) ? uuid.equals(wv42.b) ? 0 : 1 : wv4.b.compareTo(wv42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yv4.class != obj.getClass()) {
            return false;
        }
        yv4 yv4 = (yv4) obj;
        return v0g.a(this.c, yv4.c) && Arrays.equals(this.a, yv4.a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: wv4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yv4(java.lang.String r1, boolean r2, defpackage.wv4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            wv4[] r3 = (defpackage.wv4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv4.<init>(java.lang.String, boolean, wv4[]):void");
    }

    public yv4(Parcel parcel) {
        this.c = parcel.readString();
        wv4[] wv4Arr = (wv4[]) parcel.createTypedArray(wv4.CREATOR);
        int i = v0g.a;
        this.a = wv4Arr;
        this.o = wv4Arr.length;
    }
}
