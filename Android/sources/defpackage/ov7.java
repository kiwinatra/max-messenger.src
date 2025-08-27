package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: ov7  reason: default package */
public final class ov7 implements SensorEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                int type = sensorEvent.sensor.getType();
                he heVar = (he) this.b;
                boolean z = false;
                if (type != 5) {
                    if (type == 8) {
                        if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                            z = true;
                        }
                        heVar.b = z;
                        return;
                    }
                    return;
                } else if (!heVar.b) {
                    Float valueOf = Float.valueOf(sensorEvent.values[0]);
                    xme xme = (xme) heVar.c;
                    xme.getClass();
                    xme.m((Object) null, valueOf);
                    return;
                } else {
                    return;
                }
            default:
                p9c p9c = (p9c) this.b;
                if (p9c.f != null) {
                    boolean z2 = false;
                    if (((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d)) {
                        z2 = true;
                    }
                    if (z2 != p9c.e) {
                        p9c.e = z2;
                        if (z2) {
                            for (o9c a2 : p9c.h) {
                                a2.a();
                            }
                            return;
                        }
                        for (o9c b2 : p9c.h) {
                            b2.b();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
