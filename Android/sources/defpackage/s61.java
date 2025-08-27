package defpackage;

import android.os.Vibrator;
import kotlin.Lazy;

/* renamed from: s61  reason: default package */
public final class s61 {
    public final Lazy a;
    public final Lazy b;

    public s61(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final void a() {
        z68.c("HandleSilenceMode", "try mute ringtones", new Object[0]);
        tg1 a2 = ((h5d) this.b.getValue()).a();
        if (a2.g == null && ((Vibrator) a2.e.getValue()) == null) {
            z68.c("RingtoneManagerTag", " mute already set", new Object[0]);
            return;
        }
        z68.c("RingtoneManagerTag", " set mute", new Object[0]);
        a2.c();
    }
}
