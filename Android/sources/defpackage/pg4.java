package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* renamed from: pg4  reason: default package */
public final class pg4 implements zu7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ pg4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                ng4 ng4 = (ng4) obj;
                switch (og4.$EnumSwitchMapping$0[hu7.ordinal()]) {
                    case 1:
                        ng4.getClass();
                        break;
                    case 2:
                        ng4.onStart(jv7);
                        break;
                    case 3:
                        ng4.onResume(jv7);
                        break;
                    case 4:
                        ng4.onPause(jv7);
                        break;
                    case 5:
                        ng4.onStop(jv7);
                        break;
                    case 6:
                        ng4.onDestroy(jv7);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                zu7 zu7 = (zu7) obj2;
                if (zu7 != null) {
                    zu7.d(jv7, hu7);
                    return;
                }
                return;
            case 1:
                it8 it8 = (it8) obj2;
                if (!it8.v.Q()) {
                    jv7.getLifecycle().b(this);
                    nd6 nd6 = (nd6) obj;
                    if (((FrameLayout) nd6.a).isAttachedToWindow()) {
                        it8.J(nd6);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (hu7 == hu7.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((Runnable) obj2);
                    jv7.getLifecycle().b(this);
                    return;
                }
                return;
            case 3:
                if (hu7 == hu7.ON_START) {
                    ((ju7) obj).b(this);
                    ((mdd) obj2).d();
                    return;
                }
                return;
            case 4:
                int i = lu8.a[hu7.ordinal()];
                m48 m48 = (m48) obj;
                mu8 mu8 = (mu8) obj2;
                if (i == 1) {
                    mu8.p(m48);
                    return;
                } else if (i == 2) {
                    mu8.getClass();
                    z68.c("mu8", "detachInternal %s", m48.a);
                    iu8 iu8 = m48.e;
                    if (iu8 != null) {
                        iu8.y();
                        return;
                    }
                    return;
                } else if (i == 3) {
                    mu8.x(m48);
                    return;
                } else {
                    return;
                }
            default:
                HashMap hashMap = ((k13) obj2).a;
                k13.a((List) hashMap.get(hu7), jv7, hu7, obj);
                k13.a((List) hashMap.get(hu7.ON_ANY), jv7, hu7, obj);
                return;
        }
    }

    public /* synthetic */ pg4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public pg4(Object obj) {
        this.a = 5;
        this.b = obj;
        m13 m13 = m13.c;
        Class<?> cls = obj.getClass();
        k13 k13 = (k13) m13.a.get(cls);
        this.c = k13 == null ? m13.a(cls, (Method[]) null) : k13;
    }
}
