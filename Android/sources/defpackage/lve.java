package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lve  reason: default package */
public final class lve extends SuspendLambda implements Function2 {
    public mqe a;
    public List b;
    public int c;
    public int o;
    public int v;
    public final /* synthetic */ mve w;
    public final /* synthetic */ mqe x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lve(mve mve, mqe mqe, Continuation continuation) {
        super(2, continuation);
        this.w = mve;
        this.x = mqe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lve(this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lve) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        mqe mqe;
        List list;
        int i;
        int i2;
        mqe mqe2;
        boolean z = true;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.v;
        mve mve = this.w;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            list = ((v8e) mve.X.getValue()).b;
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex >= 0) {
                i = 0;
                while (true) {
                    mqe2 = (mqe) list.get(i);
                    if (this.x.a != mqe2.a) {
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            i = -1;
            mqe2 = null;
            if (mqe2 == null) {
                return Unit.INSTANCE;
            }
            boolean z2 = !mqe2.y;
            bb3 h = ((ai5) mve.w.getValue()).h(mqe2.a, z2);
            this.a = mqe2;
            this.b = list;
            this.c = i;
            this.o = z2 ? 1 : 0;
            this.v = 1;
            if (bs0.e(h, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = z2;
            mqe = mqe2;
        } else if (i3 == 1) {
            i2 = this.o;
            i = this.c;
            list = this.b;
            mqe = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List mutableList = CollectionsKt.toMutableList(list);
        mutableList.set(i, mqe.h(mqe, (ArrayList) null, false, i2 != 0, 127));
        xme xme = mve.X;
        v8e v8e = (v8e) xme.getValue();
        u8e u8e = v8e.a;
        v8e v8e2 = v8e.c;
        v8e.getClass();
        v8e v8e3 = new v8e(u8e, mutableList);
        xme.getClass();
        xme.m((Object) null, v8e3);
        if (i2 == 0) {
            z = false;
        }
        xag.h(mve.y, new t8e(z ? cad.o : cad.y, z ? hza.c : hza.d));
        return Unit.INSTANCE;
    }
}
