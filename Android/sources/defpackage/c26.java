package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageFragment;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: c26  reason: default package */
public final /* synthetic */ class c26 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderPageFragment b;

    public /* synthetic */ c26(FolderPageFragment folderPageFragment, int i) {
        this.a = i;
        this.b = folderPageFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                FolderPageViewModel i3 = this.b.i3();
                String str2 = ((c05) obj2).a;
                i3.getClass();
                ev0.v(b0h.C(i3), (CoroutineContext) null, (f14) null, new n36(i3, str2, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                FolderPageViewModel i32 = this.b.i3();
                g36 g36 = (g36) i32.k.getValue();
                if (!(g36 == null || (str = g36.a) == null)) {
                    ev0.v(b0h.C(i32), ((osa) i32.j).a(), (f14) null, new p36(i32, str, booleanValue, (Continuation) null), 2);
                }
                return Unit.INSTANCE;
            default:
                View view2 = (View) obj;
                dy5 dy5 = (dy5) this.b.F1.getValue();
                dy5.getClass();
                ArrayList arrayListOf = CollectionsKt.arrayListOf(new cy5(lic.delete_chat_more_action, (s26) obj2));
                f7a f7a = dy5.a;
                sz7 sz7 = (sz7) f7a.b;
                if (sz7 != null && sz7.I0.isShowing()) {
                    ((sz7) f7a.b).dismiss();
                }
                Context context = (Context) f7a.c;
                f7a.b = new sz7(context);
                prb prb = new prb(context, arrayListOf, dy5);
                ((sz7) f7a.b).p(prb);
                ((sz7) f7a.b).x0 = view2;
                int i = 0;
                int i2 = 0;
                for (int i4 = 0; i4 < prb.o.size(); i4++) {
                    FrameLayout a2 = prb.a(i4, -2);
                    a2.measure(0, 0);
                    int measuredWidth = a2.getMeasuredWidth();
                    if (measuredWidth > i) {
                        i = measuredWidth;
                    }
                    i2 += a2.getMeasuredHeight();
                }
                Pair create = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
                ((sz7) f7a.b).r(Math.max(f7a.a, ((Integer) create.first).intValue()));
                Drawable background = ((sz7) f7a.b).I0.getBackground();
                if (background != null) {
                    iq.a0(background, ((scf) f7a.d).n);
                }
                ((Integer) create.second).getClass();
                ((sz7) f7a.b).k(0);
                ((Integer) create.first).getClass();
                ((sz7) f7a.b).w = 0;
                sz7 sz72 = (sz7) f7a.b;
                sz72.Z = 8388611;
                sz72.b();
                return Unit.INSTANCE;
        }
    }
}
