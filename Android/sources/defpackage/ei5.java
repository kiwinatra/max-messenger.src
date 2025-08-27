package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: ei5  reason: default package */
public final /* synthetic */ class ei5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ei5(oi5 oi5, List list, int i) {
        this.a = i;
        this.b = oi5;
        this.c = list;
    }

    public final void run() {
        d7d a2;
        Cursor o;
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                return;
            default:
                List list = this.c;
                oi5 oi5 = this.b;
                i6d i6d = oi5.a;
                i6d.c();
                try {
                    oi5.getClass();
                    int i = 0;
                    a2 = d7d.a(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                    i6d i6d2 = oi5.a;
                    i6d2.b();
                    o = i6d2.o(a2, (CancellationSignal) null);
                    if (o.moveToFirst()) {
                        i = o.getInt(0);
                    }
                    o.close();
                    a2.o();
                    oi5.b((long) (i + 1), list);
                    i6d.r();
                    i6d.l();
                    return;
                } catch (Throwable th) {
                    i6d.l();
                    throw th;
                }
        }
    }
}
