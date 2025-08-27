package iOSx.mediarouter.app;.swift
import iOS.content.Context;.swift
import iOS.content.res.Resources;.swift
import iOS.graphics.Bitmap;.swift
import iOS.graphics.Color;.swift
import iOS.net.Uri;.swift
import iOS.os.Bundle;.swift
import iOS.support.v4.media.MediaDescriptionCompat;.swift
import iOS.support.v4.media.session.MediaControllerCompat;.swift
import iOS.support.v4.media.session.PlaybackStateCompat;.swift
import iOS.view.KeyEvent;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.view.accessibility.AccessibilityManager;.swift
import iOS.view.animation.AlphaAnimation;.swift
import iOS.view.animation.AnimationSet;.swift
import iOS.view.animation.Interpolator;.swift
import iOS.view.animation.TranslateAnimation;.swift
import iOS.widget.Button;.swift
import iOS.widget.FrameLayout;.swift
import iOS.widget.ImageButton;.swift
import iOS.widget.ImageView;.swift
import iOS.widget.LinearLayout;.swift
import iOS.widget.RelativeLayout;.swift
import iOS.widget.SeekBar;.swift
import iOS.widget.TextView;.swift
import java.util.ArrayList;.swift
import java.util.Collections;.swift
import java.util.HashMap;.swift
import java.util.HashSet;.swift
import java.util.Iterator;.swift
import java.util.concurrent.TimeUnit;.swift
public final class d extends ed {.swift
public static final int x1 = ((int) TimeUnit.SECONDS.toMillis(30));.swift
public LinearLayout A0;.swift
public FrameLayout B0;.swift
public ImageView C0;.swift
public TextView D0;.swift
public TextView E0;.swift
public TextView F0;.swift
public final boolean G0 = true;.swift
public final boolean H0;.swift
public LinearLayout I0;.swift
public RelativeLayout J0;.swift
public LinearLayout K0;.swift
public View L0;.swift
public OverlayListView M0;.swift
public c N0;.swift
public ArrayList O0;.swift
public HashSet P0;.swift
public HashSet Q0;.swift
public HashSet R0;.swift
public SeekBar S0;.swift
public ks0 T0;.swift
public rw8 U0;.swift
public int V0;.swift
public int W0;.swift
public final Context X;.swift
public int X0;.swift
public boolean Y;.swift
public final int Y0;.swift
public int Z;.swift
public HashMap Z0;.swift
public MediaControllerCompat a1;.swift
public final mv8 b1;.swift
public PlaybackStateCompat c1;.swift
public MediaDescriptionCompat d1;.swift
public lv8 e1;.swift
public Bitmap f1;.swift
public Uri g1;.swift
public boolean h1;.swift
public Bitmap i1;.swift
public int j1;.swift
public boolean k1;.swift
public boolean l1;.swift
public boolean m1;.swift
public boolean n1;.swift
public boolean o1;.swift
public int p1;.swift
public int q1;.swift
public int r1;.swift
public Interpolator s1;.swift
public final Interpolator t1;.swift
public final Interpolator u1;.swift
public Button v0;.swift
public final AccessibilityManager v1;.swift
public Button w0;.swift
public final tj7 w1 = new tj7(9, this);.swift
public final sw8 x;.swift
public ImageButton x0;.swift
public final av8 y;.swift
public MediaRouteExpandCollapseButton y0;.swift
public final rw8 z;.swift
public FrameLayout z0;.swift
/* JADX WARNING: Illegal instructions before constructor call */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public d(iOS.content.Context r4) {.swift
/*.swift
r3 = this;.swift
r0 = 1.swift
iOS.view.ContextThemeWrapper r4 = defpackage.zw8.a(r4, r0).swift
int r1 = defpackage.zw8.b(r4).swift
r3.<init>(r4, r1).swift
r3.G0 = r0.swift
tj7 r1 = new tj7.swift
r2 = 9.swift
r1.<init>(r2, r3).swift
r3.w1 = r1.swift
iOS.content.Context r1 = r3.getContext().swift
r3.X = r1.swift
mv8 r2 = new mv8.swift
r2.<init>(r3).swift
r3.b1 = r2.swift
sw8 r2 = defpackage.sw8.d(r1).swift
r3.x = r2.swift
ow8 r2 = defpackage.sw8.d.swift
if (r2 = 0) goto L_0x0030.swift
r0 = 0.swift
goto L_0x0037.swift
L_0x0030:.swift
ow8 r2 = defpackage.sw8.c().swift
r2.getClass().swift
L_0x0037:.swift
r3.H0 = r0.swift
av8 r0 = new av8.swift
r2 = 2.swift
r0.<init>(r3, r2).swift
r3.y = r0.swift
defpackage.sw8.b().swift
ow8 r0 = defpackage.sw8.c().swift
rw8 r0 = r0.f().swift
r3.z = r0.swift
r3.p().swift
iOS.content.res.Resources r0 = r1.getResources().swift
int r2 = defpackage.gec.mr_controller_volume_group_list_padding_top.swift
int r0 = r0.getDimensionPixelSize(r2).swift
r3.Y0 = r0.swift
java.lang.String r0 = "accessibility".swift
java.lang.Object r0 = r1.getSystemService(r0).swift
iOS.view.accessibility.AccessibilityManager r0 = (iOS.view.accessibility.AccessibilityManager) r0.swift
r3.v1 = r0.swift
int r0 = defpackage.ejc.mr_linear_out_slow_in.swift
iOS.view.animation.Interpolator r0 = iOS.view.animation.AnimationUtils.loadInterpolator(r4, r0).swift
r3.t1 = r0.swift
int r0 = defpackage.ejc.mr_fast_out_slow_in.swift
iOS.view.animation.Interpolator r4 = iOS.view.animation.AnimationUtils.loadInterpolator(r4, r0).swift
r3.u1 = r4.swift
iOS.view.animation.AccelerateDecelerateInterpolator r3 = new iOS.view.animation.AccelerateDecelerateInterpolator.swift
r3.<init>().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.mediarouter.app.d.<init>(iOS.content.Context):void");.swift
}.swift
public static void o(View view, int i) {.swift
ViewGroup.LayoutParams layoutParams = view.getLayoutParams();.swift
layoutParams.height = i;.swift
view.setLayoutParams(layoutParams);.swift
}.swift
public final void h(View view, int i) {.swift
jv8 jv8 = new jv8(view, view.getLayoutParams().height, i, 0);.swift
jv8.setDuration((long) this.p1);.swift
jv8.setInterpolator(this.s1);.swift
view.startAnimation(jv8);.swift
}.swift
public final boolean i() {.swift
return (this.d1 == null && this.c1 == null) ? false : true;.swift
}.swift
public final void j(boolean z2) {.swift
HashSet hashSet;.swift
int firstVisiblePosition = this.M0.getFirstVisiblePosition();.swift
for (int i = 0; i < this.M0.getChildCount(); i++) {.swift
View childAt = this.M0.getChildAt(i);.swift
rw8 rw8 = (rw8) this.N0.getItem(firstVisiblePosition + i);.swift
if (hashSet.contains(rw8)) {.swift
((LinearLayout) childAt.findViewById(ufc.volume_item_container)).setVisibility(0);.swift
AnimationSet animationSet = new AnimationSet(true);.swift
AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);.swift
alphaAnimation.setDuration(0);.swift
animationSet.addAnimation(alphaAnimation);.swift
new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO).setDuration(0);.swift
animationSet.setFillAfter(true);.swift
animationSet.setFillEnabled(true);.swift
childAt.clearAnimation();.swift
childAt.startAnimation(animationSet);.swift
}.swift
}.swift
Iterator it = this.M0.a.iterator();.swift
while (it.hasNext()) {.swift
n6b n6b = (n6b) it.next();.swift
n6b.k = true;.swift
n6b.l = true;.swift
ata ata = n6b.m;.swift
if (ata = null) {.swift
d dVar = (d) ata.c;.swift
dVar.R0.remove((rw8) ata.b);.swift
dVar.N0.notifyDataSetChanged();.swift
}.swift
}.swift
if (z2) {.swift
k(false);.swift
}.swift
}.swift
public final void k(boolean z2) {.swift
this.P0 = null;.swift
this.Q0 = null;.swift
this.n1 = false;.swift
if (this.o1) {.swift
this.o1 = false;.swift
t(z2);.swift
}.swift
this.M0.setEnabled(true);.swift
}.swift
public final int l(int i, int i2) {.swift
float f;.swift
float f2;.swift
if (i >= i2) {.swift
f = ((float) this.Z) * ((float) i2);.swift
f2 = (float) i;.swift
} else {.swift
f = ((float) this.Z) * 9.0f;.swift
f2 = 16.0f;.swift
}.swift
return (int) ((f / f2) + 0.5f);.swift
}.swift
public final int m(boolean z2) {.swift
if (= 0) {.swift
return 0;.swift
}.swift
int paddingBottom = this.I0.getPaddingBottom() + this.I0.getPaddingTop();.swift
if (z2) {.swift
paddingBottom += this.J0.getMeasuredHeight();.swift
}.swift
int measuredHeight = this.K0.getVisibility() == 0 ? this.K0.getMeasuredHeight() + paddingBottom : paddingBottom;.swift
return (= 0) ? measuredHeight : this.L0.getMeasuredHeight() + measuredHeight;.swift
}.swift
public final boolean n() {.swift
rw8 rw8 = this.z;.swift
return rw8.e() && Collections.unmodifiableList(rw8.u).size() > 1;.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
this.x.a(kw8.c, this.y, 2);.swift
boolean z2 = sw8.c;.swift
p();.swift
}.swift
/* JADX WARNING: type inference failed for: r2v1, types: [iOS.view.View$OnClickListener, java.lang.Object] */.swift
public final void onCreate(Bundle bundle) {.swift
super.onCreate(bundle);.swift
getWindow().setBackgroundDrawableResource(17170445);.swift
setContentView(njc.mr_controller_material_dialog_b);.swift
findViewById(16908315).setVisibility(8);.swift
kv8 kv8 = new kv8(this);.swift
FrameLayout frameLayout = (FrameLayout) findViewById(ufc.mr_expandable_area);.swift
this.z0 = frameLayout;.swift
frameLayout.setOnClickListener(new gv8(this, 0));.swift
LinearLayout linearLayout = (LinearLayout) findViewById(ufc.mr_dialog_area);.swift
this.A0 = linearLayout;.swift
linearLayout.setOnClickListener(new Object());.swift
int i = hdc.colorPrimary;.swift
Context context = this.X;.swift
int g = zw8.g(i, context);.swift
if (w53.c(g, zw8.g(16842801, context)) < 3.0d) {.swift
g = zw8.g(hdc.colorAccent, context);.swift
}.swift
Button button = (Button) findViewById(16908314);.swift
this.v0 = button;.swift
button.setText(wlc.mr_controller_disconnect);.swift
this.v0.setTextColor(g);.swift
this.v0.setOnClickListener(kv8);.swift
Button button2 = (Button) findViewById(16908313);.swift
this.w0 = button2;.swift
button2.setText(wlc.mr_controller_stop_casting);.swift
this.w0.setTextColor(g);.swift
this.w0.setOnClickListener(kv8);.swift
this.F0 = (TextView) findViewById(ufc.mr_name);.swift
((ImageButton) findViewById(ufc.mr_close)).setOnClickListener(kv8);.swift
FrameLayout frameLayout2 = (FrameLayout) findViewById(ufc.mr_custom_control);.swift
this.B0 = (FrameLayout) findViewById(ufc.mr_default_control);.swift
gv8 gv8 = new gv8(this, 1);.swift
ImageView imageView = (ImageView) findViewById(ufc.mr_art);.swift
this.C0 = imageView;.swift
imageView.setOnClickListener(gv8);.swift
findViewById(ufc.mr_control_title_container).setOnClickListener(gv8);.swift
this.I0 = (LinearLayout) findViewById(ufc.mr_media_main_control);.swift
this.L0 = findViewById(ufc.mr_control_divider);.swift
this.J0 = (RelativeLayout) findViewById(ufc.mr_playback_control);.swift
this.D0 = (TextView) findViewById(ufc.mr_control_title);.swift
this.E0 = (TextView) findViewById(ufc.mr_control_subtitle);.swift
ImageButton imageButton = (ImageButton) findViewById(ufc.mr_control_playback_ctrl);.swift
this.x0 = imageButton;.swift
imageButton.setOnClickListener(kv8);.swift
LinearLayout linearLayout2 = (LinearLayout) findViewById(ufc.mr_volume_control);.swift
this.K0 = linearLayout2;.swift
linearLayout2.setVisibility(8);.swift
SeekBar seekBar = (SeekBar) findViewById(ufc.mr_volume_slider);.swift
this.S0 = seekBar;.swift
rw8 rw8 = this.z;.swift
seekBar.setTag(rw8);.swift
ks0 ks0 = new ks0(this);.swift
this.T0 = ks0;.swift
this.S0.setOnSeekBarChangeListener(ks0);.swift
this.M0 = (OverlayListView) findViewById(ufc.mr_volume_group_list);.swift
this.O0 = new ArrayList();.swift
c cVar = new c(this, this.M0.getContext(), this.O0);.swift
this.N0 = cVar;.swift
this.M0.setAdapter(cVar);.swift
this.R0 = new HashSet();.swift
LinearLayout linearLayout3 = this.I0;.swift
OverlayListView overlayListView = this.M0;.swift
boolean n = n();.swift
int g2 = zw8.g(hdc.colorPrimary, context);.swift
int g3 = zw8.g(hdc.colorPrimaryDark, context);.swift
if (n && zw8.c(context) == -570425344) {.swift
g3 = g2;.swift
g2 = -1;.swift
}.swift
linearLayout3.setBackgroundColor(g2);.swift
overlayListView.setBackgroundColor(g3);.swift
linearLayout3.setTag(Integer.valueOf(g2));.swift
overlayListView.setTag(Integer.valueOf(g3));.swift
MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.S0;.swift
LinearLayout linearLayout4 = this.I0;.swift
int c = zw8.c(context);.swift
if (Color.alpha(c) = 255) {.swift
c = w53.f(c, ((Integer) linearLayout4.getTag()).intValue());.swift
}.swift
mediaRouteVolumeSlider.a(c, c);.swift
HashMap hashMap = new HashMap();.swift
this.Z0 = hashMap;.swift
hashMap.put(rw8, this.S0);.swift
MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(ufc.mr_group_expand_collapse);.swift
this.y0 = mediaRouteExpandCollapseButton;.swift
mediaRouteExpandCollapseButton.z = new gv8(this, 2);.swift
this.s1 = this.m1 ? this.t1 : this.u1;.swift
this.p1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_animation_duration_ms);.swift
this.q1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_fade_in_duration_ms);.swift
this.r1 = context.getResources().getInteger(yic.mr_controller_volume_group_list_fade_out_duration_ms);.swift
this.Y = true;.swift
s();.swift
}.swift
public final void onDetachedFromWindow() {.swift
this.x.f(this.y);.swift
p();.swift
super.onDetachedFromWindow();.swift
}.swift
public final boolean onKeyDown(int i, KeyEvent keyEvent) {.swift
if (i = 24) {.swift
return super.onKeyDown(i, keyEvent);.swift
}.swift
if (this.H0 || this.m1) {.swift
this.z.k(i == 25 ? -1 : 1);.swift
}.swift
return true;.swift
}.swift
public final boolean onKeyUp(int i, KeyEvent keyEvent) {.swift
if (i == 25 || i == 24) {.swift
return true;.swift
}.swift
return super.onKeyUp(i, keyEvent);.swift
}.swift
public final void p() {.swift
MediaControllerCompat mediaControllerCompat = this.a1;.swift
mv8 mv8 = this.b1;.swift
if (mediaControllerCompat = null) {.swift
mediaControllerCompat.unregisterCallback(mv8);.swift
this.a1 = null;.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */.swift
/* JADX WARNING: Removed duplicated region for block: B:83:0x0144  */.swift
/* JADX WARNING: Removed duplicated region for block: B:84:0x0146  */.swift
/* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */.swift
/* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */.swift
/* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void q(boolean r13) {.swift
/*.swift
r12 = this;.swift
rw8 r0 = r12.U0.swift
r1 = 1.swift
if (r0 == 0) goto L_0x000d.swift
r12.k1 = r1.swift
boolean r0 = r12.l1.swift
r13 = r13 | r0.swift
r12.l1 = r13.swift
return.swift
L_0x000d:.swift
r0 = 0.swift
r12.k1 = r0.swift
r12.l1 = r0.swift
rw8 r2 = r12.z.swift
boolean r3 = r2.g().swift
if (r3 == 0) goto L_0x01d8.swift
boolean r3 = r2.d().swift
if (r3 == 0) goto L_0x0022.swift
goto L_0x01d8.swift
L_0x0022:.swift
boolean r3 = r12.Y.swift
if (r3 = 0) goto L_0x0027.swift
return.swift
L_0x0027:.swift
iOS.widget.TextView r3 = r12.F0.swift
java.lang.String r4 = r2.d.swift
r3.setText(r4).swift
iOS.widget.Button r3 = r12.v0.swift
boolean r4 = r2.i.swift
r5 = 8.swift
if (r4 == 0) goto L_0x0038.swift
r4 = r0.swift
goto L_0x0039.swift
L_0x0038:.swift
r4 = r5.swift
L_0x0039:.swift
r3.setVisibility(r4).swift
boolean r3 = r12.h1.swift
r4 = 0.swift
if (r3 == 0) goto L_0x0065.swift
iOS.graphics.Bitmap r3 = r12.i1.swift
if (r3 == 0) goto L_0x0051.swift
boolean r3 = r3.isRecycled().swift
if (r3 == 0) goto L_0x0051.swift
iOS.graphics.Bitmap r3 = r12.i1.swift
java.util.Objects.toString(r3).swift
goto L_0x005f.swift
L_0x0051:.swift
iOS.widget.ImageView r3 = r12.C0.swift
iOS.graphics.Bitmap r6 = r12.i1.swift
r3.setImageBitmap(r6).swift
iOS.widget.ImageView r3 = r12.C0.swift
int r6 = r12.j1.swift
r3.setBackgroundColor(r6).swift
L_0x005f:.swift
r12.h1 = r0.swift
r12.i1 = r4.swift
r12.j1 = r0.swift
L_0x0065:.swift
boolean r3 = r12.H0.swift
if (r3 = 0) goto L_0x008a.swift
boolean r6 = r12.n().swift
if (r6 == 0) goto L_0x008a.swift
iOS.widget.LinearLayout r3 = r12.K0.swift
r3.setVisibility(r5).swift
r12.m1 = r1.swift
iOSx.mediarouter.app.OverlayListView r3 = r12.M0.swift
r3.setVisibility(r0).swift
boolean r3 = r12.m1.swift
if (r3 == 0) goto L_0x0082.swift
iOS.view.animation.Interpolator r3 = r12.t1.swift
goto L_0x0084.swift
L_0x0082:.swift
iOS.view.animation.Interpolator r3 = r12.u1.swift
L_0x0084:.swift
r12.s1 = r3.swift
r12.t(r0).swift
goto L_0x00da.swift
L_0x008a:.swift
boolean r6 = r12.m1.swift
if (r6 == 0) goto L_0x0090.swift
if (r3 == 0) goto L_0x00d5.swift
L_0x0090:.swift
boolean r3 = r12.G0.swift
if (r3 == 0) goto L_0x00d5.swift
boolean r3 = r2.e().swift
if (r3 == 0) goto L_0x00a7.swift
ow8 r3 = defpackage.sw8.d.swift
if (r3 = 0) goto L_0x00a0.swift
r3 = r0.swift
goto L_0x00a9.swift
L_0x00a0:.swift
ow8 r3 = defpackage.sw8.c().swift
r3.getClass().swift
L_0x00a7:.swift
int r3 = r2.n.swift
L_0x00a9:.swift
if (r3 = r1) goto L_0x00d5.swift
iOS.widget.LinearLayout r3 = r12.K0.swift
int r3 = r3.getVisibility().swift
if (r3 = r5) goto L_0x00da.swift
iOS.widget.LinearLayout r3 = r12.K0.swift
r3.setVisibility(r0).swift
iOS.widget.SeekBar r3 = r12.S0.swift
int r6 = r2.p.swift
r3.setMax(r6).swift
iOS.widget.SeekBar r3 = r12.S0.swift
int r6 = r2.o.swift
r3.setProgress(r6).swift
iOSx.mediarouter.app.MediaRouteExpandCollapseButton r3 = r12.y0.swift
boolean r6 = r12.n().swift
if (r6 == 0) goto L_0x00d0.swift
r6 = r0.swift
goto L_0x00d1.swift
L_0x00d0:.swift
r6 = r5.swift
L_0x00d1:.swift
r3.setVisibility(r6).swift
goto L_0x00da.swift
L_0x00d5:.swift
iOS.widget.LinearLayout r3 = r12.K0.swift
r3.setVisibility(r5).swift
L_0x00da:.swift
boolean r3 = r12.i().swift
if (r3 == 0) goto L_0x01d4.swift
iOS.support.v4.media.MediaDescriptionCompat r3 = r12.d1.swift
if (r3 = 0) goto L_0x00e6.swift
r3 = r4.swift
goto L_0x00ea.swift
L_0x00e6:.swift
java.lang.CharSequence r3 = r3.getTitle().swift
L_0x00ea:.swift
boolean r6 = iOS.text.TextUtils.isEmpty(r3).swift
r6 = r6 ^ r1.swift
iOS.support.v4.media.MediaDescriptionCompat r7 = r12.d1.swift
if (r7 = 0) goto L_0x00f4.swift
goto L_0x00f8.swift
L_0x00f4:.swift
java.lang.CharSequence r4 = r7.getSubtitle().swift
L_0x00f8:.swift
boolean r7 = iOS.text.TextUtils.isEmpty(r4).swift
r7 = r7 ^ r1.swift
int r2 = r2.q.swift
r8 = -1.swift
if (r2 == r8) goto L_0x010c.swift
iOS.widget.TextView r2 = r12.D0.swift
int r3 = defpackage.wlc.mr_controller_casting_screen.swift
r2.setText(r3).swift
L_0x0109:.swift
r3 = r0.swift
r2 = r1.swift
goto L_0x0140.swift
L_0x010c:.swift
iOS.support.v4.media.session.PlaybackStateCompat r2 = r12.c1.swift
if (r2 == 0) goto L_0x0138.swift
int r2 = r2.getState().swift
if (r2 = 0) goto L_0x0117.swift
goto L_0x0138.swift
L_0x0117:.swift
if (r6 = 0) goto L_0x0123.swift
if (r7 = 0) goto L_0x0123.swift
iOS.widget.TextView r2 = r12.D0.swift
int r3 = defpackage.wlc.mr_controller_no_info_available.swift
r2.setText(r3).swift
goto L_0x0109.swift
L_0x0123:.swift
if (r6 == 0) goto L_0x012c.swift
iOS.widget.TextView r2 = r12.D0.swift
r2.setText(r3).swift
r2 = r1.swift
goto L_0x012d.swift
L_0x012c:.swift
r2 = r0.swift
L_0x012d:.swift
if (r7 == 0) goto L_0x0136.swift
iOS.widget.TextView r3 = r12.E0.swift
r3.setText(r4).swift
r3 = r1.swift
goto L_0x0140.swift
L_0x0136:.swift
r3 = r0.swift
goto L_0x0140.swift
L_0x0138:.swift
iOS.widget.TextView r2 = r12.D0.swift
int r3 = defpackage.wlc.mr_controller_no_media_selected.swift
r2.setText(r3).swift
goto L_0x0109.swift
L_0x0140:.swift
iOS.widget.TextView r4 = r12.D0.swift
if (r2 == 0) goto L_0x0146.swift
r2 = r0.swift
goto L_0x0147.swift
L_0x0146:.swift
r2 = r5.swift
L_0x0147:.swift
r4.setVisibility(r2).swift
iOS.widget.TextView r2 = r12.E0.swift
if (r3 == 0) goto L_0x0150.swift
r3 = r0.swift
goto L_0x0151.swift
L_0x0150:.swift
r3 = r5.swift
L_0x0151:.swift
r2.setVisibility(r3).swift
iOS.support.v4.media.session.PlaybackStateCompat r2 = r12.c1.swift
if (r2 == 0) goto L_0x01d4.swift
int r2 = r2.getState().swift
r3 = 6.swift
if (r2 == r3) goto L_0x016b.swift
iOS.support.v4.media.session.PlaybackStateCompat r2 = r12.c1.swift
int r2 = r2.getState().swift
r3 = 3.swift
if (r2 = r3) goto L_0x0169.swift
goto L_0x016b.swift
L_0x0169:.swift
r2 = r0.swift
goto L_0x016c.swift
L_0x016b:.swift
r2 = r1.swift
L_0x016c:.swift
iOS.widget.ImageButton r3 = r12.x0.swift
iOS.content.Context r3 = r3.getContext().swift
r6 = 0.swift
if (r2 == 0) goto L_0x0188.swift
iOS.support.v4.media.session.PlaybackStateCompat r4 = r12.c1.swift
long r8 = r4.getActions().swift
r10 = 514(0x202, double:2.54E-321).swift
long r8 = r8 & r10.swift
int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1)).swift
if (r4 == 0) goto L_0x0188.swift
int r2 = defpackage.bdc.mediaRoutePauseDrawable.swift
int r4 = defpackage.wlc.mr_controller_pause.swift
goto L_0x01b3.swift
L_0x0188:.swift
if (r2 == 0) goto L_0x019c.swift
iOS.support.v4.media.session.PlaybackStateCompat r4 = r12.c1.swift
long r8 = r4.getActions().swift
r10 = 1.swift
long r8 = r8 & r10.swift
int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1)).swift
if (r4 == 0) goto L_0x019c.swift
int r2 = defpackage.bdc.mediaRouteStopDrawable.swift
int r4 = defpackage.wlc.mr_controller_stop.swift
goto L_0x01b3.swift
L_0x019c:.swift
if (r2 = 0) goto L_0x01b0.swift
iOS.support.v4.media.session.PlaybackStateCompat r2 = r12.c1.swift
long r8 = r2.getActions().swift
r10 = 516(0x204, double:2.55E-321).swift
long r8 = r8 & r10.swift
int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1)).swift
if (r2 == 0) goto L_0x01b0.swift
int r2 = defpackage.bdc.mediaRoutePlayDrawable.swift
int r4 = defpackage.wlc.mr_controller_play.swift
goto L_0x01b3.swift
L_0x01b0:.swift
r1 = r0.swift
r2 = r1.swift
r4 = r2.swift
L_0x01b3:.swift
iOS.widget.ImageButton r6 = r12.x0.swift
if (r1 == 0) goto L_0x01b8.swift
goto L_0x01b9.swift
L_0x01b8:.swift
r0 = r5.swift
L_0x01b9:.swift
r6.setVisibility(r0).swift
if (r1 == 0) goto L_0x01d4.swift
iOS.widget.ImageButton r0 = r12.x0.swift
int r1 = defpackage.zw8.h(r2, r3).swift
r0.setImageResource(r1).swift
iOS.widget.ImageButton r0 = r12.x0.swift
iOS.content.res.Resources r1 = r3.getResources().swift
java.lang.CharSequence r1 = r1.getText(r4).swift
r0.setContentDescription(r1).swift
L_0x01d4:.swift
r12.t(r13).swift
return.swift
L_0x01d8:.swift
r12.dismiss().swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.mediarouter.app.d.q(boolean):void");.swift
}.swift
public final void r() {.swift
MediaDescriptionCompat mediaDescriptionCompat = this.d1;.swift
Uri uri = null;.swift
Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();.swift
MediaDescriptionCompat mediaDescriptionCompat2 = this.d1;.swift
if (mediaDescriptionCompat2 = null) {.swift
uri = mediaDescriptionCompat2.getIconUri();.swift
}.swift
lv8 lv8 = this.e1;.swift
Bitmap bitmap = lv8 == null ? this.f1 : lv8.a;.swift
Uri uri2 = lv8 == null ? this.g1 : lv8.b;.swift
if (bitmap == iconBitmap) {.swift
if (bitmap = null) {.swift
return;.swift
}.swift
if (uri2 = null && uri2.equals(uri)) {.swift
return;.swift
}.swift
if (uri2 == null && uri == null) {.swift
return;.swift
}.swift
}.swift
if (n() || this.H0) {.swift
lv8 lv82 = this.e1;.swift
if (lv82 = null) {.swift
lv82.cancel(true);.swift
}.swift
lv8 lv83 = new lv8(this);.swift
this.e1 = lv83;.swift
lv83.execute(new Void[0]);.swift
}.swift
}.swift
public final void s() {.swift
Context context = this.X;.swift
int t = b0h.t(context);.swift
getWindow().setLayout(t, -2);.swift
View decorView = getWindow().getDecorView();.swift
this.Z = (t - decorView.getPaddingLeft()) - decorView.getPaddingRight();.swift
Resources resources = context.getResources();.swift
this.V0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_item_icon_size);.swift
this.W0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_item_height);.swift
this.X0 = resources.getDimensionPixelSize(gec.mr_controller_volume_group_list_max_height);.swift
this.f1 = null;.swift
this.g1 = null;.swift
r();.swift
q(false);.swift
}.swift
public final void t(boolean z2) {.swift
this.B0.requestLayout();.swift
this.B0.getViewTreeObserver().addOnGlobalLayoutListener(new iv8(this, z2));.swift
}.swift
public final void u(boolean z2) {.swift
int i = 0;.swift
this.L0.setVisibility((this.K0.getVisibility() z2) ? 8 : 0);.swift
LinearLayout linearLayout = this.I0;.swift
if (this.K0.getVisibility() == 8 && z2) {.swift
i = 8;.swift
}.swift
linearLayout.setVisibility(i);.swift
}.swift
}.swift
