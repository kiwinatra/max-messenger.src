package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: xr  reason: default package */
public final class xr extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ as b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xr(as asVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.b = asVar;
        this.c = z;
        this.o = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xr(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xr) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        kf0 kf0 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a28 a28 = (a28) this.b.A0.getValue();
            Context m = this.b.m();
            boolean z = this.c;
            this.a = 1;
            obj = ev0.I(((osa) ((gaf) a28.b.getValue())).b(), new z18(z, a28, m, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            kf0 kf02 = (kf0) entry.getKey();
            Drawable drawable = (Drawable) entry.getValue();
            Drawable drawable2 = (Drawable) entry.getValue();
            if (drawable2 instanceof uhf) {
                drawable2 = ((uhf) drawable2).a(0.45f);
            }
            linkedHashMap.put(key, new y32(Boxing.boxBoolean(false), kf02, drawable, drawable2));
        }
        as asVar = this.b;
        KProperty[] kPropertyArr = as.H0;
        String b2 = nf0.b(((ltb) asVar.n()).a, this.c);
        if (b2 != null) {
            kf0 = new kf0(b2);
        }
        if (this.c) {
            this.b.Z = linkedHashMap;
            this.b.x0 = kf0;
        } else {
            this.b.v0 = linkedHashMap;
            this.b.w0 = kf0;
        }
        if (this.o) {
            this.b.u();
        }
        return Unit.INSTANCE;
    }
}
