package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgDeleteChat extends FrgDlgChecked<eh6> {
    public static FrgDlgDeleteChat f3(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        FrgDlgDeleteChat frgDlgDeleteChat = new FrgDlgDeleteChat();
        frgDlgDeleteChat.L2(bundle);
        return frgDlgDeleteChat;
    }

    public final Dialog V2(Bundle bundle) {
        a32 G = ((qra) ym.e()).l().G(F2().getLong("ru.ok.tamtam.extra.CHAT_ID"));
        cg8 q = new cg8(G2()).q(G.K() ? S1(qad.f5) : (!G.L() || !G.e0()) ? S1(qad.i5) : S1(qad.j5));
        q.a.f = ((qra) ym.e()).v().k.c(G.K() ? T1(qad.J0, G.r()) : G.N() ? T1(qad.i8, G.m().f()) : G.e0() ? T1(qad.h8, G.r()) : T1(qad.g8, G.r()));
        q.m(S1(qad.m0), new e10(1));
        q.k(S1(qad.W1), new d10(6, (Object) this));
        return q.g();
    }

    public final Class c3() {
        return eh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgDeleteChat";
    }
}
