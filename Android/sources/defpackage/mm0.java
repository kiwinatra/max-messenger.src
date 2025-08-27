package defpackage;

import android.opengl.GLES20;

/* renamed from: mm0  reason: default package */
public final class mm0 extends fk6 {
    public float i;
    public int j;
    public int k;
    public int l;

    public final void a() {
        super.a();
        this.j = GLES20.glGetUniformLocation(this.d, "params");
        this.k = GLES20.glGetUniformLocation(this.d, "brightness");
        this.l = GLES20.glGetUniformLocation(this.d, "singleStepOffset");
        this.i = 0.34f;
        c(new ek6(this, this.j, new float[]{0.748f, 0.874f, 0.241f, 0.241f}, 1));
        float f = this.i;
        this.i = f;
        c(new dk6(this, this.k, (f - 8.0f) * 0.6f));
    }

    public final void b(int i2, int i3) {
        c(new ek6(this, this.l, new float[]{2.0f / ((float) i2), 2.0f / ((float) i3)}, 0));
    }
}
