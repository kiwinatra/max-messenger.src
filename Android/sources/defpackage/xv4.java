package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: xv4  reason: default package */
public final class xv4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<xv4> CREATOR = new j22(27);
    public final vv4[] a;
    public int b;
    public final String c;
    public final int o;

    public xv4(String str, ArrayList arrayList) {
        this(str, false, (vv4[]) arrayList.toArray(new vv4[0]));
    }

    public final xv4 a(String str) {
        return t0g.a(this.c, str) ? this : new xv4(str, false, this.a);
    }

    public final int compare(Object obj, Object obj2) {
        vv4 vv4 = (vv4) obj;
        vv4 vv42 = (vv4) obj2;
        UUID uuid = ww0.a;
        return uuid.equals(vv4.b) ? uuid.equals(vv42.b) ? 0 : 1 : vv4.b.compareTo(vv42.b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xv4.class != obj.getClass()) {
            return false;
        }
        xv4 xv4 = (xv4) obj;
        return t0g.a(this.c, xv4.c) && Arrays.equals(this.a, xv4.a);
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: vv4[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xv4(java.lang.String r1, boolean r2, defpackage.vv4... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            vv4[] r3 = (defpackage.vv4[]) r3
        L_0x000e:
            r0.a = r3
            int r1 = r3.length
            r0.o = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv4.<init>(java.lang.String, boolean, vv4[]):void");
    }

    public xv4(Parcel parcel) {
        this.c = parcel.readString();
        vv4[] vv4Arr = (vv4[]) parcel.createTypedArray(vv4.CREATOR);
        int i = t0g.a;
        this.a = vv4Arr;
        this.o = vv4Arr.length;
    }
}
