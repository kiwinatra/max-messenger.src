package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: h26  reason: default package */
public final class h26 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderPageFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h26(FolderPageFragment folderPageFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderPageFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h26 h26 = new h26(this.b, continuation);
        h26.a = obj;
        return h26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h26) create((g36) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        g36 g36 = (g36) this.a;
        FolderPageFragment folderPageFragment = this.b;
        t26 t26 = folderPageFragment.D1.y;
        if (t26 != null) {
            t26.G(g36.k);
        }
        g26 g26 = folderPageFragment.D1;
        g26.e().setVisibility(g36.j ? 0 : 8);
        ct.G(g26.e(), 300, new e26(folderPageFragment, 0));
        if (g36.j) {
            RecyclerView d = g26.d();
            d.setPadding(d.getPaddingLeft(), d.getPaddingTop(), d.getPaddingRight(), MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density));
        } else {
            RecyclerView d2 = g26.d();
            d2.setPadding(d2.getPaddingLeft(), d2.getPaddingTop(), d2.getPaddingRight(), 0);
        }
        b33 b33 = g26.x;
        if (b33 != null) {
            if (Intrinsics.areEqual((Object) g36.a, (Object) "all.chat.folder")) {
                b33.f(lic.menu_folder__delete, false);
                b33.f(lic.menu_folder__edit, false);
            } else {
                b33.f(lic.menu_folder__delete, g36.g);
                b33.f(lic.menu_folder__edit, g36.e);
            }
        }
        TamAvatarView expandedAvatarView = g26.f().getExpandedAvatarView();
        m58 m58 = g36.b;
        x15 x15 = folderPageFragment.C1;
        n79.d(expandedAvatarView, m58, x15);
        n79.d(g26.f().getCollapsedAvatarView(), m58, x15);
        b33 b332 = g26.x;
        if (b332 != null) {
            b332.e(g36.c);
            b332.d(g36.d);
        }
        return Unit.INSTANCE;
    }
}
