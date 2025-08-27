package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/views/widgets/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVideoInfoTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoInfoTextView.kt\nru/ok/messages/views/widgets/VideoInfoTextView\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,82:1\n49#2,2:83\n45#2:85\n49#2,2:107\n45#2:109\n49#2,2:110\n45#2:112\n92#3:86\n60#3:87\n105#3:88\n75#3:89\n44#3:90\n99#3:91\n75#3:92\n44#3:93\n99#3:94\n75#3:95\n44#3:96\n99#3:97\n75#3:98\n44#3:99\n99#3:100\n75#3:101\n44#3:102\n99#3:103\n75#3:104\n44#3:105\n99#3:106\n*S KotlinDebug\n*F\n+ 1 VideoInfoTextView.kt\nru/ok/messages/views/widgets/VideoInfoTextView\n*L\n27#1:83,2\n27#1:85\n64#1:107,2\n64#1:109\n77#1:110,2\n77#1:112\n29#1:86\n29#1:87\n29#1:88\n30#1:89\n30#1:90\n30#1:91\n30#1:92\n30#1:93\n30#1:94\n30#1:95\n30#1:96\n30#1:97\n30#1:98\n30#1:99\n30#1:100\n32#1:101\n32#1:102\n32#1:103\n39#1:104\n39#1:105\n39#1:106\n*E\n"})
public final class VideoInfoTextView extends AppCompatTextView {
    public VideoInfoTextView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public final void j(long j) {
        scf scf;
        Context context = getContext();
        int i = nad.Z1;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        hsg.D(iq.E(i, scf.u, context), (Drawable) null, (Drawable) null, (Drawable) null, this);
        String[] strArr = ghf.c;
        setText(b0h.c(j));
        setVisibility(0);
    }

    public final void k() {
        setText(getContext().getString(qad.T4));
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        setVisibility(0);
    }

    public final void l(k20 k20) {
        String str;
        scf scf;
        Drawable drawable;
        if (k20.f) {
            setText(getContext().getString(qad.pa));
            Context context = getContext();
            int i = nad.i2;
            if (i != -1) {
                try {
                    drawable = ew3.b(context, i);
                } catch (Resources.NotFoundException unused) {
                    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            } else {
                drawable = null;
            }
            hsg.D(drawable, (Drawable) null, (Drawable) null, (Drawable) null, this);
        } else {
            String str2 = k20.g;
            if (str2.length() <= 0 || k20.a <= 0) {
                long j = k20.b;
                if (j > 0) {
                    String[] strArr = ghf.c;
                    str = b0h.c(j);
                } else {
                    str = "";
                }
            } else {
                str = k20.h;
                if (str.length() <= 0) {
                    str = Uri.parse(str2).getHost();
                }
            }
            setText(str);
            Context context2 = getContext();
            int i2 = nad.Z1;
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context3 = getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context3);
            }
            hsg.D(iq.E(i2, scf.u, context2), (Drawable) null, (Drawable) null, (Drawable) null, this);
        }
        setVisibility(getText().length() == 0 ? 4 : 0);
    }

    @JvmOverloads
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoInfoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context2);
        }
        setTextColor(scf.u);
        setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(mad.e));
        float f = (float) 4;
        float f2 = (float) 2;
        setPadding(MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f2), MathKt.roundToInt(getContext().getResources().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(MathKt.roundToInt(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(i8b.O(Integer.valueOf(scf.s), (Integer) null, (Integer) null, MathKt.roundToInt(((float) 16) * getContext().getResources().getDisplayMetrics().density)));
    }
}
