package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* renamed from: dvb  reason: default package */
public final class dvb {
    public final cvb a;

    public dvb(cvb cvb) {
        this.a = cvb;
    }

    public final lu7 a(jv7 jv7, jv1 jv1, d19 d19) {
        int i;
        cvb cvb = this.a;
        cvb.getClass();
        Trace.beginSection(ld9.T("CX:bindToLifecycle-UseCaseGroup"));
        try {
            uv1 uv1 = cvb.d;
            if (uv1 == null) {
                i = 0;
            } else {
                vf2 vf2 = uv1.f;
                if (vf2 != null) {
                    i = ((mqf) vf2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                cvb.b(cvb, 1);
                vzf[] vzfArr = (vzf[]) ((List) d19.c).toArray(new vzf[0]);
                return cvb.d(jv7, jv1, (dcg) d19.b, (List) d19.a, (vzf[]) Arrays.copyOf(vzfArr, vzfArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    public final void b(vzf... vzfArr) {
        int i;
        cvb cvb = this.a;
        cvb.getClass();
        Trace.beginSection(ld9.T("CX:unbind"));
        try {
            ev0.g();
            uv1 uv1 = cvb.d;
            if (uv1 == null) {
                i = 0;
            } else {
                vf2 vf2 = uv1.f;
                if (vf2 != null) {
                    i = ((mqf) vf2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                cvb.c.I(CollectionsKt.listOf(Arrays.copyOf(vzfArr, vzfArr.length)));
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }
}
