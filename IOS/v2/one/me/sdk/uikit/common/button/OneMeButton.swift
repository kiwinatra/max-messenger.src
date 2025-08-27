package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004 )0\u001dB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u000b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@FX\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8F@FX\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00106\u001a\u0002002\u0006\u0010!\u001a\u0002008F@FX\u0002¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u00103\"\u0004\b4\u00105R/\u0010=\u001a\u0004\u0018\u0001072\b\u0010!\u001a\u0004\u0018\u0001078F@FX\u0002¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010?\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t8F@FX\u0002¢\u0006\u0012\n\u0004\b>\u0010#\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\rR\u0011\u0010\u0016\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u0002078BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010:¨\u0006G"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeButton;", "Landroid/widget/LinearLayout;", "Lphf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "setEndIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "(Ljava/lang/Integer;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "(I)V", "Landroid/widget/TextView;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "Lypa;", "getInternalType", "()Lypa;", "Laqa;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getSize", "()Laqa;", "setSize", "(Laqa;)V", "size", "Lzpa;", "b", "getMode", "()Lzpa;", "setMode", "(Lzpa;)V", "mode", "Lxpa;", "c", "getAppearance", "()Lxpa;", "setAppearance", "(Lxpa;)V", "appearance", "Lk2b;", "o", "getCustomTheme", "()Lk2b;", "setCustomTheme", "(Lk2b;)V", "customTheme", "v", "isProgressEnabled", "()Z", "setProgressEnabled", "", "getText", "()Ljava/lang/String;", "getCurrentTheme", "currentTheme", "common_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeButton.kt\none/me/sdk/uikit/common/button/OneMeButton\n+ 2 DelegatesExt.kt\none/me/sdk/kotlintools/DelegatesExtKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 5 Ripple.kt\none/me/sdk/uikit/common/RippleKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 10 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n*L\n1#1,439:1\n14#2:440\n18#2:444\n14#2:445\n18#2:449\n14#2:450\n18#2:454\n14#2:455\n18#2:459\n14#2:460\n18#2:464\n33#3,3:441\n33#3,3:446\n33#3,3:451\n33#3,3:456\n33#3,3:461\n5#4:465\n5#4:466\n5#4:467\n5#4:468\n5#4:469\n26#5,6:470\n1317#6:476\n1318#6:479\n1328#6,2:543\n1330#6:549\n256#7,2:477\n298#7,2:481\n298#7,2:483\n298#7,2:485\n298#7,2:487\n256#7,2:489\n298#7,2:491\n163#7,2:498\n310#7:506\n326#7,4:507\n311#7:511\n310#7:515\n326#7,4:516\n311#7:520\n326#7,4:545\n81#7:550\n1#8:480\n24#9:493\n24#9:542\n65#10,4:494\n65#10,4:500\n65#10,2:504\n68#10:512\n65#10,2:513\n68#10:521\n65#10,4:522\n65#10,4:526\n65#10,4:530\n65#10,4:534\n65#10,4:538\n*S KotlinDebug\n*F\n+ 1 OneMeButton.kt\none/me/sdk/uikit/common/button/OneMeButton\n*L\n51#1:440\n51#1:444\n54#1:445\n54#1:449\n57#1:450\n57#1:454\n61#1:455\n61#1:459\n65#1:460\n65#1:464\n51#1:441,3\n54#1:446,3\n57#1:451,3\n61#1:456,3\n65#1:461,3\n84#1:465\n95#1:466\n96#1:467\n97#1:468\n98#1:469\n107#1:470,6\n81#1:476\n81#1:479\n375#1:543,2\n375#1:549\n81#1:477,2\n140#1:481,2\n161#1:483,2\n181#1:485,2\n199#1:487,2\n238#1:489,2\n262#1:491,2\n284#1:498,2\n296#1:506\n296#1:507,4\n296#1:511\n302#1:515\n302#1:516,4\n302#1:520\n378#1:545,4\n88#1:550\n265#1:493\n374#1:542\n272#1:494,4\n291#1:500,4\n295#1:504,2\n295#1:512\n301#1:513,2\n301#1:521\n338#1:522,4\n344#1:526,4\n354#1:530,4\n362#1:534,4\n367#1:538,4\n*E\n"})
public final class OneMeButton extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] z0;
    public final bqa a = new bqa(this, 0);
    public final bqa b;
    public final bqa c;
    public final bqa o;
    public final bqa v;
    public final Lazy v0;
    public final Lazy w;
    public final ShapeDrawable w0;
    public final Lazy x;
    public final RippleDrawable x0;
    public final Lazy y;
    public boolean y0;
    public final Lazy z;

    static {
        Class<OneMeButton> cls = OneMeButton.class;
        z0 = new KProperty[]{rae.s(cls, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;", 0), rae.s(cls, "mode", "getMode()Lone/me/sdk/uikit/common/button/OneMeButton$Mode;", 0), rae.s(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;", 0), rae.s(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0), rae.s(cls, "isProgressEnabled", "isProgressEnabled()Z", 0)};
    }

    @JvmOverloads
    public OneMeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        aqa aqa = aqa.a;
        zpa zpa = zpa.a;
        this.b = new bqa(this, 1);
        xpa xpa = xpa.a;
        this.c = new bqa(this, 2);
        this.o = new bqa(this, 3);
        this.v = new bqa(this, 4);
        wpa wpa = new wpa(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = LazyKt.lazy(lazyThreadSafetyMode, wpa);
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 18));
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 19));
        this.z = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 20));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new wpa(context, this, 1));
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.w0 = shapeDrawable;
        int i = fu4.k.e(getContext()).f().b().a.c;
        this.x0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        this.y0 = true;
        setOrientation(0);
        setGravity(17);
        setClipToOutline(true);
        e();
        k();
    }

    public static final void a(OneMeButton oneMeButton, int i, boolean z2) {
        oneMeButton.getClass();
        for (View visibility : SequencesKt.filter(new mag(0, oneMeButton), new pd7(i, 2))) {
            visibility.setVisibility(z2 ? 0 : 8);
        }
    }

    private final k2b getCurrentTheme() {
        k2b customTheme = getCustomTheme();
        return customTheme == null ? fu4.k.e(getContext()).f() : customTheme;
    }

    private final ypa getInternalType() {
        return ((Boolean) this.v.getValue(this, z0[4])).booleanValue() ? ypa.c : (y7e.L(this.x) == y7e.L(this.y) || y7e.L(this.z)) ? ypa.a : ypa.b;
    }

    private final void setupTextViewParams(TextView textView) {
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
    }

    public final int b(int i) {
        int count;
        if (i == dad.i) {
            return 0;
        }
        if (i == dad.j) {
            count = SequencesKt.count(cjf.x(this)) / 2;
        } else if (i == dad.f) {
            return SequencesKt.count(cjf.x(this)) / 2;
        } else {
            if (i != dad.g) {
                return -1;
            }
            count = SequencesKt.count(cjf.x(this));
        }
        return count - 1;
    }

    public final void c(Integer num, boolean z2) {
        Lazy lazy = this.v0;
        if (lazy.isInitialized() || num != null) {
            wsa wsa = (wsa) lazy.getValue();
            int i = 0;
            wsa.setVisibility(num != null ? 0 : 8);
            if (num != null) {
                i = num.intValue();
            }
            wsa.g(i, z2);
            g();
            i();
        }
    }

    public final void d(Integer num, boolean z2) {
        ImageView imageView = (ImageView) this.x.getValue();
        imageView.setId(dad.i);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.y0 = z2;
        y7e.c(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void e() {
        h();
        l();
        g();
        j();
        f();
        invalidate();
    }

    public final void f() {
        zv0 b2 = y64.b(getCurrentTheme(), getMode(), getAppearance(), isEnabled());
        Paint paint = this.w0.getPaint();
        Integer num = b2.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(b2.b);
        RippleDrawable rippleDrawable = this.x0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
    }

    public final void g() {
        qsa qsa;
        Lazy lazy = this.v0;
        if (lazy.isInitialized()) {
            wsa wsa = (wsa) lazy.getValue();
            zpa mode = getMode();
            xpa appearance = getAppearance();
            if (bw0.$EnumSwitchMapping$3[mode.ordinal()] == 1) {
                qsa = qsa.b;
            } else {
                int ordinal = appearance.ordinal();
                if (ordinal == 0) {
                    qsa = qsa.a;
                } else if (ordinal == 1) {
                    qsa = qsa.o;
                } else if (ordinal == 2) {
                    qsa = qsa.b;
                } else if (ordinal == 3) {
                    qsa = qsa.v;
                } else if (ordinal == 4) {
                    qsa = qsa.v;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            wsa.setAppearance(qsa);
        }
    }

    public final xpa getAppearance() {
        return (xpa) this.c.getValue(this, z0[2]);
    }

    public final k2b getCustomTheme() {
        return (k2b) this.o.getValue(this, z0[3]);
    }

    public final zpa getMode() {
        return (zpa) this.b.getValue(this, z0[1]);
    }

    public final aqa getSize() {
        return (aqa) this.a.getValue(this, z0[0]);
    }

    public final String getText() {
        Lazy lazy = this.z;
        return lazy.isInitialized() ? ((TextView) lazy.getValue()).getText().toString() : "";
    }

    public final void h() {
        k2b currentTheme = getCurrentTheme();
        zpa mode = getMode();
        xpa appearance = getAppearance();
        int ordinal = mode.ordinal();
        int i = -1;
        if (ordinal == 0) {
            int ordinal2 = appearance.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                currentTheme.getIcon().getClass();
            } else if (ordinal2 == 2) {
                i = currentTheme.getIcon().b;
            } else if (ordinal2 == 3) {
                currentTheme.getIcon().getClass();
            } else if (ordinal2 == 4) {
                currentTheme.getIcon().getClass();
                i = -15987442;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            int ordinal3 = appearance.ordinal();
            if (ordinal3 == 0) {
                currentTheme.getIcon().getClass();
                i = -16745729;
            } else if (ordinal3 == 1) {
                i = currentTheme.getIcon().c;
            } else if (ordinal3 == 2) {
                i = currentTheme.getIcon().f;
            } else if (ordinal3 == 3) {
                i = currentTheme.getIcon().d;
            } else if (ordinal3 == 4) {
                currentTheme.getIcon().getClass();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.y0) {
            Lazy lazy = this.x;
            if (lazy.isInitialized()) {
                ((ImageView) lazy.getValue()).setImageTintList(ColorStateList.valueOf(i));
            }
        }
        Lazy lazy2 = this.y;
        if (lazy2.isInitialized()) {
            ((ImageView) lazy2.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void i() {
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        z69 z69 = new z69(1, this);
        int i = 0;
        while (z69.hasNext()) {
            Object next = z69.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) next;
            if (i != getChildCount() - 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(roundToInt);
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            i = i2;
        }
        requestLayout();
    }

    public final void j() {
        yxa yxa;
        Lazy lazy = this.w;
        if (lazy.isInitialized()) {
            aya aya = (aya) lazy.getValue();
            zpa mode = getMode();
            xpa appearance = getAppearance();
            int ordinal = mode.ordinal();
            txa txa = nxa.a;
            if (ordinal == 0) {
                int ordinal2 = appearance.ordinal();
                if (!(ordinal2 == 0 || ordinal2 == 1)) {
                    if (ordinal2 == 2) {
                        txa = mxa.a;
                    } else if (ordinal2 != 3) {
                        if (ordinal2 == 4) {
                            txa = qxa.a;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                int ordinal3 = appearance.ordinal();
                if (ordinal3 == 0) {
                    txa = sxa.a;
                } else if (ordinal3 != 1) {
                    pxa pxa = pxa.a;
                    if (ordinal3 == 2 || ordinal3 == 3) {
                        txa = pxa;
                    } else if (ordinal3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    txa = oxa.a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            aya.setAppearance(txa);
            int ordinal4 = getSize().ordinal();
            if (ordinal4 == 0) {
                yxa = wxa.a;
            } else if (ordinal4 == 1 || ordinal4 == 2) {
                yxa = vxa.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            aya.setSize(yxa);
        }
    }

    public final void k() {
        aw0 aw0;
        ogf ogf;
        int i;
        yxa yxa;
        setMinimumHeight(y64.y(getSize()));
        setOutlineProvider(new n04(y64.d(getSize())));
        aqa size = getSize();
        int ordinal = getInternalType().ordinal();
        if (ordinal == 0) {
            int ordinal2 = size.ordinal();
            if (ordinal2 == 0) {
                aw0 = new aw0(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal2 == 1) {
                aw0 = new aw0(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal2 == 2) {
                aw0 = new aw0(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 15) * vo4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int ordinal3 = size.ordinal();
            if (ordinal3 == 0) {
                float f = (float) 6;
                aw0 = new aw0(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            } else if (ordinal3 == 1) {
                float f2 = (float) 8;
                aw0 = new aw0(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            } else if (ordinal3 == 2) {
                float f3 = (float) 14;
                aw0 = new aw0(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 2) {
            int ordinal4 = size.ordinal();
            if (ordinal4 == 0) {
                aw0 = new aw0(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal4 == 1) {
                aw0 = new aw0(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
            } else if (ordinal4 == 2) {
                aw0 = new aw0(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = aw0.a;
        setPadding(i2, 0, i2, 0);
        int ordinal5 = getSize().ordinal();
        if (ordinal5 == 0) {
            ogf = puf.C;
        } else if (ordinal5 == 1) {
            ogf = puf.B;
        } else if (ordinal5 == 2) {
            ogf = puf.A;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Lazy lazy = this.z;
        if (lazy.isInitialized()) {
            ogf.b((TextView) lazy.getValue(), uy4.b);
        }
        int ordinal6 = getSize().ordinal();
        if (ordinal6 == 0) {
            i = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        } else if (ordinal6 == 1) {
            i = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        } else if (ordinal6 == 2) {
            i = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Lazy lazy2 = this.x;
        if (lazy2.isInitialized()) {
            ImageView imageView = (ImageView) lazy2.getValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Lazy lazy3 = this.y;
        if (lazy3.isInitialized()) {
            ImageView imageView2 = (ImageView) lazy3.getValue();
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i;
                layoutParams2.height = i;
                imageView2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Lazy lazy4 = this.w;
        if (lazy4.isInitialized()) {
            aya aya = (aya) lazy4.getValue();
            int ordinal7 = getSize().ordinal();
            if (ordinal7 == 0) {
                yxa = wxa.a;
            } else if (ordinal7 == 1 || ordinal7 == 2) {
                yxa = vxa.a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            aya.setSize(yxa);
        }
        requestLayout();
        requestLayout();
        invalidate();
    }

    public final void l() {
        Lazy lazy = this.z;
        if (lazy.isInitialized()) {
            TextView textView = (TextView) lazy.getValue();
            textView.setTextColor(y64.H(getCurrentTheme(), getMode(), getAppearance(), textView.isEnabled()));
        }
    }

    public final void onThemeChanged(k2b k2b) {
        e();
    }

    public final void setAppearance(xpa xpa) {
        this.c.setValue(this, z0[2], xpa);
    }

    public final void setCustomTheme(k2b k2b) {
        this.o.setValue(this, z0[3], k2b);
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        f();
        l();
        invalidate();
    }

    public final void setEndIcon(Drawable drawable) {
        ImageView imageView = (ImageView) this.y.getValue();
        imageView.setId(dad.g);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        imageView.setVisibility(drawable == null ? 8 : 0);
        y7e.c(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void setMode(zpa zpa) {
        this.b.setValue(this, z0[1], zpa);
    }

    public final void setProgressEnabled(boolean z2) {
        this.v.setValue(this, z0[4], Boolean.valueOf(z2));
    }

    public final void setSize(aqa aqa) {
        this.a.setValue(this, z0[0], aqa);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.z.getValue();
        textView.setId(dad.j);
        textView.setText(charSequence);
        setupTextViewParams(textView);
        y7e.c(this, textView, Integer.valueOf(b(textView.getId())));
        l();
        k();
        i();
    }

    public final void setEndIcon(Integer num) {
        ImageView imageView = (ImageView) this.y.getValue();
        imageView.setId(dad.g);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        y7e.c(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        k();
        i();
    }

    public final void setText(int i) {
        TextView textView = (TextView) this.z.getValue();
        textView.setId(dad.j);
        textView.setText(i);
        setupTextViewParams(textView);
        y7e.c(this, textView, Integer.valueOf(b(textView.getId())));
        l();
        k();
        i();
    }
}
