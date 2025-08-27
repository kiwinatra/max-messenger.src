package defpackage;

import kotlin.Lazy;

/* renamed from: r10  reason: default package */
public final class r10 {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public s10 a() {
        return new s10(this);
    }

    public olg b(boolean z) {
        return z ? (ilg) ((Lazy) this.e).getValue() : (hlg) ((Lazy) this.d).getValue();
    }
}
