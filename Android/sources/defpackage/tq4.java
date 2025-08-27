package defpackage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* renamed from: tq4  reason: default package */
public final class tq4 extends dn7 {
    public final /* synthetic */ int v;
    public final Object w;

    public /* synthetic */ tq4(int i, Object obj) {
        this.v = i;
        this.w = obj;
    }

    public final boolean h() {
        switch (this.v) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public final void i(Throwable th) {
        Object obj = this.w;
        switch (this.v) {
            case 0:
                ((pq4) obj).dispose();
                return;
            case 1:
                ((Function1) obj).invoke(th);
                return;
            default:
                Result.Companion companion = Result.Companion;
                ((Continuation) obj).resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                return;
        }
    }
}
