package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: p9c  reason: default package */
public final class p9c {
    public final Lazy a;
    public final Lazy b = LazyKt.lazy(new n9c(this, 0));
    public final Lazy c;
    public final Lazy d;
    public boolean e;
    public PowerManager.WakeLock f;
    public u6h g;
    public final LinkedHashSet h;

    public p9c(Lazy lazy) {
        this.a = LazyKt.lazy(new ur(24, lazy));
        this.c = LazyKt.lazy(new ur(25, lazy));
        this.d = LazyKt.lazy(new n9c(this, 1));
        this.h = new LinkedHashSet();
    }

    public final void a() {
        Sensor sensor = (Sensor) this.b.getValue();
        if (sensor != null) {
            try {
                this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
                ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
            } catch (Exception e2) {
                z68.h("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void b() {
        if (((Sensor) this.b.getValue()) != null) {
            PowerManager.WakeLock wakeLock = this.f;
            try {
                ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release(1);
                }
            } catch (Exception e2) {
                z68.h("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }

    public final void c() {
        Object value;
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    wakeLock.release(1);
                    u6h u6h = this.g;
                    if (u6h != null) {
                        ap1 ap1 = (ap1) u6h.b;
                        tz9 tz9 = (tz9) ap1.n.getValue();
                        do {
                            value = tz9.getValue();
                            CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) value;
                        } while (!tz9.b(value, ((o01) ap1.b).b()));
                    }
                }
            } catch (Exception e2) {
                z68.h("ProximityHelperTag", e2, e2.getMessage(), new Object[0]);
            }
        }
    }
}
