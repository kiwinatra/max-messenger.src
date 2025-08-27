package defpackage;

import android.view.View;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: lkd  reason: default package */
public final /* synthetic */ class lkd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ lkd(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final void onClick(View view) {
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                if (searchMessageBottomWidget.x) {
                    rk2 rk2 = (rk2) searchMessageBottomWidget.g0().o.c;
                    int i = rk2.d;
                    if (i - 1 >= 0) {
                        int i2 = i - 1;
                        rk2.d = i2;
                        fu4 fu4 = rk2.g;
                        if (fu4 != null) {
                            fu4.k(i2, rk2.k);
                        }
                        fu4 fu42 = rk2.g;
                        if (fu42 != null) {
                            fu42.m((he9) rk2.f.get(rk2.d - 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (searchMessageBottomWidget.w) {
                    rk2 rk22 = (rk2) searchMessageBottomWidget.g0().o.c;
                    int i3 = rk22.d + 1;
                    ArrayList arrayList = rk22.f;
                    if (i3 <= arrayList.size()) {
                        int i4 = rk22.d + 1;
                        rk22.d = i4;
                        fu4 fu43 = rk22.g;
                        if (fu43 != null) {
                            fu43.k(i4, rk22.k);
                        }
                        fu4 fu44 = rk22.g;
                        if (fu44 != null) {
                            fu44.m((he9) arrayList.get(rk22.d - 1));
                        }
                        if (rk22.d + 1 <= arrayList.size() && rk22.g != null) {
                            he9 he9 = (he9) arrayList.get(rk22.d - 1);
                        }
                    }
                    String str = rk22.c;
                    if (rk22.h && arrayList.size() - rk22.d < 5 && rk22.j != 0 && str != null && str.length() != 0) {
                        z68.c("rk2", "Search for next messages", new Object[0]);
                        rk22.h = false;
                        ev0.v(rk22.e, (CoroutineContext) null, (f14) null, new pk2(rk22, str, rk22.j, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
