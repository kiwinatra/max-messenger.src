package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: pl6  reason: default package */
public final class pl6 implements Parcelable {
    public static final Parcelable.Creator<pl6> CREATOR = new uv4(21);
    public static final pl6 v0 = new pl6(false, true, true, true, false, CollectionsKt.emptyList(), false, 32);
    public final boolean X;
    public final boolean Y;
    public final Lazy Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean v;
    public final boolean w;
    public final List x;
    public final boolean y;
    public final boolean z;

    public pl6(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, boolean z8, boolean z9, boolean z10) {
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.o = z5;
        this.v = z6;
        this.w = z7;
        this.x = list;
        this.y = z8;
        this.z = z9;
        this.X = z10;
        this.Y = !z4;
        this.Z = LazyKt.lazy(new u75(16, this));
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.pl6) r5;
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
            boolean r1 = r5 instanceof defpackage.pl6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            pl6 r5 = (defpackage.pl6) r5
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
            boolean r1 = r4.v
            boolean r3 = r5.v
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            boolean r1 = r4.w
            boolean r3 = r5.w
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            java.util.List r1 = r4.x
            java.util.List r3 = r5.x
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0041
            return r2
        L_0x0041:
            boolean r1 = r4.y
            boolean r3 = r5.y
            if (r1 == r3) goto L_0x0048
            return r2
        L_0x0048:
            boolean r1 = r4.z
            boolean r3 = r5.z
            if (r1 == r3) goto L_0x004f
            return r2
        L_0x004f:
            boolean r4 = r4.X
            boolean r5 = r5.X
            if (r4 == r5) goto L_0x0056
            return r2
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X) + g63.e(g63.e(rae.i(this.x, g63.e(g63.e(g63.e(g63.e(g63.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.v), 31, this.w), 31), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryMode(selfClose=");
        sb.append(this.a);
        sb.append(", needCameraView=");
        sb.append(this.b);
        sb.append(", useVideos=");
        sb.append(this.c);
        sb.append(", multiSelectionEnabled=");
        sb.append(this.o);
        sb.append(", isMessageEdit=");
        sb.append(this.v);
        sb.append(", isAvatarPick=");
        sb.append(this.w);
        sb.append(", selectedItems=");
        sb.append(this.x);
        sb.append(", includeAlbumsSelection=");
        sb.append(this.y);
        sb.append(", profileCreation=");
        sb.append(this.z);
        sb.append(", useTopInset=");
        return tr1.m(sb, this.X, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        List<Parcelable> list = this.x;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ pl6(boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, java.util.List r20, boolean r21, int r22) {
        /*
            r14 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L_0x0011
            r9 = r3
            goto L_0x0013
        L_0x0011:
            r9 = r19
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001d
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r10 = r1
            goto L_0x001f
        L_0x001d:
            r10 = r20
        L_0x001f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0025
            r11 = r2
            goto L_0x0027
        L_0x0025:
            r11 = r21
        L_0x0027:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002d
            r13 = r2
            goto L_0x002e
        L_0x002d:
            r13 = r3
        L_0x002e:
            r8 = 0
            r12 = 0
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl6.<init>(boolean, boolean, boolean, boolean, boolean, java.util.List, boolean, int):void");
    }
}
