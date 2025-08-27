package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmField;

/* renamed from: o1h  reason: default package */
public final class o1h extends h3 {
    @JvmField
    public static final Parcelable.Creator<o1h> CREATOR = new o0h(4);
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final p2h v;
    public final o1h w;

    static {
        Process.myUid();
        Process.myPid();
    }

    public o1h(int i, String str, String str2, String str3, ArrayList arrayList, o1h o1h) {
        if (o1h == null || o1h.w == null) {
            this.a = i;
            this.b = str;
            this.c = str2;
            AbstractCollection abstractCollection = null;
            this.o = str3 == null ? o1h != null ? o1h.o : null : str3;
            AbstractCollection abstractCollection2 = arrayList;
            if (arrayList == null) {
                AbstractCollection abstractCollection3 = o1h != null ? o1h.v : abstractCollection;
                abstractCollection2 = abstractCollection3;
                if (abstractCollection3 == null) {
                    m2h m2h = p2h.b;
                    abstractCollection2 = q2h.v;
                }
            }
            m2h m2h2 = p2h.b;
            Object[] array = abstractCollection2.toArray();
            int length = array.length;
            int i2 = 0;
            while (i2 < length) {
                if (array[i2] != null) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                    sb.append("at index ");
                    sb.append(i2);
                    throw new NullPointerException(sb.toString());
                }
            }
            this.v = length == 0 ? q2h.v : new q2h(array, length);
            this.w = o1h;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (defpackage.o1h) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.o1h
            r1 = 0
            if (r0 == 0) goto L_0x0041
            o1h r4 = (defpackage.o1h) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0041
            java.lang.String r0 = r3.b
            java.lang.String r2 = r4.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.c
            java.lang.String r2 = r4.c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r3.o
            java.lang.String r2 = r4.o
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0041
            o1h r0 = r3.w
            o1h r2 = r4.w
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0041
            p2h r3 = r3.v
            p2h r4 = r4.v
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 == 0) goto L_0x0041
            r3 = 1
            return r3
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o, this.w});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (StringsKt__StringsJVMKt.startsWith$default(str2, str, false, 2, (Object) null)) {
                sb.append(str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.o;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.w0(parcel, 3, this.b);
        tf6.w0(parcel, 4, this.c);
        tf6.w0(parcel, 6, this.o);
        tf6.u0(parcel, 7, this.w, i);
        tf6.y0(parcel, this.v, 8);
        tf6.E0(parcel, B0);
    }
}
