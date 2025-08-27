package defpackage;

import java.util.ArrayList;

/* renamed from: mh5  reason: default package */
public final /* synthetic */ class mh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mh5(Object obj, long j, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xi5 xi5 = (xi5) this.d;
                i6d i6d = xi5.a;
                i6d.c();
                try {
                    ArrayList c2 = xi5.c();
                    boolean z = this.c;
                    long j = this.b;
                    if (!z) {
                        if (c2.remove(Long.valueOf(j))) {
                            xi5.a(c2);
                        }
                    } else if (c2.indexOf(Long.valueOf(j)) == -1) {
                        c2.add(0, Long.valueOf(j));
                        xi5.a(c2);
                    }
                    i6d.r();
                    return;
                } finally {
                    i6d.l();
                }
            default:
                oi5 oi5 = (oi5) this.d;
                i6d i6d2 = oi5.a;
                i6d2.c();
                try {
                    ArrayList c3 = oi5.c();
                    boolean z2 = this.c;
                    long j2 = this.b;
                    if (!z2) {
                        if (c3.remove(Long.valueOf(j2))) {
                            oi5.a(c3);
                        }
                    } else if (c3.indexOf(Long.valueOf(j2)) == -1) {
                        c3.add(0, Long.valueOf(j2));
                        oi5.a(c3);
                    }
                    i6d2.r();
                    return;
                } finally {
                    i6d2.l();
                }
        }
    }
}
