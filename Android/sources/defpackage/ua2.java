package defpackage;

import java.util.HashSet;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: ua2  reason: default package */
public final class ua2 extends qm implements lcf {
    public final /* synthetic */ int o;
    public final List v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua2(int i, long j, List list) {
        super(j);
        this.o = i;
        this.v = list;
    }

    public final void e(ibf ibf) {
        switch (this.o) {
            case 0:
                va2 va2 = (va2) ibf;
                try {
                    p().o(va2);
                } catch (TamErrorException unused) {
                    String name = ua2.class.getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.x, name, "fail to get missed contacts for CHAT_INFO", (Throwable) null);
                    }
                }
                l().n0(va2.c);
                sv0 k = k();
                ij0 ij0 = new ij0(this.a);
                new HashSet(this.v);
                k.c(ij0);
                return;
            default:
                j().i(((sxd) ibf).c, j().f());
                k().c(new ij0(this.a));
                return;
        }
    }

    public final fbf g() {
        switch (this.o) {
            case 0:
                yt ytVar = new yt((x3b) null, 21);
                ytVar.i("chatIds", this.v);
                return ytVar;
            default:
                jw9 jw9 = new jw9((x3b) null, 10);
                List list = this.v;
                if (list != null && !list.isEmpty()) {
                    jw9.i("pushTokens", list);
                }
                return jw9;
        }
    }

    public final void h(qaf qaf) {
        switch (this.o) {
            case 0:
                k().c(new hj0(this.a, qaf));
                return;
            default:
                k().c(new hj0(this.a, qaf));
                return;
        }
    }
}
