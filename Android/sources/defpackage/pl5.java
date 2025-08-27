package defpackage;

/* renamed from: pl5  reason: default package */
public final class pl5 {
    public final oj4 a = new oj4(4);
    public final xj5 b;
    public final r62 c;
    public final fa9 d;
    public final fzf e;
    public final yf9 f;
    public final t4g g;
    public final rl5 h;
    public final ql5 i;
    public final ol5 j;

    public pl5(xj5 xj5, kf4 kf4, r62 r62, fa9 fa9, fzf fzf, yf9 yf9, t4g t4g, rl5 rl5, ql5 ql5, ol5 ol5) {
        this.b = xj5;
        this.c = r62;
        this.d = fa9;
        this.e = fzf;
        this.f = yf9;
        this.g = t4g;
        this.h = rl5;
        this.i = ql5;
        this.j = ol5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.io.File r13, defpackage.zx0 r14, defpackage.ata r15) {
        /*
            r12 = this;
            boolean r0 = r13.isDirectory()
            if (r0 != 0) goto L_0x000b
            java.util.List r12 = java.util.Collections.emptyList()
            return r12
        L_0x000b:
            java.io.File[] r13 = r13.listFiles()
            if (r13 == 0) goto L_0x01b0
            int r0 = r13.length
            if (r0 != 0) goto L_0x0016
            goto L_0x01b0
        L_0x0016:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L_0x001f:
            if (r3 >= r1) goto L_0x01af
            r4 = r13[r3]
            zx0 r5 = defpackage.zx0.w
            if (r14 == 0) goto L_0x002a
            r6 = r14
            goto L_0x0161
        L_0x002a:
            rl5 r6 = r12.h
            r6.getClass()
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.d
            ln5 r9 = r6.a
            if (r8 != 0) goto L_0x0042
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            java.io.File r8 = r8.m()
            r6.d = r8
        L_0x0042:
            java.io.File r8 = r6.d
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x0052
            zx0 r6 = defpackage.zx0.b
            goto L_0x0161
        L_0x0052:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.e
            if (r8 != 0) goto L_0x006c
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "audioCache"
            java.io.File r8 = defpackage.po5.g(r8, r10)
            r6.e = r8
        L_0x006c:
            java.io.File r8 = r6.e
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x007c
            zx0 r6 = defpackage.zx0.c
            goto L_0x0161
        L_0x007c:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.f
            if (r8 != 0) goto L_0x0096
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "stickerCache"
            java.io.File r8 = defpackage.po5.g(r8, r10)
            r6.f = r8
        L_0x0096:
            java.io.File r8 = r6.f
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a6
            zx0 r6 = defpackage.zx0.v
            goto L_0x0161
        L_0x00a6:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.g
            if (r8 != 0) goto L_0x00c0
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "gifCache"
            java.io.File r8 = defpackage.po5.g(r8, r10)
            r6.g = r8
        L_0x00c0:
            java.io.File r8 = r6.g
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00d0
            zx0 r6 = defpackage.zx0.o
            goto L_0x0161
        L_0x00d0:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.c
            if (r8 != 0) goto L_0x00ea
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "upload"
            java.io.File r8 = defpackage.po5.g(r8, r10)
            r6.c = r8
        L_0x00ea:
            java.io.File r8 = r6.c
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r10 = r7.startsWith(r8)
            if (r10 == 0) goto L_0x010e
            java.lang.String r10 = java.io.File.separator
            int r11 = r8.length()
            boolean r10 = r7.startsWith(r10, r11)
            if (r10 != 0) goto L_0x010c
            int r7 = r7.length()
            int r8 = r8.length()
            if (r7 != r8) goto L_0x010e
        L_0x010c:
            r6 = r5
            goto L_0x0161
        L_0x010e:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.h
            if (r8 != 0) goto L_0x0128
            r8 = r9
            po5 r8 = (defpackage.po5) r8
            r8.getClass()
            java.lang.String r8 = r8.b()
            java.lang.String r10 = "exo_files_cache"
            java.io.File r8 = defpackage.po5.g(r8, r10)
            r6.h = r8
        L_0x0128:
            java.io.File r8 = r6.h
            java.lang.String r8 = r8.getAbsolutePath()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x0137
            zx0 r6 = defpackage.zx0.x
            goto L_0x0161
        L_0x0137:
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r8 = r6.i
            if (r8 != 0) goto L_0x0150
            po5 r9 = (defpackage.po5) r9
            r9.getClass()
            java.lang.String r8 = r9.b()
            java.lang.String r9 = "videoCache"
            java.io.File r8 = defpackage.po5.g(r8, r9)
            r6.i = r8
        L_0x0150:
            java.io.File r6 = r6.i
            java.lang.String r6 = r6.getAbsolutePath()
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x015f
            zx0 r6 = defpackage.zx0.y
            goto L_0x0161
        L_0x015f:
            zx0 r6 = defpackage.zx0.z
        L_0x0161:
            boolean r7 = r4.isDirectory()
            if (r7 == 0) goto L_0x016f
            java.util.List r4 = r12.a(r4, r6, r15)
            r0.addAll(r4)
            goto L_0x01ab
        L_0x016f:
            if (r6 != r5) goto L_0x017c
            java.lang.Object r5 = r15.b
            ezf r5 = (defpackage.ezf) r5
            if (r5 == 0) goto L_0x01a0
            boolean r5 = r5.b(r4)
            goto L_0x01a1
        L_0x017c:
            java.lang.Object r5 = r15.c
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x01a0
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x01a0
            java.util.Iterator r5 = r5.iterator()
        L_0x018c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01a0
            java.lang.Object r7 = r5.next()
            ezf r7 = (defpackage.ezf) r7
            boolean r7 = r7.b(r4)
            if (r7 != 0) goto L_0x018c
            r5 = r2
            goto L_0x01a1
        L_0x01a0:
            r5 = 1
        L_0x01a1:
            if (r5 == 0) goto L_0x01ab
            kx0 r5 = new kx0
            r5.<init>(r4, r6)
            r0.add(r5)
        L_0x01ab:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x01af:
            return r0
        L_0x01b0:
            java.util.List r12 = java.util.Collections.emptyList()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl5.a(java.io.File, zx0, ata):java.util.List");
    }
}
