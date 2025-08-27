package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: k62  reason: default package */
public final /* synthetic */ class k62 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k62(long j, z84 z84) {
        this.a = 2;
        this.b = j;
        this.c = z84;
    }

    public final void run() {
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                r62 r62 = (r62) obj;
                r62.f();
                r62.p0("localRemoveChat", new z60(r62, j, 3));
                f6d f6d = ((a74) ((s74) r62.l.get())).b;
                f6d.getClass();
                ((OneMeRoomDatabase) f6d.a.m()).p(new e6d(0, new cy2(f6d, j, 1)));
                fa9 fa9 = (fa9) r62.s.get();
                fa9.getClass();
                z68.a("fa9", "deleteMessages %d, all!");
                ((a74) fa9.a).c.d().e(j);
                return;
            case 1:
                km3 km3 = (km3) obj;
                km3.e(j, new c10(((ltb) km3.h).a.m(), 16));
                return;
            case 2:
                z68.c(z84.k, "cancelServerChatId %d", Long.valueOf(j));
                z84 z84 = (z84) obj;
                z84.g.e.remove(Long.valueOf(j));
                ((po9) ((mo9) z84.a.getValue())).b(j);
                return;
            case 3:
                ((jna) ((mi5) obj).a).h(5, j);
                return;
            default:
                ((jna) ((qi5) obj).a).h(4, j);
                return;
        }
    }

    public /* synthetic */ k62(qi5 qi5) {
        this.a = 4;
        this.c = qi5;
        this.b = 0;
    }

    public /* synthetic */ k62(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
