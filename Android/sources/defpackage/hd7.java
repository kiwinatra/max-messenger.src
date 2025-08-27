package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;

/* renamed from: hd7  reason: default package */
public final class hd7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean Y;
    public ArrayList a;
    public ArrayList b;
    public ArrayList c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ vk6 w;
    public final /* synthetic */ zcf x;
    public final /* synthetic */ yd7 y;
    public final /* synthetic */ int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hd7(vk6 vk6, zcf zcf, yd7 yd7, int i, int i2, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.w = vk6;
        this.x = zcf;
        this.y = yd7;
        this.z = i;
        this.X = i2;
        this.Y = z2;
    }

    public static final void e(d14 d14, yd7 yd7, zcf zcf, boolean z2) {
        aje aje;
        kv0.q(d14.U());
        if (z2 && (aje = yd7.A0) != null && aje.isActive()) {
            throw new lc3("content change", 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r1.A0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean h(defpackage.d14 r0, defpackage.yd7 r1, defpackage.zcf r2, boolean r3) {
        /*
            e(r0, r1, r2, r3)
            if (r3 == 0) goto L_0x0019
            boolean r0 = defpackage.e14.f(r0)
            if (r0 == 0) goto L_0x0017
            aje r0 = r1.A0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        L_0x0019:
            boolean r0 = defpackage.e14.f(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.h(d14, yd7, zcf, boolean):boolean");
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hd7 hd7 = new hd7(this.w, this.x, this.y, this.z, this.X, this.Y, continuation);
        hd7.v = obj;
        return hd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z2;
        d14 d14;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.o;
        boolean z3 = this.Y;
        yd7 yd7 = this.y;
        zcf zcf = this.x;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.v;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            vk6 vk6 = this.w;
            for (pk6 pk6 : vk6.d()) {
                ContentResolver contentResolver = yd7.o;
                cd7 cd7 = r6;
                Object obj2 = coroutine_suspended;
                ContentResolver contentResolver2 = contentResolver;
                pk6 pk62 = pk6;
                boolean z4 = z3;
                vk6 vk62 = vk6;
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = arrayList4;
                cd7 cd72 = new cd7(pk6, arrayList4, arrayList5, this.Y, d142, yd7, this.x);
                Uri i2 = pk62.i();
                pk6 pk63 = pk62;
                String e = vk62.e(pk63);
                String[] a2 = vk62.a(pk63);
                String j = tr1.j(pk63.d(), " DESC");
                Bundle bundle = new Bundle();
                int i3 = this.z;
                if (i3 != -1) {
                    bundle.putInt("android:query-arg-limit", i3);
                }
                int i4 = this.X;
                if (i4 != -1) {
                    bundle.putInt("android:query-arg-offset", i4);
                }
                if (j != null) {
                    bundle.putStringArray("android:query-arg-sort-columns", new String[]{j});
                }
                if (e != null) {
                    bundle.putString("android:query-arg-sql-selection", e);
                }
                if (a2 != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", a2);
                }
                Cursor query = contentResolver2.query(i2, pk63.d, bundle, (CancellationSignal) null);
                if (query != null) {
                    try {
                        cd7.invoke(query);
                        CloseableKt.closeFinally(query, (Throwable) null);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        CloseableKt.closeFinally(query, th);
                        throw th3;
                    }
                }
                vk6 = vk62;
                coroutine_suspended = obj2;
                z3 = z4;
                arrayList5 = arrayList6;
                arrayList4 = arrayList7;
            }
            Object obj3 = coroutine_suspended;
            boolean z5 = z3;
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            if (!arrayList8.isEmpty() || !arrayList9.isEmpty()) {
                z2 = z5;
                if (h(d142, yd7, zcf, z2)) {
                    arrayList8.size();
                    arrayList9.size();
                    arrayList3 = new ArrayList(arrayList9.size() + arrayList8.size());
                    arrayList2 = arrayList8;
                    arrayList3.addAll(arrayList2);
                    arrayList = arrayList9;
                    arrayList3.addAll(arrayList);
                    aje v2 = ev0.v(d142, ((osa) yd7.c).b(), (f14) null, new dd7(arrayList3, (Continuation) null), 2);
                    gaf gaf = yd7.c;
                    pm7[] pm7Arr = {v2, ev0.v(d142, ((osa) gaf).b(), (f14) null, new fd7(arrayList2, (Continuation) null), 2), ev0.v(d142, ((osa) gaf).b(), (f14) null, new gd7(arrayList, (Continuation) null), 2)};
                    this.v = d142;
                    this.a = arrayList;
                    this.b = arrayList2;
                    this.c = arrayList3;
                    this.o = 1;
                    Object obj4 = obj3;
                    if (j4b.W(pm7Arr, this) == obj4) {
                        return obj4;
                    }
                    d14 = d142;
                }
            }
            zcf.getClass();
            return new zc7();
        } else if (i == 1) {
            ArrayList arrayList10 = this.c;
            ArrayList arrayList11 = this.b;
            ArrayList arrayList12 = this.a;
            d14 = (d14) this.v;
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList13 = arrayList11;
            arrayList3 = arrayList10;
            z2 = z3;
            arrayList = arrayList12;
            arrayList2 = arrayList13;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zcf.getClass();
        e(d14, yd7, zcf, z2);
        return new zc7(arrayList3, arrayList, arrayList2);
    }
}
