package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ksd  reason: default package */
public final class ksd implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    public final Set d = Collections.synchronizedSet(new LinkedHashSet());
    public final Set e = Collections.synchronizedSet(new LinkedHashSet());
    public final isd f;

    public ksd(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(8);
        this.c = sensorManager.getDefaultSensor(5);
        this.f = new isd(this);
    }

    public static int a(float f2) {
        if (f2 < c44.DEFAULT_ASPECT_RATIO) {
            f2 = 0.0f;
        }
        if (f2 > 10000.0f) {
            f2 = 10000.0f;
        }
        return (int) ((Math.log10((double) f2) / 4.0d) * 100.0d);
    }

    public final void b(hsd hsd) {
        Set set = this.e;
        if (set.add(hsd) && set.size() == 1) {
            Sensor sensor = this.c;
            SensorManager sensorManager = this.a;
            isd isd = this.f;
            sensorManager.registerListener(isd, sensor, 3, 2500000);
            sensorManager.registerListener(isd, this.b, 3, 2500000);
        }
        set.add(hsd);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.d) {
            try {
                if (sensorEvent.sensor.getType() == 8) {
                    boolean z = false;
                    if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                        z = true;
                    }
                    for (jsd jsd : this.d) {
                        if (z) {
                            jsd.h();
                        } else {
                            jsd.e();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
