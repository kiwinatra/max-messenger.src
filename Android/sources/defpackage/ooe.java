package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: ooe  reason: default package */
public final class ooe {
    public final rl a;
    public final moe b;
    public final lfd c;
    public final gcf d;

    public ooe(rl rlVar, moe moe, lfd lfd, gcf gcf) {
        this.a = rlVar;
        this.b = moe;
        this.c = lfd;
        this.d = gcf;
    }

    public final dx5 a(String str) {
        jw9 jw9 = new jw9((x3b) null, 12);
        if (!cvg.A(str)) {
            jw9.t(ApiProtocol.KEY_TOKEN, str);
            tbe tbe = new tbe(new wbe(((jna) this.a).U(jw9, this.c).i(new ch2(12, noe.class)).i(new mqd(20)).i(new mqd(21)), new nqd(9, this), 0), new mqd(22), 1);
            gcf gcf = this.d;
            gcf.getClass();
            return tbe.k(new ecf(gcf, 3, 0));
        }
        throw new IllegalStateException("token cannot be null");
    }
}
