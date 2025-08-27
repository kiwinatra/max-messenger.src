package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;

/* renamed from: ly7  reason: default package */
public final /* synthetic */ class ly7 implements jy7 {
    public final /* synthetic */ qy7 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ly7(qy7 qy7, Object obj) {
        this.a = qy7;
        this.b = obj;
    }

    public void a(View view, String str) {
        sy7 sy7 = sy7.w;
        ClickableSpan clickableSpan = (ClickableSpan) this.b;
        qy7 qy7 = this.a;
        a94 a94 = qy7.e;
        if (a94.b) {
            a94.b = false;
            ny7 ny7 = qy7.a;
            if (ny7 == null) {
                ny7 = view instanceof ny7 ? (ny7) view : null;
            }
            if (ny7 != null) {
                ny7.X(str, sy7, clickableSpan, (View) null);
            }
            Unit unit = Unit.INSTANCE;
            view.postDelayed(new cf(14, (nm1) a94.c), a94.a);
        }
    }
}
