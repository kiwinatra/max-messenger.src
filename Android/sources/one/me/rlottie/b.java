package one.me.rlottie;

import android.graphics.Bitmap;

public final class b {
    public final ib7[] a;
    public final Bitmap[] b;
    public int c;

    public b() {
        int i = c.x;
        this.a = new ib7[i];
        this.b = new Bitmap[i];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ib7[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream, ib7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r9 << 16
            int r0 = r0 + r8
            int r1 = r7.c
            r2 = 0
            if (r1 == r0) goto L_0x000a
            r1 = 1
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            r7.c = r0
        L_0x000d:
            int r0 = one.me.rlottie.c.x
            if (r2 >= r0) goto L_0x004b
            android.graphics.Bitmap[] r0 = r7.b
            if (r1 != 0) goto L_0x0019
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0033
        L_0x0019:
            r3 = r0[r2]
            if (r3 == 0) goto L_0x002b
            one.me.rlottie.RLottie$Config r4 = one.me.rlottie.RLottie.config
            one.me.rlottie.RLottie$WorkQueue r4 = r4.workQueue
            b r5 = new b
            r6 = 16
            r5.<init>((int) r6, (java.lang.Object) r3)
            r4.post(r5)
        L_0x002b:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r9, r8, r3)
            r0[r2] = r3
        L_0x0033:
            ib7[] r0 = r7.a
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0048
            ib7 r3 = new ib7
            int r4 = r9 * r8
            int r4 = r4 * 2
            r3.<init>()
            byte[] r4 = new byte[r4]
            r3.a = r4
            r0[r2] = r3
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.b.a(int, int):void");
    }
}
