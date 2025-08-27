package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jqb  reason: default package */
public final class jqb extends h3 {
    public static final Parcelable.Creator<jqb> CREATOR = new o0h(14);
    public int X;
    public final List Y;
    public final List Z;
    public final List a;
    public float b;
    public int c;
    public final float o;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final ww1 y;
    public final ww1 z;

    public jqb() {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = c44.DEFAULT_ASPECT_RATIO;
        this.v = true;
        this.w = false;
        this.x = false;
        this.y = new tv0();
        this.z = new tv0();
        this.X = 0;
        this.Y = null;
        this.Z = new ArrayList();
        this.a = new ArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.y0(parcel, this.a, 2);
        float f = this.b;
        tf6.G0(parcel, 3, 4);
        parcel.writeFloat(f);
        int i2 = this.c;
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(i2);
        tf6.G0(parcel, 5, 4);
        parcel.writeFloat(this.o);
        tf6.G0(parcel, 6, 4);
        parcel.writeInt(this.v ? 1 : 0);
        tf6.G0(parcel, 7, 4);
        parcel.writeInt(this.w ? 1 : 0);
        tf6.G0(parcel, 8, 4);
        parcel.writeInt(this.x ? 1 : 0);
        tf6.u0(parcel, 9, this.y.b(), i);
        tf6.u0(parcel, 10, this.z.b(), i);
        int i3 = this.X;
        tf6.G0(parcel, 11, 4);
        parcel.writeInt(i3);
        tf6.y0(parcel, this.Y, 12);
        List<kye> list = this.Z;
        ArrayList arrayList = new ArrayList(list.size());
        for (kye kye : list) {
            gye gye = kye.a;
            float f2 = gye.a;
            Pair pair = new Pair(Integer.valueOf(gye.b), Integer.valueOf(gye.c));
            arrayList.add(new kye(new gye(this.b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.v, gye.v), kye.b));
        }
        tf6.y0(parcel, arrayList, 13);
        tf6.E0(parcel, B0);
    }

    public jqb(ArrayList arrayList, float f, int i, float f2, boolean z2, boolean z3, boolean z4, ww1 ww1, ww1 ww12, int i2, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = c44.DEFAULT_ASPECT_RATIO;
        this.v = true;
        this.w = false;
        this.x = false;
        this.y = new tv0();
        this.z = new tv0();
        this.X = 0;
        this.Y = null;
        this.Z = new ArrayList();
        this.a = arrayList;
        this.b = f;
        this.c = i;
        this.o = f2;
        this.v = z2;
        this.w = z3;
        this.x = z4;
        if (ww1 != null) {
            this.y = ww1;
        }
        if (ww12 != null) {
            this.z = ww12;
        }
        this.X = i2;
        this.Y = arrayList2;
        if (arrayList3 != null) {
            this.Z = arrayList3;
        }
    }
}
