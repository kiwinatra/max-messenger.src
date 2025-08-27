package ru.ok.messages.messages.panels.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001b\u0010\u001c\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001f\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lru/ok/messages/messages/panels/widgets/PinnedMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lbif;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setInternalDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lhmb;", "listener", "setListener", "(Lhmb;)V", "I0", "Lkotlin/Lazy;", "getLocationDrawable", "()Landroid/graphics/drawable/Drawable;", "locationDrawable", "J0", "getMicrophoneDrawable", "microphoneDrawable", "K0", "getContactDrawable", "contactDrawable", "L0", "getMusicDrawable", "musicDrawable", "M0", "getFileDrawable", "fileDrawable", "N0", "getPlayDrawable", "playDrawable", "getBackgroundDrawable", "backgroundDrawable", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPinnedMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinnedMessageView.kt\nru/ok/messages/messages/panels/widgets/PinnedMessageView\n+ 2 AnimojisExtensions.kt\nru/ok/tamtam/animoji/utils/AnimojisExtenstions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,281:1\n101#2:282\n1755#3,3:283\n49#4,2:286\n45#4:288\n49#4,2:292\n45#4:294\n75#5:289\n44#5:290\n99#5:291\n24#5:295\n75#5:296\n44#5:297\n99#5:298\n44#5:299\n99#5:300\n*S KotlinDebug\n*F\n+ 1 PinnedMessageView.kt\nru/ok/messages/messages/panels/widgets/PinnedMessageView\n*L\n114#1:282\n114#1:283,3\n104#1:286,2\n104#1:288\n131#1:292,2\n131#1:294\n104#1:289\n104#1:290\n104#1:291\n144#1:295\n248#1:296\n248#1:297\n248#1:298\n248#1:299\n248#1:300\n*E\n"})
public final class PinnedMessageView extends ConstraintLayout implements bif {
    public static final /* synthetic */ int O0 = 0;
    public final SimpleDraweeView E0;
    public final EllipsizingEndTextView F0;
    public final ImageButton G0;
    public final ImageView H0;
    public final Lazy I0 = LazyKt.lazy(new fmb(this, 0));
    public final Lazy J0 = LazyKt.lazy(new fmb(this, 1));
    public final Lazy K0 = LazyKt.lazy(new fmb(this, 2));
    public final Lazy L0 = LazyKt.lazy(new fmb(this, 3));
    public final Lazy M0 = LazyKt.lazy(new fmb(this, 4));
    public final Lazy N0 = LazyKt.lazy(new fmb(this, 5));

    @JvmOverloads
    public PinnedMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        LazyKt.lazy(new lce(16, getResources()));
        nb9 nb9 = (nb9) ((qra) ym.e()).getAccessor().g(nb9.class);
        ((qra) ym.e()).v();
        ltb y = ((qra) ym.e()).y();
        View.inflate(context, ujc.view_pinned_message, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelOffset(ydc.chat_top_panel_height)));
        this.E0 = (SimpleDraweeView) findViewById(lic.view_pinned_message__iv_attach);
        EllipsizingEndTextView ellipsizingEndTextView = (EllipsizingEndTextView) findViewById(lic.view_pinned_message__tv_content);
        this.F0 = ellipsizingEndTextView;
        y.b.getClass();
        Set emptySet = Collections.emptySet();
        hj hjVar = hj.a;
        if (!(emptySet instanceof Collection) || !emptySet.isEmpty()) {
            Iterator it = emptySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.contentEquals((CharSequence) it.next(), "MESSAGE_NORMAL_TEXT", true)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        ellipsizingEndTextView.setAnimojiEnabled(z);
        this.H0 = (ImageView) findViewById(lic.view_pinned_message__iv_pin);
        View findViewById = findViewById(lic.view_pinned_message__ib_close);
        ct.G((AppCompatImageButton) findViewById, 300, new gmb(this, 0));
        this.G0 = (ImageButton) findViewById;
        ct.G(this, 300, new gmb(this, 1));
        c();
    }

    private final Drawable getBackgroundDrawable() {
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        return i8b.O(Integer.valueOf(j4b.l0(0.2f, scf.G)), (Integer) null, (Integer) null, MathKt.roundToInt(((float) 6) * getContext().getResources().getDisplayMetrics().density));
    }

    private final Drawable getContactDrawable() {
        return (Drawable) this.K0.getValue();
    }

    private final Drawable getFileDrawable() {
        return (Drawable) this.M0.getValue();
    }

    private final Drawable getLocationDrawable() {
        return (Drawable) this.I0.getValue();
    }

    private final Drawable getMicrophoneDrawable() {
        return (Drawable) this.J0.getValue();
    }

    private final Drawable getMusicDrawable() {
        return (Drawable) this.L0.getValue();
    }

    private final Drawable getPlayDrawable() {
        return (Drawable) this.N0.getValue();
    }

    private final void setInternalDrawable(Drawable drawable) {
        SimpleDraweeView simpleDraweeView = this.E0;
        sp6 sp6 = (sp6) simpleDraweeView.getHierarchy();
        simpleDraweeView.setVisibility(0);
        sp6.i(getBackgroundDrawable(), 0);
        sp6.h(ydd.l);
        sp6.j(drawable, c44.DEFAULT_ASPECT_RATIO, false);
    }

    public final Drawable L(int i) {
        Resources resources = getResources();
        ThreadLocal threadLocal = h4d.a;
        return c4d.a(resources, i, (Resources.Theme) null);
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
            int i = scf.G;
            EllipsizingEndTextView ellipsizingEndTextView = this.F0;
            ellipsizingEndTextView.setTextColor(i);
            ellipsizingEndTextView.setLinkTextColor(scf.G);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            ImageView imageView = this.H0;
            int i2 = scf.x;
            imageView.setColorFilter(i2, mode);
            ImageButton imageButton = this.G0;
            imageButton.setColorFilter(i2, mode);
            imageButton.setBackground(scf.d());
            int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            setBackground(i8b.f(scf.y, scf.j, 0, roundToInt));
        }
    }

    public final void setListener(hmb hmb) {
    }
}
