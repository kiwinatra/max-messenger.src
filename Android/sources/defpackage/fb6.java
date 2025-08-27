package defpackage;

import kotlin.reflect.KProperty;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.arch.Widget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: fb6  reason: default package */
public final class fb6 implements oq7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ fb6(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void k() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                sn0 sn0 = ((ForwardPickerScreen) widget).z0;
                if (sn0.isInitialized()) {
                    ((dc9) sn0.getValue()).e(false);
                    return;
                }
                return;
            case 1:
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                ((MediaBarWidget) widget).m0().e(false);
                return;
            case 2:
                sn0 sn02 = ((PickerChatController) widget).X;
                if (sn02.isInitialized()) {
                    ((dc9) sn02.getValue()).e(false);
                    return;
                }
                return;
            default:
                sn0 sn03 = ((ShareDataPickerScreen) widget).Z;
                if (sn03.isInitialized()) {
                    ((dc9) sn03.getValue()).e(false);
                    return;
                }
                return;
        }
    }
}
