package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: ja9  reason: default package */
public final class ja9 implements Parcelable {
    public static final Parcelable.Creator<ja9> CREATOR = new ia9(0);
    public final ha9 a;

    public ja9(ha9 ha9) {
        this.a = ha9;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ha9 ha9 = this.a;
        parcel.writeByte(ha9 == null ? (byte) 1 : 0);
        if (ha9 != null) {
            parcel.writeLong(ha9.b);
            parcel.writeLong(ha9.c);
            parcel.writeLong(ha9.o);
            parcel.writeLong(ha9.v);
            parcel.writeLong(ha9.w);
            parcel.writeLong(ha9.x);
            te8.D(parcel, ha9.y);
            parcel.writeLong(ha9.z);
            parcel.writeInt(ha9.X.a);
            parcel.writeInt(ha9.Y.a);
            parcel.writeLong(ha9.Z);
            te8.D(parcel, ha9.v0);
            te8.D(parcel, ha9.w0);
            byte[] bArr = null;
            w28 w28 = ha9.x0;
            te8.C(parcel, w28 != null ? ad9.toByteArray(b.f(w28)) : null);
            parcel.writeInt(ha9.D0);
            parcel.writeLong(ha9.z0);
            parcel.writeInt(ha9.y0);
            parcel.writeParcelable(new ja9(ha9.A0), 0);
            parcel.writeString(ha9.B0);
            parcel.writeString(ha9.C0);
            parcel.writeByte(ha9.E0 ? (byte) 1 : 0);
            parcel.writeInt(ha9.F0);
            parcel.writeInt(ha9.G0);
            parcel.writeInt(wj6.d(ha9.T0));
            parcel.writeLong(ha9.H0);
            parcel.writeLong(ha9.I0);
            parcel.writeParcelable(new ja9(ha9.J0), 0);
            parcel.writeInt(ha9.K0);
            parcel.writeLong(ha9.L0);
            parcel.writeInt(ha9.M0);
            parcel.writeInt(ha9.N0);
            parcel.writeLong(ha9.O0);
            List list = ha9.P0;
            if (list != null) {
                bArr = ua9.b(list);
            }
            te8.C(parcel, bArr);
            parcel.writeByte(ha9.p() ? (byte) 1 : 0);
            if (ha9.p()) {
                cl4 cl4 = ha9.R0;
                parcel.writeLong(cl4.a);
                parcel.writeByte(cl4.b ? (byte) 1 : 0);
            }
        }
    }

    public ja9(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        long j;
        cl4 cl4;
        cl4 cl42;
        cl4 cl43;
        Parcel parcel2 = parcel;
        if (!te8.s(parcel)) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            long readLong5 = parcel.readLong();
            long readLong6 = parcel.readLong();
            String u = te8.u(parcel);
            long readLong7 = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            long readLong8 = parcel.readLong();
            String u2 = te8.u(parcel);
            String u3 = te8.u(parcel);
            w28 b = qe8.b(te8.t(parcel));
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            long readLong9 = parcel.readLong();
            Class<ja9> cls = ja9.class;
            ja9 ja9 = (ja9) parcel2.readParcelable(cls.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long j2 = readLong5;
            boolean z2 = parcel.readByte() == 1;
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            long readLong10 = parcel.readLong();
            long readLong11 = parcel.readLong();
            ja9 ja92 = (ja9) parcel2.readParcelable(cls.getClassLoader());
            int readInt8 = parcel.readInt();
            long readLong12 = parcel.readLong();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            long readLong13 = parcel.readLong();
            byte[] t = te8.t(parcel);
            if (t != null) {
                z = z2;
                try {
                    Protos.MessageElements messageElements = new Protos.MessageElements();
                    ad9.mergeFrom(messageElements, t);
                    arrayList = ua9.a(messageElements);
                } catch (Exception unused) {
                }
            } else {
                z = z2;
                arrayList = null;
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readByte() == 1) {
                try {
                    cl4 cl44 = cl42;
                    long readLong14 = parcel.readLong();
                    j = readLong4;
                    try {
                        boolean z3 = true;
                        if (parcel.readByte() == 1) {
                            cl43 = cl44;
                        } else {
                            cl43 = cl44;
                            z3 = false;
                        }
                        cl4 = new cl4(readLong14, z3);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
                xd9 xd9 = new xd9(Collections.emptyList(), 0, (qqc) null);
                oa9.b.getClass();
                oa9 n = cd4.n(readInt);
                qe9.b.getClass();
                this.a = new ha9(readLong, readLong2, readLong7, readLong3, j, j2, readLong6, u, n, sq6.D(readInt2), readLong8, u2, u3, b, readInt3, readInt4, readLong9, ja9.a, readString, readString2, z, readInt5, readInt6, wj6.c(readInt7), readLong10, readLong11, ja92.a, readInt8, readLong12, readInt9, readInt10, readLong13, arrayList2, xd9, cl4);
                return;
            }
            j = readLong4;
            cl4 = null;
            xd9 xd92 = new xd9(Collections.emptyList(), 0, (qqc) null);
            oa9.b.getClass();
            oa9 n2 = cd4.n(readInt);
            qe9.b.getClass();
            this.a = new ha9(readLong, readLong2, readLong7, readLong3, j, j2, readLong6, u, n2, sq6.D(readInt2), readLong8, u2, u3, b, readInt3, readInt4, readLong9, ja9.a, readString, readString2, z, readInt5, readInt6, wj6.c(readInt7), readLong10, readLong11, ja92.a, readInt8, readLong12, readInt9, readInt10, readLong13, arrayList2, xd92, cl4);
            return;
        }
        this.a = null;
    }
}
