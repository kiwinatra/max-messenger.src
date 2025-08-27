package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* renamed from: pg5  reason: default package */
public final class pg5 extends kbe {
    public final void N(lz7 lz7, Object obj) {
        rg5 rg5 = (rg5) lz7;
        qg5 qg5 = obj instanceof qg5 ? (qg5) obj : null;
        if (qg5 != null) {
            BitSet bitSet = (BitSet) qg5.a;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z || bitSet.get(5)) {
                Uri uri = rg5.b;
                if (uri == null) {
                    ((i42) view).c(rg5.y, Long.valueOf(rg5.a));
                } else {
                    ((i42) view).setAvatar(uri);
                }
            }
            if (bitSet.get(1)) {
                ((i42) view).setOnline(rg5.c);
            }
            if (bitSet.get(2)) {
                ((i42) view).setTitle(rg5.v);
            }
            if (bitSet.get(3)) {
                ((i42) view).setSubtitle(rg5.w);
            }
            if (bitSet.get(4)) {
                rg5.getClass();
            }
            if (bitSet.get(6)) {
                ((i42) view).setVerified(rg5.o);
            }
        }
    }

    /* renamed from: P */
    public final void M(rg5 rg5) {
        i42 i42 = (i42) this.a;
        long j = rg5.a;
        i42.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        i42.setTitle(rg5.v);
        i42.setSubtitle(rg5.w);
        Uri uri = rg5.b;
        if (uri == null) {
            i42.c(rg5.y, Long.valueOf(rg5.a));
        } else {
            i42.setAvatar(uri);
        }
        i42.setOnline(rg5.c);
        i42.setVerified(rg5.o);
    }
}
