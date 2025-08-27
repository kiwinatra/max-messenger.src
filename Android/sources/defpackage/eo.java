package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: eo  reason: default package */
public final class eo extends rn implements k69, LayoutInflater.Factory2 {
    public static final qae q1 = new qae(0);
    public static final int[] r1 = {16842836};
    public static final boolean s1 = (!"robolectric".equals(Build.FINGERPRINT));
    public ga4 A0;
    public wie B0;
    public e4 C0;
    public b8 D0;
    public ActionBarContextView E0;
    public PopupWindow F0;
    public sn G0;
    public ecg H0 = null;
    public boolean I0;
    public ViewGroup J0;
    public TextView K0;
    public View L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public co[] U0;
    public co V0;
    public boolean W0;
    public final Object X;
    public boolean X0;
    public final Context Y;
    public boolean Y0;
    public Window Z;
    public boolean Z0;
    public Configuration a1;
    public final int b1 = -100;
    public int c1;
    public int d1;
    public boolean e1;
    public zn f1;
    public zn g1;
    public boolean h1;
    public int i1;
    public final sn j1 = new sn(this, 0);
    public boolean k1;
    public Rect l1;
    public Rect m1;
    public qp n1;
    public OnBackInvokedDispatcher o1;
    public OnBackInvokedCallback p1;
    public yn v0;
    public final kn w0;
    public b59 x0;
    public c3f y0;
    public CharSequence z0;

    public eo(Context context, Window window, kn knVar, Object obj) {
        hn hnVar = null;
        this.Y = context;
        this.w0 = knVar;
        this.X = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof hn)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        hnVar = (hn) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (hnVar != null) {
                this.b1 = ((eo) hnVar.A()).b1;
            }
        }
        if (this.b1 == -100) {
            qae qae = q1;
            Integer num = (Integer) qae.get(this.X.getClass().getName());
            if (num != null) {
                this.b1 = num.intValue();
                qae.remove(this.X.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        ho.d();
    }

    public static j58 n(Context context) {
        j58 j58;
        j58 j582;
        if (Build.VERSION.SDK_INT >= 33 || (j58 = rn.c) == null) {
            return null;
        }
        j58 b = vn.b(context.getApplicationContext().getResources().getConfiguration());
        k58 k58 = j58.a;
        if (k58.a.isEmpty()) {
            j582 = j58.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                if (i >= b.a.a.size() + k58.a.size()) {
                    break;
                }
                Locale locale = i < k58.a.size() ? k58.a.get(i) : b.a.a.get(i - k58.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            j582 = new j58(new k58(i58.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return j582.a.a.isEmpty() ? b : j582;
    }

    public static Configuration s(Context context, int i, j58 j58, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = c44.DEFAULT_ASPECT_RATIO;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (j58 != null) {
            vn.d(configuration2, j58);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.i1 = (1 << i) | this.i1;
        if (!this.h1) {
            View decorView = this.Z.getDecorView();
            WeakHashMap weakHashMap = gag.a;
            decorView.postOnAnimation(this.j1);
            this.h1 = true;
        }
    }

    public final int B(int i, Context context) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.g1 == null) {
                            this.g1 = new zn(this, context);
                        }
                        return this.g1.D();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return x(context).D();
            }
        }
        return i;
    }

    public final boolean C() {
        boolean z = this.W0;
        this.W0 = false;
        co y = y(0);
        if (y.m) {
            if (!z) {
                r(y, true);
            }
            return true;
        }
        b8 b8Var = this.D0;
        if (b8Var != null) {
            b8Var.a();
            return true;
        }
        z();
        b59 b59 = this.x0;
        return b59 != null && b59.j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        if (r3.x.getCount() > 0) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(defpackage.co r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            if (r2 != 0) goto L_0x01d7
            boolean r2 = r0.Z0
            if (r2 == 0) goto L_0x000e
            goto L_0x01d7
        L_0x000e:
            int r2 = r1.a
            android.content.Context r3 = r0.Y
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.Z
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            m69 r6 = r1.h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.r(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.F(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            bo r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ae
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ae
            r10 = r6
            goto L_0x01af
        L_0x0068:
            if (r6 != 0) goto L_0x00e2
            r17.z()
            b59 r6 = r0.x0
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.G()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            int r10 = defpackage.hdc.actionBarPopupTheme
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009b
            r9.applyStyle(r10, r5)
        L_0x009b:
            int r10 = defpackage.hdc.panelMenuListTheme
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00a8
            r9.applyStyle(r6, r5)
            goto L_0x00ad
        L_0x00a8:
            int r6 = defpackage.mnc.Theme_AppCompat_CompactMenu
            r9.applyStyle(r6, r5)
        L_0x00ad:
            kx3 r6 = new kx3
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.j = r6
            int[] r3 = defpackage.koc.AppCompatTheme
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            int r6 = defpackage.koc.AppCompatTheme_panelBackground
            int r6 = r3.getResourceId(r6, r7)
            r1.b = r6
            int r6 = defpackage.koc.AppCompatTheme_android_windowAnimationStyle
            int r6 = r3.getResourceId(r6, r7)
            r1.d = r6
            r3.recycle()
            bo r3 = new bo
            kx3 r6 = r1.j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.c = r3
            goto L_0x00f1
        L_0x00e2:
            boolean r3 = r1.n
            if (r3 == 0) goto L_0x00f1
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f1
            bo r3 = r1.e
            r3.removeAllViews()
        L_0x00f1:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x00f8
            r1.f = r3
            goto L_0x0155
        L_0x00f8:
            m69 r3 = r1.h
            if (r3 != 0) goto L_0x00fe
            goto L_0x01d5
        L_0x00fe:
            e4 r3 = r0.C0
            if (r3 != 0) goto L_0x010a
            e4 r3 = new e4
            r6 = 1
            r3.<init>((int) r6, (java.lang.Object) r0)
            r0.C0 = r3
        L_0x010a:
            e4 r3 = r0.C0
            nz7 r6 = r1.i
            if (r6 != 0) goto L_0x0124
            nz7 r6 = new nz7
            kx3 r9 = r1.j
            int r10 = defpackage.vjc.abc_list_menu_item_layout
            r6.<init>(r9, r10)
            r1.i = r6
            r6.w = r3
            m69 r3 = r1.h
            android.content.Context r9 = r3.a
            r3.b(r6, r9)
        L_0x0124:
            nz7 r3 = r1.i
            bo r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.o
            if (r9 != 0) goto L_0x014f
            android.view.LayoutInflater r9 = r3.b
            int r10 = defpackage.vjc.abc_expanded_menu_layout
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.o = r6
            mz7 r6 = r3.x
            if (r6 != 0) goto L_0x0143
            mz7 r6 = new mz7
            r6.<init>(r3)
            r3.x = r6
        L_0x0143:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            mz7 r9 = r3.x
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.o
            r6.setOnItemClickListener(r3)
        L_0x014f:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.o
            r1.f = r3
            if (r3 == 0) goto L_0x01d5
        L_0x0155:
            android.view.View r3 = r1.f
            if (r3 != 0) goto L_0x015b
            goto L_0x01d5
        L_0x015b:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            nz7 r3 = r1.i
            mz7 r6 = r3.x
            if (r6 != 0) goto L_0x016d
            mz7 r6 = new mz7
            r6.<init>(r3)
            r3.x = r6
        L_0x016d:
            mz7 r3 = r3.x
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d5
        L_0x0175:
            android.view.View r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0182:
            int r6 = r1.b
            bo r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L_0x019a:
            bo r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ae
            android.view.View r3 = r1.f
            r3.requestFocus()
        L_0x01ae:
            r10 = r8
        L_0x01af:
            r1.l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.c
            r3.gravity = r6
            int r6 = r1.d
            r3.windowAnimations = r6
            bo r6 = r1.e
            r4.addView(r6, r3)
            r1.m = r5
            if (r2 != 0) goto L_0x01d4
            r17.H()
        L_0x01d4:
            return
        L_0x01d5:
            r1.n = r5
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.D(co, android.view.KeyEvent):void");
    }

    public final boolean E(co coVar, int i, KeyEvent keyEvent) {
        m69 m69;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((coVar.k || F(coVar, keyEvent)) && (m69 = coVar.h) != null) {
            return m69.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(co coVar, KeyEvent keyEvent) {
        ga4 ga4;
        ga4 ga42;
        ga4 ga43;
        Resources.Theme theme;
        ga4 ga44;
        if (this.Z0) {
            return false;
        }
        if (coVar.k) {
            return true;
        }
        co coVar2 = this.V0;
        if (!(coVar2 == null || coVar2 == coVar)) {
            r(coVar2, false);
        }
        Window.Callback callback = this.Z.getCallback();
        int i = coVar.a;
        if (callback != null) {
            coVar.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (ga44 = this.A0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) ga44;
            actionBarOverlayLayout.e();
            ((omf) actionBarOverlayLayout.v).l = true;
        }
        if (coVar.g == null && (!z || !(this.x0 instanceof jmf))) {
            m69 m69 = coVar.h;
            if (m69 == null || coVar.o) {
                if (m69 == null) {
                    Context context = this.Y;
                    if ((i == 0 || i == 108) && this.A0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(hdc.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(hdc.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(hdc.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            kx3 kx3 = new kx3(context, 0);
                            kx3.getTheme().setTo(theme);
                            context = kx3;
                        }
                    }
                    m69 m692 = new m69(context);
                    m692.v = this;
                    m69 m693 = coVar.h;
                    if (m692 != m693) {
                        if (m693 != null) {
                            m693.r(coVar.i);
                        }
                        coVar.h = m692;
                        nz7 nz7 = coVar.i;
                        if (nz7 != null) {
                            m692.b(nz7, m692.a);
                        }
                    }
                    if (coVar.h == null) {
                        return false;
                    }
                }
                if (z && (ga43 = this.A0) != null) {
                    if (this.B0 == null) {
                        this.B0 = new wie(3, (Object) this);
                    }
                    ((ActionBarOverlayLayout) ga43).f(coVar.h, this.B0);
                }
                coVar.h.w();
                if (!callback.onCreatePanelMenu(i, coVar.h)) {
                    m69 m694 = coVar.h;
                    if (m694 != null) {
                        if (m694 != null) {
                            m694.r(coVar.i);
                        }
                        coVar.h = null;
                    }
                    if (z && (ga42 = this.A0) != null) {
                        ((ActionBarOverlayLayout) ga42).f((Menu) null, this.B0);
                    }
                    return false;
                }
                coVar.o = false;
            }
            coVar.h.w();
            Bundle bundle = coVar.p;
            if (bundle != null) {
                coVar.h.s(bundle);
                coVar.p = null;
            }
            if (!callback.onPreparePanel(0, coVar.g, coVar.h)) {
                if (z && (ga4 = this.A0) != null) {
                    ((ActionBarOverlayLayout) ga4).f((Menu) null, this.B0);
                }
                coVar.h.v();
                return false;
            }
            coVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            coVar.h.v();
        }
        coVar.k = true;
        coVar.l = false;
        this.V0 = coVar;
        return true;
    }

    public final void G() {
        if (this.I0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.o1 != null && (y(0).m || this.D0 != null)) {
                z = true;
            }
            if (z && this.p1 == null) {
                this.p1 = xn.b(this.o1, this);
            } else if (!z && (onBackInvokedCallback = this.p1) != null) {
                xn.c(this.o1, onBackInvokedCallback);
                this.p1 = null;
            }
        }
    }

    public final void a() {
        if (this.x0 != null) {
            z();
            if (!this.x0.I()) {
                A(0);
            }
        }
    }

    public final void c() {
        String str;
        this.X0 = true;
        l(false, true);
        w();
        Object obj = this.X;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = i8b.y(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                b59 b59 = this.x0;
                if (b59 == null) {
                    this.k1 = true;
                } else {
                    b59.W(true);
                }
            }
            synchronized (rn.y) {
                rn.e(this);
                rn.x.add(new WeakReference(this));
            }
        }
        this.a1 = new Configuration(this.Y.getResources().getConfiguration());
        this.Y0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.X
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = defpackage.rn.y
            monitor-enter(r0)
            defpackage.rn.e(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r3
        L_0x0011:
            boolean r0 = r3.h1
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.Z
            android.view.View r0 = r0.getDecorView()
            sn r1 = r3.j1
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.Z0 = r0
            int r0 = r3.b1
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.X
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            qae r0 = q1
            java.lang.Object r1 = r3.X
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.b1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            qae r0 = q1
            java.lang.Object r1 = r3.X
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            b59 r0 = r3.x0
            if (r0 == 0) goto L_0x0063
            r0.N()
        L_0x0063:
            zn r0 = r3.f1
            if (r0 == 0) goto L_0x006a
            r0.y()
        L_0x006a:
            zn r3 = r3.g1
            if (r3 == 0) goto L_0x0071
            r3.y()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.d():void");
    }

    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.S0 && i == 108) {
            return false;
        }
        if (this.O0 && i == 1) {
            this.O0 = false;
        }
        if (i == 1) {
            G();
            this.S0 = true;
            return true;
        } else if (i == 2) {
            G();
            this.M0 = true;
            return true;
        } else if (i == 5) {
            G();
            this.N0 = true;
            return true;
        } else if (i == 10) {
            G();
            this.Q0 = true;
            return true;
        } else if (i == 108) {
            G();
            this.O0 = true;
            return true;
        } else if (i != 109) {
            return this.Z.requestFeature(i);
        } else {
            G();
            this.P0 = true;
            return true;
        }
    }

    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.J0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.Y).inflate(i, viewGroup);
        this.v0.a(this.Z.getCallback());
    }

    public final boolean h(m69 m69, MenuItem menuItem) {
        co coVar;
        Window.Callback callback = this.Z.getCallback();
        if (callback != null && !this.Z0) {
            m69 k = m69.k();
            co[] coVarArr = this.U0;
            int length = coVarArr != null ? coVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    coVar = coVarArr[i];
                    if (coVar != null && coVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    coVar = null;
                    break;
                }
            }
            if (coVar != null) {
                return callback.onMenuItemSelected(coVar.a, menuItem);
            }
        }
        return false;
    }

    public final void i(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.J0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.v0.a(this.Z.getCallback());
    }

    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.J0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.v0.a(this.Z.getCallback());
    }

    public final void k(CharSequence charSequence) {
        this.z0 = charSequence;
        ga4 ga4 = this.A0;
        if (ga4 != null) {
            ga4.setWindowTitle(charSequence);
            return;
        }
        b59 b59 = this.x0;
        if (b59 != null) {
            b59.Y(charSequence);
            return;
        }
        TextView textView = this.K0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(boolean r13, boolean r14) {
        /*
            r12 = this;
            boolean r0 = r12.Z0
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.b1
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            int r0 = defpackage.rn.b
        L_0x000f:
            android.content.Context r2 = r12.Y
            int r3 = r12.B(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L_0x0021
            j58 r4 = n(r2)
            goto L_0x0022
        L_0x0021:
            r4 = r6
        L_0x0022:
            if (r14 != 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            android.content.res.Resources r14 = r2.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            j58 r4 = defpackage.vn.b(r14)
        L_0x0032:
            android.content.res.Configuration r14 = s(r2, r3, r4, r6, r1)
            boolean r3 = r12.e1
            r5 = 1
            java.lang.Object r7 = r12.X
            if (r3 != 0) goto L_0x0061
            boolean r3 = r7 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0061
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            if (r3 != 0) goto L_0x0049
            r3 = r1
            goto L_0x0065
        L_0x0049:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005f }
            java.lang.Class r9 = r7.getClass()     // Catch:{ NameNotFoundException -> 0x005f }
            r8.<init>(r2, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            r9 = 269221888(0x100c0000, float:2.7610132E-29)
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x005f }
            if (r3 == 0) goto L_0x0061
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x005f }
            r12.d1 = r3     // Catch:{ NameNotFoundException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r12.d1 = r1
        L_0x0061:
            r12.e1 = r5
            int r3 = r12.d1
        L_0x0065:
            android.content.res.Configuration r8 = r12.a1
            if (r8 != 0) goto L_0x0071
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L_0x0071:
            int r9 = r8.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            j58 r8 = defpackage.vn.b(r8)
            if (r4 != 0) goto L_0x0081
            r4 = r6
            goto L_0x0085
        L_0x0081:
            j58 r4 = defpackage.vn.b(r14)
        L_0x0085:
            if (r9 == r10) goto L_0x008a
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x008b
        L_0x008a:
            r9 = r1
        L_0x008b:
            if (r4 == 0) goto L_0x0095
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0095
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        L_0x0095:
            int r8 = ~r3
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00d2
            if (r13 == 0) goto L_0x00d2
            boolean r13 = r12.X0
            if (r13 == 0) goto L_0x00d2
            boolean r13 = s1
            if (r13 != 0) goto L_0x00a7
            boolean r13 = r12.Y0
            if (r13 == 0) goto L_0x00d2
        L_0x00a7:
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x00d2
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r8 = r13.isChild()
            if (r8 != 0) goto L_0x00d2
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r8 < r11) goto L_0x00cd
            r8 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x00cd
            android.view.Window r8 = r13.getWindow()
            android.view.View r8 = r8.getDecorView()
            int r14 = r14.getLayoutDirection()
            r8.setLayoutDirection(r14)
        L_0x00cd:
            r13.recreate()
            r13 = r5
            goto L_0x00d3
        L_0x00d2:
            r13 = r1
        L_0x00d3:
            if (r13 != 0) goto L_0x013c
            if (r9 == 0) goto L_0x013c
            r13 = r9 & r3
            if (r13 != r9) goto L_0x00dc
            r1 = r5
        L_0x00dc:
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r14 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r13.getConfiguration()
            r14.<init>(r3)
            android.content.res.Configuration r3 = r13.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & -49
            r3 = r3 | r10
            r14.uiMode = r3
            if (r4 == 0) goto L_0x00f9
            defpackage.vn.d(r14, r4)
        L_0x00f9:
            r13.updateConfiguration(r14, r6)
            int r13 = r12.c1
            if (r13 == 0) goto L_0x010c
            r2.setTheme(r13)
            android.content.res.Resources$Theme r13 = r2.getTheme()
            int r3 = r12.c1
            r13.applyStyle(r3, r5)
        L_0x010c:
            if (r1 == 0) goto L_0x013d
            boolean r13 = r7 instanceof android.app.Activity
            if (r13 == 0) goto L_0x013d
            r13 = r7
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r1 = r13 instanceof defpackage.jv7
            if (r1 == 0) goto L_0x0130
            r1 = r13
            jv7 r1 = (defpackage.jv7) r1
            ju7 r1 = r1.getLifecycle()
            lv7 r1 = (defpackage.lv7) r1
            iu7 r1 = r1.d
            iu7 r3 = defpackage.iu7.c
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L_0x013d
            r13.onConfigurationChanged(r14)
            goto L_0x013d
        L_0x0130:
            boolean r1 = r12.Y0
            if (r1 == 0) goto L_0x013d
            boolean r1 = r12.Z0
            if (r1 != 0) goto L_0x013d
            r13.onConfigurationChanged(r14)
            goto L_0x013d
        L_0x013c:
            r5 = r13
        L_0x013d:
            if (r5 == 0) goto L_0x0156
            boolean r13 = r7 instanceof defpackage.hn
            if (r13 == 0) goto L_0x0156
            r13 = r9 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x014d
            r13 = r7
            hn r13 = (defpackage.hn) r13
            r13.getClass()
        L_0x014d:
            r13 = r9 & 4
            if (r13 == 0) goto L_0x0156
            hn r7 = (defpackage.hn) r7
            r7.getClass()
        L_0x0156:
            if (r4 == 0) goto L_0x0167
            android.content.res.Resources r13 = r2.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            j58 r13 = defpackage.vn.b(r13)
            defpackage.vn.c(r13)
        L_0x0167:
            if (r0 != 0) goto L_0x0171
            fbf r13 = r12.x(r2)
            r13.c0()
            goto L_0x0178
        L_0x0171:
            zn r13 = r12.f1
            if (r13 == 0) goto L_0x0178
            r13.y()
        L_0x0178:
            r13 = 3
            if (r0 != r13) goto L_0x018c
            zn r13 = r12.g1
            if (r13 != 0) goto L_0x0186
            zn r13 = new zn
            r13.<init>((defpackage.eo) r12, (android.content.Context) r2)
            r12.g1 = r13
        L_0x0186:
            zn r12 = r12.g1
            r12.c0()
            goto L_0x0193
        L_0x018c:
            zn r12 = r12.g1
            if (r12 == 0) goto L_0x0193
            r12.y()
        L_0x0193:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.l(boolean, boolean):boolean");
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.Z == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof yn)) {
                yn ynVar = new yn(this, callback);
                this.v0 = ynVar;
                window.setCallback(ynVar);
                int[] iArr = r1;
                Context context = this.Y;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    ho a = ho.a();
                    synchronized (a) {
                        drawable = a.a.e(resourceId, context, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.Z = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.o1) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.p1) == null)) {
                        xn.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.p1 = null;
                    }
                    Object obj = this.X;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.o1 = xn.a(activity);
                            H();
                            return;
                        }
                    }
                    this.o1 = null;
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.i() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(defpackage.m69 r6) {
        /*
            r5 = this;
            ga4 r6 = r5.A0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00d3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            ha4 r6 = r6.v
            omf r6 = (defpackage.omf) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00d3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r6.o
            if (r6 == 0) goto L_0x00d3
            android.content.Context r6 = r5.Y
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            ga4 r6 = r5.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            ha4 r6 = r6.v
            omf r6 = (defpackage.omf) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x00d3
            w7 r6 = r6.v
            if (r6 == 0) goto L_0x00d3
            vj6 r2 = r6.D0
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.i()
            if (r6 == 0) goto L_0x00d3
        L_0x004a:
            android.view.Window r6 = r5.Z
            android.view.Window$Callback r6 = r6.getCallback()
            ga4 r2 = r5.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            ha4 r2 = r2.v
            omf r2 = (defpackage.omf) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x008c
            ga4 r0 = r5.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.e()
            ha4 r0 = r0.v
            omf r0 = (defpackage.omf) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x007e
            w7 r0 = r0.v
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.b()
        L_0x007e:
            boolean r0 = r5.Z0
            if (r0 != 0) goto L_0x00e0
            co r5 = r5.y(r1)
            m69 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            goto L_0x00e0
        L_0x008c:
            if (r6 == 0) goto L_0x00e0
            boolean r2 = r5.Z0
            if (r2 != 0) goto L_0x00e0
            boolean r2 = r5.h1
            if (r2 == 0) goto L_0x00a9
            int r2 = r5.i1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00a9
            android.view.Window r0 = r5.Z
            android.view.View r0 = r0.getDecorView()
            sn r2 = r5.j1
            r0.removeCallbacks(r2)
            r2.run()
        L_0x00a9:
            co r0 = r5.y(r1)
            m69 r2 = r0.h
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r0.o
            if (r4 != 0) goto L_0x00e0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L_0x00e0
            m69 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            ga4 r5 = r5.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.e()
            ha4 r5 = r5.v
            omf r5 = (defpackage.omf) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
            goto L_0x00e0
        L_0x00d3:
            co r6 = r5.y(r1)
            r6.n = r0
            r5.r(r6, r1)
            r0 = 0
            r5.D(r6, r0)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.o(m69):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            r8 = 3
            r0 = -1
            r1 = 0
            r2 = 1
            qp r3 = r7.n1
            r4 = 0
            if (r3 != 0) goto L_0x0040
            int[] r3 = defpackage.koc.AppCompatTheme
            android.content.Context r5 = r7.Y
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r3)
            int r6 = defpackage.koc.AppCompatTheme_viewInflaterClass
            java.lang.String r6 = r3.getString(r6)
            r3.recycle()
            if (r6 != 0) goto L_0x0024
            qp r3 = new qp
            r3.<init>()
            r7.n1 = r3
            goto L_0x0040
        L_0x0024:
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch:{ all -> 0x0039 }
            java.lang.Class r3 = r3.loadClass(r6)     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ all -> 0x0039 }
            qp r3 = (defpackage.qp) r3     // Catch:{ all -> 0x0039 }
            r7.n1 = r3     // Catch:{ all -> 0x0039 }
            goto L_0x0040
        L_0x0039:
            qp r3 = new qp
            r3.<init>()
            r7.n1 = r3
        L_0x0040:
            qp r7 = r7.n1
            int r3 = defpackage.a2g.a
            r7.getClass()
            int[] r3 = defpackage.koc.View
            android.content.res.TypedArray r3 = r10.obtainStyledAttributes(r11, r3, r1, r1)
            int r5 = defpackage.koc.View_theme
            int r5 = r3.getResourceId(r5, r1)
            r3.recycle()
            if (r5 == 0) goto L_0x0069
            boolean r3 = r10 instanceof defpackage.kx3
            if (r3 == 0) goto L_0x0063
            r3 = r10
            kx3 r3 = (defpackage.kx3) r3
            int r3 = r3.a
            if (r3 == r5) goto L_0x0069
        L_0x0063:
            kx3 r3 = new kx3
            r3.<init>(r10, r5)
            goto L_0x006a
        L_0x0069:
            r3 = r10
        L_0x006a:
            r9.getClass()
            int r5 = r9.hashCode()
            switch(r5) {
                case -1946472170: goto L_0x0115;
                case -1455429095: goto L_0x0109;
                case -1346021293: goto L_0x00fd;
                case -938935918: goto L_0x00f1;
                case -937446323: goto L_0x00e6;
                case -658531749: goto L_0x00db;
                case -339785223: goto L_0x00d0;
                case 776382189: goto L_0x00c5;
                case 799298502: goto L_0x00b8;
                case 1125864064: goto L_0x00ab;
                case 1413872058: goto L_0x009e;
                case 1601505219: goto L_0x0091;
                case 1666676343: goto L_0x0084;
                case 2001146706: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            r5 = r0
            goto L_0x0120
        L_0x0077:
            java.lang.String r5 = "Button"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0080
            goto L_0x0074
        L_0x0080:
            r5 = 13
            goto L_0x0120
        L_0x0084:
            java.lang.String r5 = "EditText"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x008d
            goto L_0x0074
        L_0x008d:
            r5 = 12
            goto L_0x0120
        L_0x0091:
            java.lang.String r5 = "CheckBox"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x009a
            goto L_0x0074
        L_0x009a:
            r5 = 11
            goto L_0x0120
        L_0x009e:
            java.lang.String r5 = "AutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00a7
            goto L_0x0074
        L_0x00a7:
            r5 = 10
            goto L_0x0120
        L_0x00ab:
            java.lang.String r5 = "ImageView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00b4
            goto L_0x0074
        L_0x00b4:
            r5 = 9
            goto L_0x0120
        L_0x00b8:
            java.lang.String r5 = "ToggleButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00c1
            goto L_0x0074
        L_0x00c1:
            r5 = 8
            goto L_0x0120
        L_0x00c5:
            java.lang.String r5 = "RadioButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ce
            goto L_0x0074
        L_0x00ce:
            r5 = 7
            goto L_0x0120
        L_0x00d0:
            java.lang.String r5 = "Spinner"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x0074
        L_0x00d9:
            r5 = 6
            goto L_0x0120
        L_0x00db:
            java.lang.String r5 = "SeekBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00e4
            goto L_0x0074
        L_0x00e4:
            r5 = 5
            goto L_0x0120
        L_0x00e6:
            java.lang.String r5 = "ImageButton"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00ef
            goto L_0x0074
        L_0x00ef:
            r5 = 4
            goto L_0x0120
        L_0x00f1:
            java.lang.String r5 = "TextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x00fb
            goto L_0x0074
        L_0x00fb:
            r5 = r8
            goto L_0x0120
        L_0x00fd:
            java.lang.String r5 = "MultiAutoCompleteTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0107
            goto L_0x0074
        L_0x0107:
            r5 = 2
            goto L_0x0120
        L_0x0109:
            java.lang.String r5 = "CheckedTextView"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x0113
            goto L_0x0074
        L_0x0113:
            r5 = r2
            goto L_0x0120
        L_0x0115:
            java.lang.String r5 = "RatingBar"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L_0x011f
            goto L_0x0074
        L_0x011f:
            r5 = r1
        L_0x0120:
            switch(r5) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0168;
                case 2: goto L_0x0162;
                case 3: goto L_0x015d;
                case 4: goto L_0x0157;
                case 5: goto L_0x0151;
                case 6: goto L_0x014b;
                case 7: goto L_0x0146;
                case 8: goto L_0x0140;
                case 9: goto L_0x013a;
                case 10: goto L_0x0135;
                case 11: goto L_0x0130;
                case 12: goto L_0x012a;
                case 13: goto L_0x0125;
                default: goto L_0x0123;
            }
        L_0x0123:
            r5 = r4
            goto L_0x0175
        L_0x0125:
            androidx.appcompat.widget.AppCompatButton r5 = r7.b(r3, r11)
            goto L_0x0175
        L_0x012a:
            androidx.appcompat.widget.AppCompatEditText r5 = new androidx.appcompat.widget.AppCompatEditText
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0130:
            androidx.appcompat.widget.AppCompatCheckBox r5 = r7.c(r3, r11)
            goto L_0x0175
        L_0x0135:
            in r5 = r7.a(r3, r11)
            goto L_0x0175
        L_0x013a:
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0140:
            op r5 = new op
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0146:
            androidx.appcompat.widget.AppCompatRadioButton r5 = r7.d(r3, r11)
            goto L_0x0175
        L_0x014b:
            ap r5 = new ap
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0151:
            androidx.appcompat.widget.AppCompatSeekBar r5 = new androidx.appcompat.widget.AppCompatSeekBar
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0157:
            androidx.appcompat.widget.AppCompatImageButton r5 = new androidx.appcompat.widget.AppCompatImageButton
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x015d:
            androidx.appcompat.widget.AppCompatTextView r5 = r7.e(r3, r11)
            goto L_0x0175
        L_0x0162:
            lo r5 = new lo
            r5.<init>(r3, r11)
            goto L_0x0175
        L_0x0168:
            ln r5 = new ln
            int r6 = defpackage.hdc.checkedTextViewStyle
            r5.<init>(r3, r11, r6)
            goto L_0x0175
        L_0x0170:
            no r5 = new no
            r5.<init>(r3, r11)
        L_0x0175:
            if (r5 != 0) goto L_0x01c5
            if (r10 == r3) goto L_0x01c5
            java.lang.Object[] r10 = r7.a
            java.lang.String r5 = "view"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0189
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r4, r9)
        L_0x0189:
            r10[r1] = r3     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r10[r2] = r11     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r5 = 46
            int r5 = r9.indexOf(r5)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r0 != r5) goto L_0x01b1
            r0 = r1
        L_0x0196:
            java.lang.String[] r5 = defpackage.qp.d     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r0 >= r8) goto L_0x01ac
            r5 = r5[r0]     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            android.view.View r5 = r7.f(r3, r9, r5)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            if (r5 == 0) goto L_0x01a8
            r10[r1] = r4
            r10[r2] = r4
            r4 = r5
            goto L_0x01c4
        L_0x01a8:
            int r0 = r0 + r2
            goto L_0x0196
        L_0x01aa:
            r7 = move-exception
            goto L_0x01bb
        L_0x01ac:
            r10[r1] = r4
            r10[r2] = r4
            goto L_0x01c4
        L_0x01b1:
            android.view.View r7 = r7.f(r3, r9, r4)     // Catch:{ Exception -> 0x01c0, all -> 0x01aa }
            r10[r1] = r4
            r10[r2] = r4
            r4 = r7
            goto L_0x01c4
        L_0x01bb:
            r10[r1] = r4
            r10[r2] = r4
            throw r7
        L_0x01c0:
            r10[r1] = r4
            r10[r2] = r4
        L_0x01c4:
            r5 = r4
        L_0x01c5:
            if (r5 == 0) goto L_0x01ed
            android.content.Context r7 = r5.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L_0x01ed
            boolean r8 = r5.hasOnClickListeners()
            if (r8 != 0) goto L_0x01d6
            goto L_0x01ed
        L_0x01d6:
            int[] r8 = defpackage.qp.c
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r11, r8)
            java.lang.String r8 = r7.getString(r1)
            if (r8 == 0) goto L_0x01ea
            pp r9 = new pp
            r9.<init>(r5, r8)
            r5.setOnClickListener(r9)
        L_0x01ea:
            r7.recycle()
        L_0x01ed:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: finally extract failed */
    public final void p(int i, co coVar, m69 m69) {
        if (m69 == null) {
            if (coVar == null && i >= 0) {
                co[] coVarArr = this.U0;
                if (i < coVarArr.length) {
                    coVar = coVarArr[i];
                }
            }
            if (coVar != null) {
                m69 = coVar.h;
            }
        }
        if ((coVar == null || coVar.m) && !this.Z0) {
            yn ynVar = this.v0;
            Window.Callback callback = this.Z.getCallback();
            ynVar.getClass();
            try {
                ynVar.v = true;
                callback.onPanelClosed(i, m69);
                ynVar.v = false;
            } catch (Throwable th) {
                ynVar.v = false;
                throw th;
            }
        }
    }

    public final void q(m69 m69) {
        w7 w7Var;
        if (!this.T0) {
            this.T0 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A0;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((omf) actionBarOverlayLayout.v).a.a;
            if (!(actionMenuView == null || (w7Var = actionMenuView.v) == null)) {
                w7Var.b();
                t7 t7Var = w7Var.C0;
                if (t7Var != null && t7Var.b()) {
                    t7Var.j.dismiss();
                }
            }
            Window.Callback callback = this.Z.getCallback();
            if (callback != null && !this.Z0) {
                callback.onPanelClosed(108, m69);
            }
            this.T0 = false;
        }
    }

    public final void r(co coVar, boolean z) {
        bo boVar;
        ga4 ga4;
        if (z && coVar.a == 0 && (ga4 = this.A0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) ga4;
            actionBarOverlayLayout.e();
            if (((omf) actionBarOverlayLayout.v).a.p()) {
                q(coVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.Y.getSystemService("window");
        if (!(windowManager == null || !coVar.m || (boVar = coVar.e) == null)) {
            windowManager.removeView(boVar);
            if (z) {
                p(coVar.a, coVar, (m69) null);
            }
        }
        coVar.k = false;
        coVar.l = false;
        coVar.m = false;
        coVar.f = null;
        coVar.n = true;
        if (this.V0 == coVar) {
            this.V0 = null;
        }
        if (coVar.a == 0) {
            H();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (r6.b() != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.X
            boolean r1 = r0 instanceof defpackage.cq7
            if (r1 != 0) goto L_0x000a
            boolean r0 = r0 instanceof defpackage.go
            if (r0 == 0) goto L_0x0014
        L_0x000a:
            android.view.Window r0 = r6.Z
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x0014
            java.util.WeakHashMap r0 = defpackage.gag.a
        L_0x0014:
            int r0 = r7.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 82
            if (r0 != r3) goto L_0x0038
            yn r0 = r6.v0
            android.view.Window r4 = r6.Z
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.o = r1     // Catch:{ all -> 0x0034 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0034 }
            r0.o = r2
            if (r4 == 0) goto L_0x0038
            return r1
        L_0x0034:
            r6 = move-exception
            r0.o = r2
            throw r6
        L_0x0038:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006a
            if (r0 == r5) goto L_0x005b
            if (r0 == r3) goto L_0x0048
            goto L_0x0067
        L_0x0048:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012d
            co r0 = r6.y(r2)
            boolean r2 = r0.m
            if (r2 != 0) goto L_0x012d
            r6.F(r0, r7)
            goto L_0x012d
        L_0x005b:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            r6.W0 = r1
        L_0x0067:
            r1 = r2
            goto L_0x012d
        L_0x006a:
            if (r0 == r5) goto L_0x0127
            if (r0 == r3) goto L_0x006f
            goto L_0x0067
        L_0x006f:
            b8 r0 = r6.D0
            if (r0 == 0) goto L_0x0075
            goto L_0x012d
        L_0x0075:
            co r0 = r6.y(r2)
            ga4 r3 = r6.A0
            android.content.Context r4 = r6.Y
            if (r3 == 0) goto L_0x00ed
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            ha4 r3 = r3.v
            omf r3 = (defpackage.omf) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x00ed
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            if (r3 == 0) goto L_0x00ed
            boolean r3 = r3.o
            if (r3 == 0) goto L_0x00ed
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x00ed
            ga4 r3 = r6.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.e()
            ha4 r3 = r3.v
            omf r3 = (defpackage.omf) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x00d1
            boolean r3 = r6.Z0
            if (r3 != 0) goto L_0x010d
            boolean r7 = r6.F(r0, r7)
            if (r7 == 0) goto L_0x010d
            ga4 r6 = r6.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            ha4 r6 = r6.v
            omf r6 = (defpackage.omf) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            boolean r6 = r6.w()
            goto L_0x0113
        L_0x00d1:
            ga4 r6 = r6.A0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            ha4 r6 = r6.v
            omf r6 = (defpackage.omf) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto L_0x010d
            w7 r6 = r6.v
            if (r6 == 0) goto L_0x010d
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x010d
            goto L_0x010b
        L_0x00ed:
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x010f
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x00f6
            goto L_0x010f
        L_0x00f6:
            boolean r3 = r0.k
            if (r3 == 0) goto L_0x010d
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0105
            r0.k = r2
            boolean r3 = r6.F(r0, r7)
            goto L_0x0106
        L_0x0105:
            r3 = r1
        L_0x0106:
            if (r3 == 0) goto L_0x010d
            r6.D(r0, r7)
        L_0x010b:
            r6 = r1
            goto L_0x0113
        L_0x010d:
            r6 = r2
            goto L_0x0113
        L_0x010f:
            r6.r(r0, r1)
            r6 = r3
        L_0x0113:
            if (r6 == 0) goto L_0x012d
            android.content.Context r6 = r4.getApplicationContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            if (r6 == 0) goto L_0x012d
            r6.playSoundEffect(r2)
            goto L_0x012d
        L_0x0127:
            boolean r6 = r6.C()
            if (r6 == 0) goto L_0x0067
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i) {
        co y = y(i);
        if (y.h != null) {
            Bundle bundle = new Bundle();
            y.h.t(bundle);
            if (bundle.size() > 0) {
                y.p = bundle;
            }
            y.h.w();
            y.h.clear();
        }
        y.o = true;
        y.n = true;
        if ((i == 108 || i == 0) && this.A0 != null) {
            co y2 = y(0);
            y2.k = false;
            F(y2, (KeyEvent) null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        if (!this.I0) {
            int[] iArr = koc.AppCompatTheme;
            Context context = this.Y;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(koc.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(koc.AppCompatTheme_windowNoTitle, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(koc.AppCompatTheme_windowActionBar, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(koc.AppCompatTheme_windowActionBarOverlay, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(koc.AppCompatTheme_windowActionModeOverlay, false)) {
                    f(10);
                }
                this.R0 = obtainStyledAttributes.getBoolean(koc.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                w();
                this.Z.getDecorView();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.S0) {
                    viewGroup = this.Q0 ? (ViewGroup) from.inflate(vjc.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(vjc.abc_screen_simple, (ViewGroup) null);
                } else if (this.R0) {
                    viewGroup = (ViewGroup) from.inflate(vjc.abc_dialog_title_material, (ViewGroup) null);
                    this.P0 = false;
                    this.O0 = false;
                } else if (this.O0) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(hdc.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new kx3(context, typedValue.resourceId) : context).inflate(vjc.abc_screen_toolbar, (ViewGroup) null);
                    ga4 ga4 = (ga4) viewGroup.findViewById(egc.decor_content_parent);
                    this.A0 = ga4;
                    ga4.setWindowCallback(this.Z.getCallback());
                    if (this.P0) {
                        ((ActionBarOverlayLayout) this.A0).d(109);
                    }
                    if (this.M0) {
                        ((ActionBarOverlayLayout) this.A0).d(2);
                    }
                    if (this.N0) {
                        ((ActionBarOverlayLayout) this.A0).d(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    rt6 rt6 = new rt6(3, (Object) this);
                    WeakHashMap weakHashMap = gag.a;
                    v9g.u(viewGroup, rt6);
                    if (this.A0 == null) {
                        this.K0 = (TextView) viewGroup.findViewById(egc.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(egc.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.Z.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.Z.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new er7(3, (Object) this));
                    this.J0 = viewGroup;
                    Object obj = this.X;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.z0;
                    if (!TextUtils.isEmpty(title)) {
                        ga4 ga42 = this.A0;
                        if (ga42 != null) {
                            ga42.setWindowTitle(title);
                        } else {
                            b59 b59 = this.x0;
                            if (b59 != null) {
                                b59.Y(title);
                            } else {
                                TextView textView = this.K0;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J0.findViewById(16908290);
                    View decorView = this.Z.getDecorView();
                    contentFrameLayout2.x.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(koc.AppCompatTheme);
                    obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(koc.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(koc.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(koc.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(koc.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(koc.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.I0 = true;
                    co y = y(0);
                    if (!this.Z0 && y.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.O0);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.P0);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.R0);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.Q0);
                sb.append(", windowNoTitle: ");
                throw new IllegalArgumentException(tr1.m(sb, this.S0, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.Z == null) {
            Object obj = this.X;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.Z == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [jk3, java.lang.Object] */
    public final fbf x(Context context) {
        if (this.f1 == null) {
            if (jk3.v == null) {
                Context applicationContext = context.getApplicationContext();
                ? obj = new Object();
                obj.c = new Object();
                obj.a = applicationContext;
                obj.b = (LocationManager) applicationContext.getSystemService("location");
                jk3.v = obj;
            }
            this.f1 = new zn(this, jk3.v);
        }
        return this.f1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: co[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: co[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, co] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.co y(int r5) {
        /*
            r4 = this;
            co[] r0 = r4.U0
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            co[] r2 = new defpackage.co[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.U0 = r2
            r0 = r2
        L_0x0015:
            r4 = r0[r5]
            if (r4 != 0) goto L_0x0024
            co r4 = new co
            r4.<init>()
            r4.a = r5
            r4.n = r1
            r0[r5] = r4
        L_0x0024:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.y(int):co");
    }

    public final void z() {
        v();
        if (this.O0 && this.x0 == null) {
            Object obj = this.X;
            if (obj instanceof Activity) {
                this.x0 = new ong((Activity) obj, this.P0);
            } else if (obj instanceof Dialog) {
                this.x0 = new ong((Dialog) obj);
            }
            b59 b59 = this.x0;
            if (b59 != null) {
                b59.W(this.k1);
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
