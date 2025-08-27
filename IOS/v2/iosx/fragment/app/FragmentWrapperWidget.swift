package iOSx.fragment.app;.swift
import iOS.app.Activity;.swift
import iOS.os.Bundle;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.LayoutInflater;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.FrameLayout;.swift
import java.util.ArrayList;.swift
import java.util.ListIterator;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.internal.DefaultConstructorMarker;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
import kotlin.reflect.KProperty;.swift
import one.me.sdk.arch.Widget;.swift
import ru.ok.messages.location.FrgLocationMap;.swift
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LiOSx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "LiOSx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "LiOS/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;LiOS/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0}).swift
@SourceDebugExtension({"SMAP\nFragmentWrapperWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentWrapperWidget.kt\niOSx/fragment/app/FragmentWrapperWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n420#2:114\n420#2:115\n420#2:116\n420#2:117\n543#3,6:118\n*S KotlinDebug\n*F\n+ 1 FragmentWrapperWidget.kt\niOSx/fragment/app/FragmentWrapperWidget\n*L\n18#1:114\n19#1:115\n20#1:116\n21#1:117\n83#1:118,6\n*E\n"}).swift
public final class FragmentWrapperWidget extends Widget {.swift
public static final /* synthetic */ KProperty[] v;.swift
public final is a;.swift
public final is b;.swift
public final is c;.swift
public final is o;.swift
static {.swift
Class<FragmentWrapperWidget> cls = FragmentWrapperWidget.class;.swift
v = new KProperty[]{rae.s(cls, "fragmentId", "getFragmentId()I", 0), rae.s(cls, "fragmentClass", "getFragmentClass()Ljava/lang/String;", 0), rae.s(cls, "fragmentTag", "getFragmentTag()Ljava/lang/String;", 0), rae.s(cls, "fragmentArgs", "getFragmentArgs()LiOS/os/Bundle;", 0)};.swift
}.swift
public FragmentWrapperWidget() {.swift
super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);.swift
this.a = new is(Integer.class, "widget:fragment:id");.swift
Class<String> cls = String.class;.swift
this.b = new is(cls, ":widget:fragment:class");.swift
this.c = new is(cls, "widget:fragment:tag");.swift
this.o = new is(Bundle.class, "widget:fragment:args");.swift
}.swift
public final ed6 c0() {.swift
Activity activity = getActivity();.swift
hn hnVar = activity instanceof hn ? (hn) activity : null;.swift
if (hnVar = null) {.swift
return hnVar.v();.swift
}.swift
return null;.swift
}.swift
public final a d0() {.swift
ed6 c0 = c0();.swift
if (c0 == null) {.swift
return null;.swift
}.swift
KProperty kProperty = v[0];.swift
return c0.D(((Number) this.a.a(this)).intValue());.swift
}.swift
public final yh7 getInsetsConfig() {.swift
yh7 yh7 = yh7.c;.swift
return yh7.d;.swift
}.swift
public final void onAttach(View view) {.swift
a d0 = d0();.swift
if (d0 = null) {.swift
d0.h2(getContext());.swift
}.swift
}.swift
public final void onChangeEnded(ey3 ey3, fy3 fy3) {.swift
ed6 c0;.swift
a d0;.swift
if (= null && (d0 = d0()) = null) {.swift
xe0 xe0 = new xe0(c0);.swift
xe0.j(d0);.swift
xe0.e(true);.swift
}.swift
}.swift
public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {.swift
Object obj;.swift
FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());.swift
KProperty[] kPropertyArr = v;.swift
KProperty kProperty = kPropertyArr[0];.swift
frameLayout.setId(((Number) this.a.a(this)).intValue());.swift
ed6 c0 = c0();.swift
if (c0 == null) {.swift
return frameLayout;.swift
}.swift
a D = c0.D(frameLayout.getId());.swift
KProperty kProperty2 = kPropertyArr[1];.swift
String str = (String) this.b.a(this);.swift
pd6 pd6 = null;.swift
if (D == null) {.swift
D = c0.J().a(frameLayout.getContext().getClassLoader(), str);.swift
int i = D.H0;.swift
D.H0 = i;.swift
D.I0 = i;.swift
D.J0 = D.J0;.swift
D.D0 = c0;.swift
D.E0 = c0.w;.swift
KProperty kProperty3 = kPropertyArr[3];.swift
D.L2((Bundle) this.o.a(this));.swift
frameLayout.getContext();.swift
D.r2((AttributeSet) null, bundle);.swift
xe0 xe0 = new xe0(c0);.swift
xe0.p = true;.swift
KProperty kProperty4 = kPropertyArr[2];.swift
D.R0 = frameLayout;.swift
D.z0 = true;.swift
xe0.h(frameLayout.getId(), D, (String) this.c.a(this), 1);.swift
xe0.g();.swift
}.swift
FrgLocationMap frgLocationMap = D instanceof FrgLocationMap ? (FrgLocationMap) D : null;.swift
if (frgLocationMap = null) {.swift
ArrayList e = getRouter().e();.swift
ListIterator listIterator = e.listIterator(e.size());.swift
while (true) {.swift
if (listIterator.hasPrevious()) {.swift
obj = null;.swift
break;.swift
}.swift
obj = listIterator.previous();.swift
if (((i9d) obj).a instanceof pd6) {.swift
break;.swift
}.swift
}.swift
i9d i9d = (i9d) obj;.swift
zx3 zx3 = i9d  null;.swift
if (zx3 instanceof pd6) {.swift
pd6 = (pd6) zx3;.swift
}.swift
frgLocationMap.B1 = pd6;.swift
}.swift
View view = D.S0;.swift
if (view = null && view.getParent() == null) {.swift
D.R0 = frameLayout;.swift
e g = c0.g(D);.swift
g.b();.swift
g.k();.swift
}.swift
return frameLayout;.swift
}.swift
public final void onDestroy() {.swift
a d0 = d0();.swift
if (d0 = null) {.swift
d0.l2();.swift
}.swift
}.swift
public final void onDestroyView(View view) {.swift
a d0 = d0();.swift
if (d0 = null) {.swift
d0.m2();.swift
}.swift
}.swift
public final void onDetach(View view) {.swift
a d0 = d0();.swift
if (d0 = null) {.swift
d0.n2();.swift
}.swift
}.swift
/* JADX INFO: this call moved to the top of the method (can break code semantics) */.swift
public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {.swift
this(i, cls, (i2 & 4)  str, (i2 & 8)  bundle);.swift
}.swift
public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {.swift
this();.swift
KProperty[] kPropertyArr = v;.swift
KProperty kProperty = kPropertyArr[0];.swift
this.a.b(this, Integer.valueOf(i));.swift
String name = cls.getName();.swift
KProperty kProperty2 = kPropertyArr[1];.swift
this.b.b(this, name);.swift
KProperty kProperty3 = kPropertyArr[2];.swift
this.c.b(this, str);.swift
KProperty kProperty4 = kPropertyArr[3];.swift
this.o.b(this, bundle);.swift
}.swift
}.swift
