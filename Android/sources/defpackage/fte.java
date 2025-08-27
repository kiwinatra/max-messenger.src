package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: fte  reason: default package */
public final class fte extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fte(Continuation continuation, StickersScreen stickersScreen, View view) {
        super(2, continuation);
        this.b = stickersScreen;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fte fte = new fte(continuation, this.b, this.c);
        fte.a = obj;
        return fte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fte) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        StickersScreen stickersScreen = this.b;
        ete ete = stickersScreen.a;
        ete ete2 = ete.SET;
        View view = this.c;
        Integer num = null;
        if (ete == ete2) {
            sn0 sn0 = stickersScreen.x;
            if (!sn0.isInitialized()) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    f6e.c(viewGroup, (View) sn0.getValue(), -1);
                }
                View view2 = (View) sn0.getValue();
                u3b.a(view2, new uj6(24, view2, stickersScreen));
            }
        }
        stickersScreen.X.G(list);
        boolean isEmpty = list.isEmpty();
        sn0 sn02 = stickersScreen.w;
        if (isEmpty) {
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                f6e.c(viewGroup2, (View) sn02.getValue(), -1);
            }
            if (sn02.isInitialized()) {
                lse lse = (lse) sn02.getValue();
                ete ete3 = ete.RECENT;
                ete ete4 = stickersScreen.a;
                lse.setTitle(ete4 == ete3 ? n1b.c : n1b.a);
                if (ete4 == ete3) {
                    num = Integer.valueOf(n1b.b);
                }
                lse.setSubtitle(num);
                lse.setIcon(l1b.b);
            }
            ((View) sn02.getValue()).setVisibility(0);
            stickersScreen.c0().setVisibility(8);
            stickersScreen.d0().setRightActions(s2b.a);
        } else {
            stickersScreen.c0().setVisibility(0);
            h88.D(sn02);
            stickersScreen.d0().setRightActions(new w2b(new hq7(17, (Object) stickersScreen)));
        }
        return Unit.INSTANCE;
    }
}
