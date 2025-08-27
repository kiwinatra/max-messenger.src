package com.google.android.exoplayer2;

public final class ExoPlaybackException extends PlaybackException {
    public final int c;
    public final String o;
    public final int v;
    public final ca6 w;
    public final int x;
    public final pt8 y;
    public final boolean z;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, (String) null, -1, (ca6) null, 4, false);
    }

    public final ExoPlaybackException a(pt8 pt8) {
        String message = getMessage();
        int i = t0g.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.c, this.o, this.v, this.w, this.x, pt8, this.b, this.z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, ca6 ca6, int i4, pt8 pt8, long j, boolean z2) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z3 = z2;
        boolean z4 = false;
        y64.g(!z3 || i5 == 1);
        y64.g((th != null || i5 == 3) ? true : z4);
        this.c = i5;
        this.o = str2;
        this.v = i3;
        this.w = ca6;
        this.x = i4;
        this.y = pt8;
        this.z = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ca6 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r5 = r17
            r8 = r20
            r0 = 2
            if (r4 == 0) goto L_0x0069
            r1 = 3
            r2 = 1
            if (r4 == r2) goto L_0x0016
            if (r4 == r1) goto L_0x0013
            java.lang.String r1 = "Unexpected runtime error"
        L_0x0010:
            r7 = r18
            goto L_0x006d
        L_0x0013:
            java.lang.String r1 = "Remote error"
            goto L_0x0010
        L_0x0016:
            java.lang.String r3 = java.lang.String.valueOf(r19)
            int r6 = defpackage.t0g.a
            if (r8 == 0) goto L_0x0039
            if (r8 == r2) goto L_0x0036
            if (r8 == r0) goto L_0x0033
            if (r8 == r1) goto L_0x0030
            r1 = 4
            if (r8 != r1) goto L_0x002a
            java.lang.String r1 = "YES"
            goto L_0x003b
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0030:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x003b
        L_0x0033:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L_0x003b
        L_0x0036:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L_0x003b
        L_0x0039:
            java.lang.String r1 = "NO"
        L_0x003b:
            r2 = 53
            int r2 = defpackage.g63.f(r2, r5)
            int r6 = r3.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r18
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = defpackage.rae.q(r6, r3, r2, r1)
            goto L_0x006d
        L_0x0069:
            r7 = r18
            java.lang.String r1 = "Source error"
        L_0x006d:
            r2 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0096
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = ": null"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r0
        L_0x0096:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, ca6, int, boolean):void");
    }
}
