package com.my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.time.DurationKt;

public final class w1 {
    final AtomicInteger a = new AtomicInteger();
    final e0 b;
    final AntiFraudConfig c;
    final Context d;
    a e;
    Runnable f;
    Runnable g;
    long h = -1;

    public static final class a implements SensorEventListener {
        private final e0 a;
        private final SensorManager b;
        private final AntiFraudConfig c;
        private final ArrayList d = new ArrayList();

        public a(e0 e0Var, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.a = e0Var;
            this.b = sensorManager;
            this.c = antiFraudConfig;
        }

        public static a a(e0 e0Var, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(e0Var, sensorManager, antiFraudConfig);
        }

        public void b() {
            x2.a("SensorEventListenerImpl: stop()");
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    this.b.unregisterListener(this, (Sensor) it.next());
                } catch (Throwable th) {
                    x2.a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.d.clear();
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            StringBuilder sb;
            float f;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                e0 e0Var = this.a;
                float[] fArr = sensorEvent.values;
                e0Var.b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 8) {
                this.a.c(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: proximity - ");
                f = sensorEvent.values[0];
            } else if (type == 4) {
                e0 e0Var2 = this.a;
                float[] fArr2 = sensorEvent.values;
                e0Var2.a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 5) {
                this.a.a(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: light - ");
                f = sensorEvent.values[0];
            } else if (type == 6) {
                this.a.b(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: pressure - ");
                f = sensorEvent.values[0];
            } else {
                return;
            }
            sb.append(f);
            x2.a(sb.toString());
        }

        public void a() {
            x2.a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i = 0; i < 5; i++) {
                int i2 = iArr[i];
                if ((i2 != 5 || this.c.useLightSensor) && ((i2 != 2 || this.c.useMagneticFieldSensor) && ((i2 != 4 || this.c.useGyroscope) && ((i2 != 6 || this.c.usePressureSensor) && (i2 != 8 || this.c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.b.getDefaultSensor(i2);
                        if (defaultSensor != null) {
                            this.b.registerListener(this, defaultSensor, DurationKt.NANOS_IN_MILLIS);
                            this.d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        x2.a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }
    }

    public w1(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {
        this.b = e0Var;
        this.c = antiFraudConfig;
        this.d = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        m.a(new avg(this, 0));
    }

    public void a(long j) {
        if (j <= 0) {
            x2.a("SensorHandler: install timestamp is empty, do nothing");
        } else if (!this.a.compareAndSet(0, 1)) {
            x2.a("SensorHandler: handler has already been initialized");
        } else {
            a a2 = a.a(this.b, this.d.getApplicationContext(), this.c);
            this.e = a2;
            if (a2 == null) {
                x2.a("SensorHandler: sensor event listener is null");
                return;
            }
            this.f = new avg(this, 1);
            this.g = new z60(this, j, 11);
            this.h = j;
            x2.a("SensorHandler: initialized");
            this.g.run();
        }
    }

    public void c() {
        Runnable runnable = this.g;
        if (runnable == null) {
            x2.a("SensorHandler: can't start, startRunnable is null");
        } else {
            m.a(runnable);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (!this.a.compareAndSet(2, 1)) {
            x2.a("SensorHandler: handle isn't running");
            return;
        }
        this.e.b();
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(long j) {
        if (!this.a.compareAndSet(1, 2)) {
            x2.a("SensorHandler: handler can't start, current state: " + this.a.get());
        } else if (this.e == null) {
            x2.a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (v2.a() - j > 259200) {
            x2.a("SensorHandler: more than 259200 seconds passed since the app was installed");
        } else {
            this.e.a();
            m.a.postDelayed(this.f, 20000);
        }
    }

    public static w1 a(e0 e0Var, AntiFraudConfig antiFraudConfig, Context context) {
        return new w1(e0Var, antiFraudConfig, context);
    }
}
