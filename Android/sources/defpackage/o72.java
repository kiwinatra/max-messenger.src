package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.android.join.JoinChatWidget;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: o72  reason: default package */
public final /* synthetic */ class o72 implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ o72(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new ChatScreen(this.b);
            case 1:
                return new ChatScreen(this.b);
            case 2:
                return new ExternalCallbackWidget(o54.N("params", this.b));
            case 3:
                return new ly5(this.b, 0);
            case 4:
                return new ly5(this.b, 1);
            case 5:
                return new FolderEditScreen(o54.N("id", this.b));
            case 6:
                return new FolderEditScreen(o54.N("id", this.b));
            case 7:
                Bundle bundle = this.b;
                return new JoinChatWidget(o54.L("id", bundle), o54.N("link", bundle), bundle.getString("title"), o54.I("channel", bundle));
            case 8:
                Parcelable parcelable = this.b.getParcelable("link");
                if (parcelable != null) {
                    return new LinkInterceptorWidget((Uri) parcelable);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 9:
                return new PickerChatController(this.b);
            case 10:
                return new ShareDataPickerScreen(this.b);
            case 11:
                return new StickersSearchScreen(this.b);
            default:
                return new StickersShowcaseScreen(this.b);
        }
    }
}
