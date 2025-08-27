package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* renamed from: nh5  reason: default package */
public final /* synthetic */ class nh5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi5 b;

    public /* synthetic */ nh5(xi5 xi5, int i) {
        this.a = i;
        this.b = xi5;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        int i = this.a;
        xi5 xi5 = this.b;
        switch (i) {
            case 0:
                xi5.getClass();
                d7d a2 = d7d.a(0, "SELECT COUNT(*) FROM favorite_stickers");
                i6d i6d = xi5.a;
                i6d.b();
                Cursor o = i6d.o(a2, (CancellationSignal) null);
                try {
                    long j = o.moveToFirst() ? o.getLong(0) : 0;
                    o.close();
                    a2.o();
                    return Long.valueOf(j);
                } catch (Throwable th) {
                    o.close();
                    a2.o();
                    throw th;
                }
            default:
                return xi5.c();
        }
    }
}
