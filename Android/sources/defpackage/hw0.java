package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.messages.bots.ButtonsView;

/* renamed from: hw0  reason: default package */
public final /* synthetic */ class hw0 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ButtonsView b;

    public /* synthetic */ hw0(ButtonsView buttonsView, int i) {
        this.a = i;
        this.b = buttonsView;
    }

    public final void accept(Object obj) {
        ButtonsView buttonsView = this.b;
        switch (this.a) {
            case 0:
                tq0 tq0 = (tq0) obj;
                int i = ButtonsView.Q0;
                buttonsView.getClass();
                fw0 fw0 = tq0.a.b;
                fw0 fw02 = fw0.CALLBACK;
                a20 a20 = tq0.b;
                float abs = fw0 == fw02 ? Math.abs(a20.d - a20.b) : Math.abs(a20.d - a20.b) - ((float) (buttonsView.v + buttonsView.b));
                if (abs < c44.DEFAULT_ASPECT_RATIO) {
                    abs = Math.abs(a20.d - a20.b);
                }
                yva yva = buttonsView.C0;
                xv0 xv0 = tq0.a;
                tq0.h = TextUtils.ellipsize(yva.k.c((xv0.b != fw0.REQUEST_GEO_LOCATION || !xv0.w) ? xv0.a : buttonsView.getContext().getString(qad.O)), buttonsView.y0, abs, TextUtils.TruncateAt.END).toString();
                return;
            default:
                eq7 eq7 = (eq7) obj;
                buttonsView.y = eq7;
                int i2 = 0;
                for (ew0 it : eq7.a()) {
                    Iterator it2 = it.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            xv0 xv02 = (xv0) it2.next();
                            if (i2 <= buttonsView.x.size() - 1) {
                                tq0 tq02 = (tq0) buttonsView.x.get(i2);
                                if (xv02 != tq02.a) {
                                    ArrayList arrayList = buttonsView.x;
                                    tq0 tq03 = new tq0(xv02, tq02.b, tq02.c, tq02.d, tq02.e, tq02.f, tq02.g);
                                    tq03.h = tq02.h;
                                    arrayList.set(i2, tq03);
                                }
                                i2++;
                            }
                        }
                    }
                    buttonsView.postDelayed(new b(20, (Object) buttonsView), 300);
                    return;
                }
                buttonsView.postDelayed(new b(20, (Object) buttonsView), 300);
                return;
        }
    }
}
