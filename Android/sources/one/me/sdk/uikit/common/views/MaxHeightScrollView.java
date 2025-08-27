package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.IntCompanionObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/uikit/common/views/MaxHeightScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "maxHeight", "", "setMaxHeight", "(I)V", "common_release"}, k = 1, mv = {2, 0, 0})
public final class MaxHeightScrollView extends ScrollView {
    public int a = -1;

    @JvmOverloads
    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        if (this.a > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            super.onMeasure(i, mode == 0 ? View.MeasureSpec.makeMeasureSpec(this.a, IntCompanionObject.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(Math.min(this.a, View.MeasureSpec.getSize(i2)), mode));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        this.a = i;
    }
}
