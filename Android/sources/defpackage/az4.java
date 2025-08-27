package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: az4  reason: default package */
public final class az4 implements zy4 {
    public final DynamicRangeProfiles a;

    public az4(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            vy4 vy4 = (vy4) wy4.a.get(l);
            bs0.q(vy4, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(vy4);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final DynamicRangeProfiles a() {
        return this.a;
    }

    public final Set b() {
        return d(this.a.getSupportedProfiles());
    }

    public final Set c(vy4 vy4) {
        Long a2 = wy4.a(vy4, this.a);
        boolean z = a2 != null;
        bs0.m("DynamicRange is not supported: " + vy4, z);
        return d(this.a.getProfileCaptureRequestConstraints(a2.longValue()));
    }
}
