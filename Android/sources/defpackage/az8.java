package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: az8  reason: default package */
public final /* synthetic */ class az8 implements pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ az8(cx8 cx8, int i, int i2) {
        this.a = i2;
        this.b = cx8;
        this.c = i;
    }

    public final void accept(Object obj) {
        zt7 zt7;
        swd swd;
        int i = this.c;
        cx8 cx8 = this.b;
        int i2 = -1;
        switch (this.a) {
            case 0:
                try {
                    zt7 = (zt7) ((zz7) obj).get();
                    n79.k(zt7, "LibraryResult must not be null");
                } catch (CancellationException e) {
                    i8b.W("Library operation cancelled", e);
                    String str = zt7.g;
                    iwd iwd = new iwd("no error message provided", 1, Bundle.EMPTY);
                    zt7 = new zt7(iwd.a, SystemClock.elapsedRealtime(), (ds8) null, iwd, (Object) null, 4);
                } catch (InterruptedException | ExecutionException e2) {
                    i8b.W("Library operation failed", e2);
                    String str2 = zt7.g;
                    iwd iwd2 = new iwd("no error message provided", -1, Bundle.EMPTY);
                    zt7 = new zt7(iwd2.a, SystemClock.elapsedRealtime(), (ds8) null, iwd2, (Object) null, 4);
                }
                try {
                    bx8 bx8 = cx8.d;
                    n79.o(bx8);
                    bx8.e(i, zt7);
                    return;
                } catch (RemoteException e3) {
                    i8b.W("Failed to send result to browser " + cx8, e3);
                    return;
                }
            default:
                try {
                    swd = (swd) ((zz7) obj).get();
                    n79.k(swd, "SessionResult must not be null");
                } catch (CancellationException e4) {
                    i8b.W("Session operation cancelled", e4);
                    swd = new swd(1);
                } catch (InterruptedException | ExecutionException e5) {
                    i8b.W("Session operation failed", e5);
                    if (e5.getCause() instanceof UnsupportedOperationException) {
                        i2 = -6;
                    }
                    swd = new swd(i2);
                }
                hz8.N0(cx8, i, swd);
                return;
        }
    }
}
