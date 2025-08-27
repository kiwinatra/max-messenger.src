package androidx.media3.exoplayer;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

public final class ExoPlaybackException extends PlaybackException {
    public static final String A0 = Integer.toString(1002, 36);
    public static final String B0 = Integer.toString(1003, 36);
    public static final String C0 = Integer.toString(1004, 36);
    public static final String D0 = Integer.toString(1005, 36);
    public static final String E0 = Integer.toString(1006, 36);
    public static final String z0 = Integer.toString(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 36);
    public final int X;
    public final String Y;
    public final int Z;
    public final ea6 v0;
    public final int w0;
    public final nz8 x0;
    public final boolean y0;

    static {
        int i = v0g.a;
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, (String) null, -1, (ea6) null, 4, false);
    }

    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        int i = v0g.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.X == exoPlaybackException.X && v0g.a(this.Y, exoPlaybackException.Y) && this.Z == exoPlaybackException.Z && v0g.a(this.v0, exoPlaybackException.v0) && this.w0 == exoPlaybackException.w0 && v0g.a(this.x0, exoPlaybackException.x0) && this.y0 == exoPlaybackException.y0;
    }

    public final Bundle c() {
        Bundle c = super.c();
        c.putInt(z0, this.X);
        c.putString(A0, this.Y);
        c.putInt(B0, this.Z);
        ea6 ea6 = this.v0;
        if (ea6 != null) {
            c.putBundle(C0, ea6.d(false));
        }
        c.putInt(D0, this.w0);
        c.putBoolean(E0, this.y0);
        return c;
    }

    public final ExoPlaybackException d(nz8 nz8) {
        String message = getMessage();
        int i = v0g.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.X, this.Y, this.Z, this.v0, this.w0, nz8, this.b, this.y0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, ea6 ea6, int i4, nz8 nz8, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        n79.g(!z2 || i5 == 1);
        n79.g((th != null || i5 == 3) ? true : z3);
        this.X = i5;
        this.Y = str2;
        this.Z = i3;
        this.v0 = ea6;
        this.w0 = i4;
        this.x0 = nz8;
        this.y0 = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ea6 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0044
            r0 = 1
            if (r4 == r0) goto L_0x0015
            r0 = 3
            if (r4 == r0) goto L_0x0012
            java.lang.String r0 = "Unexpected runtime error"
        L_0x000b:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x004c
        L_0x0012:
            java.lang.String r0 = "Remote error"
            goto L_0x000b
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = defpackage.v0g.z(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0044:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x004c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = ": null"
            java.lang.String r0 = defpackage.tr1.j(r0, r1)
        L_0x0059:
            r1 = r0
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, ea6, int, boolean):void");
    }
}
