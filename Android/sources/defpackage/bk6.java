package defpackage;

import android.opengl.GLES20;

/* renamed from: bk6  reason: default package */
public final class bk6 extends ak6 {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bk6(defpackage.vy4 r3, defpackage.xj6 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x000b
            java.lang.String r3 = defpackage.ck6.d
            goto L_0x000d
        L_0x000b:
            java.lang.String r3 = defpackage.ck6.c
        L_0x000d:
            java.lang.String r1 = "vTextureCoord"
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x004e }
            boolean r1 = r4.contains(r1)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r4.contains(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0050
            r2.<init>(r3, r4)
            r3 = -1
            r2.e = r3
            r2.f = r3
            r2.g = r3
            r2.a()
            int r3 = r2.a
            int r4 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.e = r4
            defpackage.ck6.e(r4, r0)
            java.lang.String r4 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.g = r0
            defpackage.ck6.e(r0, r4)
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f = r3
            defpackage.ck6.e(r3, r4)
            return
        L_0x004e:
            r2 = move-exception
            goto L_0x0058
        L_0x0050:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004e }
            java.lang.String r3 = "Invalid fragment shader"
            r2.<init>(r3)     // Catch:{ all -> 0x004e }
            throw r2     // Catch:{ all -> 0x004e }
        L_0x0058:
            boolean r3 = r2 instanceof java.lang.IllegalArgumentException
            if (r3 == 0) goto L_0x005d
            throw r2
        L_0x005d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unable retrieve fragment shader source"
            r3.<init>(r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk6.<init>(vy4, xj6):void");
    }

    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        ck6.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, ck6.i);
        ck6.b("glVertexAttribPointer");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bk6(defpackage.vy4 r4, defpackage.zj6 r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0028
            zj6 r0 = defpackage.zj6.a
            if (r5 == r0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No default sampler shader available for"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.bs0.m(r1, r0)
            zj6 r0 = defpackage.zj6.c
            if (r5 != r0) goto L_0x0025
            xj6 r5 = defpackage.ck6.g
            goto L_0x002a
        L_0x0025:
            xj6 r5 = defpackage.ck6.f
            goto L_0x002a
        L_0x0028:
            xj6 r5 = defpackage.ck6.e
        L_0x002a:
            r3.<init>((defpackage.vy4) r4, (defpackage.xj6) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk6.<init>(vy4, zj6):void");
    }
}
