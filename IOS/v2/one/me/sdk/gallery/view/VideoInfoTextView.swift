package one.me.sdk.gallery.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/gallery/view/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoInfoTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoInfoTextView.kt\none/me/sdk/gallery/view/VideoInfoTextView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,53:1\n49#2,2:54\n45#2:56\n49#2,2:72\n45#2:74\n75#3:57\n44#3:58\n99#3:59\n44#3:60\n99#3:61\n44#3:62\n99#3:63\n44#3:64\n99#3:65\n75#3:66\n44#3:67\n99#3:68\n75#3:69\n44#3:70\n99#3:71\n*S KotlinDebug\n*F\n+ 1 VideoInfoTextView.kt\none/me/sdk/gallery/view/VideoInfoTextView\n*L\n25#1:54,2\n25#1:56\n48#1:72,2\n48#1:74\n28#1:57\n28#1:58\n28#1:59\n28#1:60\n28#1:61\n28#1:62\n28#1:63\n28#1:64\n28#1:65\n30#1:66\n30#1:67\n30#1:68\n37#1:69\n37#1:70\n37#1:71\n*E\n"})
public final class VideoInfoTextView extends AppCompatTextView {
    @JvmOverloads
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        setTextColor(scf.u);
        tr2.c.b(this, uy4.b);
        float f = (float) 4;
        float f2 = (float) 2;
        setPadding(MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f2), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(MathKt.roundToInt(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(i8b.O(Integer.valueOf(scf.s), (Integer) null, (Integer) null, MathKt.roundToInt(((float) 16) * getContext().getResources().getDisplayMetrics().density)));
    }
}
