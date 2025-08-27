package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: k07  reason: default package */
public final class k07 extends yod {
    public k07(ir8 ir8, hx0 hx0, Executor executor) {
        super(ir8, new o17(), hx0, executor);
    }

    public static void i(c17 c17, x07 x07, HashSet hashSet, ArrayList arrayList) {
        long j = c17.h + x07.v;
        String str = c17.a;
        String str2 = x07.x;
        if (str2 != null) {
            Uri V = hi7.V(str, str2);
            if (hashSet.add(V)) {
                arrayList.add(new wod(j, yod.d(V)));
            }
        }
        arrayList.add(new wod(j, new q74(hi7.V(str, x07.a), x07.z, x07.X)));
    }

    public final ArrayList e(jx0 jx0, to5 to5, boolean z) {
        m17 m17 = (m17) to5;
        ArrayList arrayList = new ArrayList();
        if (m17 instanceof k17) {
            List list = ((k17) m17).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(yod.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(yod.d(Uri.parse(m17.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q74 q74 = (q74) it.next();
            arrayList2.add(new wod(0, q74));
            try {
                c17 c17 = (c17) ((to5) c(new uod(this, jx0, q74), z));
                tb7 tb7 = c17.r;
                x07 x07 = null;
                for (int i2 = 0; i2 < tb7.size(); i2++) {
                    x07 x072 = (x07) tb7.get(i2);
                    x07 x073 = x072.b;
                    if (!(x073 == null || x073 == x07)) {
                        i(c17, x073, hashSet, arrayList2);
                        x07 = x073;
                    }
                    i(c17, x072, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
