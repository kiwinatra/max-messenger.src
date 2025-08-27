package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: wy4  reason: default package */
public abstract class wy4 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        vy4 vy4;
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        vy4 vy42 = vy4.d;
        hashMap.put(1L, vy42);
        hashMap2.put(vy42, Collections.singletonList(1L));
        hashMap.put(2L, vy4.e);
        hashMap2.put((vy4) hashMap.get(2L), Collections.singletonList(2L));
        vy4 vy43 = vy4.f;
        hashMap.put(4L, vy43);
        hashMap2.put(vy43, Collections.singletonList(4L));
        vy4 vy44 = vy4.g;
        hashMap.put(8L, vy44);
        hashMap2.put(vy44, Collections.singletonList(8L));
        List asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vy4 = vy4.h;
            if (!hasNext) {
                break;
            }
            a.put((Long) it.next(), vy4);
        }
        b.put(vy4, asList);
        List asList2 = Arrays.asList(new Long[]{Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L});
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            vy4 vy45 = vy4.i;
            if (hasNext2) {
                a.put((Long) it2.next(), vy45);
            } else {
                b.put(vy45, asList2);
                return;
            }
        }
    }

    public static Long a(vy4 vy4, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(vy4);
        if (list == null) {
            return null;
        }
        Set q = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (q.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
