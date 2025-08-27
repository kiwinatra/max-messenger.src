package defpackage;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: epg  reason: default package */
public final /* synthetic */ class epg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ epg(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return wj6.k("worker_class_name LIKE '", (String) obj, "%'");
            default:
                KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
                ((EditText) obj).getText().clear();
                return Unit.INSTANCE;
        }
    }
}
