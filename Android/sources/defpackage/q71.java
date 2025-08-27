package defpackage;

import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: q71  reason: default package */
public final class q71 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallHistoryScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q71(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.b = callHistoryScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        q71 q71 = new q71(continuation, this.b);
        q71.a = obj;
        return q71;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q71) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        aq1 aq1 = (aq1) this.a;
        KProperty[] kPropertyArr = CallHistoryScreen.y0;
        CallHistoryScreen callHistoryScreen = this.b;
        callHistoryScreen.getClass();
        KProperty[] kPropertyArr2 = CallHistoryScreen.y0;
        ((iz0) callHistoryScreen.y.getValue(callHistoryScreen, kPropertyArr2[4])).setVisibility(aq1.b ? 0 : 8);
        iz0 iz0 = (iz0) callHistoryScreen.z.getValue(callHistoryScreen, kPropertyArr2[5]);
        boolean z = aq1.b;
        List list = aq1.a;
        iz0.setVisibility((!z && list.isEmpty()) ? 8 : 0);
        callHistoryScreen.Y.a = list;
        ViewPager2 c0 = callHistoryScreen.c0();
        g71 g71 = callHistoryScreen.Z;
        if (!g71.v0.isEmpty() || !(!list.isEmpty())) {
            sz0 sz0 = new sz0((Object) g71, (Object) list, (Object) h88.h(new c71(0, g71.v0, list)), 1);
            j6 j6Var = new j6(18, g71);
            if (c0.isInLayout()) {
                c0.post(new uy0(g71, c0, 0, sz0, j6Var, 1));
            } else {
                sz0.invoke();
            }
        } else {
            g71.v0 = list;
            g71.o(0, list.size());
        }
        Collection collection = list;
        ((c2b) callHistoryScreen.w.getValue(callHistoryScreen, kPropertyArr2[2])).setVisibility(collection.isEmpty() ^ true ? 0 : 8);
        callHistoryScreen.c0().setVisibility(collection.isEmpty() ^ true ? 0 : 8);
        boolean isEmpty = list.isEmpty();
        boolean z2 = callHistoryScreen.requireView().findViewById(igc.call_history_empty) != null;
        ReadOnlyProperty readOnlyProperty = callHistoryScreen.X;
        if (isEmpty) {
            if (!z2) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) callHistoryScreen.o.getValue(callHistoryScreen, kPropertyArr2[0]);
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(callHistoryScreen.getContext(), (AttributeSet) null);
                oneMeEmptyView.setId(igc.call_history_empty);
                wz3 wz3 = new wz3(-1, -1);
                wz3.b(new AppBarLayout.ScrollingViewBehavior());
                oneMeEmptyView.setLayoutParams(wz3);
                oneMeEmptyView.setIcon(cad.f0);
                oneMeEmptyView.setTitle(new igf(vkc.call_history_call_history_empty_title));
                oneMeEmptyView.setSubtitle(new igf(vkc.call_history_call_history_empty_subtitle));
                if (!((Boolean) callHistoryScreen.d0().v.getValue()).booleanValue()) {
                    oneMeEmptyView.M(oneMeEmptyView.getContext().getString(vkc.call_history_call_contact_action), new p71(1));
                }
                h88.f(oneMeEmptyView, new yh7((jdb) null, new nr0(jdb.o, mr0.b, true), 1), (Function1) null);
                oneMeEmptyView.setVisibility(8);
                y7e.c(coordinatorLayout, oneMeEmptyView, -1);
            }
            ((OneMeEmptyView) readOnlyProperty.getValue(callHistoryScreen, kPropertyArr2[6])).setVisibility(0);
        } else if (z2) {
            ((OneMeEmptyView) readOnlyProperty.getValue(callHistoryScreen, kPropertyArr2[6])).setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
