package defpackage;

import android.os.Bundle;
import android.util.AttributeSet;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: uw2  reason: default package */
public final /* synthetic */ class uw2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ uw2(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    public final Object invoke() {
        boolean z = true;
        ChatsListWidget chatsListWidget = this.b;
        switch (this.a) {
            case 0:
                if (Intrinsics.areEqual((Object) chatsListWidget.b, (Object) "all.chat.folder")) {
                    return (cp3) gt3.a.getAccessor().g(cp3.class);
                }
                cp3.a.getClass();
                return bp3.b;
            case 1:
                KProperty[] kPropertyArr = ChatsListWidget.I0;
                return chatsListWidget.getRouter();
            case 2:
                KProperty[] kPropertyArr2 = ChatsListWidget.I0;
                String str = chatsListWidget.b;
                oq2 oq2 = new oq2(3);
                ((fd4) yh0.a.getAccessor().g(fd4.class)).getClass();
                return new ry2(str, oq2);
            case 3:
                KProperty[] kPropertyArr3 = ChatsListWidget.I0;
                if (((ss2) chatsListWidget.f0().D0.getValue()).b && !chatsListWidget.e0().Q0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                KProperty[] kPropertyArr4 = ChatsListWidget.I0;
                return new tw2((cp3) chatsListWidget.v.getValue(), chatsListWidget.b, (lf1) chatsListWidget.F0.getValue());
            case 5:
                KProperty[] kPropertyArr5 = ChatsListWidget.I0;
                return new wh0(LazyKt.lazy(new uw2(chatsListWidget, 2)), false, (zp3) null, 62);
            case 6:
                KProperty[] kPropertyArr6 = ChatsListWidget.I0;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(chatsListWidget.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.D0);
                oneMeEmptyView.setTitle(new igf(clc.chats_list_empty_state_title));
                u3b.a(oneMeEmptyView, new cf(11, oneMeEmptyView, chatsListWidget));
                return oneMeEmptyView;
            case 7:
                KProperty[] kPropertyArr7 = ChatsListWidget.I0;
                ox2 ox2 = ox2.b;
                String str2 = chatsListWidget.b;
                ox2.W0().b(":settings/folder/members-picker?folder_id=" + str2, (Bundle) null);
                return Unit.INSTANCE;
            case 8:
                KProperty[] kPropertyArr8 = ChatsListWidget.I0;
                return new lf1(LazyKt.lazy(new uw2(chatsListWidget, 1)), new eng(chatsListWidget, 0));
            default:
                KProperty[] kPropertyArr9 = ChatsListWidget.I0;
                return new eu2(chatsListWidget.e0(), new uw2(chatsListWidget, 3));
        }
    }
}
