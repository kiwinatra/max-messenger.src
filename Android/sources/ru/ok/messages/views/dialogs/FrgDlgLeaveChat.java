package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.os.Bundle;

public class FrgDlgLeaveChat extends FrgDlgChecked<kh6> {
    public static FrgDlgLeaveChat f3(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.CHAT_ID", j);
        FrgDlgLeaveChat frgDlgLeaveChat = new FrgDlgLeaveChat();
        frgDlgLeaveChat.L2(bundle);
        return frgDlgLeaveChat;
    }

    public final Dialog V2(Bundle bundle) {
        a32 G = ((qra) ym.e()).l().G(F2().getLong("ru.ok.tamtam.extra.CHAT_ID"));
        cg8 q = new cg8(G2()).q(G.K() ? S1(qad.ha) : S1(qad.o9));
        q.a.f = ((qra) ym.e()).v().k.c(G.K() ? T1(qad.D0, G.r()) : T1(qad.f8, G.r()));
        q.m(S1(qad.m0), new jh6(this, 0));
        q.k(G.K() ? S1(qad.ha) : S1(qad.o9), new jh6(this, 1));
        return q.g();
    }

    public final Class c3() {
        return kh6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgLeaveChat";
    }
}
