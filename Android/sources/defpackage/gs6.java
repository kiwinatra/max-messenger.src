package defpackage;

import android.opengl.GLES20;

/* renamed from: gs6  reason: default package */
public final class gs6 {
    public static final gs6 e = new gs6(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gs6(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a() {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            ld8.h();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            ld8.h();
        }
    }
}
