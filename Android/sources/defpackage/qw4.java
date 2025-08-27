package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* renamed from: qw4  reason: default package */
public abstract class qw4 {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
