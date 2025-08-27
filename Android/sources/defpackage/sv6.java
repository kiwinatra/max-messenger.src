package defpackage;

import android.util.SparseArray;
import kotlin.uuid.Uuid;

/* renamed from: sv6  reason: default package */
public final class sv6 {
    public final ypf a;
    public final boolean b;
    public final boolean c;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final ky1 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public rv6 m = new Object();
    public rv6 n = new Object();
    public boolean o;
    public long p;
    public long q;
    public boolean r;

    /* JADX WARNING: type inference failed for: r2v3, types: [rv6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [rv6, java.lang.Object] */
    public sv6(ypf ypf, boolean z, boolean z2) {
        this.a = ypf;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[Uuid.SIZE_BITS];
        this.g = bArr;
        this.f = new ky1(0, 0, 3, bArr);
        this.k = false;
        this.o = false;
        rv6 rv6 = this.n;
        rv6.b = false;
        rv6.a = false;
    }
}
