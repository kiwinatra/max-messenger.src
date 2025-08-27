package defpackage;

import kotlin.collections.CollectionsKt;

/* renamed from: ovd  reason: default package */
public final class ovd extends gud {
    public final long b;
    public final long c;

    public ovd(ap0 ap0) {
        this.b = ap0.b;
        this.c = ap0.c;
    }

    public final void z() {
        long j;
        String name = ovd.class.getName();
        long j2 = this.b;
        Long valueOf = Long.valueOf(j2);
        long j3 = this.c;
        z68.c(name, "process, chatId = %d, botId = %d, suspend = %b", valueOf, Long.valueOf(j3), Boolean.TRUE);
        if (h().G(j2) != null) {
            r62 h = h();
            h.getClass();
            h.i(j2, false, new vz0(true, 1));
            h().t(j2);
            jna jna = (jna) a();
            long j4 = this.b;
            if (!jna.r(j4)) {
                j = 0;
            } else {
                j = ocf.d(jna.E(), new e4f(((ltb) jna.D()).a.n(), j4, true, this.c), false, 0, 12);
            }
            u().c(new xy2(CollectionsKt.listOf(Long.valueOf(j2)), true, false, (bl4) null, (zub) null, 124));
            u().c(new zu3(j, CollectionsKt.listOf(Long.valueOf(j3))));
            u().c(new f4f(j2));
        }
    }
}
