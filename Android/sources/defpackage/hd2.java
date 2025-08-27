package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: hd2  reason: default package */
public final class hd2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaDownloadBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hd2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.b = chatMediaDownloadBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hd2 hd2 = new hd2(continuation, this.b);
        hd2.a = obj;
        return hd2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hd2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        yr4 yr4 = (yr4) this.a;
        boolean z = yr4 instanceof xr4;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.b;
        if (z) {
            chatMediaDownloadBottomSheet.i0(false);
            xr4 xr4 = (xr4) yr4;
            Uri uri = xr4.a;
            sr4 sr4 = xr4.b;
            switch (sr4.ordinal()) {
                case 0:
                    if (uri != null) {
                        String str = hsg.n;
                        o9a o9a = sq9.b;
                        hsg.F(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        break;
                    }
                    break;
                case 1:
                    chatMediaDownloadBottomSheet.q0(hlc.media_share_dialog_download_video_success, cad.o);
                    break;
                case 2:
                case 4:
                    if (uri != null) {
                        String str2 = hsg.n;
                        o9a o9a2 = sq9.b;
                        hsg.F(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        break;
                    }
                    break;
                case 3:
                case 5:
                    chatMediaDownloadBottomSheet.q0(sr4 == sr4.x ? hlc.media_share_dialog_download_gif_success : hlc.media_share_dialog_download_photo_success, cad.o);
                    break;
                case 6:
                    if (uri != null) {
                        String str3 = hsg.n;
                        hsg.F(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        break;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (yr4 instanceof wr4) {
            int i = ((wr4) yr4).a;
            int i2 = cad.K;
            KProperty[] kPropertyArr = ChatMediaDownloadBottomSheet.C0;
            chatMediaDownloadBottomSheet.q0(i, i2);
            chatMediaDownloadBottomSheet.i0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        el4 el4 = chatMediaDownloadBottomSheet.z0;
        if (el4 != null) {
            el4.a();
        }
        return Unit.INSTANCE;
    }
}
