package defpackage;

import kotlin.jvm.internal.Intrinsics;
import one.me.android.root.RootController;
import one.me.chats.picker.ActChatPickerCompat;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;

/* renamed from: w5  reason: default package */
public final class w5 implements dy3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c(zx3 zx3, zx3 zx32, boolean z) {
    }

    private final void d(zx3 zx3, zx3 zx32, boolean z) {
    }

    private final void e(zx3 zx3, zx3 zx32, boolean z) {
    }

    public final void a(zx3 zx3, zx3 zx32, boolean z) {
        switch (this.a) {
            case 0:
                if (!z && zx3 == null && (zx32 instanceof PickerChatController)) {
                    ((ActChatPickerCompat) this.b).finish();
                    return;
                }
                return;
            case 1:
                if (zx3 instanceof u5a) {
                    ChatScreen chatScreen = (ChatScreen) this.b;
                    if (!Intrinsics.areEqual((Object) zx3, (Object) chatScreen)) {
                        z5a.g(chatScreen.o, ((u5a) zx3).m());
                        return;
                    }
                    return;
                }
                return;
            default:
                if (zx32 != null) {
                    RootController rootController = (RootController) this.b;
                    if (rootController.K().a.a.size() > 0 && (zx3 instanceof Widget) && !((Widget) zx3).isDialog()) {
                        rootController.K().C();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void b(zx3 zx3, zx3 zx32, boolean z) {
        int i = this.a;
    }
}
