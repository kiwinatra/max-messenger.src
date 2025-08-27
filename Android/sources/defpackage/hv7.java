package defpackage;

import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;

/* renamed from: hv7  reason: default package */
public final class hv7 implements zu7 {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ iv7 b;
    public final /* synthetic */ ju7 c;

    public hv7(AppBarLayout appBarLayout, iv7 iv7, ju7 ju7) {
        this.a = appBarLayout;
        this.b = iv7;
        this.c = ju7;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        iv7 iv7;
        if (hu7.a().compareTo(iu7.a) <= 0) {
            z68.i("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", (Throwable) null);
            ArrayList arrayList = this.a.y;
            if (!(arrayList == null || (iv7 = this.b) == null)) {
                arrayList.remove(iv7);
            }
            this.c.b(this);
        }
    }
}
