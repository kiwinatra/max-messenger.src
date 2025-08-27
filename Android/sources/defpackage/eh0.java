package defpackage;

import android.app.Activity;

/* renamed from: eh0  reason: default package */
public final class eh0 extends n45 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eh0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                nh0 nh0 = (nh0) this.b;
                nh0.d.h();
                nh0.e.h();
                return;
            default:
                return;
        }
    }

    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                udg udg = (udg) this.b;
                udg.f++;
                z68.a("udg", "onActivityStarted, visibleActivitiesCount: " + udg.f);
                return;
            default:
                return;
        }
    }

    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                udg udg = (udg) this.b;
                udg.f--;
                z68.a("udg", "onActivityStopped, visibleActivitiesCount: " + ((udg) this.b).f);
                if (((udg) this.b).k) {
                    udg udg2 = (udg) this.b;
                    if (udg2.f == 0) {
                        udg2.k = false;
                        ((udg) this.b).a();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
