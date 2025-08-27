package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: s42  reason: default package */
public final class s42 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h52 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s42(int i, h52 h52, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s42(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s42) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = fxa.z0;
            h52 h52 = this.c;
            int i3 = this.b;
            if (i3 == i2) {
                this.a = 1;
                KProperty[] kPropertyArr = h52.y;
                if (h52.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == fxa.B0) {
                this.a = 2;
                KProperty[] kPropertyArr2 = h52.y;
                xme xme = h52.i;
                g02 g02 = (g02) xme.getValue();
                if (g02 == null || (str = g02.c) == null) {
                    obj3 = Unit.INSTANCE;
                } else {
                    g02 g022 = (g02) xme.getValue();
                    f02 f02 = g022 != null ? g022.b : null;
                    int i4 = f02 == null ? -1 : o42.$EnumSwitchMapping$0[f02.ordinal()];
                    n6e n6e = h52.f;
                    if (i4 == 1) {
                        obj3 = n6e.a(new dxb(new kgf(ead.i, ArraysKt.toList((T[]) new Object[]{g63.i(((fz7) h52.m.getValue()).e, "/", str)}))), this);
                        if (obj3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else if (i4 != 2) {
                        obj3 = Unit.INSTANCE;
                    } else {
                        obj3 = n6e.a(new dxb(new kgf(ead.i, ArraysKt.toList((T[]) new Object[]{str}))), this);
                        if (obj3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj3 = Unit.INSTANCE;
                        }
                    }
                }
                if (obj3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == fxa.C0) {
                this.a = 3;
                KProperty[] kPropertyArr3 = h52.y;
                g02 g023 = (g02) h52.i.getValue();
                if (g023 == null) {
                    obj2 = Unit.INSTANCE;
                } else {
                    String str2 = g023.c;
                    if (str2 == null) {
                        obj2 = Unit.INSTANCE;
                    } else {
                        int ordinal = g023.b.ordinal();
                        if (ordinal == 0) {
                            str2 = g63.i(((fz7) h52.m.getValue()).e, "/", str2);
                        } else if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = h52.f.a(new bxb(new kgf(ead.i, ArraysKt.toList((T[]) new Object[]{str2}))), this);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                }
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2 || i == 3) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
