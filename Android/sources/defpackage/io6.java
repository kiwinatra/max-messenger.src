package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: io6  reason: default package */
public final class io6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gp6 a;
    public final /* synthetic */ uqd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io6(gp6 gp6, uqd uqd, Continuation continuation) {
        super(2, continuation);
        this.a = gp6;
        this.b = uqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new io6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((io6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        uqd uqd;
        Uri uri;
        int i;
        String path;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gp6 gp6 = this.a;
        Iterator it = ((List) gp6.Z.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            uqd = this.b;
            if (!hasNext) {
                i2 = -1;
                break;
            }
            if (y64.a(((tm6) it.next()).c.b, uqd.a.c())) {
                break;
            }
            i2++;
        }
        Integer boxInt = Boxing.boxInt(i2);
        if (boxInt.intValue() < 0) {
            boxInt = null;
        }
        if (boxInt == null) {
            return Unit.INSTANCE;
        }
        int intValue = boxInt.intValue();
        xme xme = gp6.Z;
        tm6 tm6 = (tm6) ((List) xme.getValue()).get(intValue);
        dfb dfb = uqd.c;
        p4g p4g = uqd.b;
        List mutableList = CollectionsKt.toMutableList((Collection) xme.getValue());
        dfb dfb2 = uqd.c;
        Uri uri2 = dfb2 != null ? dfb2.v : null;
        d48 d48 = uqd.a;
        int i3 = d48.v;
        Uri uri3 = tm6.l;
        if (dfb.b(dfb, d48)) {
            Uri a2 = dfb.a(dfb, d48);
            if (a2 == null || (path = a2.getPath()) == null || path.equals(d48.c)) {
                i = 0;
            } else {
                i = 0;
                uri = a2;
                mutableList.set(intValue, tm6.b(tm6, dfb, p4g, uri2, 0, false, i, uri, 455));
                xme.getClass();
                xme.m((Object) null, mutableList);
                ArrayList v = vzg.v(gp6.D0);
                om6 om6 = gp6.w;
                om6.getClass();
                xag.h(om6.c, new im6(v));
                return Unit.INSTANCE;
            }
        } else {
            i = i3;
        }
        uri = uri3;
        mutableList.set(intValue, tm6.b(tm6, dfb, p4g, uri2, 0, false, i, uri, 455));
        xme.getClass();
        xme.m((Object) null, mutableList);
        ArrayList v2 = vzg.v(gp6.D0);
        om6 om62 = gp6.w;
        om62.getClass();
        xag.h(om62.c, new im6(v2));
        return Unit.INSTANCE;
    }
}
