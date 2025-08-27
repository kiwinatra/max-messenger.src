package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: i9  reason: default package */
public final /* synthetic */ class i9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2b b;

    public /* synthetic */ i9(k2b k2b, int i) {
        this.a = i;
        this.b = k2b;
    }

    public final Object invoke(Object obj) {
        boolean z;
        k2b k2b = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof phf) {
                    k9.a(view, k2b);
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                k9.a((View) obj, k2b);
                return Unit.INSTANCE;
            case 2:
                k2b k2b2 = (k2b) obj;
                int i = OneMeAvatarView.E0;
                return Integer.valueOf(k2b.getIcon().g);
            default:
                k2b k2b3 = (k2b) obj;
                int i2 = OneMeAvatarView.E0;
                return Integer.valueOf(k2b.c().j);
        }
    }
}
