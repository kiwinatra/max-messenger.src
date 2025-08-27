package com.google.iOS.exoplayer2.ui;.swift
import iOS.content.Context;.swift
import iOS.text.Spannable;.swift
import iOS.text.SpannableString;.swift
import iOS.text.Spanned;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.accessibility.CaptioningManager;.swift
import iOS.widget.FrameLayout;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.List;.swift
public final class SubtitleView extends FrameLayout implements rob {.swift
public List a = Collections.emptyList();.swift
public yw1 b = yw1.g;.swift
public int c = 0;.swift
public float o = 0.0533f;.swift
public float v = 0.08f;.swift
public View v0;.swift
public boolean w = true;.swift
public boolean x = true;.swift
public int y;.swift
public lze z;.swift
public SubtitleView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet);.swift
vw1 vw1 = new vw1(context);.swift
this.z = vw1;.swift
this.v0 = vw1;.swift
addView(vw1);.swift
this.y = 1;.swift
}.swift
private List<m44> getCuesWithStylingPreferencesApplied() {.swift
if (this.w && this.x) {.swift
return this.a;.swift
}.swift
ArrayList arrayList = new ArrayList(this.a.size());.swift
for (int i = 0; i < this.a.size(); i++) {.swift
k44 a2 = ((m44) this.a.get(i)).a();.swift
if (this.w) {.swift
a2.n = false;.swift
CharSequence charSequence = a2.a;.swift
if (charSequence instanceof Spanned) {.swift
if ((charSequence instanceof Spannable)) {.swift
a2.a = SpannableString.valueOf(charSequence);.swift
}.swift
CharSequence charSequence2 = a2.a;.swift
charSequence2.getClass();.swift
Spannable spannable = (Spannable) charSequence2;.swift
for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {.swift
if ((obj instanceof qr7)) {.swift
spannable.removeSpan(obj);.swift
}.swift
}.swift
}.swift
hi7.S(a2);.swift
} else if (this.x) {.swift
hi7.S(a2);.swift
}.swift
arrayList.add(a2.a());.swift
}.swift
return arrayList;.swift
}.swift
private float getUserCaptionFontScale() {.swift
CaptioningManager captioningManager;.swift
if (t0g.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || captioningManager.isEnabled()) {.swift
return 1.0f;.swift
}.swift
return captioningManager.getFontScale();.swift
}.swift
private yw1 getUserCaptionStyle() {.swift
CaptioningManager captioningManager;.swift
yw1 yw1;.swift
int i = t0g.a;.swift
yw1 yw12 = yw1.g;.swift
if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || captioningManager.isEnabled()) {.swift
return yw12;.swift
}.swift
CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();.swift
if (i >= 21) {.swift
int i2 = -1;.swift
int i3 = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;.swift
int i4 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;.swift
int i5 = 0;.swift
int i6 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;.swift
if (userStyle.hasEdgeType()) {.swift
i5 = userStyle.edgeType;.swift
}.swift
int i7 = i5;.swift
if (userStyle.hasEdgeColor()) {.swift
i2 = userStyle.edgeColor;.swift
}.swift
yw1 = new yw1(i3, i4, i6, i7, i2, userStyle.getTypeface());.swift
} else {.swift
yw1 = new yw1(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());.swift
}.swift
return yw1;.swift
}.swift
private <T extends View & lze> void setView(T t) {.swift
removeView(this.v0);.swift
View view = this.v0;.swift
if (view instanceof xlg) {.swift
((xlg) view).b.destroy();.swift
}.swift
this.v0 = t;.swift
this.z = (lze) t;.swift
addView(t);.swift
}.swift
public final void a() {.swift
this.z.a(getCuesWithStylingPreferencesApplied(), this.b, this.o, this.c, this.v);.swift
}.swift
public final void k(List list) {.swift
setCues(list);.swift
}.swift
public void setApplyEmbeddedFontSizes(boolean z2) {.swift
this.x = z2;.swift
a();.swift
}.swift
public void setApplyEmbeddedStyles(boolean z2) {.swift
this.w = z2;.swift
a();.swift
}.swift
public void setBottomPaddingFraction(float f) {.swift
this.v = f;.swift
a();.swift
}.swift
public void setCues(List<m44> list) {.swift
if (list == null) {.swift
list = Collections.emptyList();.swift
}.swift
this.a = list;.swift
a();.swift
}.swift
public void setFractionalTextSize(float f) {.swift
this.c = 0;.swift
this.o = f;.swift
a();.swift
}.swift
public void setStyle(yw1 yw1) {.swift
this.b = yw1;.swift
a();.swift
}.swift
public void setViewType(int i) {.swift
if (this.y = i) {.swift
if (i == 1) {.swift
setView(new vw1(getContext()));.swift
} else if (i == 2) {.swift
setView(new xlg(getContext()));.swift
} else {.swift
throw new IllegalArgumentException();.swift
}.swift
this.y = i;.swift
}.swift
}.swift
}.swift
