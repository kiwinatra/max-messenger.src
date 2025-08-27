package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ym2  reason: default package */
public final class ym2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ym2 ym2 = new ym2(continuation, this.b);
        ym2.a = obj;
        return ym2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ym2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        View videoMessageRecordAnchor;
        Activity d;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xvc xvc = (xvc) this.a;
        boolean z = xvc instanceof svc;
        int i = 0;
        ChatScreen chatScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = ChatScreen.d1;
            chatScreen.B0().u((CharSequence) null, chatScreen.q0().l(), CollectionsKt.listOf(((svc) xvc).a), false);
            chatScreen.C0();
            qc7 qc7 = (qc7) un2.a.getAccessor().j(qc7.class);
            if (qc7 != null) {
                qc7.f(SetsKt.setOf(new pc7(nc7.SEND_AUDIO_MESSAGE, 1)), jgd.CHAT);
            }
        } else if (xvc instanceof vvc) {
            ChatScreen.G0(chatScreen, (Integer) null, String.valueOf(((vvc) xvc).a.a(chatScreen.getContext())), (Integer) null, (Integer) null, 13);
        } else if (xvc instanceof uvc) {
            wn2 wn2 = wn2.b;
            if (!wn2.W0().d() && (d = ((bta) wn2.W0().a()).e().x().d()) != null) {
                d.finish();
            }
        } else if (xvc instanceof wvc) {
            KProperty[] kPropertyArr2 = ChatScreen.d1;
            MessageWriteWidget r0 = chatScreen.r0();
            if (r0 != null) {
                wvc wvc = (wvc) xvc;
                int[] iArr = new int[2];
                int ordinal = wvc.a.ordinal();
                if (ordinal == 0) {
                    videoMessageRecordAnchor = r0.d0().getVideoMessageRecordAnchor();
                } else if (ordinal == 1) {
                    videoMessageRecordAnchor = r0.d0().getAudioRecordAnchor();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                View view = videoMessageRecordAnchor;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    int e = a81.e((float) 18, vo4.c().getDisplayMetrics().density, (hi7.v(r0.getContext()) - iArr[0]) - (view.getWidth() / 2));
                    WindowInsets rootWindowInsets = r0.requireView().getRootWindowInsets();
                    int i2 = rootWindowInsets != null ? iog.g((View) null, rootWindowInsets).a.f(7).d : 0;
                    int i3 = pq7.a;
                    if (pq7.b(pq7.c)) {
                        i = pq7.a(r0.getContext());
                    }
                    Point point = new Point(e, (r0.d0().getHeight() - MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)) + i2 + i);
                    ymf ymf = r0.B0;
                    if (ymf == null || !ymf.isShowing()) {
                        ymf ymf2 = r0.B0;
                        if (ymf2 != null) {
                            ymf2.dismiss();
                        }
                        ymf ymf3 = new ymf(r0.getContext(), view, (Function0) new h49(4), (Function0) null, wmf.b, vmf.b, 8);
                        ymf3.d(wvc.b);
                        ymf3.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        ymf3.setOnDismissListener(new w01(5, r0));
                        r0.B0 = ymf3;
                    } else {
                        ymf ymf4 = r0.B0;
                        if (ymf4 != null) {
                            ymf4.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        }
                    }
                }
            }
        } else if (xvc instanceof tvc) {
            KProperty[] kPropertyArr3 = ChatScreen.d1;
            lp2 B0 = chatScreen.B0();
            boolean z2 = ((tvc) xvc).a;
            a32 a32 = (a32) B0.Q0.a.getValue();
            if (a32 != null) {
                long j = a32.b.a;
                Lazy lazy = B0.B0;
                if (z2) {
                    d6b d6b = (d6b) lazy.getValue();
                    d6b.getClass();
                    if (j != 0) {
                        d6b.f(j, b10.AUDIO, -1);
                    }
                } else {
                    d6b d6b2 = (d6b) lazy.getValue();
                    if (j == 0) {
                        d6b2.getClass();
                    } else {
                        d6b2.getClass();
                        d6b.b(j, -1);
                    }
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
