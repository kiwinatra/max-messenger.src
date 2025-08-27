package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;
import one.me.sdk.arch.Widget;

/* renamed from: wmg  reason: default package */
public final /* synthetic */ class wmg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ int c;

    public /* synthetic */ wmg(Widget widget, int i, int i2) {
        this.a = i2;
        this.b = widget;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Widget.childSlotRouter$lambda$11(this.b, this.c, (mz2) obj);
            default:
                return Widget.viewBinding$lambda$5(this.b, this.c, (View) obj);
        }
    }
}
