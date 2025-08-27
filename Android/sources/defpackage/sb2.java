package defpackage;

import android.content.Context;
import kotlin.Pair;

/* renamed from: sb2  reason: default package */
public final class sb2 extends tb8 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb2(int i, Object obj, int i2) {
        super(i);
        this.g = i2;
        this.h = obj;
    }

    public final Object a(Object obj) {
        switch (this.g) {
            case 0:
                a32 a32 = ((pb2) obj).a;
                a89 a89 = a32.c;
                if (a89 == null) {
                    return null;
                }
                return ((vb2) this.h).d(a32, a89, qb2.b, false);
            case 1:
                Pair pair = (Pair) obj;
                return new fd0(goa.a, new gd0((CharSequence) pair.getFirst(), ((Number) pair.getSecond()).longValue()), fu4.k.e((Context) this.h).f());
            default:
                return null;
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 2:
                g3g g3g = (g3g) obj3;
                g3g g3g2 = (g3g) obj2;
                String str = (String) obj;
                h3g h3g = (h3g) this.h;
                if (z) {
                    String str2 = h3g.d;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        w78 w78 = w78.o;
                        long j = g3g2.b;
                        String str3 = g3g2.a;
                        int g2 = h3g.l.g();
                        boolean a = g3g2.c.a();
                        StringBuilder k = i2a.k("Player autoplay. State evicted, should free player, \n                                |msgId:", j, ", \n                                |attachId:", str3);
                        k.append("\n                                |states count:");
                        k.append(g2);
                        k.append("\n                                |playing:");
                        k.append(a);
                        a67.d(w78, str2, StringsKt__IndentKt.trimMargin$default(k.toString(), (String) null, 1, (Object) null), (Throwable) null);
                    }
                    g3g2.o.a(g3g2.c);
                    g3g2.c.M0();
                    i9g i9g = (i9g) g3g2.w.get();
                    if (i9g != null) {
                        i9g.a();
                        return;
                    }
                    return;
                }
                h3g.getClass();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb2(vb2 vb2) {
        super(500);
        this.g = 0;
        this.h = vb2;
    }
}
