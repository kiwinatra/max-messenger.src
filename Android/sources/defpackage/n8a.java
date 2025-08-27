package defpackage;

import androidx.viewpager.widget.ViewPager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: n8a  reason: default package */
public final class n8a implements l8f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n8a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(o8f o8f) {
    }

    private final void b(o8f o8f) {
    }

    public final void E(o8f o8f) {
        switch (this.a) {
            case 0:
                int i = 0;
                if (o8f.e > 0) {
                    KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
                    ((NeuroAvatarsScreen) this.b).c0().setExpanded(false);
                }
                KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
                x8a h0 = ((NeuroAvatarsScreen) this.b).h0();
                int i2 = o8f.e;
                if (i2 != h0.x) {
                    int intValue = ((Number) CollectionsKt___CollectionsKt.elementAt(((Map) h0.x0.getValue()).keySet(), i2)).intValue();
                    Iterator it = ((List) h0.w.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (((q7a) it.next()).c != intValue) {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    h0.x = i2;
                    h0.Z.d(new r7a(i2, valueOf));
                    return;
                }
                return;
            default:
                ((ViewPager) this.b).setCurrentItem(o8f.e);
                return;
        }
    }

    public final void h(o8f o8f) {
        int i = this.a;
    }
}
