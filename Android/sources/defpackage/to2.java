package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;

/* renamed from: to2  reason: default package */
public final class to2 extends SuspendLambda implements Function2 {
    public Ref.ObjectRef a;
    public Ref.ObjectRef b;
    public int c;
    public final /* synthetic */ lp2 o;
    public final /* synthetic */ long v;
    public final /* synthetic */ Long w;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to2(lp2 lp2, long j, Long l, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.o = lp2;
        this.v = j;
        this.w = l;
        this.x = arrayList;
        this.y = arrayList2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new to2(this.o, this.v, this.w, (ArrayList) this.x, (ArrayList) this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((to2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [hvd, zud] */
    /* JADX WARNING: type inference failed for: r8v4, types: [hvd, zud] */
    /* JADX WARNING: type inference failed for: r7v6, types: [hvd, zud] */
    /* JADX WARNING: type inference failed for: r7v8, types: [hvd, zud] */
    public final Object invokeSuspend(T t) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        zud zud;
        mc9 mc9;
        zud zud2;
        T coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        long j = this.v;
        lp2 lp2 = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(t);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            this.a = objectRef3;
            this.b = objectRef3;
            this.c = 1;
            T a2 = ((ej9) lp2.A0.getValue()).a(j, this.w, this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef3;
            t = a2;
            objectRef = objectRef2;
        } else if (i == 1) {
            objectRef2 = this.b;
            objectRef = this.a;
            ResultKt.throwOnFailure(t);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2.element = t;
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        int i3 = 0;
        for (Object next : this.x) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long longValue = ((Number) next).longValue();
            if (i3 == 0) {
                KProperty[] kPropertyArr = lp2.X0;
                ? hvd = new hvd(j);
                hvd.m = longValue;
                hvd.b = objectRef.element;
                objectRef.element = null;
                zud2 = hvd;
            } else {
                KProperty[] kPropertyArr2 = lp2.X0;
                ? hvd2 = new hvd(j);
                hvd2.m = longValue;
                zud2 = hvd2;
            }
            linkedList.add(new avd(zud2));
            i3 = i4;
        }
        for (Object next2 : this.y) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            vdb vdb = (vdb) next2;
            if (i2 != 0 || (mc9 = objectRef.element) == null) {
                KProperty[] kPropertyArr3 = lp2.X0;
                ? hvd3 = new hvd(j);
                hvd3.n = (int) vdb.a;
                hvd3.o = vdb.b;
                hvd3.p = vdb.c;
                zud = hvd3;
            } else {
                KProperty[] kPropertyArr4 = lp2.X0;
                ? hvd4 = new hvd(j);
                hvd4.n = (int) vdb.a;
                hvd4.o = vdb.b;
                hvd4.p = vdb.c;
                hvd4.b = mc9;
                objectRef.element = null;
                zud = hvd4;
            }
            linkedList.add(new avd(zud));
            i2 = i5;
        }
        ((jqg) lp2.z0.getValue()).a(new jvd(new kud(j, linkedList, 2)));
        return Unit.INSTANCE;
    }
}
