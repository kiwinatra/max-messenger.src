package defpackage;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: r30  reason: default package */
public abstract class r30 {
    public static u30 a(AudioManager audioManager, i30 i30) {
        List x = audioManager.getDirectProfilesForAttributes((AudioAttributes) i30.b().b);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(cvg.d(12)));
        for (int i = 0; i < x.size(); i++) {
            AudioProfile i2 = n30.i(x.get(i));
            if (i2.getEncapsulationType() != 1) {
                int y = i2.getFormat();
                if (!v0g.L(y)) {
                    if (!u30.e.containsKey(Integer.valueOf(y))) {
                    }
                }
                if (hashMap.containsKey(Integer.valueOf(y))) {
                    Set set = (Set) hashMap.get(Integer.valueOf(y));
                    set.getClass();
                    set.addAll(cvg.d(i2.getChannelMasks()));
                } else {
                    hashMap.put(Integer.valueOf(y), new HashSet(cvg.d(i2.getChannelMasks())));
                }
            }
        }
        qb7 o = tb7.o();
        for (Map.Entry entry : hashMap.entrySet()) {
            o.a(new s30(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new u30(o.j());
    }

    public static g40 b(AudioManager audioManager, i30 i30) {
        try {
            audioManager.getClass();
            List p = audioManager.getAudioDevicesForAttributes((AudioAttributes) i30.b().b);
            if (p.isEmpty()) {
                return null;
            }
            return new g40((AudioDeviceInfo) p.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
