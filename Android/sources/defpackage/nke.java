package defpackage;

import androidx.fragment.app.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ru.ok.messages.calls.utils.StartCallsViewModel;
import ru.ok.tamtam.calls.CallDialogFragment;

/* renamed from: nke  reason: default package */
public final /* synthetic */ class nke implements Function1 {
    public final /* synthetic */ d19 a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ StartCallsViewModel c;
    public final /* synthetic */ c o;

    public /* synthetic */ nke(d19 d19, Ref.ObjectRef objectRef, StartCallsViewModel startCallsViewModel, c cVar) {
        this.a = d19;
        this.b = objectRef;
        this.c = startCallsViewModel;
        this.o = cVar;
    }

    public final Object invoke(Object obj) {
        mq1 mq1;
        d41 d41 = (d41) obj;
        boolean areEqual = Intrinsics.areEqual((Object) d41, (Object) x31.a);
        Ref.ObjectRef objectRef = this.b;
        StartCallsViewModel startCallsViewModel = this.c;
        if (areEqual) {
            c cVar = this.o;
            this.a.a = new vra(26, cVar, startCallsViewModel);
            mq1 mq12 = (mq1) objectRef.element;
            if (mq12 != null) {
                mq12.c = true;
            }
            if (mq12 != null && mq12.a(startCallsViewModel.k())) {
                CallDialogFragment a2 = uke.a(cVar);
                if (a2 != null) {
                    a2.a3();
                }
                startCallsViewModel.m();
            }
        } else if (Intrinsics.areEqual((Object) d41, (Object) y31.a)) {
            hsg.l(startCallsViewModel.r);
        } else if (d41 instanceof z31) {
            boolean z = ((z31) d41).a;
            startCallsViewModel.getClass();
            startCallsViewModel.m.setValue(startCallsViewModel, StartCallsViewModel.t[3], Boolean.valueOf(z));
        } else if (d41 instanceof a41) {
            a41 a41 = (a41) d41;
            if (a41.c) {
                mq1 mq13 = (mq1) objectRef.element;
                if (mq13 != null) {
                    mq13.a(true);
                }
            } else if (a41.b && (mq1 = (mq1) objectRef.element) != null) {
                mq1.a(false);
            }
        } else if (d41 instanceof b41) {
            b41 b41 = (b41) d41;
            gdb gdb = new gdb(b41.a, b41.b, b41.c);
            mq1 mq14 = (mq1) objectRef.element;
            if (mq14 != null) {
                mq14.c(gdb);
            }
        } else if (d41 instanceof c41) {
            boolean z2 = ((c41) d41).a;
            startCallsViewModel.getClass();
            startCallsViewModel.l.setValue(startCallsViewModel, StartCallsViewModel.t[2], Boolean.valueOf(z2));
            startCallsViewModel.f.getClass();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
