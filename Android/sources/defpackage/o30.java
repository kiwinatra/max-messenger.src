package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: o30  reason: default package */
public abstract class o30 {
    /* JADX WARNING: type inference failed for: r0v0, types: [cc7, jb7] */
    private static dc7 a() {
        ? jb7 = new jb7(4);
        jb7.b(8, 7);
        int i = v0g.a;
        if (i >= 31) {
            jb7.b(26, 27);
        }
        if (i >= 33) {
            jb7.a(30);
        }
        return jb7.l();
    }

    public static boolean b(AudioManager audioManager, g40 g40) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (g40 == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{g40.a};
        }
        dc7 a = a();
        for (AudioDeviceInfo type : audioDeviceInfoArr) {
            if (a.contains(Integer.valueOf(type.getType()))) {
                return true;
            }
        }
        return false;
    }
}
