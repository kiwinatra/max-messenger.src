package defpackage;

import android.hardware.SensorManager;
import kotlin.jvm.functions.Function0;

/* renamed from: n9c  reason: default package */
public final /* synthetic */ class n9c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;

    public /* synthetic */ n9c(p9c p9c, int i) {
        this.a = i;
        this.b = p9c;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((SensorManager) this.b.a.getValue()).getDefaultSensor(8);
            default:
                return new ov7(1, this.b);
        }
    }
}
