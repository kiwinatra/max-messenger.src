package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: rn6  reason: default package */
public final class rn6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ gp6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn6(gp6 gp6, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = set;
        this.c = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rn6 rn6 = new rn6(this.c, this.b, continuation);
        rn6.a = obj;
        return rn6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rn6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        List mutableList = CollectionsKt.toMutableList(this.b);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        gp6 gp6 = this.c;
        Iterable<tm6> iterable = (Iterable) gp6.Z.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (tm6 tm6 : iterable) {
            if (!e14.f(d14)) {
                return Unit.INSTANCE;
            }
            if (!mutableList.isEmpty()) {
                Uri uri = tm6.c.b;
                Iterator it = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Uri c2 = ((uqd) it.next()).a.c();
                    if (y64.a(uri, c2) || String.valueOf(c2).length() > 0) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    mutableList.remove(i);
                    int m = gp6.m(tm6.c);
                    if (tm6.h != m) {
                        booleanRef.element = true;
                        tm6 = tm6.b(tm6, (dfb) null, (p4g) null, (Uri) null, m, false, 0, (Uri) null, 1983);
                    }
                }
            }
            arrayList.add(tm6);
        }
        if (e14.f(d14) && booleanRef.element) {
            xme xme = gp6.Z;
            xme.getClass();
            xme.m((Object) null, arrayList);
        }
        return Unit.INSTANCE;
    }
}
