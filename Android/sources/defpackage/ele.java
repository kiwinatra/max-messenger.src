package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: ele  reason: default package */
public final /* synthetic */ class ele implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ ele(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final Object invoke(Object obj) {
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                fma onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj).intValue();
                int j = startConversationScreen.A0.j() + startConversationScreen.v0.j();
                int j2 = startConversationScreen.w0.j() + j;
                t56 t56 = startConversationScreen.x0;
                int j3 = t56.j() + j2;
                int j4 = startConversationScreen.B0.j();
                CharSequence c0 = startConversationScreen.c0();
                if (!(!(c0 == null || c0.length() == 0)) && intValue >= j && intValue >= j2 && intValue >= j4 && intValue < j3) {
                    return ((zo3) ((lz7) t56.E(intValue - j2))).b;
                }
                return null;
        }
    }
}
