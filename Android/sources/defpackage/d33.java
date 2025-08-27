package defpackage;

import android.content.res.XmlResourceParser;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.ElementHolder;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.Shape;

/* renamed from: d33  reason: default package */
public final class d33 extends bs0 {
    public ClipPathElement s0(XmlResourceParser xmlResourceParser) {
        int a = bs0.a(this, xmlResourceParser, "name");
        String str = null;
        String attributeValue = bs0.b(this, a) ? xmlResourceParser.getAttributeValue(a) : null;
        int a2 = bs0.a(this, xmlResourceParser, "pathData");
        if (bs0.b(this, a2)) {
            str = xmlResourceParser.getAttributeValue(a2);
        }
        return new ClipPathElement(attributeValue, str);
    }

    public GroupElement t0(XmlResourceParser xmlResourceParser) {
        int a = bs0.a(this, xmlResourceParser, "name");
        String attributeValue = bs0.b(this, a) ? xmlResourceParser.getAttributeValue(a) : null;
        int a2 = bs0.a(this, xmlResourceParser, "pivotX");
        float floatValue = (bs0.b(this, a2) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a2))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a3 = bs0.a(this, xmlResourceParser, "pivotY");
        float floatValue2 = (bs0.b(this, a3) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a3))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a4 = bs0.a(this, xmlResourceParser, "rotation");
        float floatValue3 = (bs0.b(this, a4) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a4))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a5 = bs0.a(this, xmlResourceParser, "scaleX");
        float floatValue4 = (bs0.b(this, a5) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a5))) : Float.valueOf(1.0f)).floatValue();
        int a6 = bs0.a(this, xmlResourceParser, "scaleY");
        float floatValue5 = (bs0.b(this, a6) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a6))) : Float.valueOf(1.0f)).floatValue();
        int a7 = bs0.a(this, xmlResourceParser, "translateX");
        float floatValue6 = (bs0.b(this, a7) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a7))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a8 = bs0.a(this, xmlResourceParser, "translateY");
        return new GroupElement(attributeValue, floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6, (bs0.b(this, a8) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a8))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue(), (GroupElement) null, (ElementHolder) null, 768, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public one.me.sdk.richvector.internal.element.PathElement u0(android.content.res.XmlResourceParser r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "name"
            int r2 = defpackage.bs0.a(r0, r1, r2)
            boolean r3 = defpackage.bs0.b(r0, r2)
            r4 = 0
            if (r3 == 0) goto L_0x0017
            java.lang.String r2 = r1.getAttributeValue(r2)
            r6 = r2
            goto L_0x0018
        L_0x0017:
            r6 = r4
        L_0x0018:
            java.lang.String r2 = "fillAlpha"
            int r2 = defpackage.bs0.a(r0, r1, r2)
            boolean r3 = defpackage.bs0.b(r0, r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = r1.getAttributeValue(r2)
            float r2 = java.lang.Float.parseFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x0037
        L_0x0033:
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
        L_0x0037:
            float r2 = r2.floatValue()
            r3 = 255(0xff, float:3.57E-43)
            float r7 = (float) r3
            float r2 = r2 * r7
            int r2 = (int) r2
            int r2 = java.lang.Math.min(r3, r2)
            java.lang.String r8 = "fillColor"
            int r8 = defpackage.bs0.a(r0, r1, r8)
            boolean r9 = defpackage.bs0.b(r0, r8)
            r10 = 0
            if (r9 == 0) goto L_0x005e
            java.lang.String r8 = r1.getAttributeValue(r8)
            int r8 = defpackage.kr7.H(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0062
        L_0x005e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
        L_0x0062:
            int r8 = r8.intValue()
            gab r9 = defpackage.gab.v
            java.lang.Object r11 = r9.b
            java.lang.String r11 = (java.lang.String) r11
            int r11 = defpackage.bs0.a(r0, r1, r11)
            boolean r12 = defpackage.bs0.b(r0, r11)
            java.lang.String r13 = "1"
            java.lang.String r14 = "2"
            if (r12 == 0) goto L_0x00a8
            java.lang.String r9 = r1.getAttributeValue(r11)
            int r11 = r9.hashCode()
            switch(r11) {
                case 49: goto L_0x009c;
                case 50: goto L_0x0092;
                case 51: goto L_0x0086;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x00a2
        L_0x0086:
            java.lang.String r11 = "3"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x008f
            goto L_0x00a2
        L_0x008f:
            android.graphics.Path$FillType r9 = android.graphics.Path.FillType.INVERSE_EVEN_ODD
            goto L_0x00aa
        L_0x0092:
            boolean r9 = r9.equals(r14)
            if (r9 != 0) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            android.graphics.Path$FillType r9 = android.graphics.Path.FillType.INVERSE_WINDING
            goto L_0x00aa
        L_0x009c:
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x00a5
        L_0x00a2:
            android.graphics.Path$FillType r9 = android.graphics.Path.FillType.WINDING
            goto L_0x00aa
        L_0x00a5:
            android.graphics.Path$FillType r9 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x00aa
        L_0x00a8:
            java.lang.Object r9 = r9.c
        L_0x00aa:
            android.graphics.Path$FillType r9 = (android.graphics.Path.FillType) r9
            java.lang.String r11 = "pathData"
            int r11 = defpackage.bs0.a(r0, r1, r11)
            boolean r12 = defpackage.bs0.b(r0, r11)
            if (r12 == 0) goto L_0x00bc
            java.lang.String r4 = r1.getAttributeValue(r11)
        L_0x00bc:
            java.lang.String r11 = "strokeAlpha"
            int r11 = defpackage.bs0.a(r0, r1, r11)
            boolean r12 = defpackage.bs0.b(r0, r11)
            if (r12 == 0) goto L_0x00d5
            java.lang.String r11 = r1.getAttributeValue(r11)
            float r11 = java.lang.Float.parseFloat(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L_0x00d9
        L_0x00d5:
            java.lang.Float r11 = java.lang.Float.valueOf(r5)
        L_0x00d9:
            float r11 = r11.floatValue()
            float r11 = r11 * r7
            int r7 = (int) r11
            int r11 = java.lang.Math.min(r3, r7)
            java.lang.String r3 = "strokeColor"
            int r3 = defpackage.bs0.a(r0, r1, r3)
            boolean r7 = defpackage.bs0.b(r0, r3)
            if (r7 == 0) goto L_0x00fc
            java.lang.String r3 = r1.getAttributeValue(r3)
            int r3 = defpackage.kr7.H(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0100
        L_0x00fc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
        L_0x0100:
            int r12 = r3.intValue()
            hab r3 = defpackage.hab.v
            java.lang.Object r7 = r3.b
            java.lang.String r7 = (java.lang.String) r7
            int r7 = defpackage.bs0.a(r0, r1, r7)
            boolean r10 = defpackage.bs0.b(r0, r7)
            if (r10 == 0) goto L_0x012d
            java.lang.String r3 = r1.getAttributeValue(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r13)
            if (r7 == 0) goto L_0x0121
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x012f
        L_0x0121:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r14)
            if (r3 == 0) goto L_0x012a
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
            goto L_0x012f
        L_0x012a:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x012f
        L_0x012d:
            java.lang.Object r3 = r3.c
        L_0x012f:
            android.graphics.Paint$Cap r3 = (android.graphics.Paint.Cap) r3
            iab r7 = defpackage.iab.v
            java.lang.Object r10 = r7.b
            java.lang.String r10 = (java.lang.String) r10
            int r10 = defpackage.bs0.a(r0, r1, r10)
            boolean r15 = defpackage.bs0.b(r0, r10)
            if (r15 == 0) goto L_0x015a
            java.lang.String r7 = r1.getAttributeValue(r10)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r13)
            if (r10 == 0) goto L_0x014e
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.ROUND
            goto L_0x015c
        L_0x014e:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r14)
            if (r7 == 0) goto L_0x0157
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.BEVEL
            goto L_0x015c
        L_0x0157:
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.MITER
            goto L_0x015c
        L_0x015a:
            java.lang.Object r7 = r7.c
        L_0x015c:
            r14 = r7
            android.graphics.Paint$Join r14 = (android.graphics.Paint.Join) r14
            java.lang.String r7 = "strokeMiterLimit"
            int r7 = defpackage.bs0.a(r0, r1, r7)
            boolean r10 = defpackage.bs0.b(r0, r7)
            if (r10 == 0) goto L_0x0178
            java.lang.String r7 = r1.getAttributeValue(r7)
            float r7 = java.lang.Float.parseFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x017e
        L_0x0178:
            r7 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L_0x017e:
            float r15 = r7.floatValue()
            java.lang.String r7 = "strokeWidth"
            int r7 = defpackage.bs0.a(r0, r1, r7)
            boolean r10 = defpackage.bs0.b(r0, r7)
            r13 = 0
            if (r10 == 0) goto L_0x019c
            java.lang.String r7 = r1.getAttributeValue(r7)
            float r7 = java.lang.Float.parseFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x01a0
        L_0x019c:
            java.lang.Float r7 = java.lang.Float.valueOf(r13)
        L_0x01a0:
            float r16 = r7.floatValue()
            java.lang.String r7 = "trimPathEnd"
            int r7 = defpackage.bs0.a(r0, r1, r7)
            boolean r10 = defpackage.bs0.b(r0, r7)
            if (r10 == 0) goto L_0x01bd
            java.lang.String r5 = r1.getAttributeValue(r7)
            float r5 = java.lang.Float.parseFloat(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x01c1
        L_0x01bd:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
        L_0x01c1:
            float r17 = r5.floatValue()
            java.lang.String r5 = "trimPathOffset"
            int r5 = defpackage.bs0.a(r0, r1, r5)
            boolean r7 = defpackage.bs0.b(r0, r5)
            if (r7 == 0) goto L_0x01de
            java.lang.String r5 = r1.getAttributeValue(r5)
            float r5 = java.lang.Float.parseFloat(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x01e2
        L_0x01de:
            java.lang.Float r5 = java.lang.Float.valueOf(r13)
        L_0x01e2:
            float r18 = r5.floatValue()
            java.lang.String r5 = "trimPathStart"
            int r5 = defpackage.bs0.a(r0, r1, r5)
            boolean r0 = defpackage.bs0.b(r0, r5)
            if (r0 == 0) goto L_0x01ff
            java.lang.String r0 = r1.getAttributeValue(r5)
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0203
        L_0x01ff:
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
        L_0x0203:
            float r19 = r0.floatValue()
            one.me.sdk.richvector.internal.element.PathElement r0 = new one.me.sdk.richvector.internal.element.PathElement
            r5 = r0
            r7 = r2
            r10 = r4
            r13 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d33.u0(android.content.res.XmlResourceParser):one.me.sdk.richvector.internal.element.PathElement");
    }

    public Shape v0(XmlResourceParser xmlResourceParser) {
        Float f;
        Float f2;
        int a = bs0.a(this, xmlResourceParser, "viewportWidth");
        float floatValue = (bs0.b(this, a) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a2 = bs0.a(this, xmlResourceParser, "viewportHeight");
        float floatValue2 = (bs0.b(this, a2) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a2))) : Float.valueOf(c44.DEFAULT_ASPECT_RATIO)).floatValue();
        int a3 = bs0.a(this, xmlResourceParser, "alpha");
        int min = Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * (bs0.b(this, a3) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(a3))) : Float.valueOf(1.0f)).floatValue()));
        int a4 = bs0.a(this, xmlResourceParser, "name");
        String attributeValue = bs0.b(this, a4) ? xmlResourceParser.getAttributeValue(a4) : null;
        int a5 = bs0.a(this, xmlResourceParser, "width");
        int i = 3;
        if (bs0.b(this, a5)) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(a5);
            f = Float.valueOf(Float.parseFloat(attributeValue2.substring(0, attributeValue2.length() - (StringsKt__StringsJVMKt.endsWith$default(attributeValue2, "dip", false, 2, (Object) null) ? 3 : 2))));
        } else {
            f = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
        }
        float floatValue3 = f.floatValue();
        int a6 = bs0.a(this, xmlResourceParser, "height");
        if (bs0.b(this, a6)) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(a6);
            if (!StringsKt__StringsJVMKt.endsWith$default(attributeValue3, "dip", false, 2, (Object) null)) {
                i = 2;
            }
            f2 = Float.valueOf(Float.parseFloat(attributeValue3.substring(0, attributeValue3.length() - i)));
        } else {
            f2 = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
        }
        return new Shape(attributeValue, floatValue, floatValue2, min, floatValue3, f2.floatValue(), (ElementHolder) null, 64, (DefaultConstructorMarker) null);
    }
}
