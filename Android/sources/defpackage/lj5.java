package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: lj5  reason: default package */
public final class lj5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lj5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity, Bundle bundle) {
    }

    private final void o(Activity activity, Bundle bundle) {
    }

    private final void p(Activity activity, Bundle bundle) {
    }

    private final void q(Activity activity, Bundle bundle) {
    }

    private final void r(Activity activity) {
    }

    private final void s(Activity activity) {
    }

    private final void t(Activity activity) {
    }

    private final void u(Activity activity) {
    }

    private final void v(Activity activity) {
    }

    private final void w(Activity activity) {
    }

    private final void x(Activity activity) {
    }

    private final void y(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2 = null;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                ArrayDeque arrayDeque = (ArrayDeque) obj;
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                } else {
                                    return;
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                            hp5 b2 = hp5.b();
                            b2.a();
                            rae.w(b2.d.a(od.class));
                        }
                        n79.G("_no", bundle2);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                a8d a8d = a8d.a;
                a8d.b.add(new vz3(2, (rta) obj));
                View decorView = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.setOnHierarchyChangeListener(a8d);
                }
                Sequence sequenceOf = SequencesKt.sequenceOf(activity.getWindow().getDecorView().getRootView());
                oo9 oo9 = new oo9(9);
                oo9 oo92 = new oo9();
                veg veg = veg.a;
                for (View view : SequencesKt___SequencesKt.flatMap(sequenceOf, new ued(oo9, oo92))) {
                    ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setOnHierarchyChangeListener(a8d);
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ((ocb) this.b).b.h();
                return;
            default:
                int i = Build.VERSION.SDK_INT;
                xcb xcb = (xcb) this.b;
                if (i >= 33) {
                    xcb.d.h();
                }
                xcb.e.h();
                xcb.f.h();
                if (i >= 34) {
                    xcb.g.h();
                }
                xcb.h.h();
                xcb.i.h();
                xcb.j.h();
                return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    public final void onActivityStopped(Activity activity) {
        int i = this.a;
    }

    public lj5() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }
}
