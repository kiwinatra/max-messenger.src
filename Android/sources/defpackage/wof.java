package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: wof  reason: default package */
public final class wof extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xof b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wof(xof xof, int i) {
        super(0);
        this.a = i;
        this.b = xof;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                xof xof = this.b;
                String str2 = xof.a;
                zof a2 = xof.a();
                if (a2 == null || (str = a2.versionName()) == null) {
                    str = "NA";
                }
                zof a3 = xof.a();
                String str3 = null;
                String buildUuid = a3 != null ? a3.buildUuid() : null;
                zof a4 = xof.a();
                if (a4 != null) {
                    str3 = a4.environment();
                }
                return new tof(str2, str, buildUuid, str3);
            default:
                xof xof2 = this.b;
                try {
                    return o5a.V(xof2.a);
                } catch (Exception unused) {
                    String str4 = xof2.a;
                    return null;
                }
        }
    }
}
