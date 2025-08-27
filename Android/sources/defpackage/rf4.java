package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: rf4  reason: default package */
public final class rf4 implements r17 {
    public final /* synthetic */ vf4 a;

    public rf4(vf4 vf4) {
        this.a = vf4;
    }

    public final void a() {
        this.a.c.remove(this);
    }

    public final boolean e(Uri uri, j28 j28, boolean z) {
        HashMap hashMap;
        tf4 tf4;
        vf4 vf4 = this.a;
        if (((b17) vf4.x0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = t0g.a;
            List list = ((j17) vf4.w0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = vf4.b;
                if (i2 >= size) {
                    break;
                }
                tf4 tf42 = (tf4) hashMap.get(((h17) list.get(i2)).a);
                if (tf42 != null && elapsedRealtime < tf42.y) {
                    i3++;
                }
                i2++;
            }
            z35 z35 = new z35(1, 0, ((j17) vf4.w0).e.size(), i3, 1);
            ((gga) vf4.X).getClass();
            p01 n = gga.n(z35, j28);
            if (!(n == null || n.b != 2 || (tf4 = (tf4) hashMap.get(uri)) == null)) {
                tf4.a(tf4, n.c);
            }
        }
        return false;
    }
}
