package defpackage;

import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: fle  reason: default package */
public final /* synthetic */ class fle implements uo3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ fle(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    public final boolean c(int i) {
        boolean z = false;
        StartConversationScreen startConversationScreen = this.b;
        switch (this.a) {
            case 0:
                if (i != startConversationScreen.w0.j() + startConversationScreen.A0.j() + startConversationScreen.v0.j()) {
                    if (i != startConversationScreen.C0.j()) {
                        return false;
                    }
                    CharSequence c0 = startConversationScreen.c0();
                    if (!(c0 == null || c0.length() == 0)) {
                        return false;
                    }
                }
                return true;
            default:
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                CharSequence c02 = startConversationScreen.c0();
                if (c02 == null || c02.length() == 0) {
                    z = true;
                }
                return !z;
        }
    }
}
