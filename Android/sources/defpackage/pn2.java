package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: pn2  reason: default package */
public final class pn2 implements mza {
    public final /* synthetic */ ChatScreen a;

    public pn2(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    public final void C(CharSequence charSequence) {
        KProperty[] kPropertyArr = ChatScreen.d1;
        fu4 fu4 = this.a.v0().o;
        fu4.getClass();
        if (charSequence != null) {
            charSequence.toString();
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str = obj;
        rk2 rk2 = (rk2) fu4.c;
        rk2.getClass();
        z68.c("rk2", "Search text changed ".concat(str), new Object[0]);
        rk2.a();
        rk2.c = str;
        if (str.length() == 0) {
            fu4 fu42 = rk2.g;
            if (fu42 != null) {
                fu42.n();
                return;
            }
            return;
        }
        ev0.v(rk2.e, (CoroutineContext) null, (f14) null, new pk2(rk2, str, 0, (Continuation) null), 3);
    }

    public final void L() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            if (chatScreen.z0().c()) {
                chatScreen.z0().postDelayed(new pr1(12, chatScreen), 200);
            } else {
                chatScreen.z0().g(true);
            }
            chatScreen.v0().j();
        }
    }

    public final void d() {
        KProperty[] kPropertyArr = ChatScreen.d1;
        this.a.z0().g(false);
    }

    public final void l() {
        KProperty[] kPropertyArr = ChatScreen.d1;
        this.a.v0().k(true);
    }
}
