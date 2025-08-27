package defpackage;

import android.os.Parcel;

/* renamed from: o6h  reason: default package */
public final class o6h extends bvg {
    public final p67 J0(hha hha, String str, int i) {
        Parcel H0 = H0();
        szg.c(H0, hha);
        H0.writeString(str);
        H0.writeInt(i);
        Parcel l = l(H0, 2);
        p67 L0 = hha.L0(l.readStrongBinder());
        l.recycle();
        return L0;
    }

    public final p67 K0(hha hha, String str, int i, hha hha2) {
        Parcel H0 = H0();
        szg.c(H0, hha);
        H0.writeString(str);
        H0.writeInt(i);
        szg.c(H0, hha2);
        Parcel l = l(H0, 8);
        p67 L0 = hha.L0(l.readStrongBinder());
        l.recycle();
        return L0;
    }

    public final p67 L0(hha hha, String str, int i) {
        Parcel H0 = H0();
        szg.c(H0, hha);
        H0.writeString(str);
        H0.writeInt(i);
        Parcel l = l(H0, 4);
        p67 L0 = hha.L0(l.readStrongBinder());
        l.recycle();
        return L0;
    }

    public final p67 M0(hha hha, String str, boolean z, long j) {
        Parcel H0 = H0();
        szg.c(H0, hha);
        H0.writeString(str);
        H0.writeInt(z ? 1 : 0);
        H0.writeLong(j);
        Parcel l = l(H0, 7);
        p67 L0 = hha.L0(l.readStrongBinder());
        l.recycle();
        return L0;
    }
}
