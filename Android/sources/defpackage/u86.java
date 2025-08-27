package defpackage;

import kotlin.jvm.internal.Ref;

/* renamed from: u86  reason: default package */
public final class u86 implements wq {
    public final /* synthetic */ Ref.LongRef a;
    public final /* synthetic */ cwb b;

    public u86(Ref.LongRef longRef, cwb cwb) {
        this.a = longRef;
        this.b = cwb;
    }

    public final void a() {
        y64.L(this.b, Boolean.FALSE);
    }

    public final void c() {
        this.a.element = System.currentTimeMillis();
        y64.L(this.b, Boolean.TRUE);
    }
}
