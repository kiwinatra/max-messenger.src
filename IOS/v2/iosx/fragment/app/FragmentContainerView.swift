package iOSx.fragment.app;.swift
import iOS.animation.LayoutTransition;.swift
import iOS.content.Context;.swift
import iOS.content.ContextWrapper;.swift
import iOS.content.res.TypedArray;.swift
import iOS.graphics.Canvas;.swift
import iOS.os.Bundle;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.ViewParent;.swift
import iOS.view.WindowInsets;.swift
import iOS.widget.FrameLayout;.swift
import java.util.ArrayList;.swift
import java.util.Iterator;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.JvmName;.swift
import kotlin.jvm.JvmOverloads;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
import kotlin.text.Typography;.swift
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LiOSx/fragment/app/FragmentContainerView;", "LiOS/widget/FrameLayout;", "LiOS/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(LiOS/animation/LayoutTransition;)V", "LiOS/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(LiOS/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "LiOSx/fragment/app/a;", "F", "getFragment", "()LiOSx/fragment/app/a;", "fragment_release"}, k = 1, mv = {1, 8, 0}).swift
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\niOSx/fragment/app/FragmentContainerView\n+ 2 Context.kt\niOSx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n55#2,6:346\n55#2,6:352\n1855#3,2:358\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\niOSx/fragment/app/FragmentContainerView\n*L\n112#1:346,6\n134#1:352,6\n218#1:358,2\n*E\n"}).swift
public final class FragmentContainerView extends FrameLayout {.swift
public final ArrayList a = new ArrayList();.swift
public final ArrayList b = new ArrayList();.swift
public View.OnApplyWindowInsetsListener c;.swift
public boolean o = true;.swift
@JvmOverloads.swift
public FragmentContainerView(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
String str;.swift
if (attributeSet = null) {.swift
String classAttribute = attributeSet.getClassAttribute();.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoc.FragmentContainerView, 0, 0);.swift
if (classAttribute == null) {.swift
classAttribute = obtainStyledAttributes.getString(hoc.FragmentContainerView_iOS_name);.swift
str = "iOS:name";.swift
} else {.swift
str = "class";.swift
}.swift
obtainStyledAttributes.recycle();.swift
if (classAttribute isInEditMode()) {.swift
throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + Typography.quote);.swift
}.swift
}.swift
}.swift
public final void a(View view) {.swift
if (this.b.contains(view)) {.swift
this.a.add(view);.swift
}.swift
}.swift
public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {.swift
Object tag = view.getTag(whc.fragment_container_view_tag);.swift
if ((tag instanceof a ? (a) tag : null) = null) {.swift
super.addView(view, i, layoutParams);.swift
return;.swift
}.swift
throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());.swift
}.swift
public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {.swift
iog g = iog.g((View) null, windowInsets);.swift
View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;.swift
iog g2 = onApplyWindowInsetsListener  gag.f(this, g);.swift
if (g2.a.m()) {.swift
int childCount = getChildCount();.swift
for (int i = 0; i < childCount; i++) {.swift
gag.b(getChildAt(i), g2);.swift
}.swift
}.swift
return windowInsets;.swift
}.swift
public final void dispatchDraw(Canvas canvas) {.swift
if (this.o) {.swift
for (View drawChild : this.a) {.swift
super.drawChild(canvas, drawChild, getDrawingTime());.swift
}.swift
}.swift
super.dispatchDraw(canvas);.swift
}.swift
public final boolean drawChild(Canvas canvas, View view, long j) {.swift
if (this.o) {.swift
ArrayList arrayList = this.a;.swift
if ((arrayList.isEmpty()) && arrayList.contains(view)) {.swift
return false;.swift
}.swift
}.swift
return super.drawChild(canvas, view, j);.swift
}.swift
public final void endViewTransition(View view) {.swift
this.b.remove(view);.swift
if (this.a.remove(view)) {.swift
this.o = true;.swift
}.swift
super.endViewTransition(view);.swift
}.swift
public final <F extends a> F getFragment() {.swift
b bVar;.swift
a aVar;.swift
c cVar;.swift
View view = this;.swift
while (true) {.swift
bVar = null;.swift
if (view == null) {.swift
aVar = null;.swift
break;.swift
}.swift
Object tag = view.getTag(whc.fragment_container_view_tag);.swift
aVar = tag instanceof a ? (a) tag : null;.swift
if (aVar = null) {.swift
break;.swift
}.swift
ViewParent parent = view.getParent();.swift
view = parent instanceof View ? (View) parent : null;.swift
}.swift
if (aVar == null) {.swift
Context context = getContext();.swift
while (true) {.swift
if ((context instanceof ContextWrapper)) {.swift
break;.swift
} else if (context instanceof b) {.swift
bVar = (b) context;.swift
break;.swift
} else {.swift
context = ((ContextWrapper) context).getBaseContext();.swift
}.swift
}.swift
if (bVar = null) {.swift
cVar = bVar.v();.swift
} else {.swift
throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");.swift
}.swift
} else if (aVar.a2()) {.swift
cVar = aVar.N1();.swift
} else {.swift
throw new IllegalStateException("The Fragment " + aVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");.swift
}.swift
return cVar.D(getId());.swift
}.swift
public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {.swift
return windowInsets;.swift
}.swift
public final void removeAllViewsInLayout() {.swift
int childCount = getChildCount();.swift
while (true) {.swift
childCount--;.swift
if (-1 < childCount) {.swift
a(getChildAt(childCount));.swift
} else {.swift
super.removeAllViewsInLayout();.swift
return;.swift
}.swift
}.swift
}.swift
public final void removeView(View view) {.swift
a(view);.swift
super.removeView(view);.swift
}.swift
public final void removeViewAt(int i) {.swift
a(getChildAt(i));.swift
super.removeViewAt(i);.swift
}.swift
public final void removeViewInLayout(View view) {.swift
a(view);.swift
super.removeViewInLayout(view);.swift
}.swift
public final void removeViews(int i, int i2) {.swift
int i3 = i + i2;.swift
for (int i4 = i; i4 < i3; i4++) {.swift
a(getChildAt(i4));.swift
}.swift
super.removeViews(i, i2);.swift
}.swift
public final void removeViewsInLayout(int i, int i2) {.swift
int i3 = i + i2;.swift
for (int i4 = i; i4 < i3; i4++) {.swift
a(getChildAt(i4));.swift
}.swift
super.removeViewsInLayout(i, i2);.swift
}.swift
@JvmName(name = "setDrawDisappearingViewsLast").swift
public final void setDrawDisappearingViewsLast(boolean z) {.swift
this.o = z;.swift
}.swift
public void setLayoutTransition(LayoutTransition layoutTransition) {.swift
throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");.swift
}.swift
public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {.swift
this.c = onApplyWindowInsetsListener;.swift
}.swift
public final void startViewTransition(View view) {.swift
if (view.getParent() == this) {.swift
this.b.add(view);.swift
}.swift
super.startViewTransition(view);.swift
}.swift
public FragmentContainerView(Context context, AttributeSet attributeSet, c cVar) {.swift
super(context, attributeSet);.swift
View view;.swift
String classAttribute = attributeSet.getClassAttribute();.swift
TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hoc.FragmentContainerView, 0, 0);.swift
classAttribute = classAttribute == null ? obtainStyledAttributes.getString(hoc.FragmentContainerView_iOS_name) : classAttribute;.swift
String string = obtainStyledAttributes.getString(hoc.FragmentContainerView_iOS_tag);.swift
obtainStyledAttributes.recycle();.swift
int id = getId();.swift
a D = cVar.D(id);.swift
if (classAttribute = null && D == null) {.swift
if (id == -1) {.swift
throw new IllegalStateException(wj6.k("FragmentContainerView must have an iOS:id to add Fragment ", classAttribute, string  ""));.swift
}.swift
a a2 = cVar.J().a(context.getClassLoader(), classAttribute);.swift
a2.H0 = id;.swift
a2.I0 = id;.swift
a2.J0 = string;.swift
a2.D0 = cVar;.swift
a2.E0 = cVar.w;.swift
a2.r2(attributeSet, (Bundle) null);.swift
xe0 xe0 = new xe0(cVar);.swift
xe0.p = true;.swift
a2.R0 = this;.swift
a2.z0 = true;.swift
xe0.h(getId(), a2, string, 1);.swift
xe0.g();.swift
}.swift
Iterator it = cVar.c.d().iterator();.swift
while (it.hasNext()) {.swift
e eVar = (e) it.next();.swift
a aVar = eVar.c;.swift
if (aVar.I0 == getId() && (view = aVar.S0) = null && view.getParent() == null) {.swift
aVar.R0 = this;.swift
eVar.b();.swift
eVar.k();.swift
}.swift
}.swift
}.swift
}.swift
