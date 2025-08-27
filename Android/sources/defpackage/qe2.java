package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: qe2  reason: default package */
public final class qe2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qe2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.b = chatMediaListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qe2 qe2 = new qe2(continuation, this.b);
        qe2.a = obj;
        return qe2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qe2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mf2 mf2 = (mf2) this.a;
        e9d e9d = null;
        if (mf2 instanceof ff2) {
            r4c r4c = r4c.b;
            ff2 ff2 = (ff2) mf2;
            long j = ff2.b;
            ta4 W0 = r4c.W0();
            StringBuilder n = tr1.n(j, ":attach/viewer?chat_id=", "&attach_id=");
            n.append(ff2.d);
            n.append("&msg_id=");
            n.append(ff2.c);
            n.append("&single=");
            n.append(ff2.e);
            n.append("&desc=true");
            W0.b(n.toString(), (Bundle) null);
        } else if (mf2 instanceof gf2) {
            r4c r4c2 = r4c.b;
            gf2 gf2 = (gf2) mf2;
            Parcelable parcelable = gf2.b;
            r4c2.getClass();
            Bundle f = o54.f(TuplesKt.to("message", parcelable));
            ta4 W02 = r4c2.W0();
            W02.b(":attach/fullscreen?attachment_id=" + gf2.c + "&single_attach=" + gf2.d + "&desc_order=true", f);
        } else {
            boolean z = mf2 instanceof hf2;
            ChatMediaListWidget chatMediaListWidget = this.b;
            if (z) {
                gsg.s(chatMediaListWidget.getContext(), 0, ((hf2) mf2).b);
            } else if (mf2 instanceof if2) {
                r4c r4c3 = r4c.b;
                if2 if2 = (if2) mf2;
                long j2 = if2.b;
                ta4 W03 = r4c3.W0();
                StringBuilder n2 = tr1.n(j2, ":chats?id=", "&type=local&message_id=");
                n2.append(if2.c);
                W03.b(n2.toString(), (Bundle) null);
            } else if (mf2 instanceof kf2) {
                gsg.B(chatMediaListWidget.getContext(), ((kf2) mf2).b);
            } else if (mf2 instanceof df2) {
                b59.k(chatMediaListWidget.getContext(), ((df2) mf2).b);
            } else if (mf2 instanceof jf2) {
                r4c r4c4 = r4c.b;
                jf2 jf2 = (jf2) mf2;
                Long l = jf2.b;
                List listOf = CollectionsKt.listOf(Boxing.boxLong(jf2.c));
                if (l != null) {
                    ta4 W04 = r4c4.W0();
                    String p = CollectionsKt___CollectionsKt.joinToString$default(listOf, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    W04.b(":chats/forward?messages_ids=" + p + "&attach_id=" + l + "&is_forward_attach=" + jf2.d, (Bundle) null);
                } else {
                    ta4 W05 = r4c4.W0();
                    String p2 = CollectionsKt___CollectionsKt.joinToString$default(listOf, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    W05.b(":chats/forward?messages_ids=" + p2, (Bundle) null);
                }
            } else if (mf2 instanceof ef2) {
                try {
                    chatMediaListWidget.getContext().startActivity(((ef2) mf2).b);
                } catch (Exception unused) {
                    ef2 ef2 = (ef2) mf2;
                    ef2.b.setDataAndType(ef2.c, "*/*");
                    chatMediaListWidget.getContext().startActivity(ef2.b);
                }
            } else if (mf2 instanceof lf2) {
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                lf2 lf2 = (lf2) mf2;
                ngf ngf = lf2.c;
                m29 m29 = lf2.b;
                ng3 a2 = b0h.a(ngf, o54.f(TuplesKt.to("selected_message_id", Boxing.boxLong(m29.m())), TuplesKt.to("selected_attach_id", Boxing.boxLong(m29.j()))), 4);
                a2.f(lf2.d);
                for (pg3 pg3 : lf2.e) {
                    a2.a(pg3);
                }
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(chatMediaListWidget);
                zx3 zx3 = chatMediaListWidget;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(chatMediaListWidget);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
