package defpackage;

import android.os.SystemClock;
import kotlin.jvm.functions.Function2;

/* renamed from: j8  reason: default package */
public final class j8 {
    public long a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        if (this.b) {
            this.b = false;
            g8 g8Var = (g8) this.e;
            if (g8Var != null) {
                long j = this.a;
                ((sjf) ((rjf) this.c)).getClass();
                ((Function2) this.d).invoke(g8Var, Long.valueOf(SystemClock.elapsedRealtime() - j));
            }
        }
    }
}
