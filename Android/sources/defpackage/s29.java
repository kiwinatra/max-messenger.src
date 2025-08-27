package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s29  reason: default package */
public final class s29 implements Parcelable {
    public static final Parcelable.Creator<s29> CREATOR = new f27(28);
    public final int a;
    public final ngf b;
    public final h1e c;
    public final Integer o;
    public final f1e v;

    public /* synthetic */ s29(int i, igf igf, Integer num) {
        this(i, igf, h1e.a, num, (f1e) null);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.s29) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.s29
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            s29 r5 = (defpackage.s29) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ngf r1 = r4.b
            ngf r3 = r5.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            h1e r1 = r4.c
            h1e r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.Integer r1 = r4.o
            java.lang.Integer r3 = r5.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            f1e r4 = r4.v
            f1e r5 = r5.v
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s29.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + i2a.g(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i = 0;
        Integer num = this.o;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        f1e f1e = this.v;
        if (f1e != null) {
            i = f1e.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MemberListAction(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.v + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeParcelable(this.v, i);
    }

    public s29(int i, ngf ngf, h1e h1e, Integer num, f1e f1e) {
        this.a = i;
        this.b = ngf;
        this.c = h1e;
        this.o = num;
        this.v = f1e;
    }
}
