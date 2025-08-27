package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.devmenu.server.ServerHostBottomSheet;

/* renamed from: utd  reason: default package */
public final class utd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ServerHostBottomSheet b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public utd(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet, View view) {
        super(2, continuation);
        this.b = serverHostBottomSheet;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        utd utd = new utd(continuation, this.b, this.c);
        utd.a = obj;
        return utd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((utd) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a37 a37 = (a37) this.a;
        boolean z = a37 instanceof x27;
        ServerHostBottomSheet serverHostBottomSheet = this.b;
        if (z) {
            kr7.z(serverHostBottomSheet);
            serverHostBottomSheet.i0(true);
        } else {
            boolean z2 = a37 instanceof y27;
            View view = this.c;
            if (z2) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.x0);
                KProperty[] kPropertyArr = ServerHostBottomSheet.E0;
                ((RecyclerView) serverHostBottomSheet.z0.getValue(serverHostBottomSheet, kPropertyArr[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.B0.getValue(serverHostBottomSheet, kPropertyArr[2])).setVisibility(0);
                h2b h2b = (h2b) serverHostBottomSheet.C0.getValue(serverHostBottomSheet, kPropertyArr[3]);
                String str = ((y27) a37).a;
                if (str == null) {
                    str = "";
                }
                h2b.setText(str);
            } else if (a37 instanceof z27) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.x0);
                KProperty[] kPropertyArr2 = ServerHostBottomSheet.E0;
                ((RecyclerView) serverHostBottomSheet.z0.getValue(serverHostBottomSheet, kPropertyArr2[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.B0.getValue(serverHostBottomSheet, kPropertyArr2[2])).setVisibility(8);
                ((aya) serverHostBottomSheet.A0.getValue(serverHostBottomSheet, kPropertyArr2[1])).setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
