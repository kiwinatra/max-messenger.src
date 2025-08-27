package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: eu0  reason: default package */
public final class eu0 {
    public static final int[] c = {8000, 8000, 2000, 2000};
    public static final int[] d = {4000, 4000, 200, 200};
    public final AtomicReferenceArray a = new AtomicReferenceArray(4);
    public final AtomicReferenceArray b = new AtomicReferenceArray(4);

    public final char[] a(int i, int i2) {
        int i3 = d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] cArr = (char[]) this.b.getAndSet(i, (Object) null);
        return (cArr == null || cArr.length < i2) ? new char[i2] : cArr;
    }
}
