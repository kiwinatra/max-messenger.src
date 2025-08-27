package defpackage;

import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: sz4  reason: default package */
public final class sz4 {
    public final fa9 a;
    public final r62 b;
    public final esb c;
    public final sv0 d;
    public final x23 e;

    public sz4(fa9 fa9, r62 r62, esb esb, sv0 sv0, x23 x23) {
        this.a = fa9;
        this.b = r62;
        this.c = esb;
        this.d = sv0;
        this.e = x23;
    }

    public final void a(long j, long j2, String str, List list, qe9 qe9, List list2, boolean z) {
        long j3;
        long j4 = j;
        long j5 = j2;
        this.c.c.remove(Long.valueOf(j));
        rz4 rz4 = r0;
        rz4 rz42 = new rz4(this, j, ((qjd) this.e).m(), z, list2, str, list, qe9);
        fa9 fa9 = this.a;
        ((OneMeRoomDatabase) ((a74) fa9.a).c.a.m()).p(new e6d(1, rz4));
        r62 r62 = this.b;
        a32 G = r62.G(j5);
        if (G != null) {
            j3 = j;
            if (G.b.j == j3) {
                r62.u0(j5, fa9.r(j3), true);
            }
        } else {
            j3 = j;
        }
        if (!(G == null || G.b.L != j3 || fa9.r(j3) == null)) {
            r62.y0(j5);
        }
        this.d.c(new twf(0, j2, j));
    }
}
