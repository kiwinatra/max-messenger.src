package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g92  reason: default package */
public final class g92 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ia2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g92(ia2 ia2, Continuation continuation) {
        super(2, continuation);
        this.b = ia2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g92(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ia2 ia2 = this.b;
            String str = ia2.K0;
            c6d g = ia2.g();
            this.a = 1;
            g.getClass();
            obj = i8b.q(g.a, new CancellationSignal(), new b6d(g, d7d.a(0, "SELECT * FROM chat_folder WHERE isHiddenForAllFolder = 1"), 2), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ws wsVar = new ws(0);
        EnumSet<E> noneOf = EnumSet.noneOf(q82.class);
        ia2 ia22 = this.b;
        for (j5d j5d : (List) obj) {
            String str2 = ia2.K0;
            c6d g2 = ia22.g();
            String str3 = j5d.a;
            g2.getClass();
            d7d a2 = d7d.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
            if (str3 == null) {
                a2.X(1);
            } else {
                a2.h(1, str3);
            }
            i6d i6d = g2.a;
            i6d.b();
            Cursor o = i6d.o(a2, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                }
                o.close();
                a2.o();
                wsVar.addAll(arrayList);
                noneOf.addAll(j5d.e);
            } catch (Throwable th) {
                o.close();
                a2.o();
                throw th;
            }
        }
        zx5 b2 = ((j5d) this.b.A0.getValue()).b(CollectionsKt.emptyList(), CollectionsKt.emptyList(), wsVar, noneOf, (xva) this.b.v.getValue());
        this.b.C0 = b2;
        this.b.X.put("all.chat.folder", b2);
        return b2;
    }
}
