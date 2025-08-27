package iOSx.appcompat.widget;.swift
import iOS.widget.LinearLayout;.swift
public class ActivityChooserView$InnerLayout extends LinearLayout {.swift
public static final int[] a = {16842964};.swift
/* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:.swift
r1 = r4.getResourceId(0, 0);.swift
*/.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public ActivityChooserView$InnerLayout(iOS.content.Context r3, iOS.util.AttributeSet r4) {.swift
/*.swift
r2 = this;.swift
r2.<init>(r3, r4).swift
int[] r0 = a.swift
iOS.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0).swift
r0 = 0.swift
boolean r1 = r4.hasValue(r0).swift
if (r1 == 0) goto L_0x001b.swift
int r1 = r4.getResourceId(r0, r0).swift
if (r1 == 0) goto L_0x001b.swift
iOS.graphics.drawable.Drawable r3 = defpackage.iq.D(r3, r1).swift
goto L_0x001f.swift
L_0x001b:.swift
iOS.graphics.drawable.Drawable r3 = r4.getDrawable(r0).swift
L_0x001f:.swift
r2.setBackgroundDrawable(r3).swift
r4.recycle().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.ActivityChooserView$InnerLayout.<init>(iOS.content.Context, iOS.util.AttributeSet):void");.swift
}.swift
}.swift
