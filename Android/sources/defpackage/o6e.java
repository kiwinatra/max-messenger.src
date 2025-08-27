package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o6e  reason: default package */
public final class o6e extends k3 {
    public long a;
    public lw1 b;

    public final boolean a(j3 j3Var) {
        n6e n6e = (n6e) j3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = n6e.z;
        if (j < n6e.X) {
            n6e.X = j;
        }
        this.a = j;
        return true;
    }

    public final Continuation[] b(j3 j3Var) {
        long j = this.a;
        this.a = -1;
        this.b = null;
        return ((n6e) j3Var).x(j);
    }
}
