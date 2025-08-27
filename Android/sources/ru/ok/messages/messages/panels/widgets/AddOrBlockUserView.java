package ru.ok.messages.messages.panels.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/messages/messages/panels/widgets/AddOrBlockUserView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lwa;", "listener", "", "setListener", "(Lwa;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddOrBlockUserView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddOrBlockUserView.kt\nru/ok/messages/messages/panels/widgets/AddOrBlockUserView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,119:1\n28#2:120\n28#2:121\n28#2:122\n*S KotlinDebug\n*F\n+ 1 AddOrBlockUserView.kt\nru/ok/messages/messages/panels/widgets/AddOrBlockUserView\n*L\n67#1:120\n68#1:121\n95#1:122\n*E\n"})
public final class AddOrBlockUserView extends ConstraintLayout {
    public static final /* synthetic */ int L0 = 0;
    public ShapeDrawable E0;
    public final TextView F0 = ((TextView) findViewById(lic.ll_block_contact__btn_add));
    public final View G0;
    public final ImageView H0;
    public final ImageView I0;
    public final View J0;
    public final View K0;

    @JvmOverloads
    public AddOrBlockUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.add_or_block_contact_panel, this);
        View findViewById = findViewById(lic.add_or_block_add_button);
        this.G0 = findViewById;
        ImageView imageView = (ImageView) findViewById(lic.ll_block_contact__btn_block);
        this.H0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(lic.ll_block_contact__ib_close);
        this.I0 = imageView2;
        this.J0 = findViewById(lic.separator1);
        this.K0 = findViewById(lic.separator2);
        ct.G(findViewById, 300, new va(this, 0));
        ct.G(imageView, 300, new va(this, 1));
        ct.G(imageView2, 300, new va(this, 2));
        c();
    }

    public final void c() {
        k2b f = fu4.k.e(getContext()).f();
        float f2 = vo4.c().getDisplayMetrics().density * 4.0f;
        float f3 = vo4.c().getDisplayMetrics().density * 8.0f;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) null, new RectF(f3, f3, f3, f3), new float[]{f2, f2, f2, f2, f2, f2, f2, f2}));
        shapeDrawable.getPaint().setColor(f.c().f);
        this.E0 = shapeDrawable;
        setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(f.c().f), this.E0}));
        int i = f.c().f;
        float[] fArr = new float[8];
        Arrays.fill(fArr, vo4.c().getDisplayMetrics().density * 4.0f);
        this.G0.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, i8b.P(-65536, (Integer) null, (Integer) null, fArr)));
        f.getText().getClass();
        TextView textView = this.F0;
        textView.setTextColor(-16745729);
        f.getText().getClass();
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(-16745729));
        int i2 = f.c().f;
        ImageView imageView = this.H0;
        imageView.setBackgroundColor(i2);
        int i3 = f.getIcon().f;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(i3, mode);
        int i4 = f.c().f;
        ImageView imageView2 = this.I0;
        imageView2.setBackgroundColor(i4);
        imageView2.setColorFilter(f.getIcon().f, mode);
        this.J0.setBackgroundColor(0);
        this.K0.setBackgroundColor(0);
    }

    public final void setListener(wa waVar) {
    }
}
