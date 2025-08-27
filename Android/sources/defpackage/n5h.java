package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: n5h  reason: default package */
public abstract class n5h extends b5h {
    public static final WeakReference f = new WeakReference((Object) null);
    public WeakReference e;

    public final byte[] M0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.e.get();
                if (bArr == null) {
                    bArr = N0();
                    this.e = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] N0();
}
