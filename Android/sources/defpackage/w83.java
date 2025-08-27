package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.chats.common.CommonChatsViewModel;

/* renamed from: w83  reason: default package */
public final class w83 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CommonChatsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w83(CommonChatsViewModel commonChatsViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = commonChatsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w83 w83 = new w83(this.c, continuation);
        w83.b = obj;
        return w83;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w83) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        e83 e83;
        List list;
        y73 y73;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        CommonChatsViewModel commonChatsViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            z68.c("ru.ok.messages.chats.common.CommonChatsViewModel", "load", new Object[0]);
            i83 l = commonChatsViewModel.l();
            y73 y732 = l instanceof y73 ? (y73) l : null;
            Long l2 = y732 != null ? y732.c : null;
            xme xme = commonChatsViewModel.m;
            i83 l3 = commonChatsViewModel.l();
            l3.getClass();
            if (l3 instanceof y73) {
                y73 y733 = (y73) l3;
                List list2 = y733.a;
                if (!(CollectionsKt.lastOrNull(list2) instanceof c83)) {
                    list2 = CollectionsKt.plus(list2, c83.a);
                }
                y73 = y73.b(y733, list2, 6);
            } else {
                y73 = new y73((Long) null, CollectionsKt.listOf(c83.a), true);
            }
            xme.getClass();
            xme.m((Object) null, y73);
            q04 b2 = ((osa) commonChatsViewModel.i).b();
            v83 v83 = new v83(commonChatsViewModel, l2, (Continuation) null);
            this.b = d142;
            this.a = 1;
            Object I = ev0.I(b2, v83, this);
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 d143 = d142;
            obj = I;
            d14 = d143;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        op2 op2 = (op2) obj;
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        z68.c("ru.ok.messages.chats.common.CommonChatsViewModel", "response = " + op2, new Object[0]);
        if (op2 == null) {
            xme xme2 = commonChatsViewModel.m;
            i83 l4 = commonChatsViewModel.l();
            Object b3 = l4 instanceof y73 ? y73.b((y73) l4, (List) null, 5) : u73.a;
            xme2.getClass();
            xme2.m((Object) null, b3);
            return Unit.INSTANCE;
        }
        List<b32> list3 = op2.c;
        z68.c("ru.ok.messages.chats.common.CommonChatsViewModel", "response chats count = " + list3.size(), new Object[0]);
        HashSet hashSet = new HashSet(commonChatsViewModel.o);
        i83 l5 = commonChatsViewModel.l();
        y73 y734 = l5 instanceof y73 ? (y73) l5 : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet((y734 == null || (list = y734.a) == null) ? CollectionsKt.emptyList() : list);
        linkedHashSet.remove(c83.a);
        for (b32 b32 : list3) {
            if (!e14.f(d14)) {
                return Unit.INSTANCE;
            }
            a32 D = commonChatsViewModel.d.D(b32.a);
            if (D == null || D.b.c() == 0) {
                e83 = null;
            } else {
                hashSet.add(Boxing.boxLong(D.a));
                D.l0();
                e83 = new e83(D, D.X, ghf.s(zjc.tt_chat_subtitle_count, D.b.c(), commonChatsViewModel.e.a));
            }
            if (e83 != null) {
                linkedHashSet.add(e83);
            }
        }
        commonChatsViewModel.o = hashSet;
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        boolean z = op2.o;
        if (z) {
            linkedHashSet.add(c83.a);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt.toList(linkedHashSet)) {
            if (hashSet2.add(Boxing.boxLong(((g83) next).getId()))) {
                arrayList.add(next);
            }
        }
        xme xme3 = commonChatsViewModel.m;
        Object y735 = arrayList.isEmpty() ? u73.a : new y73(op2.v, arrayList, z);
        xme3.getClass();
        xme3.m((Object) null, y735);
        return Unit.INSTANCE;
    }
}
