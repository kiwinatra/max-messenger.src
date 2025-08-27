package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* renamed from: cz6  reason: default package */
public final class cz6 implements dz6 {
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;

    public cz6(dz6 dz6) {
        this.b = dz6.g();
        this.c = dz6.h();
        this.d = CollectionsKt.toList(dz6.i());
        dz6.b();
        Unit unit = Unit.INSTANCE;
        this.e = dz6.a();
    }

    public final boolean a() {
        return this.e;
    }

    public final void b() {
    }

    public final long g() {
        return this.b;
    }

    public final long h() {
        return this.c;
    }

    public final List i() {
        return this.d;
    }
}
