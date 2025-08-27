package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: tq  reason: default package */
public final /* synthetic */ class tq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ tq(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                if (((qq) obj).a == 2) {
                    str = "https://play.google.com/store/apps/details?id=ru.oneme.app";
                } else {
                    sq.a.getClass();
                    str = rq.b;
                }
                kw3.b(this.b, str);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(((WeakReference) obj).get() == this.b);
        }
    }
}
