package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.views.widgets.BoundedLinearLayout;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ok/messages/messages/widgets/SecretModeView;", "Landroid/widget/FrameLayout;", "Lbif;", "", "getText", "()Ljava/lang/CharSequence;", "text", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSecretModeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretModeView.kt\nru/ok/messages/messages/widgets/SecretModeView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,102:1\n24#2:103\n32#2:104\n24#2:105\n24#2:106\n24#2:107\n148#3,2:108\n49#4,2:110\n45#4:112\n*S KotlinDebug\n*F\n+ 1 SecretModeView.kt\nru/ok/messages/messages/widgets/SecretModeView\n*L\n29#1:103\n30#1:104\n31#1:105\n32#1:106\n33#1:107\n49#1:108,2\n71#1:110,2\n71#1:112\n*E\n"})
public final class SecretModeView extends FrameLayout implements bif {
    public final int a = MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density);
    public final int b = MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 2.5d);
    public final int c;
    public final TextView o;
    public final TextView v;
    public final AppCompatImageView w;
    public final BoundedLinearLayout x;

    @JvmOverloads
    public SecretModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        float f = (float) 1;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int roundToInt2 = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        this.c = roundToInt3;
        View.inflate(context, ujc.secret_mode_view, this);
        setLayoutParams(new bzc(-1, -2));
        setPaddingRelative(roundToInt3, roundToInt, roundToInt3, roundToInt2);
        TextView textView = (TextView) findViewById(lic.secret_mode__tv_text);
        this.o = textView;
        textView.setText(getText());
        this.v = (TextView) findViewById(lic.secret_mode__tv_title);
        this.w = (AppCompatImageView) findViewById(lic.secret_mode__iv_icon);
        this.x = (BoundedLinearLayout) findViewById(lic.secret_mode__ll_content);
        c();
    }

    public final void c() {
        scf scf;
        if (!isInEditMode()) {
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            this.o.setTextColor(scf.u);
            TextView textView = this.v;
            int i = scf.u;
            textView.setTextColor(i);
            iq.a0(this.w.getDrawable(), i);
            this.x.setBackground(i8b.O(Integer.valueOf(scf.s), (Integer) null, (Integer) null, this.c));
        }
    }

    public final CharSequence getText() {
        wsb wsb = new wsb(27);
        wsb.e0(new cv0(this.a, this.b, 0, false));
        String string = getResources().getString(qad.A8);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) wsb.a;
        spannableStringBuilder.append(string);
        spannableStringBuilder.append("\n");
        wsb.d0();
        wsb.e0(new cv0(this.a, this.b, 0, false));
        spannableStringBuilder.append(getResources().getString(qad.B8));
        spannableStringBuilder.append("\n");
        wsb.d0();
        wsb.e0(new cv0(this.a, this.b, 0, false));
        spannableStringBuilder.append(getResources().getString(qad.C8));
        spannableStringBuilder.append("\n");
        wsb.d0();
        wsb.e0(new cv0(this.a, this.b, 0, false));
        spannableStringBuilder.append(getResources().getString(qad.D8));
        wsb.d0();
        return spannableStringBuilder;
    }
}
