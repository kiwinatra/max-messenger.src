package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fp6  reason: default package */
public final class fp6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gp6 a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp6(gp6 gp6, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = gp6;
        this.b = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fp6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fp6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z68.c("gp6", "updateUiItemsBySelections()", new Object[0]);
        gp6 gp6 = this.a;
        Iterable<tm6> iterable = (Iterable) gp6.Z.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (tm6 tm6 : iterable) {
            int m = this.b ? 0 : gp6.m(tm6.c);
            arrayList.add(tm6.b(tm6, (dfb) null, (p4g) null, (Uri) null, m, !((Boolean) gp6.Y.getValue()).booleanValue() || m > 0, 0, (Uri) null, 1855));
        }
        xme xme = gp6.Z;
        xme.getClass();
        xme.m((Object) null, arrayList);
        return Unit.INSTANCE;
    }
}
