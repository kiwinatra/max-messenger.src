package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/dialogs/SaveToGalleryDialog;", "Lru/ok/messages/views/dialogs/FrgDlgBase;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSaveToGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveToGalleryDialog.kt\nru/ok/messages/views/dialogs/SaveToGalleryDialog\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,109:1\n49#2,2:110\n45#2:112\n*S KotlinDebug\n*F\n+ 1 SaveToGalleryDialog.kt\nru/ok/messages/views/dialogs/SaveToGalleryDialog\n*L\n28#1:110,2\n28#1:112\n*E\n"})
public final class SaveToGalleryDialog extends FrgDlgBase {
    public static final SaveToGalleryDialog b3(String str, boolean z) {
        SaveToGalleryDialog saveToGalleryDialog = new SaveToGalleryDialog();
        saveToGalleryDialog.L2(o54.f(TuplesKt.to("ru.ok.tamtam.extra.EXTRA_URL", str), TuplesKt.to("ru.ok.tamtam.extra.EXTRA_GIF", Boolean.valueOf(z))));
        return saveToGalleryDialog;
    }

    public final Dialog V2(Bundle bundle) {
        scf scf;
        if (n54.f(M1())) {
            d3();
        } else {
            n54.N(this, n54.n(), 157);
        }
        LayoutInflater layoutInflater = this.X0;
        if (layoutInflater == null) {
            layoutInflater = D2();
        }
        View inflate = layoutInflater.inflate(ujc.dialog_progress_with_text, (ViewGroup) null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(lic.dialog_progress__text);
        appCompatTextView.setText(S1(qad.s8));
        if (appCompatTextView.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = appCompatTextView.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        appCompatTextView.setTextColor(scf.G);
        return new cg8(G2()).s(inflate).g();
    }

    public final void a3(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            m5 m5Var = (M1() == null || M1().isFinishing()) ? null : (m5) M1();
            if (m5Var != null) {
                if (n54.W(m5Var, (a) null, strArr, iArr, n54.n(), qad.f7, qad.e7)) {
                    d3();
                    return;
                }
            }
            T2(true, false);
        }
    }

    public final void c3(boolean z) {
        id3 id3;
        xq xqVar;
        dm4 dm4 = this.E1;
        if (!(dm4 == null || (id3 = (id3) dm4.b) == null || (xqVar = (xq) ((qra) id3).getAccessor().g(xq.class)) == null || !((udg) xqVar).c())) {
            hi7.b0(0, G2(), S1(z ? qad.u8 : qad.t8));
        }
        T2(true, false);
    }

    public final void d3() {
        String string = F2().getString("ru.ok.tamtam.extra.EXTRA_URL");
        if (string == null) {
            c3(false);
            return;
        }
        ev0.v(i8b.t(this.b1), (CoroutineContext) null, (f14) null, new pcd(this, string, F2().getBoolean("ru.ok.tamtam.extra.EXTRA_GIF"), (Continuation) null), 3);
    }
}
