package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: cig  reason: default package */
public final /* synthetic */ class cig implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ cig(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    public final Object invoke() {
        WebAppRootScreen webAppRootScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = WebAppRootScreen.D0;
                webAppRootScreen.getClass();
                KProperty[] kPropertyArr2 = WebAppRootScreen.D0;
                KProperty kProperty = kPropertyArr2[1];
                long longValue = ((Number) webAppRootScreen.z.a(webAppRootScreen)).longValue();
                KProperty kProperty2 = kPropertyArr2[2];
                KProperty kProperty3 = kPropertyArr2[0];
                KProperty kProperty4 = kPropertyArr2[3];
                return new hjg(longValue, (kfg) webAppRootScreen.X.a(webAppRootScreen), (Long) webAppRootScreen.y.a(webAppRootScreen), (String) webAppRootScreen.Y.a(webAppRootScreen));
            default:
                KProperty[] kPropertyArr3 = WebAppRootScreen.D0;
                return new tlg(webAppRootScreen.q0());
        }
    }
}
