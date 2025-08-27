package iOSx.fragment.app;.swift
import iOS.content.Context;.swift
import iOS.content.Intent;.swift
import iOS.os.Bundle;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.MenuItem;.swift
import iOS.view.View;.swift
import java.io.FileDescriptor;.swift
import java.io.PrintWriter;.swift
public abstract class b extends bc3 implements p8 {.swift
public final u6h a = new u6h(17, new oc6(this));.swift
public final lv7 b = new lv7(this);.swift
public boolean c;.swift
public boolean o;.swift
public boolean v = true;.swift
public b() {.swift
getSavedStateRegistry().c("iOS:support:lifecycle", new pb3(1, this));.swift
addOnConfigurationChangedListener(new nc6(this, 0));.swift
addOnNewIntentListener(new nc6(this, 1));.swift
addOnContextAvailableListener(new qb3(this, 1));.swift
}.swift
public static boolean w(c cVar) {.swift
boolean z = false;.swift
for (a aVar : cVar.c.f()) {.swift
if (aVar = null) {.swift
oc6 oc6 = aVar.E0;.swift
if ((oc6 == null ? null : oc6.z0) = null) {.swift
z |= w(aVar.N1());.swift
}.swift
od6 od6 = aVar.c1;.swift
iu7 iu7 = iu7.o;.swift
iu7 iu72 = iu7.c;.swift
if (od6 = null) {.swift
od6.b();.swift
if (od6.v.d.a(iu7)) {.swift
lv7 lv7 = aVar.c1.v;.swift
lv7.d("setCurrentState");.swift
lv7.f(iu72);.swift
z = true;.swift
}.swift
}.swift
if (aVar.b1.d.a(iu7)) {.swift
lv7 lv72 = aVar.b1;.swift
lv72.d("setCurrentState");.swift
lv72.f(iu72);.swift
z = true;.swift
}.swift
}.swift
}.swift
return z;.swift
}.swift
public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {.swift
super.dump(str, fileDescriptor, printWriter, strArr);.swift
if (shouldDumpInternalState(strArr)) {.swift
printWriter.print(str);.swift
printWriter.print("Local FragmentActivity ");.swift
printWriter.print(Integer.toHexString(System.identityHashCode(this)));.swift
printWriter.println(" State:");.swift
String str2 = str + "  ";.swift
printWriter.print(str2);.swift
printWriter.print("mCreated=");.swift
printWriter.print(this.c);.swift
printWriter.print(" mResumed=");.swift
printWriter.print(this.o);.swift
printWriter.print(" mStopped=");.swift
printWriter.print(this.v);.swift
if (getApplication() = null) {.swift
new iOSx.loader.app.b(this, getViewModelStore()).a(str2, printWriter);.swift
}.swift
((oc6) this.a.b).y0.w(str, fileDescriptor, printWriter, strArr);.swift
}.swift
}.swift
public void onActivityResult(int i, int i2, Intent intent) {.swift
this.a.j();.swift
super.onActivityResult(i, i2, intent);.swift
}.swift
public void onCreate(Bundle bundle) {.swift
super.onCreate(bundle);.swift
this.b.e(hu7.ON_CREATE);.swift
ed6 ed6 = ((oc6) this.a.b).y0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(1);.swift
}.swift
public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {.swift
View onCreateView = ((oc6) this.a.b).y0.f.onCreateView(view, str, context, attributeSet);.swift
return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;.swift
}.swift
public void onDestroy() {.swift
super.onDestroy();.swift
((oc6) this.a.b).y0.l();.swift
this.b.e(hu7.ON_DESTROY);.swift
}.swift
public boolean onMenuItemSelected(int i, MenuItem menuItem) {.swift
if (super.onMenuItemSelected(i, menuItem)) {.swift
return true;.swift
}.swift
if (i == 6) {.swift
return ((oc6) this.a.b).y0.j();.swift
}.swift
return false;.swift
}.swift
public void onPause() {.swift
super.onPause();.swift
this.o = false;.swift
((oc6) this.a.b).y0.u(5);.swift
this.b.e(hu7.ON_PAUSE);.swift
}.swift
public void onPostResume() {.swift
super.onPostResume();.swift
z();.swift
}.swift
public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {.swift
this.a.j();.swift
super.onRequestPermissionsResult(i, strArr, iArr);.swift
}.swift
public void onResume() {.swift
u6h u6h = this.a;.swift
u6h.j();.swift
super.onResume();.swift
this.o = true;.swift
((oc6) u6h.b).y0.A(true);.swift
}.swift
public void onStart() {.swift
u6h u6h = this.a;.swift
u6h.j();.swift
super.onStart();.swift
this.v = false;.swift
boolean z = this.c;.swift
oc6 oc6 = (oc6) u6h.b;.swift
if (z) {.swift
this.c = true;.swift
ed6 ed6 = oc6.y0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(4);.swift
}.swift
oc6.y0.A(true);.swift
this.b.e(hu7.ON_START);.swift
ed6 ed62 = oc6.y0;.swift
ed62.I = false;.swift
ed62.J = false;.swift
ed62.P.h = false;.swift
ed62.u(5);.swift
}.swift
public final void onStateNotSaved() {.swift
this.a.j();.swift
}.swift
public void onStop() {.swift
super.onStop();.swift
this.v = true;.swift
do {.swift
} while (w(v()));.swift
ed6 ed6 = ((oc6) this.a.b).y0;.swift
ed6.J = true;.swift
ed6.P.h = true;.swift
ed6.u(4);.swift
this.b.e(hu7.ON_STOP);.swift
}.swift
public final ed6 v() {.swift
return ((oc6) this.a.b).y0;.swift
}.swift
public void z() {.swift
this.b.e(hu7.ON_RESUME);.swift
ed6 ed6 = ((oc6) this.a.b).y0;.swift
ed6.I = false;.swift
ed6.J = false;.swift
ed6.P.h = false;.swift
ed6.u(7);.swift
}.swift
public final View onCreateView(String str, Context context, AttributeSet attributeSet) {.swift
View onCreateView = ((oc6) this.a.b).y0.f.onCreateView((View) null, str, context, attributeSet);.swift
return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;.swift
}.swift
}.swift
