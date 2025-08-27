package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: hj4  reason: default package */
public final class hj4 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ sj4 a;

    public hj4(sj4 sj4) {
        this.a = sj4;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        sj4 sj4 = this.a;
        f5b f5b = sj4.j;
        sj4.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        sj4 sj4 = this.a;
        f5b f5b = sj4.j;
        sj4.g();
    }
}
