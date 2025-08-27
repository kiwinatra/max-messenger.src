package defpackage;

import java.util.ArrayList;

/* renamed from: qh5  reason: default package */
public final /* synthetic */ class qh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qh5(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                long j = this.b;
                xi5 xi5 = (xi5) this.d;
                i6d i6d = xi5.a;
                i6d.c();
                try {
                    ArrayList c2 = xi5.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    if (indexOf >= 0 && (i = this.c) >= 0) {
                        if (i < c2.size()) {
                            cjf.G(c2, indexOf, i);
                            xi5.a(c2);
                        }
                    }
                    i6d.r();
                    return;
                } finally {
                    i6d.l();
                }
            default:
                long j2 = this.b;
                oi5 oi5 = (oi5) this.d;
                i6d i6d2 = oi5.a;
                i6d2.c();
                try {
                    ArrayList c3 = oi5.c();
                    int indexOf2 = c3.indexOf(Long.valueOf(j2));
                    if (indexOf2 >= 0 && (i2 = this.c) >= 0) {
                        if (i2 < c3.size()) {
                            cjf.G(c3, indexOf2, i2);
                            oi5.a(c3);
                        }
                    }
                    i6d2.r();
                    return;
                } finally {
                    i6d2.l();
                }
        }
    }
}
