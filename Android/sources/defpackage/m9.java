package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: m9  reason: default package */
public final class m9 extends SuspendLambda implements Function2 {
    public npg a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ npg v;
    public final /* synthetic */ List w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m9(npg npg, List list, Continuation continuation) {
        super(2, continuation);
        this.v = npg;
        this.w = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m9 m9Var = new m9(this.v, this.w, continuation);
        m9Var.o = obj;
        return m9Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        npg npg;
        Iterator it;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.o;
            String str = (String) this.v.c;
            List list = this.w;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.v, str, a81.m("invoke for ", CollectionsKt___CollectionsKt.joinToString$default(list, ",", "[", "]", 0, (CharSequence) null, l9.b, 24, (Object) null)), (Throwable) null);
            }
            fu4 e = fu4.k.e((Context) this.v.b);
            Sequence map = SequencesKt.map(SequencesKt.filterNot(SequencesKt.onEach(SequencesKt.mapNotNull(CollectionsKt.asSequence(this.w), new h9(2)), new l(2, e)), new h9(3)), new h9(4));
            k2b f = e.f();
            h9 h9Var = new h9(0);
            i9 i9Var = new i9(f, 0);
            veg veg = veg.a;
            Sequence onEach = SequencesKt.onEach(SequencesKt___SequencesKt.flatMap(map, new ued(h9Var, i9Var)), new i9(f, 1));
            npg = this.v;
            it = onEach.iterator();
        } else if (i == 1) {
            it = this.b;
            npg = this.a;
            d14 = (d14) this.o;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d14 d142 = d14;
        npg npg2 = npg;
        Iterator it2 = it;
        while (it2.hasNext()) {
            View view = (View) it2.next();
            String str2 = (String) npg2.c;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                w78 w78 = w78.o;
                try {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.m23constructorimpl(((Context) npg2.b).getResources().getResourceName(view.getId()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m29isFailureimpl(obj2)) {
                    obj2 = null;
                }
                a672.d(w78, str2, g63.j("colorized ", (String) obj2, "/", view.getClass().getSimpleName()), (Throwable) null);
            }
            this.o = d142;
            this.a = npg2;
            this.b = it2;
            this.c = 1;
            if (f6e.M(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
