package one.me.sdk.gallery.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/gallery/view/ChatMediaRowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lxf2;", "listener", "", "setListener", "(Lxf2;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMediaRowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMediaRowLayout.kt\none/me/sdk/gallery/view/ChatMediaRowLayout\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,52:1\n24#2:53\n*S KotlinDebug\n*F\n+ 1 ChatMediaRowLayout.kt\none/me/sdk/gallery/view/ChatMediaRowLayout\n*L\n31#1:53\n*E\n"})
public final class ChatMediaRowLayout extends FrameLayout {
    @JvmOverloads
    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        Rect H = iq.H(getRootView());
        if (H != null) {
            measuredWidth -= H.left + H.right;
        }
        int roundToInt = (measuredWidth - (MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density) * 2)) / 3;
        if (roundToInt < size) {
            i = View.MeasureSpec.makeMeasureSpec(roundToInt, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public final void setListener(xf2 xf2) {
    }
}
