package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: id2  reason: default package */
public final class id2 extends qa {
    public final /* synthetic */ ChatMediaDownloadBottomSheet d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public id2(ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(chatMediaDownloadBottomSheet, 1);
        this.d = chatMediaDownloadBottomSheet;
    }

    public final void k() {
        KProperty[] kPropertyArr = ChatMediaDownloadBottomSheet.C0;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.d;
        bs0.K(new ps5(ct.k(((wd2) chatMediaDownloadBottomSheet.w0.getValue()).Y, chatMediaDownloadBottomSheet.getViewLifecycleOwner().getLifecycle(), iu7.v), new hd2((Continuation) null, chatMediaDownloadBottomSheet), 5), chatMediaDownloadBottomSheet.getViewLifecycleScope());
    }
}
