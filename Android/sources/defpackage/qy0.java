package defpackage;

import android.os.SystemClock;

/* renamed from: qy0  reason: default package */
public final /* synthetic */ class qy0 implements lz9 {
    public final /* synthetic */ hz0 a;

    public /* synthetic */ qy0(hz0 hz0) {
        this.a = hz0;
    }

    public final void j(mz9 mz9) {
        h8 h8Var = this.a.Q1.m;
        boolean z = mz9.f;
        j8 j8Var = h8Var.b;
        if (!z) {
            j8Var.a();
        } else if (!j8Var.b) {
            j8Var.b = true;
            ((sjf) ((rjf) j8Var.c)).getClass();
            j8Var.a = SystemClock.elapsedRealtime();
        }
    }
}
