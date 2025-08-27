package defpackage;

import android.media.MediaDrm;

/* renamed from: sw4  reason: default package */
public abstract class sw4 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return v0g.x(v0g.y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
