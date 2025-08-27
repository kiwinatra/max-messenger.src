package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* renamed from: zbc  reason: default package */
public final class zbc implements uu1 {
    public final /* synthetic */ ecc a;

    public zbc(ecc ecc) {
        this.a = ecc;
    }

    public final void a(byte[] bArr) {
        hcc hcc = this.a.o;
        if (hcc == null) {
            hcc = null;
        }
        xag.g(hcc, ((osa) hcc.y).b(), (f14) null, new fcc(hcc, bArr, (Continuation) null), 2);
    }

    public final void g(File file) {
        hcc hcc = this.a.o;
        if (hcc == null) {
            hcc = null;
        }
        xag.g(hcc, ((osa) hcc.y).b(), (f14) null, new gcc(hcc, file, (Continuation) null), 2);
    }

    public final void h(CameraExceptionImpl cameraExceptionImpl) {
        hcc hcc = this.a.o;
        if (hcc == null) {
            hcc = null;
        }
        hcc.getClass();
        z68.g("QuickCameraViewModel", "onCameraError", cameraExceptionImpl);
    }
}
