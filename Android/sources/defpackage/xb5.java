package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.transformer.ExportException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: xb5  reason: default package */
public final class xb5 implements sob {
    public final ut a;
    public final /* synthetic */ f7a b;

    public xb5(f7a f7a, ut utVar) {
        this.b = f7a;
        this.a = utVar;
    }

    public final void X(qqf qqf) {
        ut utVar = this.a;
        try {
            int b2 = qqf.b(1);
            if (qqf.b(2)) {
                b2++;
            }
            if (b2 > 0) {
                utVar.b(b2);
                ((tc5) this.b.b).play();
                return;
            }
            utVar.d(ExportException.a(new IllegalStateException("The asset loader has no track to output."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
        } catch (RuntimeException e) {
            utVar.d(ExportException.a(e, 1000));
        }
    }

    public final void f0(jkf jkf, int i) {
        int i2;
        ut utVar = this.a;
        f7a f7a = this.b;
        try {
            if (f7a.a == 1) {
                hkf hkf = new hkf();
                jkf.o(0, hkf);
                if (!hkf.k) {
                    long j = hkf.m;
                    if (j > 0) {
                        if (j != -9223372036854775807L) {
                            i2 = 2;
                            f7a.a = i2;
                            utVar.f(j);
                        }
                    }
                    i2 = 3;
                    f7a.a = i2;
                    utVar.f(j);
                }
            }
        } catch (RuntimeException e) {
            utVar.d(ExportException.a(e, 1000));
        }
    }

    public final void w0(PlaybackException playbackException) {
        int i = 1000;
        Object obj = ExportException.b.get(playbackException.b());
        if (obj != null) {
            i = obj;
        }
        this.a.d(ExportException.a(playbackException, ((Integer) i).intValue()));
    }
}
