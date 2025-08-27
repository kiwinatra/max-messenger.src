package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: tg0  reason: default package */
public final class tg0 {
    public final sg0 a;
    public final sg0 b = new sg0();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public tg0(int i2, int i3, Context context) {
        AttributeSet attributeSet;
        int i4;
        int next;
        sg0 sg0 = new sg0();
        int i5 = sg0.a;
        if (i5 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i5);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    i4 = asAttributeSet.getStyleAttribute();
                    attributeSet = asAttributeSet;
                } else {
                    throw new XmlPullParserException("Must have a <" + "badge" + "> start tag");
                }
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i5));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i4 = 0;
        }
        TypedArray d2 = vhf.d(context, attributeSet, tnc.Badge, i2, i4 == 0 ? i3 : i4, new int[0]);
        Resources resources = context.getResources();
        this.c = (float) d2.getDimensionPixelSize(tnc.Badge_badgeRadius, -1);
        this.i = context.getResources().getDimensionPixelSize(iec.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(iec.mtrl_badge_text_horizontal_edge_offset);
        this.d = (float) d2.getDimensionPixelSize(tnc.Badge_badgeWithTextRadius, -1);
        this.e = d2.getDimension(tnc.Badge_badgeWidth, resources.getDimension(iec.m3_badge_size));
        this.g = d2.getDimension(tnc.Badge_badgeWithTextWidth, resources.getDimension(iec.m3_badge_with_text_size));
        this.f = d2.getDimension(tnc.Badge_badgeHeight, resources.getDimension(iec.m3_badge_size));
        this.h = d2.getDimension(tnc.Badge_badgeWithTextHeight, resources.getDimension(iec.m3_badge_with_text_size));
        this.k = d2.getInt(tnc.Badge_offsetAlignmentMode, 1);
        sg0 sg02 = this.b;
        int i6 = sg0.z;
        sg02.z = i6 == -2 ? KotlinVersion.MAX_COMPONENT_VALUE : i6;
        int i7 = sg0.Y;
        if (i7 != -2) {
            sg02.Y = i7;
        } else if (d2.hasValue(tnc.Badge_number)) {
            this.b.Y = d2.getInt(tnc.Badge_number, 0);
        } else {
            this.b.Y = -1;
        }
        String str = sg0.X;
        if (str != null) {
            this.b.X = str;
        } else if (d2.hasValue(tnc.Badge_badgeText)) {
            this.b.X = d2.getString(tnc.Badge_badgeText);
        }
        sg0 sg03 = this.b;
        sg03.x0 = sg0.x0;
        CharSequence charSequence = sg0.y0;
        sg03.y0 = charSequence == null ? context.getString(ymc.mtrl_badge_numberless_content_description) : charSequence;
        sg0 sg04 = this.b;
        int i8 = sg0.z0;
        sg04.z0 = i8 == 0 ? kkc.mtrl_badge_content_description : i8;
        int i9 = sg0.A0;
        sg04.A0 = i9 == 0 ? ymc.mtrl_exceed_max_badge_number_content_description : i9;
        Boolean bool = sg0.C0;
        sg04.C0 = Boolean.valueOf(bool == null || bool.booleanValue());
        sg0 sg05 = this.b;
        int i10 = sg0.Z;
        sg05.Z = i10 == -2 ? d2.getInt(tnc.Badge_maxCharacterCount, -2) : i10;
        sg0 sg06 = this.b;
        int i11 = sg0.v0;
        sg06.v0 = i11 == -2 ? d2.getInt(tnc.Badge_maxNumber, -2) : i11;
        sg0 sg07 = this.b;
        Integer num = sg0.v;
        sg07.v = Integer.valueOf(num == null ? d2.getResourceId(tnc.Badge_badgeShapeAppearance, hnc.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        sg0 sg08 = this.b;
        Integer num2 = sg0.w;
        sg08.w = Integer.valueOf(num2 == null ? d2.getResourceId(tnc.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        sg0 sg09 = this.b;
        Integer num3 = sg0.x;
        sg09.x = Integer.valueOf(num3 == null ? d2.getResourceId(tnc.Badge_badgeWithTextShapeAppearance, hnc.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        sg0 sg010 = this.b;
        Integer num4 = sg0.y;
        sg010.y = Integer.valueOf(num4 == null ? d2.getResourceId(tnc.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        sg0 sg011 = this.b;
        Integer num5 = sg0.b;
        sg011.b = Integer.valueOf(num5 == null ? m5a.C(context, d2, tnc.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        sg0 sg012 = this.b;
        Integer num6 = sg0.o;
        sg012.o = Integer.valueOf(num6 == null ? d2.getResourceId(tnc.Badge_badgeTextAppearance, hnc.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = sg0.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (d2.hasValue(tnc.Badge_badgeTextColor)) {
            this.b.c = Integer.valueOf(m5a.C(context, d2, tnc.Badge_badgeTextColor).getDefaultColor());
        } else {
            int intValue = this.b.o.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, tnc.TextAppearance);
            obtainStyledAttributes.getDimension(tnc.TextAppearance_android_textSize, c44.DEFAULT_ASPECT_RATIO);
            ColorStateList C = m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColor);
            m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColorHint);
            m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(tnc.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(tnc.TextAppearance_android_typeface, 1);
            int i12 = tnc.TextAppearance_fontFamily;
            i12 = !obtainStyledAttributes.hasValue(i12) ? tnc.TextAppearance_android_fontFamily : i12;
            obtainStyledAttributes.getResourceId(i12, 0);
            obtainStyledAttributes.getString(i12);
            obtainStyledAttributes.getBoolean(tnc.TextAppearance_textAllCaps, false);
            m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowDx, c44.DEFAULT_ASPECT_RATIO);
            obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowDy, c44.DEFAULT_ASPECT_RATIO);
            obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowRadius, c44.DEFAULT_ASPECT_RATIO);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, tnc.MaterialTextAppearance);
            obtainStyledAttributes2.hasValue(tnc.MaterialTextAppearance_android_letterSpacing);
            obtainStyledAttributes2.getFloat(tnc.MaterialTextAppearance_android_letterSpacing, c44.DEFAULT_ASPECT_RATIO);
            obtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(C.getDefaultColor());
        }
        sg0 sg013 = this.b;
        Integer num8 = sg0.B0;
        sg013.B0 = Integer.valueOf(num8 == null ? d2.getInt(tnc.Badge_badgeGravity, 8388661) : num8.intValue());
        sg0 sg014 = this.b;
        Integer num9 = sg0.D0;
        sg014.D0 = Integer.valueOf(num9 == null ? d2.getDimensionPixelSize(tnc.Badge_badgeWidePadding, resources.getDimensionPixelSize(iec.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        sg0 sg015 = this.b;
        Integer num10 = sg0.E0;
        sg015.E0 = Integer.valueOf(num10 == null ? d2.getDimensionPixelSize(tnc.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(iec.m3_badge_with_text_vertical_padding)) : num10.intValue());
        sg0 sg016 = this.b;
        Integer num11 = sg0.F0;
        sg016.F0 = Integer.valueOf(num11 == null ? d2.getDimensionPixelOffset(tnc.Badge_horizontalOffset, 0) : num11.intValue());
        sg0 sg017 = this.b;
        Integer num12 = sg0.G0;
        sg017.G0 = Integer.valueOf(num12 == null ? d2.getDimensionPixelOffset(tnc.Badge_verticalOffset, 0) : num12.intValue());
        sg0 sg018 = this.b;
        Integer num13 = sg0.H0;
        sg018.H0 = Integer.valueOf(num13 == null ? d2.getDimensionPixelOffset(tnc.Badge_horizontalOffsetWithText, sg018.F0.intValue()) : num13.intValue());
        sg0 sg019 = this.b;
        Integer num14 = sg0.I0;
        sg019.I0 = Integer.valueOf(num14 == null ? d2.getDimensionPixelOffset(tnc.Badge_verticalOffsetWithText, sg019.G0.intValue()) : num14.intValue());
        sg0 sg020 = this.b;
        Integer num15 = sg0.L0;
        sg020.L0 = Integer.valueOf(num15 == null ? d2.getDimensionPixelOffset(tnc.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        sg0 sg021 = this.b;
        Integer num16 = sg0.J0;
        sg021.J0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        sg0 sg022 = this.b;
        Integer num17 = sg0.K0;
        sg022.K0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        sg0 sg023 = this.b;
        Boolean bool2 = sg0.M0;
        sg023.M0 = Boolean.valueOf(bool2 == null ? d2.getBoolean(tnc.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        d2.recycle();
        Locale locale = sg0.w0;
        if (locale == null) {
            this.b.w0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.w0 = locale;
        }
        this.a = sg0;
    }
}
