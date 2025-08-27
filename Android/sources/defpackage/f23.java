package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;

/* renamed from: f23  reason: default package */
public final /* synthetic */ class f23 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClearRecentSearchBottomSheet b;

    public /* synthetic */ f23(ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, int i) {
        this.a = i;
        this.b = clearRecentSearchBottomSheet;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = this.b;
                clearRecentSearchBottomSheet.i0(true);
                zx3 targetController = clearRecentSearchBottomSheet.getTargetController();
                e23 e23 = targetController instanceof e23 ? (e23) targetController : null;
                if (e23 != null) {
                    ov2 d0 = ((ChatsListSearchScreen) e23).d0();
                    aje aje = d0.M0;
                    if (aje == null || !aje.isActive()) {
                        d0.M0 = ev0.v(d0.a, d0.J0, (f14) null, new wu2(d0, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            default:
                this.b.i0(true);
                return;
        }
    }
}
