package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: y5  reason: default package */
public final class y5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ActChatPickerCompat c;
    public final /* synthetic */ r62 o;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5(List list, ActChatPickerCompat actChatPickerCompat, r62 r62, ArrayList arrayList, ArrayList arrayList2, String str, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = actChatPickerCompat;
        this.o = r62;
        this.v = arrayList;
        this.w = arrayList2;
        this.x = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new y5(this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            for (vk3 vk3 : this.b) {
                long r = vk3.r();
                r62 r62 = this.o;
                a32 K = r62.K(r);
                ArrayList arrayList = this.v;
                ArrayList arrayList2 = this.w;
                if (K != null) {
                    arrayList.add(Boxing.boxLong(K.a));
                    Boxing.boxBoolean(arrayList2.add(Boxing.boxLong(K.b.a)));
                } else {
                    a32 b2 = r62.b(l72.a, CollectionsKt.listOf(Boxing.boxLong(vk3.r())), (String) null, (String) null);
                    arrayList.add(Boxing.boxLong(b2.a));
                    arrayList2.add(Boxing.boxLong(b2.b.a));
                }
            }
            int i2 = ActChatPickerCompat.y;
            gc8 t0 = ((osa) ((gaf) this.c.x.getValue())).c().t0();
            x5 x5Var = new x5(this.c, this.v, this.x, this.w, (Continuation) null);
            this.a = 1;
            if (ev0.I(t0, x5Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
