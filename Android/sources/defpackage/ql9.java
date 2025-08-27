package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ql9  reason: default package */
public final class ql9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ MessageModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ql9(en9 en9, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = messageModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ql9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ql9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Number number;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = (a32) this.b.k1.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            we8 we8 = this.b.v;
            MessageModel messageModel = this.c;
            this.a = 1;
            we8.getClass();
            if (messageModel.c > a32.o()) {
                String str = (String) we8.b;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, a81.m("Marking as read message=", messageModel.n()), (Throwable) null);
                }
                long j = messageModel.c;
                m72 m72 = a32.b;
                int i2 = m72.m;
                long j2 = m72.a;
                ysc ysc = (ysc) ((Lazy) we8.c).getValue();
                Long boxLong = Boxing.boxLong(messageModel.b);
                long j3 = 0;
                if (boxLong.longValue() == 0) {
                    boxLong = null;
                }
                long j4 = j2;
                ysc.e(ysc, j2, j, boxLong != null ? boxLong.longValue() : -1, false, false, false, 64);
                bl4 bl4 = bl4.REGULAR;
                if (Intrinsics.areEqual((Object) (f72) hd8.r(j, a32.b.n.d(bl4)).getSecond(), (Object) (f72) hd8.r(a32.c.h(), a32.b.n.d(bl4)).getSecond())) {
                    if (messageModel.a != a32.c.a.b) {
                        j3 = ((fa9) ((Lazy) we8.e).getValue()).b(we8.a, j);
                    }
                    number = Boxing.boxLong(j3);
                } else {
                    fa9 fa9 = (fa9) ((Lazy) we8.e).getValue();
                    long j5 = we8.a;
                    long o = a32.o() + 1;
                    fa9.getClass();
                    z68.c("fa9", "countMessagesFromTo chatId = %d, timeFrom = %d, timeTo = %d", Long.valueOf(j5), Long.valueOf(o), Long.valueOf(j));
                    aj9 d = ((a74) fa9.a).c.d();
                    sq6 sq6 = qe9.b;
                    d.getClass();
                    d7d a2 = d7d.a(5, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = ? AND status <> ?");
                    a2.k(1, j5);
                    a2.k(2, o);
                    a2.k(3, j);
                    i2a.o(a2, 4, (long) 0, d);
                    a2.k(5, (long) 10);
                    i6d i6d = d.a;
                    i6d.b();
                    Cursor o2 = i6d.o(a2, (CancellationSignal) null);
                    try {
                        if (o2.moveToFirst()) {
                            j3 = o2.getLong(0);
                        }
                        long j6 = j3;
                        o2.close();
                        a2.o();
                        number = Boxing.boxInt(RangesKt.coerceAtLeast(i2 - ((int) j6), 0));
                    } catch (Throwable th) {
                        o2.close();
                        a2.o();
                        throw th;
                    }
                }
                ((my2) ((qx2) ((Lazy) we8.d).getValue())).n().x0(number.intValue(), we8.a);
                if (messageModel.a != a32.c.a.b || i2 == 0) {
                    ((qwa) ((Lazy) we8.f).getValue()).d(SetsKt.setOf(Boxing.boxLong(j4)));
                } else {
                    ((qwa) ((Lazy) we8.f).getValue()).a(j4);
                }
                unit = Unit.INSTANCE;
            } else {
                String str2 = (String) we8.b;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, str2, wj6.k("Message message=", messageModel.n(), " is already read"), (Throwable) null);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == coroutine_suspended) {
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
