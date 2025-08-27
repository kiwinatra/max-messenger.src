package ru.ok.messages.messages.panels.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018¨\u0006%"}, d2 = {"Lru/ok/messages/messages/panels/widgets/MultiImageToggleButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "drawables", "setDrawables", "(Ljava/util/List;)V", "Lnw9;", "listener", "setListener", "(Lnw9;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "<set-?>", "o", "Lkotlin/properties/ReadWriteProperty;", "getCurrentStateIndex", "()I", "setCurrentStateIndex", "(I)V", "currentStateIndex", "", "y", "Z", "isSelfToggling", "()Z", "setSelfToggling", "(Z)V", "getAllStatesCount", "allStatesCount", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMultiImageToggleButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiImageToggleButton.kt\nru/ok/messages/messages/panels/widgets/MultiImageToggleButton\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n33#2,3:120\n1#3:123\n*S KotlinDebug\n*F\n+ 1 MultiImageToggleButton.kt\nru/ok/messages/messages/panels/widgets/MultiImageToggleButton\n*L\n26#1:120,3\n*E\n"})
public final class MultiImageToggleButton extends AppCompatImageButton {
    public static final /* synthetic */ KProperty[] z = {rae.s(MultiImageToggleButton.class, "currentStateIndex", "getCurrentStateIndex()I", 0)};
    public final bl o;
    public List v;
    public nw9 w;
    public final u99 x;
    public boolean y;

    @JvmOverloads
    public MultiImageToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public final int getAllStatesCount() {
        return this.v.size();
    }

    public final int getCurrentStateIndex() {
        return ((Number) this.o.getValue(this, z[0])).intValue();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("super_instance_state");
            setCurrentStateIndex(bundle.getInt("current_state_index"));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        return o54.f(TuplesKt.to("super_instance_state", super.onSaveInstanceState()), TuplesKt.to("current_state_index", Integer.valueOf(getCurrentStateIndex())));
    }

    public final void setCurrentStateIndex(int i) {
        this.o.setValue(this, z[0], Integer.valueOf(i));
    }

    public final void setDrawables(List<? extends Drawable> list) {
        if (!list.isEmpty()) {
            this.v = list;
            super.setImageDrawable((Drawable) list.get(getCurrentStateIndex()));
            return;
        }
        throw new IllegalArgumentException("drawables should be not empty".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "use setDrawables", replaceWith = @ReplaceWith(expression = "setDrawables", imports = {}))
    public void setImageDrawable(Drawable drawable) {
    }

    public final void setListener(nw9 nw9) {
        this.w = nw9;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if ((onClickListener instanceof t84) && ((t84) onClickListener).o == this.x) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setSelfToggling(boolean z2) {
        this.y = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiImageToggleButton(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r8 = 0
            r5.<init>(r6, r7, r8)
            kotlin.properties.Delegates r0 = kotlin.properties.Delegates.INSTANCE
            bl r0 = new bl
            r0.<init>((ru.ok.messages.messages.panels.widgets.MultiImageToggleButton) r5)
            r5.o = r0
            u99 r0 = new u99
            r1 = 3
            r0.<init>((int) r1, (java.lang.Object) r5)
            r5.x = r0
            r1 = 1
            r5.y = r1
            int[] r1 = defpackage.wnc.MultiImageToggleButton
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r1, r8, r8)
            int r7 = defpackage.wnc.MultiImageToggleButton_mitb_debounce_interval
            int r7 = r6.getInt(r7, r8)
            long r1 = (long) r7
            r3 = 300(0x12c, double:1.48E-321)
            long r1 = kotlin.ranges.RangesKt.coerceAtLeast((long) r1, (long) r3)
            int r7 = defpackage.wnc.MultiImageToggleButton_mitb_image_1
            android.graphics.drawable.Drawable r7 = r6.getDrawable(r7)
            int r3 = defpackage.wnc.MultiImageToggleButton_mitb_image_2
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r3)
            int r4 = defpackage.wnc.MultiImageToggleButton_mitb_image_3
            android.graphics.drawable.Drawable r4 = r6.getDrawable(r4)
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[]{r7, r3, r4}
            java.util.List r7 = kotlin.collections.CollectionsKt.listOfNotNull((T[]) r7)
            r5.v = r7
            int r7 = defpackage.wnc.MultiImageToggleButton_mitb_current_image_index
            int r7 = r6.getInt(r7, r8)
            r5.setCurrentStateIndex(r7)
            r6.recycle()
            defpackage.ct.G(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.messages.panels.widgets.MultiImageToggleButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
