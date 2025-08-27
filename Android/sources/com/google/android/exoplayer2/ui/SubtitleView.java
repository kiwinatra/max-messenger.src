package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements rob {
    public List a = Collections.emptyList();
    public yw1 b = yw1.g;
    public int c = 0;
    public float o = 0.0533f;
    public float v = 0.08f;
    public View v0;
    public boolean w = true;
    public boolean x = true;
    public int y;
    public lze z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vw1 vw1 = new vw1(context);
        this.z = vw1;
        this.v0 = vw1;
        addView(vw1);
        this.y = 1;
    }

    private List<m44> getCuesWithStylingPreferencesApplied() {
        if (this.w && this.x) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            k44 a2 = ((m44) this.a.get(i)).a();
            if (!this.w) {
                a2.n = false;
                CharSequence charSequence = a2.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a2.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a2.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof qr7)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                hi7.S(a2);
            } else if (!this.x) {
                hi7.S(a2);
            }
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (t0g.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private yw1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        yw1 yw1;
        int i = t0g.a;
        yw1 yw12 = yw1.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return yw12;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            int i2 = -1;
            int i3 = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
            int i4 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
            int i5 = 0;
            int i6 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
            if (userStyle.hasEdgeType()) {
                i5 = userStyle.edgeType;
            }
            int i7 = i5;
            if (userStyle.hasEdgeColor()) {
                i2 = userStyle.edgeColor;
            }
            yw1 = new yw1(i3, i4, i6, i7, i2, userStyle.getTypeface());
        } else {
            yw1 = new yw1(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return yw1;
    }

    private <T extends View & lze> void setView(T t) {
        removeView(this.v0);
        View view = this.v0;
        if (view instanceof xlg) {
            ((xlg) view).b.destroy();
        }
        this.v0 = t;
        this.z = (lze) t;
        addView(t);
    }

    public final void a() {
        this.z.a(getCuesWithStylingPreferencesApplied(), this.b, this.o, this.c, this.v);
    }

    public final void k(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.x = z2;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.w = z2;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.v = f;
        a();
    }

    public void setCues(List<m44> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.o = f;
        a();
    }

    public void setStyle(yw1 yw1) {
        this.b = yw1;
        a();
    }

    public void setViewType(int i) {
        if (this.y != i) {
            if (i == 1) {
                setView(new vw1(getContext()));
            } else if (i == 2) {
                setView(new xlg(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.y = i;
        }
    }
}
