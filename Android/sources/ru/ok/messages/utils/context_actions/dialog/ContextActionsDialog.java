package ru.ok.messages.utils.context_actions.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.TamBottomSheetDialogFragment;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lru/ok/messages/utils/context_actions/dialog/ContextActionsDialog;", "Lru/ok/TamBottomSheetDialogFragment;", "Lwcf;", "<init>", "()V", "cw3", "xv3", "bw3", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nContextActionsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextActionsDialog.kt\nru/ok/messages/utils/context_actions/dialog/ContextActionsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,155:1\n1#2:156\n54#3:157\n45#3:158\n49#3,2:159\n45#3:161\n28#4:162\n*S KotlinDebug\n*F\n+ 1 ContextActionsDialog.kt\nru/ok/messages/utils/context_actions/dialog/ContextActionsDialog\n*L\n47#1:157\n47#1:158\n75#1:159,2\n75#1:161\n88#1:162\n*E\n"})
public final class ContextActionsDialog extends TamBottomSheetDialogFragment {
    public static final String G1 = Reflection.getOrCreateKotlinClass(ContextActionsDialog.class).getSimpleName();
    public final Lazy D1 = LazyKt.lazy(new wv3(this, 0));
    public final Lazy E1 = LazyKt.lazy(new qr3(3));
    public final Lazy F1 = LazyKt.lazy(new wv3(this, 1));

    public ContextActionsDialog() {
        super(ujc.dialog_context_menu);
    }

    public final void A2(View view, Bundle bundle) {
        scf scf;
        super.A2(view, bundle);
        Lazy lazy = this.E1;
        ((cw3) lazy.getValue()).a(view, X1());
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy2 = scf.b0;
            scf = j4b.k0(context);
        }
        L0(scf);
        cw3 cw3 = (cw3) lazy.getValue();
        cw3.getClass();
        RecyclerView recyclerView = (RecyclerView) cw3.v.getValue(cw3, cw3.w[2]);
        Lazy lazy3 = this.D1;
        recyclerView.setAdapter((vv3) lazy3.getValue());
        G2();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ((vv3) lazy3.getValue()).G((List) this.F1.getValue());
    }

    public final void L0(scf scf) {
        Lazy lazy = this.E1;
        cw3 cw3 = (cw3) lazy.getValue();
        cw3.getClass();
        KProperty[] kPropertyArr = cw3.w;
        KProperty kProperty = kPropertyArr[0];
        Integer valueOf = Integer.valueOf(scf.x);
        float f = vo4.c().getDisplayMetrics().density * 10.0f;
        ((View) cw3.c.getValue(cw3, kProperty)).setBackground(i8b.P(valueOf, (Integer) null, (Integer) null, new float[]{f, f, f, f, f, f, f, f}));
        cw3 cw32 = (cw3) lazy.getValue();
        cw32.getClass();
        ((View) cw32.o.getValue(cw32, kPropertyArr[1])).setBackgroundColor(scf.n);
        ((cw3) lazy.getValue()).L0(scf);
    }

    public final int U2() {
        Context G2 = G2();
        Lazy lazy = scf.b0;
        return j4b.k0(G2).c ? knc.DarkBottomSheetDialog_NoDim : knc.LightBottomSheetDialog_NoDim;
    }

    public final void b3(xr0 xr0) {
        c3(aw3.a);
        xr0.h().w(new vr0(3, this));
    }

    public final void c3(bw3 bw3) {
        z68.c(G1, "set fragment result " + bw3, new Object[0]);
        Q1().f0("ContextActionsDialog:result:request", o54.f(TuplesKt.to("ContextActionsDialog:result:key", bw3)));
    }
}
