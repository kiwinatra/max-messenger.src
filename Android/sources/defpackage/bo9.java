package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: bo9  reason: default package */
public final class bo9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bo9 bo9 = new bo9(continuation, this.b);
        bo9.a = obj;
        return bo9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bo9) create((ta8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        Object[] objArr2;
        long[] jArr3;
        long[] jArr4;
        int i;
        int i2 = 1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ta8 ta8 = (ta8) this.a;
        MessagesListWidget messagesListWidget = this.b;
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        ur5 ur5 = (ur5) messagesListWidget.w0.getValue();
        EndlessRecyclerView2 h0 = this.b.h0();
        if (!ur5.y) {
            ur5.y = true;
            h0.j(ur5);
            ur5.z = h0;
        }
        ur5 ur52 = (ur5) this.b.w0.getValue();
        ur52.getClass();
        long[] jArr5 = ta8.b;
        Object[] objArr3 = ta8.c;
        long[] jArr6 = ta8.a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr6[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            jArr4 = jArr6;
                            long j2 = jArr5[i7];
                            yc9 yc9 = (yc9) objArr3[i7];
                            iz9 iz9 = ur52.c;
                            if (iz9.a(j2) == null) {
                                eoa eoa = new eoa(ur52.a);
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                                long j3 = yc9.a;
                                CharSequence charSequence = yc9.c;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                eoa.b(new gd0(charSequence, j3));
                                int i8 = ur52.v;
                                eoa.setBounds(0, 0, i8, i8);
                                eoa.c(yc9.b);
                                eoa.setCallback((tr5) ur52.X.getValue());
                                iz9.e(j2, eoa);
                            } else {
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                            }
                            i = 8;
                        } else {
                            jArr4 = jArr6;
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            i = i4;
                        }
                        j >>= i;
                        i2 = 1;
                        i6++;
                        i4 = i;
                        jArr6 = jArr4;
                        jArr5 = jArr3;
                        objArr3 = objArr2;
                    }
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3 += i2;
                jArr6 = jArr2;
                jArr5 = jArr;
                objArr3 = objArr;
            }
        }
        String name = ur5.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, wj6.h(ur52.c.e, "avatars.size = "), (Throwable) null);
        }
        this.b.h0().a0();
        return Unit.INSTANCE;
    }
}
