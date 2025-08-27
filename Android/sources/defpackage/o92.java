package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o92  reason: default package */
public final class o92 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ia2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o92(ia2 ia2, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.a = ia2;
        this.b = str;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o92(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = ia2.K0;
        c6d g = this.a.g();
        g.getClass();
        d7d a2 = d7d.a(2, "SELECT COUNT(*) FROM folder_and_chats WHERE folderId = ? AND chatId = ?");
        boolean z = true;
        String str2 = this.b;
        if (str2 == null) {
            a2.X(1);
        } else {
            a2.h(1, str2);
        }
        a2.k(2, this.c);
        i6d i6d = g.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a2.o();
            if (j == 0) {
                z = false;
            }
            return Boxing.boxBoolean(z);
        } catch (Throwable th) {
            o.close();
            a2.o();
            throw th;
        }
    }
}
