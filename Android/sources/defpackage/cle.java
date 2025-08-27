package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: cle  reason: default package */
public final /* synthetic */ class cle implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ cle(StartConversationScreen startConversationScreen, RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = startConversationScreen;
        this.c = recyclerView;
    }

    public final Object invoke(Object obj) {
        RecyclerView recyclerView = this.c;
        StartConversationScreen startConversationScreen = this.b;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                CharSequence c0 = startConversationScreen.c0();
                if (c0 == null || c0.length() == 0) {
                    return null;
                }
                int l = startConversationScreen.C0.l(intValue);
                if (l == rra.m) {
                    return recyclerView.getResources().getString(ead.r0);
                }
                if (l == rra.p) {
                    return recyclerView.getResources().getString(ead.t0);
                }
                if (l == rra.s) {
                    return recyclerView.getResources().getString(ead.u0);
                }
                return null;
            default:
                int intValue2 = num.intValue();
                KProperty[] kPropertyArr2 = StartConversationScreen.E0;
                CharSequence c02 = startConversationScreen.c0();
                if (!(!(c02 == null || c02.length() == 0)) && startConversationScreen.C0.l(intValue2) == rra.s) {
                    return recyclerView.getResources().getString(g1b.x);
                }
                return null;
        }
    }
}
