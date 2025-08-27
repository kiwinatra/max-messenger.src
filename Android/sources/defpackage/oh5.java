package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;

/* renamed from: oh5  reason: default package */
public final /* synthetic */ class oh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi5 b;
    public final /* synthetic */ List c;

    public /* synthetic */ oh5(xi5 xi5, List list, int i) {
        this.a = i;
        this.b = xi5;
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
                xi5 xi5 = this.b;
                i6d i6d = xi5.a;
                i6d.c();
                try {
                    xi5.getClass();
                    int i = 0;
                    a2 = d7d.a(0, "SELECT MAX(`index`) FROM favorite_stickers");
                    i6d i6d2 = xi5.a;
                    i6d2.b();
                    o = i6d2.o(a2, (CancellationSignal) null);
                    if (o.moveToFirst()) {
                        i = o.getInt(0);
                    }
                    o.close();
                    a2.o();
                    xi5.b(i + 1, list);
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
