package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: isd  reason: default package */
public final class isd implements SensorEventListener {
    public boolean a;
    public final /* synthetic */ ksd b;

    public isd(ksd ksd) {
        this.b = ksd;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        if (sensorEvent.sensor.getType() == 8) {
            if (sensorEvent.values[0] < sensorEvent.sensor.getMaximumRange()) {
                z = true;
            }
            this.a = z;
        } else if (sensorEvent.sensor.getType() == 5) {
            for (hsd n1 : this.b.e) {
                n1.n1(sensorEvent.values[0], this.a);
            }
        }
    }
}
