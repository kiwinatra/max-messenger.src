package defpackage;

import android.util.SparseArray;
import kotlin.uuid.Uuid;

/* renamed from: tv6  reason: default package */
public final class tv6 {
    public final zpf a;
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
    public boolean s;

    /* JADX WARNING: type inference failed for: r2v3, types: [rv6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [rv6, java.lang.Object] */
    public tv6(zpf zpf, boolean z, boolean z2) {
        this.a = zpf;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[Uuid.SIZE_BITS];
        this.g = bArr;
        this.f = new ky1(0, 0, 4, bArr);
        this.k = false;
        this.o = false;
        rv6 rv6 = this.n;
        rv6.b = false;
        rv6.a = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            rv6 r0 = r6.n
            boolean r3 = r0.b
            if (r3 == 0) goto L_0x0016
            int r0 = r0.d
            r3 = 7
            if (r0 == r3) goto L_0x0014
            r3 = 2
            if (r0 != r3) goto L_0x0016
        L_0x0014:
            r0 = r2
            goto L_0x001a
        L_0x0016:
            r0 = r1
            goto L_0x001a
        L_0x0018:
            boolean r0 = r6.s
        L_0x001a:
            boolean r3 = r6.r
            int r4 = r6.i
            r5 = 5
            if (r4 == r5) goto L_0x0025
            if (r0 == 0) goto L_0x0026
            if (r4 != r2) goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            r0 = r3 | r1
            r6.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.a():void");
    }
}
