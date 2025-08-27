package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: mkd  reason: default package */
public final class mkd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ View b;
    public final /* synthetic */ SearchMessageBottomWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mkd(View view, SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.b = view;
        this.c = searchMessageBottomWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mkd mkd = new mkd(this.b, this.c, continuation);
        mkd.a = obj;
        return mkd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mkd) create((lld) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lld lld = (lld) this.a;
        boolean z = lld instanceof gld;
        this.b.setVisibility(z ? 0 : 8);
        if (!(lld instanceof hld) && !(lld instanceof ild)) {
            if (z) {
                gld gld = (gld) lld;
                KProperty[] kPropertyArr = SearchMessageBottomWidget.y;
                SearchMessageBottomWidget searchMessageBottomWidget = this.c;
                AppCompatTextView d0 = searchMessageBottomWidget.d0();
                Context context = searchMessageBottomWidget.getContext();
                int i = gld.a;
                d0.setText(i == 0 ? context.getString(mra.g) : context.getString(mra.h, new Object[]{Integer.valueOf(gld.b), Integer.valueOf(i)}));
                boolean z2 = gld.c;
                searchMessageBottomWidget.w = z2;
                searchMessageBottomWidget.h0(searchMessageBottomWidget.f0(), z2);
                boolean z3 = gld.d;
                searchMessageBottomWidget.x = z3;
                searchMessageBottomWidget.h0(searchMessageBottomWidget.c0(), z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
