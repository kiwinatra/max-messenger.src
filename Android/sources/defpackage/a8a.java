package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: a8a  reason: default package */
public final /* synthetic */ class a8a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ a8a(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final Object invoke() {
        String str = null;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
                x8a h0 = neuroAvatarsScreen.h0();
                h0.o.a((dqd) null);
                h0.b.i.setValue((Object) null);
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
                OneMeAvatarView f0 = neuroAvatarsScreen.f0();
                etc etc = neuroAvatarsScreen.h0().Y;
                fqd fqd = ((gqd) etc.a.getValue()).a;
                rnb rnb = ((gqd) etc.a.getValue()).b;
                dqd dqd = fqd instanceof dqd ? (dqd) fqd : null;
                Long valueOf = dqd != null ? Long.valueOf(dqd.c) : null;
                pnb pnb = rnb instanceof pnb ? (pnb) rnb : null;
                boolean areEqual = Intrinsics.areEqual((Object) valueOf, (Object) pnb != null ? Long.valueOf(pnb.b) : null);
                boolean z = true;
                boolean z2 = !areEqual;
                eqd eqd = fqd instanceof eqd ? (eqd) fqd : null;
                String str2 = eqd != null ? eqd.a : null;
                qnb qnb = rnb instanceof qnb ? (qnb) rnb : null;
                if (qnb != null) {
                    str = qnb.a;
                }
                boolean z3 = !Intrinsics.areEqual((Object) str2, (Object) str);
                if (fqd == null || (!z3 && !z2)) {
                    z = false;
                }
                f0.setCloseBadgeVisibility(z);
                return Unit.INSTANCE;
            case 2:
                KProperty[] kPropertyArr3 = NeuroAvatarsScreen.K0;
                return neuroAvatarsScreen.e0() != null ? jgd.AUTH_AVATARS : jgd.SETTINGS_PROFILE_AVATARS;
            case 3:
                KProperty[] kPropertyArr4 = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.getClass();
                KProperty kProperty = NeuroAvatarsScreen.K0[11];
                f0d e0 = neuroAvatarsScreen.e0();
                Lazy lazy = LazyKt.lazy(new a8a(neuroAvatarsScreen, 5));
                n88 n88 = n88.a;
                n88.getClass();
                return new x8a((Long) neuroAvatarsScreen.D0.a(neuroAvatarsScreen), e0, lazy, LazyKt.lazy(new ck7(17)), LazyKt.lazy(new ck7(14)), n88.getAccessor().h(gaf.class), n88.getAccessor().h(rh3.class));
            case 4:
                KProperty[] kPropertyArr5 = NeuroAvatarsScreen.K0;
                return ew3.b(neuroAvatarsScreen.getContext(), cad.h0);
            default:
                KProperty[] kPropertyArr6 = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.getClass();
                KProperty kProperty2 = NeuroAvatarsScreen.K0[10];
                return new u7a((ytb) neuroAvatarsScreen.C0.a(neuroAvatarsScreen));
        }
    }
}
