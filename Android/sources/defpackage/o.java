package defpackage;

import android.widget.LinearLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: o  reason: default package */
public final class o extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ LinearLayout b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                o oVar = new o(3, continuation, 0);
                oVar.b = linearLayout;
                oVar.c = k2b;
                return oVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                o oVar2 = new o(3, continuation, 1);
                oVar2.b = linearLayout;
                oVar2.c = k2b;
                return oVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                o oVar3 = new o(3, continuation, 2);
                oVar3.b = linearLayout;
                oVar3.c = k2b;
                return oVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                o oVar4 = new o(3, continuation, 3);
                oVar4.b = linearLayout;
                oVar4.c = k2b;
                return oVar4.invokeSuspend(Unit.INSTANCE);
            case 4:
                o oVar5 = new o(3, continuation, 4);
                oVar5.b = linearLayout;
                oVar5.c = k2b;
                return oVar5.invokeSuspend(Unit.INSTANCE);
            case 5:
                o oVar6 = new o(3, continuation, 5);
                oVar6.b = linearLayout;
                oVar6.c = k2b;
                return oVar6.invokeSuspend(Unit.INSTANCE);
            case 6:
                o oVar7 = new o(3, continuation, 6);
                oVar7.b = linearLayout;
                oVar7.c = k2b;
                return oVar7.invokeSuspend(Unit.INSTANCE);
            case 7:
                o oVar8 = new o(3, continuation, 7);
                oVar8.b = linearLayout;
                oVar8.c = k2b;
                return oVar8.invokeSuspend(Unit.INSTANCE);
            case 8:
                o oVar9 = new o(3, continuation, 8);
                oVar9.b = linearLayout;
                oVar9.c = k2b;
                return oVar9.invokeSuspend(Unit.INSTANCE);
            case 9:
                o oVar10 = new o(3, continuation, 9);
                oVar10.b = linearLayout;
                oVar10.c = k2b;
                return oVar10.invokeSuspend(Unit.INSTANCE);
            case 10:
                o oVar11 = new o(3, continuation, 10);
                oVar11.b = linearLayout;
                oVar11.c = k2b;
                return oVar11.invokeSuspend(Unit.INSTANCE);
            case 11:
                o oVar12 = new o(3, continuation, 11);
                oVar12.b = linearLayout;
                oVar12.c = k2b;
                return oVar12.invokeSuspend(Unit.INSTANCE);
            case 12:
                o oVar13 = new o(3, continuation, 12);
                oVar13.b = linearLayout;
                oVar13.c = k2b;
                return oVar13.invokeSuspend(Unit.INSTANCE);
            case 13:
                o oVar14 = new o(3, continuation, 13);
                oVar14.b = linearLayout;
                oVar14.c = k2b;
                return oVar14.invokeSuspend(Unit.INSTANCE);
            default:
                o oVar15 = new o(3, continuation, 14);
                oVar15.b = linearLayout;
                oVar15.c = k2b;
                return oVar15.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().j);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 9:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 10:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 11:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            case 12:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
        }
    }
}
