package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: tl8  reason: default package */
public final class tl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tl8 tl8 = new tl8(continuation, this.b);
        tl8.a = obj;
        return tl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wbc wbc = (wbc) this.a;
        boolean z = wbc instanceof tbc;
        MediaBarWidget mediaBarWidget = this.b;
        if (z) {
            tbc tbc = (tbc) wbc;
            d48 d48 = tbc.a;
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mediaBarWidget.s0(d48, tbc.b, "SELECTED_MEDIA_ALBUM");
        } else if (wbc instanceof vbc) {
            KProperty[] kPropertyArr2 = MediaBarWidget.c1;
            ((edb) mediaBarWidget.c.getValue()).h(new eng(mediaBarWidget, 1));
        } else if (wbc instanceof ubc) {
            KProperty[] kPropertyArr3 = MediaBarWidget.c1;
            edb edb = (edb) mediaBarWidget.c.getValue();
            eng eng = new eng(mediaBarWidget, 1);
            edb.getClass();
            String[] strArr = edb.h;
            int i = bmc.permissions_audio_for_video_request;
            int i2 = aza.a;
            int i3 = aza.e;
            if (edb.i(eng, strArr)) {
                eng.c(strArr, 171, i2, i, i3);
            } else {
                edb.f(eng, strArr, 171);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
