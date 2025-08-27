package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;

/* renamed from: tx0  reason: default package */
public final /* synthetic */ class tx0 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx0 b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ tx0(wx0 wx0, HashSet hashSet, int i) {
        this.a = i;
        this.b = wx0;
        this.c = hashSet;
    }

    public final void run() {
        Collection collection;
        Iterator it;
        wx0 wx0;
        switch (this.a) {
            case 0:
                wx0 wx02 = this.b;
                Collection collection2 = this.c;
                wx02.getClass();
                if (collection2.contains(zx0.z)) {
                    zx0 zx0 = zx0.w;
                    if (!collection2.contains(zx0)) {
                        collection2.add(zx0);
                    }
                }
                if (wx02.k.a != null) {
                    ux0 ux0 = wx02.k;
                    if (collection2.contains(zx0.x) || collection2.contains(zx0.c)) {
                        wx02.b.B();
                    }
                    o5h o5h = ux0.a;
                    o5h.getClass();
                    HashMap hashMap = new HashMap(collection2.size());
                    Iterator it2 = collection2.iterator();
                    long j = 0;
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        zx0 zx02 = zx0.a;
                        if (hasNext) {
                            zx0 zx03 = (zx0) it2.next();
                            Iterator it3 = ((List) o5h.a).iterator();
                            long j2 = 0;
                            long j3 = 0;
                            while (it3.hasNext()) {
                                kx0 kx0 = (kx0) it3.next();
                                if (zx03 != zx02) {
                                    try {
                                        if (kx0.d != zx03) {
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                it3.remove();
                                if (kx0.a.delete()) {
                                    j2++;
                                    wx0 = wx02;
                                    j3 += kx0.b;
                                    z68.c("o5h", "deleteEntries: delete=%s", kx0);
                                } else {
                                    wx0 = wx02;
                                    z68.g("o5h", "deleteEntries: failed to delete=%s", kx0);
                                }
                                wx02 = wx0;
                            }
                            z68.c("o5h", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", zx03, Long.valueOf(j2), Long.valueOf(j3));
                            j += j3;
                            hashMap.put(zx03, Long.valueOf(j3));
                            wx02 = wx02;
                        } else {
                            wx0 wx03 = wx02;
                            Lazy lazy = ((ql5) o5h.b).a;
                            ((nd) lazy.getValue()).e("ACTION_CACHE_CLEARED");
                            Set entrySet = hashMap.entrySet();
                            Iterator it4 = entrySet.iterator();
                            long j4 = 0;
                            while (it4.hasNext()) {
                                Map.Entry entry = (Map.Entry) it4.next();
                                zx0 zx04 = (zx0) entry.getKey();
                                if (zx04 == zx0.b || zx04 == zx02) {
                                    it = it4;
                                    n77 n77 = new n77(1);
                                    ba7 B = ld9.B();
                                    collection = collection2;
                                    B.f.n(n77);
                                    B.g.n(n77);
                                    rp4 rp4 = (rp4) B.c.get();
                                    rp4.a().a();
                                    ((vu0) rp4.d.getValue()).a();
                                    for (Map.Entry value : ((xb7) rp4.f.getValue()).entrySet()) {
                                        ((vu0) value.getValue()).a();
                                    }
                                } else {
                                    collection = collection2;
                                    it = it4;
                                }
                                long longValue = ((Long) entry.getValue()).longValue();
                                j4 += longValue;
                                File a2 = ((rl5) o5h.c).a(zx04);
                                ((nd) lazy.getValue()).d(longValue, "ACTION_CACHE_CLEARED_SIZE", a2 != null ? a2.getName() : zx04.name());
                                it4 = it;
                                collection2 = collection;
                            }
                            Collection collection3 = collection2;
                            if (wx0.l.equals(hashMap.keySet()) || (entrySet.size() == 1 && ((Map.Entry) entrySet.iterator().next()).getKey() == zx02)) {
                                ((nd) lazy.getValue()).d(j4, "ACTION_CACHE_CLEARED_SIZE", "ALL");
                            }
                            z68.c("o5h", "clearCacheTypes: removed %d bytes", Long.valueOf(j));
                            wx03.c.a(new iud((HashSet) collection3));
                            return;
                        }
                    }
                } else {
                    z68.f("wx0", "onClearCacheTypesPicked: already cleared all", (Throwable) null);
                    return;
                }
            default:
                wx0 wx04 = this.b;
                wx04.getClass();
                if (this.c.equals(wx0.l)) {
                    wx04.i.set(true);
                    return;
                }
                return;
        }
    }
}
