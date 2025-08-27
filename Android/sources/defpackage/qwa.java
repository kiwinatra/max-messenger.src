package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: qwa  reason: default package */
public final class qwa {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;

    public qwa(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy8;
        this.h = lazy7;
    }

    public final void a(long j) {
        z84 z84 = (z84) this.h.getValue();
        z84.getClass();
        String str = z84.k;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.i(j, "cancelServerChatId "), (Throwable) null);
        }
        z84.b(new k62(j, z84));
    }

    public final void b(Set set) {
        z84 z84 = (z84) this.h.getValue();
        z84.getClass();
        String str = z84.k;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, a81.m("notify ", CollectionsKt___CollectionsKt.joinToString$default(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)), (Throwable) null);
        }
        if (!set.isEmpty()) {
            z84.b(new u84(z84, set));
        }
        ((c8e) this.f.getValue()).d();
    }

    public final void c() {
        z84 z84 = (z84) this.h.getValue();
        z84.getClass();
        String str = z84.k;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "notifyAllChats", (Throwable) null);
        }
        z84.b(new u84(z84, 0));
        ((c8e) this.f.getValue()).d();
    }

    public final void d(Set set) {
        z84 z84 = (z84) this.h.getValue();
        z84.getClass();
        String str = z84.k;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, a81.m("notifyServerChatIds ", CollectionsKt___CollectionsKt.joinToString$default(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)), (Throwable) null);
        }
        if (!set.isEmpty()) {
            z84.b(new p00(3, z84, set));
        }
        ((c8e) this.f.getValue()).d();
    }
}
