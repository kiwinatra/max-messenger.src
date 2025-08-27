package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.KotlinVersion;

/* renamed from: sg0  reason: default package */
public final class sg0 implements Parcelable {
    public static final Parcelable.Creator<sg0> CREATOR = new s6(11);
    public int A0;
    public Integer B0;
    public Boolean C0 = Boolean.TRUE;
    public Integer D0;
    public Integer E0;
    public Integer F0;
    public Integer G0;
    public Integer H0;
    public Integer I0;
    public Integer J0;
    public Integer K0;
    public Integer L0;
    public Boolean M0;
    public String X;
    public int Y = -2;
    public int Z = -2;
    public int a;
    public Integer b;
    public Integer c;
    public Integer o;
    public Integer v;
    public int v0 = -2;
    public Integer w;
    public Locale w0;
    public Integer x;
    public CharSequence x0;
    public Integer y;
    public CharSequence y0;
    public int z = KotlinVersion.MAX_COMPONENT_VALUE;
    public int z0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.v0);
        CharSequence charSequence = this.x0;
        String str = null;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.y0;
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.z0);
        parcel.writeSerializable(this.B0);
        parcel.writeSerializable(this.D0);
        parcel.writeSerializable(this.E0);
        parcel.writeSerializable(this.F0);
        parcel.writeSerializable(this.G0);
        parcel.writeSerializable(this.H0);
        parcel.writeSerializable(this.I0);
        parcel.writeSerializable(this.L0);
        parcel.writeSerializable(this.J0);
        parcel.writeSerializable(this.K0);
        parcel.writeSerializable(this.C0);
        parcel.writeSerializable(this.w0);
        parcel.writeSerializable(this.M0);
    }
}
