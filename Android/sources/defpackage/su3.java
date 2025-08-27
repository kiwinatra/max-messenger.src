package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: su3  reason: default package */
public final class su3 implements o1f {
    public final /* synthetic */ int a = 1;
    public final km3 b;
    public final gaf c;
    public final p3a d;
    public List e;
    public final Lazy f;
    public final kq9 g;

    public su3(l72 l72, km3 km3, gaf gaf, tld tld, yva yva, ltb ltb, ptb ptb, Lazy lazy, Lazy lazy2) {
        this.b = km3;
        this.c = gaf;
        l72 l722 = l72;
        this.d = new p3a((Object) l72);
        this.e = CollectionsKt.emptyList();
        this.f = LazyKt.lazy(new s2(27, (Object) this, (Object) lazy));
        yva yva2 = yva;
        this.g = new kq9(tld, new zqd(26, tld, yva), ltb, ptb, lazy2, new rt3(2, (Object) this));
    }

    private final void d() {
    }

    private final void e() {
    }

    public final void a() {
        int i = this.a;
    }

    public final mka b(int i, String str) {
        switch (this.a) {
            case 0:
                return gbd.a(new qu3(this, str, i, (Continuation) null));
            default:
                return gbd.a(new ru3(this, str, i, (Continuation) null));
        }
    }

    public final List c(LinkedHashSet linkedHashSet) {
        switch (this.a) {
            case 0:
                this.d.getClass();
                return this.g.l(linkedHashSet);
            default:
                this.d.getClass();
                return this.g.l(linkedHashSet);
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.e = CollectionsKt.emptyList();
                return;
            default:
                this.e = CollectionsKt.emptyList();
                return;
        }
    }

    public su3(l72 l72, km3 km3, gaf gaf, tld tld, yva yva, jtb jtb, ptb ptb) {
        Lazy lazy = rjd.G1;
        this.b = km3;
        this.c = gaf;
        this.d = new p3a((Object) l72);
        this.e = CollectionsKt.emptyList();
        this.f = LazyKt.lazy(new s2(this));
        this.g = new kq9(tld, new zqd(26, tld, yva), jtb, ptb, lazy, new rt3(3, (Object) this));
    }
}
