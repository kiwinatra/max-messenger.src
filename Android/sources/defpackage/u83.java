package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: u83  reason: default package */
public final class u83 {
    public final /* synthetic */ CommonChatsViewModel a;

    public u83(CommonChatsViewModel commonChatsViewModel) {
        this.a = commonChatsViewModel;
    }

    @oye
    public final void onAddChatEvent(fa faVar) {
        CommonChatsViewModel commonChatsViewModel = this.a;
        if (!commonChatsViewModel.o.contains(Long.valueOf(faVar.b))) {
            ev0.v(b0h.C(commonChatsViewModel), ((osa) commonChatsViewModel.i).a(), (f14) null, new p83(commonChatsViewModel, faVar, (Continuation) null), 2);
        }
    }

    @oye
    public final void onChatMembersUpdateEvent(dk2 dk2) {
        List list = dk2.b;
        CommonChatsViewModel commonChatsViewModel = this.a;
        if (list.contains(Long.valueOf(commonChatsViewModel.c)) && commonChatsViewModel.o.contains(Long.valueOf(dk2.o))) {
            ev0.v(b0h.C(commonChatsViewModel), ((osa) commonChatsViewModel.i).a(), (f14) null, new q83(dk2, commonChatsViewModel, (Continuation) null), 2);
        }
    }

    @oye
    public final void onIncomingMessageEvent(ke7 ke7) {
        CommonChatsViewModel commonChatsViewModel = this.a;
        if (commonChatsViewModel.o.contains(Long.valueOf(ke7.b)) && ke7.w) {
            ev0.v(b0h.C(commonChatsViewModel), ((osa) commonChatsViewModel.i).a(), (f14) null, new r83(commonChatsViewModel, ke7, (Continuation) null), 2);
        }
    }

    @oye
    public final void onLeaveChatEvent(rs7 rs7) {
        CommonChatsViewModel commonChatsViewModel = this.a;
        if (commonChatsViewModel.o.contains(Long.valueOf(rs7.b))) {
            ev0.v(b0h.C(commonChatsViewModel), ((osa) commonChatsViewModel.i).a(), (f14) null, new s83(commonChatsViewModel, rs7, (Continuation) null), 2);
        }
    }

    @oye
    public final void onRemoveChatEvent(c1d c1d) {
        CommonChatsViewModel commonChatsViewModel = this.a;
        if (commonChatsViewModel.o.contains(Long.valueOf(c1d.b))) {
            ev0.v(b0h.C(commonChatsViewModel), ((osa) commonChatsViewModel.i).a(), (f14) null, new t83(commonChatsViewModel, c1d, (Continuation) null), 2);
        }
    }
}
