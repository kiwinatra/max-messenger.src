package defpackage;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function0;

/* renamed from: uh3  reason: default package */
public final /* synthetic */ class uh3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh3 b;

    public /* synthetic */ uh3(xh3 xh3, int i) {
        this.a = i;
        this.b = xh3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (ConnectivityManager) this.b.a.getSystemService("connectivity");
            default:
                return (TelephonyManager) this.b.a.getSystemService("phone");
        }
    }
}
