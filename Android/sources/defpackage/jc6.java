package defpackage;

import androidx.fragment.app.a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jc6  reason: default package */
public final class jc6 extends lc6 {
    public final /* synthetic */ bj6 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ w8 c;
    public final /* synthetic */ v8 d;
    public final /* synthetic */ a e;

    public jc6(a aVar, ic6 ic6, AtomicReference atomicReference, x8 x8Var, lc5 lc5) {
        this.e = aVar;
        this.a = ic6;
        this.b = atomicReference;
        this.c = x8Var;
        this.d = lc5;
    }

    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        a aVar = this.e;
        sb.append(aVar.w);
        sb.append("_rq#");
        sb.append(aVar.h1.getAndIncrement());
        this.b.set(((e9) this.a.apply((Object) null)).d(sb.toString(), aVar, this.c, this.d));
    }
}
