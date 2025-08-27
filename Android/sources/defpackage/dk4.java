package defpackage;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: dk4  reason: default package */
public final /* synthetic */ class dk4 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dk4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                return;
            case 1:
                ((vo5) this.b).flush();
                return;
            case 2:
                gk4 gk4 = (gk4) this.b;
                EGLDisplay eGLDisplay = gk4.c;
                yr6 yr6 = gk4.b;
                try {
                    gk4.d.a();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = gk4.j;
                        if (i < arrayList.size()) {
                            ((fs6) arrayList.get(i)).release();
                            i++;
                        } else {
                            gk4.i.release();
                            try {
                                yr6.z(eGLDisplay);
                                return;
                            } catch (GlUtil$GlException e) {
                                i8b.p("Error releasing GL objects", e);
                                return;
                            }
                        }
                    }
                } catch (Exception e2) {
                    i8b.p("Error releasing shader program", e2);
                } catch (Throwable th) {
                    try {
                        yr6.z(eGLDisplay);
                    } catch (GlUtil$GlException e3) {
                        i8b.p("Error releasing GL objects", e3);
                    }
                    throw th;
                }
            case 3:
                mqf mqf = ((sef) this.b).o;
                mqf.getClass();
                mqf.V();
                p94.a();
                return;
            case 4:
                ((mqf) this.b).r();
                return;
            default:
                ((q2) this.b).G();
                return;
        }
    }
}
