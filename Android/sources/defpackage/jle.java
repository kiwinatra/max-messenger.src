package defpackage;

import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: jle  reason: default package */
public final class jle implements mza {
    public final /* synthetic */ StartConversationScreen a;

    public jle(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    public final void C(CharSequence charSequence) {
        KProperty[] kPropertyArr = StartConversationScreen.E0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        KProperty[] kPropertyArr2 = StartConversationScreen.E0;
        KProperty kProperty = kPropertyArr2[0];
        startConversationScreen.c.b(startConversationScreen, Boolean.TRUE);
        KProperty kProperty2 = kPropertyArr2[1];
        startConversationScreen.o.b(startConversationScreen, charSequence);
        rle d0 = startConversationScreen.d0();
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((tz9) d0.z.g.getValue()).setValue(obj);
    }

    public final void L() {
        KProperty[] kPropertyArr = StartConversationScreen.E0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        KProperty kProperty = StartConversationScreen.E0[2];
        startConversationScreen.v.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.D0.f(false);
    }

    public final void l() {
        KProperty[] kPropertyArr = StartConversationScreen.E0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        KProperty kProperty = StartConversationScreen.E0[2];
        startConversationScreen.v.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.D0.f(true);
    }
}
