package defpackage;

import androidx.recyclerview.widget.a;
import com.google.android.material.tabs.TabLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: m8a  reason: default package */
public final class m8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m8a m8a = new m8a(continuation, this.b);
        m8a.a = obj;
        return m8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        r7a r7a = (r7a) this.a;
        Integer num = r7a.b;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        if (num != null && num.intValue() >= 0) {
            KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
            neuroAvatarsScreen.d0().G0();
            neuroAvatarsScreen.H0.c = true;
            d8a d8a = new d8a(neuroAvatarsScreen.getContext(), 0);
            d8a.a = num.intValue();
            a layoutManager = neuroAvatarsScreen.d0().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.I0(d8a);
            }
        }
        int i = r7a.a;
        if (i >= 0) {
            KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
            if (neuroAvatarsScreen.g0().getSelectedTabPosition() != i) {
                neuroAvatarsScreen.g0().stopNestedScroll();
                o8f h = neuroAvatarsScreen.g0().h(i);
                if (h != null) {
                    TabLayout tabLayout = h.g;
                    if (tabLayout != null) {
                        tabLayout.m(h, true);
                    } else {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
