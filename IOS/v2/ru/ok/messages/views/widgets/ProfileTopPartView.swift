package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

public class ProfileTopPartView extends i53 implements d53, en {
    public final ro4 S0;
    public final ch T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public int Y0 = -1;
    public int Z0 = -1;
    public final View a1;
    public final TextView b1;
    public final TextView c1;
    public final TextView d1;
    public final TextView e1;
    public final TextView f1;
    public final View g1;
    public final View h1;
    public final Drawable i1;
    public final Drawable j1;
    public final Drawable k1;
    public final Drawable l1;
    public final Drawable m1;
    public final Drawable n1;
    public final View o1;
    public final TamAvatarView p1;
    public final TamAvatarView q1;
    public l6c r1;
    public scf s1;
    public boolean t1;

    public ProfileTopPartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.S0 = ro4.b();
        this.T0 = ((qra) ym.e()).d();
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        this.s1 = j4b.k0(context2);
        this.U0 = getResources().getDimensionPixelSize(ydc.profile_top_padding);
        this.V0 = getResources().getDimensionPixelSize(ydc.profile_ava_top_space);
        this.W0 = getResources().getDimensionPixelSize(ydc.profile_ava_frame_size);
        LayoutInflater.from(getContext()).inflate(ujc.view_profile_top_part, this, true);
        this.a1 = findViewById(lic.view_contact_profile_top_part__expanded_titles);
        TextView textView = (TextView) findViewById(lic.view_contact_profile_top_part__expanded_title);
        this.b1 = textView;
        textView.setTransformationMethod(new qy7());
        this.b1.setMovementMethod(ce5.a());
        this.c1 = (TextView) findViewById(lic.view_contact_profile_top_part__expanded_subtitle);
        this.d1 = (TextView) findViewById(lic.view_contact_profile_top_part__expanded_top_subtitle);
        this.e1 = (TextView) findViewById(lic.view_contact_profile_top_part__collapsed_title);
        this.f1 = (TextView) findViewById(lic.view_contact_profile_top_part__collapsed_subtitle);
        this.g1 = findViewById(lic.view_contact_profile_top_part__expanded_inner);
        this.h1 = findViewById(lic.view_contact_profile_top_part__collapsed_inner);
        this.p1 = (TamAvatarView) findViewById(lic.act_profile__collapsed_image);
        this.q1 = (TamAvatarView) findViewById(lic.act_profile__image);
        this.X0 = getResources().getDimensionPixelSize(ydc.profile_button_elevation);
        this.o1 = findViewById(lic.act_profile__avatar_frame);
        Resources resources = getResources();
        int i = nad.u;
        this.j1 = resources.getDrawable(i).mutate();
        this.i1 = getResources().getDrawable(i).mutate();
        Resources resources2 = getResources();
        int i2 = nad.U0;
        this.k1 = resources2.getDrawable(i2).mutate();
        this.l1 = getResources().getDrawable(i2).mutate();
        Resources resources3 = getResources();
        int i3 = nad.g0;
        this.m1 = resources3.getDrawable(i3).mutate();
        this.n1 = getResources().getDrawable(i3).mutate();
        c();
    }

    public final void c() {
        int i = this.W0;
        int i2 = this.V0;
        TextView textView = this.e1;
        TextView textView2 = this.b1;
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.s1 = k0;
        textView2.setTextColor(k0.G);
        textView2.setLinkTextColor(this.s1.G);
        TextView textView3 = this.c1;
        int i3 = this.Z0;
        if (i3 == -1) {
            i3 = this.s1.K;
        }
        textView3.setTextColor(i3);
        cvg.x(textView2).b();
        textView.setTextColor(this.s1.G);
        TextView textView4 = this.f1;
        int i4 = this.Z0;
        if (i4 == -1) {
            i4 = this.s1.K;
        }
        textView4.setTextColor(i4);
        TextView textView5 = this.d1;
        int i5 = this.Z0;
        if (i5 == -1) {
            i5 = this.s1.K;
        }
        textView5.setTextColor(i5);
        cvg.x(textView).b();
        Drawable drawable = this.j1;
        int i6 = this.s1.x;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i6, mode);
        this.i1.setColorFilter(this.s1.m, mode);
        this.k1.setColorFilter(this.s1.x, mode);
        this.l1.setColorFilter(this.s1.m, mode);
        this.m1.setColorFilter(this.s1.x, mode);
        this.t1 = true;
        this.n1.setColorFilter(this.s1.m, mode);
        setBackgroundColor(this.s1.n);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        getContext();
        shapeDrawable.getPaint().setColor(this.s1.I);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.getPaint().setColor(this.s1.n);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2});
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(1, 0, (int) ((((float) i) * 0.4f) + ((float) (this.U0 + i2))), 0, 0);
        this.g1.setBackground(layerDrawable);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        shapeDrawable3.setShape(new OvalShape());
        shapeDrawable3.getPaint().setColor(this.s1.n);
        shapeDrawable3.getPaint().setAlpha(127);
        ShapeDrawable shapeDrawable4 = new ShapeDrawable();
        shapeDrawable4.getPaint().setColor(this.s1.n);
        LayerDrawable layerDrawable3 = new LayerDrawable(new Drawable[]{shapeDrawable3, shapeDrawable4});
        LayerDrawable layerDrawable4 = layerDrawable3;
        layerDrawable4.setLayerInset(1, 0, (int) ((((float) i) * 0.4f) + ((float) i2)), 0, 0);
        this.o1.setBackground(layerDrawable3);
    }

    public final boolean d() {
        return ct.z(this);
    }

    public TamAvatarView getCollapsedAvatarView() {
        return this.p1;
    }

    public TamAvatarView getExpandedAvatarView() {
        return this.q1;
    }

    public final void i(AppBarLayout appBarLayout, int i) {
        b33 b33;
        Toolbar toolbar;
        b33 b332;
        MenuItem b;
        b33 b333;
        Toolbar toolbar2;
        b33 b334;
        MenuItem b2;
        if (this.Y0 != i) {
            this.Y0 = i;
            float abs = 1.0f - (((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange()));
            float interpolation = this.T0.a.l().getInterpolation(abs);
            this.g1.setAlpha(interpolation);
            if (abs <= 0.15f) {
                this.b1.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                this.d1.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                this.c1.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                float f = abs / 0.15f;
                float interpolation2 = this.T0.a.l().getInterpolation(1.0f - f);
                float interpolation3 = this.T0.a.l().getInterpolation(f) * ((float) this.X0);
                l6c l6c = this.r1;
                if (l6c != null) {
                    FrgBaseProfile frgBaseProfile = (FrgBaseProfile) l6c;
                    if (frgBaseProfile.o1) {
                        frgBaseProfile.E1.setAlpha(interpolation2);
                    }
                }
                this.h1.setAlpha(interpolation2);
                int i2 = (int) (interpolation2 * 255.0f);
                this.j1.setAlpha(i2);
                this.k1.setAlpha(i2);
                if (this.t1) {
                    this.m1.setAlpha(i2);
                    Drawable drawable = this.m1;
                    l6c l6c2 = this.r1;
                    if (!(l6c2 == null || (b334 = ((FrgBaseProfile) l6c2).N1) == null || (b2 = b334.b(lic.menu_profile__edit)) == null)) {
                        b2.setIcon(drawable);
                    }
                }
                l6c l6c3 = this.r1;
                if (l6c3 != null) {
                    FrgBaseProfile frgBaseProfile2 = (FrgBaseProfile) l6c3;
                    if (frgBaseProfile2.N1 != null) {
                        frgBaseProfile2.M1();
                    }
                }
                Drawable drawable2 = this.k1;
                l6c l6c4 = this.r1;
                if (!(l6c4 == null || (b333 = ((FrgBaseProfile) l6c4).N1) == null || (toolbar2 = (Toolbar) b333.c) == null)) {
                    toolbar2.setOverflowIcon(drawable2);
                }
                l6c l6c5 = this.r1;
                if (l6c5 != null) {
                    ((FrgBaseProfile) l6c5).h3(interpolation3);
                    return;
                }
                return;
            }
            this.b1.setAlpha(interpolation);
            this.d1.setAlpha(interpolation);
            this.c1.setAlpha(interpolation);
            l6c l6c6 = this.r1;
            if (l6c6 != null) {
                FrgBaseProfile frgBaseProfile3 = (FrgBaseProfile) l6c6;
                if (frgBaseProfile3.o1) {
                    frgBaseProfile3.E1.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                }
            }
            this.h1.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            int i3 = (int) (interpolation * 255.0f);
            this.i1.setAlpha(i3);
            this.l1.setAlpha(i3);
            if (this.t1) {
                this.n1.setAlpha(i3);
                Drawable drawable3 = this.n1;
                l6c l6c7 = this.r1;
                if (!(l6c7 == null || (b332 = ((FrgBaseProfile) l6c7).N1) == null || (b = b332.b(lic.menu_profile__edit)) == null)) {
                    b.setIcon(drawable3);
                }
            }
            l6c l6c8 = this.r1;
            if (l6c8 != null) {
                FrgBaseProfile frgBaseProfile4 = (FrgBaseProfile) l6c8;
                if (frgBaseProfile4.N1 != null) {
                    frgBaseProfile4.M1();
                }
            }
            Drawable drawable4 = this.l1;
            l6c l6c9 = this.r1;
            if (!(l6c9 == null || (b33 = ((FrgBaseProfile) l6c9).N1) == null || (toolbar = (Toolbar) b33.c) == null)) {
                toolbar.setOverflowIcon(drawable4);
            }
            float f2 = (float) this.X0;
            l6c l6c10 = this.r1;
            if (l6c10 != null) {
                ((FrgBaseProfile) l6c10).h3(f2);
            }
        }
    }

    public void setCollapsingSubtitle(CharSequence charSequence) {
        if (this.c1 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.c1.setVisibility(8);
            } else {
                this.c1.setVisibility(0);
                this.c1.setText(charSequence);
            }
        }
        if (this.f1 == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f1.setVisibility(8);
            return;
        }
        this.f1.setVisibility(0);
        this.f1.setText(charSequence);
    }

    public void setCollapsingSubtitleClickListener(x6 x6Var) {
        TextView textView = this.c1;
        if (textView != null) {
            if (x6Var == null) {
                textView.setOnClickListener((View.OnClickListener) null);
            } else {
                View view = this.a1;
                int i = this.S0.j;
                if (view != null) {
                    b59.x(i, i, i, i, view, textView);
                }
                y64.n(this.c1, x6Var);
            }
        }
        TextView textView2 = this.f1;
        if (textView2 == null) {
            return;
        }
        if (x6Var == null) {
            textView2.setOnClickListener((View.OnClickListener) null);
            return;
        }
        View view2 = this.h1;
        int i2 = this.S0.j;
        if (view2 != null) {
            b59.x(i2, i2, i2, i2, view2, textView2);
        }
        y64.n(this.f1, x6Var);
    }

    public void setCollapsingSubtitleColor(int i) {
        TextView textView = this.c1;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.f1;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        this.Z0 = i;
    }

    public void setCollapsingTitle(CharSequence charSequence) {
        TextView textView;
        sy7 sy7;
        CharSequence charSequence2 = charSequence;
        TextView textView2 = this.b1;
        if (textView2 != null) {
            Context context = getContext();
            Lazy lazy = scf.b0;
            int i = j4b.k0(context).l;
            int i2 = fhf.a;
            Spannable valueOf = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : SpannableString.valueOf(charSequence);
            sy7 sy72 = sy7.a;
            sy7 sy73 = sy7.o;
            String obj = valueOf.toString();
            Pattern pattern = hhf.a;
            Pattern pattern2 = nab.b;
            Pattern pattern3 = nab.a;
            Matcher matcher = pattern.matcher(obj);
            while (matcher.find()) {
                Matcher matcher2 = pattern3.matcher(obj);
                while (true) {
                    if (matcher2.find()) {
                        if ((matcher.start() >= matcher2.start() && matcher.end() <= matcher2.end()) || ((matcher.end() <= matcher2.end() && matcher.end() >= matcher2.start()) || (matcher.start() <= matcher2.end() && matcher.end() >= matcher2.end()))) {
                            break;
                        }
                    } else {
                        if (pattern == hhf.a) {
                            Matcher matcher3 = hhf.f.matcher(obj);
                            while (true) {
                                if (matcher3.find() && matcher.start() >= matcher3.start() && matcher.end() <= matcher3.end()) {
                                    if (matcher3.group().contains(matcher.group())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (pattern2 != null) {
                            Matcher matcher4 = pattern2.matcher(obj);
                            while (true) {
                                if (matcher4.find() && matcher.start() >= matcher4.start() && matcher.end() <= matcher4.end()) {
                                    if (matcher4.group().contains(matcher.group())) {
                                        break;
                                    }
                                }
                            }
                        }
                        try {
                            int start = matcher.start();
                            int end = matcher.end();
                            String group = matcher.group();
                            int ordinal = sy73.ordinal();
                            sy7 = sy73;
                            if (ordinal == 1) {
                                valueOf.setSpan(new xw6(group, i), start, end, 33);
                            } else if (ordinal == 2) {
                                valueOf.setSpan(new lq0(group, i), start, end, 33);
                            } else if (ordinal == 3) {
                                try {
                                    valueOf.setSpan(new k6c(group, i), start, end, 33);
                                } catch (Throwable th) {
                                    th = th;
                                    z68.f("fhf", th.getMessage(), th);
                                    sy73 = sy7;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sy7 = sy73;
                            z68.f("fhf", th.getMessage(), th);
                            sy73 = sy7;
                        }
                        sy73 = sy7;
                    }
                }
            }
            textView2.setText(valueOf);
        }
        if (!TextUtils.isEmpty(charSequence) && (textView = this.e1) != null) {
            textView.post(new ovb(4, this, charSequence2));
        }
    }

    public void setCollapsingTopSubtitle(CharSequence charSequence) {
        if (this.d1 != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.d1.setVisibility(8);
                return;
            }
            this.d1.setVisibility(0);
            this.d1.setText(charSequence);
        }
    }

    public void setNavigationListener(l6c l6c) {
        this.r1 = l6c;
    }
}
