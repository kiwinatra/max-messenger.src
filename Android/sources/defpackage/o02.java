package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: o02  reason: default package */
public final class o02 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChangeOwnerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o02(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.b = changeOwnerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o02 o02 = new o02(continuation, this.b);
        o02.a = obj;
        return o02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o02) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof b5c) {
            r4c.b.o1(((b5c) v5a).b);
        } else {
            boolean z = v5a instanceof c5c;
            e9d e9d = null;
            ChangeOwnerScreen changeOwnerScreen = this.b;
            if (z) {
                KProperty[] kPropertyArr = ChangeOwnerScreen.X;
                if (changeOwnerScreen.getRouter().e().size() == 1) {
                    i9d i9d = (i9d) CollectionsKt.firstOrNull(changeOwnerScreen.getRouter().e());
                    if (Intrinsics.areEqual((Object) i9d != null ? i9d.a : null, (Object) changeOwnerScreen)) {
                        r4c.b.t1();
                    }
                }
                r4c.b.W0().b(":chat-list", (Bundle) null);
            } else if (v5a instanceof r02) {
                r02 r02 = (r02) v5a;
                Bundle f = o54.f(TuplesKt.to("new_owner_id", Boxing.boxLong(r02.d)));
                KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(r02.b, f, 4);
                a2.f(r02.c);
                KProperty[] kPropertyArr3 = ChangeOwnerScreen.X;
                if (changeOwnerScreen.d0()) {
                    a2.b(jxa.q, new igf(lxa.i0));
                } else {
                    int i = jxa.q;
                    igf igf = new igf(lxa.g0);
                    Bundle bundle = a2.a;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList();
                    }
                    parcelableArrayList.add(new pg3(i, igf, og3.o));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                }
                a2.c(jxa.p, new igf(lxa.f0));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(changeOwnerScreen);
                zx3 zx3 = changeOwnerScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(changeOwnerScreen);
                if (e9d != null) {
                    i9d i9d2 = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d2, true, "BottomSheetWidget");
                    e9d.G(i9d2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
