package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.HashMap;

/* renamed from: qt1  reason: default package */
public final class qt1 {
    public final HashMap a = new HashMap();
    public final er7 b;
    public final String c;
    public tgg d = null;

    public qt1(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = new er7(9, (Object) cameraCharacteristics);
        this.c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.hardware.camera2.CameraCharacteristics.Key r3) {
        /*
            r2 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            er7 r2 = r2.b
            java.lang.Object r2 = r2.b
            android.hardware.camera2.CameraCharacteristics r2 = (android.hardware.camera2.CameraCharacteristics) r2
            java.lang.Object r2 = r2.get(r3)
            return r2
        L_0x0013:
            monitor-enter(r2)
            java.util.HashMap r0 = r2.a     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0020
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return r0
        L_0x001e:
            r3 = move-exception
            goto L_0x0033
        L_0x0020:
            er7 r0 = r2.b     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x001e }
            android.hardware.camera2.CameraCharacteristics r0 = (android.hardware.camera2.CameraCharacteristics) r0     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0031
            java.util.HashMap r1 = r2.a     // Catch:{ all -> 0x001e }
            r1.put(r3, r0)     // Catch:{ all -> 0x001e }
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return r0
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt1.a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [wsb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [tgg, java.lang.Object] */
    public final tgg b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    String str = this.c;
                    ? obj = new Object();
                    obj.a = (ExtraSupportedOutputSizeQuirk) qn4.a.g(ExtraSupportedOutputSizeQuirk.class);
                    obj.b = new dr4(str);
                    ? obj2 = new Object();
                    obj2.c = new HashMap();
                    obj2.o = new HashMap();
                    new HashMap();
                    obj2.a = new nob((Object) streamConfigurationMap);
                    obj2.b = obj;
                    this.d = obj2;
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }
}
