package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kn7  reason: default package */
public final class kn7 extends lw1 {
    public final qn7 z;

    public kn7(Continuation continuation, qn7 qn7) {
        super(1, continuation);
        this.z = qn7;
    }

    public final String A() {
        return "AwaitContinuation";
    }

    public final Throwable s(qn7 qn7) {
        Throwable c;
        qn7 qn72 = this.z;
        qn72.getClass();
        Object obj = qn7.a.get(qn72);
        return (!(obj instanceof mn7) || (c = ((mn7) obj).c()) == null) ? obj instanceof jb3 ? ((jb3) obj).a : qn7.n() : c;
    }
}
