package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ckd  reason: default package */
public final /* synthetic */ class ckd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c73 b;

    public /* synthetic */ ckd(c73 c73, int i) {
        this.a = i;
        this.b = c73;
    }

    public final Object invoke(Object obj, Object obj2) {
        ykd ykd = (ykd) obj;
        View view = (View) obj2;
        switch (this.a) {
            case 0:
                ((ChatsListSearchScreen) ((dkd) this.b.w)).f0(ykd, view);
                return Unit.INSTANCE;
            default:
                ((ChatsListSearchScreen) ((dkd) this.b.w)).f0(ykd, view);
                return Unit.INSTANCE;
        }
    }
}
