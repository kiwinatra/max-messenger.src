package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.suggests.SuggestsFragment;

/* renamed from: j1f  reason: default package */
public final class j1f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ SuggestsFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1f(etc etc, Continuation continuation, SuggestsFragment suggestsFragment) {
        super(2, continuation);
        this.b = etc;
        this.o = suggestsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        j1f j1f = new j1f((etc) this.b, continuation, this.o);
        j1f.a = obj;
        return j1f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j1f) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            b2f b2f = (b2f) a2;
            boolean areEqual = Intrinsics.areEqual((Object) b2f, (Object) y1f.a);
            SuggestsFragment suggestsFragment = this.o;
            if (areEqual) {
                SuggestsFragment.T2(suggestsFragment);
            } else {
                boolean z = false;
                if (b2f instanceof a2f) {
                    f1f f1f = suggestsFragment.l1;
                    f1f f1f2 = suggestsFragment.l1;
                    f1f.e().setVisibility(((a2f) b2f).a.isEmpty() ? 0 : 8);
                    f1f2.e().setText(((a2f) b2f).c == c2f.a ? suggestsFragment.S1(qad.T9) : suggestsFragment.S1(qad.S9));
                    boolean z2 = f1f2.f().getVisibility() == 0;
                    suggestsFragment.U2(true);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((a2f) b2f).a);
                    a32 a32 = suggestsFragment.V2().j;
                    if (a32 != null && !a32.N()) {
                        z = true;
                    }
                    if (z && !suggestsFragment.V2().k()) {
                        arrayList.add(new yuf(((a2f) b2f).c));
                    } else if (suggestsFragment.V2().k()) {
                        arrayList.add(xuf.b);
                    }
                    d1f d1f = suggestsFragment.n1;
                    if (d1f == null) {
                        d1f = null;
                    }
                    d1f.H(arrayList, new vr1((a2f) b2f, suggestsFragment, z2));
                } else if (b2f instanceof z1f) {
                    zuf zuf = ((z1f) b2f).a;
                    h5a h5a = suggestsFragment.p1;
                    f1f f1f3 = suggestsFragment.l1;
                    if (h5a != null) {
                        h5a.dismiss();
                    }
                    h5a h5a2 = new h5a(suggestsFragment.G2(), f1f3.f(), zuf, new npg(24, (Object) suggestsFragment, (Object) zuf), ((qra) ryg.x(suggestsFragment)).d(), ((z1f) b2f).c != null);
                    suggestsFragment.p1 = h5a2;
                    h5a2.setOnDismissListener(new b79(2, suggestsFragment));
                    h5a h5a3 = suggestsFragment.p1;
                    if (h5a3 != null) {
                        h5a3.showAtLocation(f1f3.f(), 8388661, ((z1f) b2f).b.x, ((z1f) b2f).b.y);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
