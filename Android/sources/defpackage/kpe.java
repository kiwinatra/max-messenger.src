package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: kpe  reason: default package */
public final class kpe implements Parcelable {
    public static final Parcelable.Creator<kpe> CREATOR = new nje(3);
    public final boe a;

    public kpe(boe boe) {
        this.a = boe;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boe boe = this.a;
        parcel.writeByte(boe == null ? (byte) 1 : 0);
        if (boe != null) {
            parcel.writeLong(boe.a);
            parcel.writeInt(boe.b);
            parcel.writeInt(boe.c);
            te8.D(parcel, boe.o);
            parcel.writeLong(boe.v);
            te8.D(parcel, boe.w);
            te8.D(parcel, boe.x);
            te8.D(parcel, boe.y);
            List list = boe.z;
            if (te8.E(parcel, list)) {
                parcel.writeInt(list.size());
                parcel.writeStringList(list);
            }
            parcel.writeInt(rae.f(boe.X));
            parcel.writeByte(boe.Y ? (byte) 1 : 0);
            parcel.writeLong(boe.Z);
            te8.D(parcel, boe.v0);
            parcel.writeByte(boe.w0 ? (byte) 1 : 0);
            x10 x10 = boe.x0;
            if (x10 == null) {
                te8.C(parcel, (byte[]) null);
            } else {
                te8.C(parcel, ad9.toByteArray(b.n(x10)));
            }
            parcel.writeInt(rae.d(boe.y0));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [h20, java.lang.Object] */
    public kpe(Parcel parcel) {
        x10 x10;
        if (!te8.s(parcel)) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String u = te8.u(parcel);
            long readLong2 = parcel.readLong();
            String u2 = te8.u(parcel);
            String u3 = te8.u(parcel);
            String u4 = te8.u(parcel);
            ArrayList v = te8.v(parcel);
            int c = rae.c(parcel.readInt());
            boolean z = true;
            long j = readLong;
            boolean z2 = parcel.readByte() == 1;
            long readLong3 = parcel.readLong();
            String u5 = te8.u(parcel);
            z = parcel.readByte() != 1 ? false : z;
            byte[] t = te8.t(parcel);
            if (t != null) {
                try {
                    x10 = b.m(Protos.Attaches.Attach.Photo.parseFrom(t));
                } catch (InvalidProtocolBufferNanoException e) {
                    throw new IllegalStateException("Can't parse gif", e);
                }
            } else {
                x10 = null;
            }
            x10 x102 = x10;
            int b = rae.b(parcel.readInt());
            ? obj = new Object();
            obj.a = j;
            obj.b = readInt;
            obj.c = readInt2;
            obj.d = u;
            obj.e = readLong2;
            obj.f = u2;
            obj.g = u3;
            obj.h = u4;
            obj.n = v;
            obj.i = c;
            obj.j = z2;
            obj.k = readLong3;
            obj.o = u5;
            obj.l = z;
            obj.p = x102;
            obj.m = b;
            this.a = obj.b();
            return;
        }
        this.a = null;
    }
}
