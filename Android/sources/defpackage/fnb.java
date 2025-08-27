package defpackage;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: fnb  reason: default package */
public final /* synthetic */ class fnb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ fnb(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    public final Object invoke() {
        PipScreen pipScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PipScreen.c;
                rf1 rf1 = new rf1(pipScreen.getContext());
                rf1.setPipTheme(l2b.a);
                rf1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                rf1.setVideoLayoutUpdatesControllerProvider(new fnb(pipScreen, 2));
                rf1.setBackgroundCorners(c44.DEFAULT_ASPECT_RATIO);
                return rf1;
            case 1:
                KProperty[] kPropertyArr2 = PipScreen.c;
                m21 m21 = m21.a;
                return new wmb((h9b) m21.getAccessor().g(h9b.class), m21.c(), (dq1) m21.getAccessor().g(dq1.class), new xga(2, pipScreen), oh1.a.getAccessor().h(hl1.class));
            default:
                KProperty[] kPropertyArr3 = PipScreen.c;
                return (p6g) ((wmb) pipScreen.b.getValue()).x.getValue();
        }
    }
}
