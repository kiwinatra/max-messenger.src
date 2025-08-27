package defpackage;

import java.util.ArrayList;

/* renamed from: jm3  reason: default package */
public final /* synthetic */ class jm3 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jm3(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                km3 km3 = (km3) this.d;
                km3.getClass();
                km3.e(this.b, new c10(this.c, 15));
                return;
            default:
                long j = this.b;
                long j2 = this.c;
                oi5 oi5 = (oi5) this.d;
                i6d i6d = oi5.a;
                i6d.c();
                try {
                    ArrayList c2 = oi5.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    int indexOf2 = c2.indexOf(Long.valueOf(j2));
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        cjf.G(c2, indexOf, indexOf2);
                        oi5.a(c2);
                    }
                    i6d.r();
                    return;
                } finally {
                    i6d.l();
                }
        }
    }
}
