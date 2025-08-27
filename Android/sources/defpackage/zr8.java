package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: zr8  reason: default package */
public final /* synthetic */ class zr8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View[] b;

    public /* synthetic */ zr8(View[] viewArr, int i) {
        this.a = i;
        this.b = viewArr;
    }

    public final Object invoke() {
        View[] viewArr = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaKeyboardWidget.A0;
                for (View visibility : viewArr) {
                    visibility.setVisibility(0);
                }
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = MediaKeyboardWidget.A0;
                for (View visibility2 : viewArr) {
                    visibility2.setVisibility(8);
                }
                return Unit.INSTANCE;
        }
    }
}
