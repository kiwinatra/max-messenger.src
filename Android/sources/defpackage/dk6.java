package defpackage;

import android.opengl.GLES20;

/* renamed from: dk6  reason: default package */
public final class dk6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fk6 c;

    public dk6(fk6 fk6, int i, float f) {
        this.c = fk6;
        this.a = i;
        this.b = f;
    }

    public final void run() {
        fk6 fk6 = this.c;
        if (!fk6.h) {
            fk6.a();
        }
        GLES20.glUniform1f(this.a, this.b);
    }
}
