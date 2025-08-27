package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: ek6  reason: default package */
public final class ek6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float[] c;
    public final /* synthetic */ fk6 o;

    public /* synthetic */ ek6(fk6 fk6, int i, float[] fArr, int i2) {
        this.a = i2;
        this.o = fk6;
        this.b = i;
        this.c = fArr;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fk6 fk6 = this.o;
                if (!fk6.h) {
                    fk6.a();
                }
                GLES20.glUniform2fv(this.b, 1, FloatBuffer.wrap(this.c));
                return;
            default:
                fk6 fk62 = this.o;
                if (!fk62.h) {
                    fk62.a();
                }
                GLES20.glUniform4fv(this.b, 1, FloatBuffer.wrap(this.c));
                return;
        }
    }
}
