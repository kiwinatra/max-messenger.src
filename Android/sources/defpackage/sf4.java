package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: sf4  reason: default package */
public final class sf4 implements s17 {
    public final /* synthetic */ vf4 a;

    public sf4(vf4 vf4) {
        this.a = vf4;
    }

    public final void a() {
        this.a.c.remove(this);
    }

    public final boolean b(Uri uri, j28 j28, boolean z) {
        HashMap hashMap;
        uf4 uf4;
        vf4 vf4 = this.a;
        if (((c17) vf4.x0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = v0g.a;
            List list = ((k17) vf4.w0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = vf4.b;
                if (i2 >= size) {
                    break;
                }
                uf4 uf42 = (uf4) hashMap.get(((i17) list.get(i2)).a);
                if (uf42 != null && elapsedRealtime < uf42.y) {
                    i3++;
                }
                i2++;
            }
            z35 z35 = new z35(1, 0, ((k17) vf4.w0).e.size(), i3, 2);
            ((nfd) vf4.X).getClass();
            p01 o = nfd.o(z35, j28);
            if (!(o == null || o.b != 2 || (uf4 = (uf4) hashMap.get(uri)) == null)) {
                uf4.a(uf4, o.c);
            }
        }
        return false;
    }
}
