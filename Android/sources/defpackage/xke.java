package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webview.FaqWebViewWidget;

/* renamed from: xke  reason: default package */
public final /* synthetic */ class xke implements ya4 {
    public final /* synthetic */ int a;

    public /* synthetic */ xke(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new ChatTitleIconScreen((long[]) null, zke.CHANNEL);
            case 1:
                return new StickersSettingsScreen();
            case 2:
                return new StickersScreen(ete.RECENT, 0, 2, (DefaultConstructorMarker) null);
            case 3:
                return new StickersScreen(ete.FAVORITE, 0, 2, (DefaultConstructorMarker) null);
            default:
                return new FaqWebViewWidget();
        }
    }
}
