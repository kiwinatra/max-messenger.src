package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: b5h  reason: default package */
public abstract class b5h extends hvg implements fxg {
    public final int d;

    public b5h(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        if (bArr.length == 25) {
            this.d = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] L0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean I0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            hha hha = new hha(M0());
            parcel2.writeNoException();
            szg.c(parcel2, hha);
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.d);
        }
        return true;
    }

    public abstract byte[] M0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fxg)) {
            try {
                fxg fxg = (fxg) obj;
                if (((b5h) fxg).d != this.d) {
                    return false;
                }
                return Arrays.equals(M0(), (byte[]) hha.M0(new hha(((b5h) fxg).M0())));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
