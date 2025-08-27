package ru.ok.tamtam.materialdialogs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/materialdialogs/TamDialogSelectItemTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lwcf;", "material-dialogs_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTamDialogSelectItemTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TamDialogSelectItemTextView.kt\nru/ok/tamtam/materialdialogs/TamDialogSelectItemTextView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,29:1\n49#2,2:30\n45#2:32\n*S KotlinDebug\n*F\n+ 1 TamDialogSelectItemTextView.kt\nru/ok/tamtam/materialdialogs/TamDialogSelectItemTextView\n*L\n22#1:30,2\n22#1:32\n*E\n"})
public final class TamDialogSelectItemTextView extends AppCompatTextView implements wcf {
    @JvmOverloads
    public TamDialogSelectItemTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        scf scf;
        d1(this);
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        L0(scf);
        puf.k.b(this, uy4.b);
    }

    public final void L0(scf scf) {
        setTextColor(scf.G);
    }
}
