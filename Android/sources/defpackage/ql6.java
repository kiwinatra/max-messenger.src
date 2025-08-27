package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: ql6  reason: default package */
public final class ql6 implements Parcelable {
    public static final Parcelable.Creator<ql6> CREATOR = new uv4(22);
    public static final ql6 X = new ql6(true, true, true, false, CollectionsKt.emptyList(), false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final List v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final Lazy z = LazyKt.lazy(new u75(17, this));

    public ql6(boolean z2, boolean z3, boolean z4, boolean z5, List list, boolean z6, boolean z7) {
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.o = z5;
        this.v = list;
        this.w = z6;
        this.x = z7;
        this.y = !z3;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ql6) r5;
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
            boolean r1 = r5 instanceof defpackage.ql6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ql6 r5 = (defpackage.ql6) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r4.o
            boolean r3 = r5.o
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            java.util.List r1 = r4.v
            java.util.List r3 = r5.v
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0033
            return r2
        L_0x0033:
            boolean r1 = r4.w
            boolean r3 = r5.w
            if (r1 == r3) goto L_0x003a
            return r2
        L_0x003a:
            boolean r4 = r4.x
            boolean r5 = r5.x
            if (r4 == r5) goto L_0x0041
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + g63.e(rae.i(this.v, g63.e(g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31), 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryMode(needCameraView=");
        sb.append(this.a);
        sb.append(", useVideos=");
        sb.append(this.b);
        sb.append(", multiSelectionEnabled=");
        sb.append(this.c);
        sb.append(", isMessageEdit=");
        sb.append(this.o);
        sb.append(", selectedItems=");
        sb.append(this.v);
        sb.append(", profileCreation=");
        sb.append(this.w);
        sb.append(", useTopInset=");
        return tr1.m(sb, this.x, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        List<Parcelable> list = this.v;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }
}
