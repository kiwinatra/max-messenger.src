package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function2;
import one.me.sdk.arch.Widget;

/* renamed from: xmg  reason: default package */
public final /* synthetic */ class xmg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ xmg(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Widget.viewBinding$lambda$6(this.b, (View) obj, (n13) obj2);
            default:
                return Widget.binding$lambda$9(this.b, obj, (n13) obj2);
        }
    }
}
