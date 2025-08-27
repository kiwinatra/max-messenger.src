package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* renamed from: yvf  reason: default package */
public final class yvf implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ File b;
    public final /* synthetic */ mm5 c;
    public final /* synthetic */ zvf o;

    public yvf(zvf zvf, boolean z, File file, mm5 mm5) {
        this.o = zvf;
        this.a = z;
        this.b = file;
        this.c = mm5;
    }

    public final void run() {
        mm5 mm5 = this.c;
        zvf zvf = this.o;
        boolean z = this.a;
        if (z) {
            try {
                w6f.c(zvf.a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                Objects.toString(zvf.a);
                mm5.close();
                throw th;
            }
        }
        zvf.i(this.b, (byte) 1, z);
        Objects.toString(zvf.a);
        mm5.close();
    }
}
