package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* renamed from: hn  reason: default package */
public abstract class hn extends b implements kn {
    public eo w;

    public hn() {
        getSavedStateRegistry().c("androidx:appcompat", new fn(this));
        addOnContextAvailableListener(new gn(this));
    }

    public final rn A() {
        if (this.w == null) {
            qn qnVar = rn.a;
            this.w = new eo(this, (Window) null, this, this);
        }
        return this.w;
    }

    public final void B() {
        q8.M(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(sic.view_tree_view_model_store_owner, this);
        iq.V(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(wic.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        eo eoVar = (eo) A();
        eoVar.v();
        ((ViewGroup) eoVar.J0.findViewById(16908290)).addView(view, layoutParams);
        eoVar.v0.a(eoVar.Z.getCallback());
    }

    public void attachBaseContext(Context context) {
        eo eoVar = (eo) A();
        eoVar.X0 = true;
        int i = eoVar.b1;
        if (i == -100) {
            i = rn.b;
        }
        int B = eoVar.B(i, context);
        if (rn.b(context) && rn.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (rn.z) {
                    try {
                        j58 j58 = rn.c;
                        if (j58 == null) {
                            if (rn.o == null) {
                                rn.o = j58.a(y64.A(context));
                            }
                            if (!rn.o.a.a.isEmpty()) {
                                rn.c = rn.o;
                            }
                        } else if (!j58.equals(rn.o)) {
                            j58 j582 = rn.c;
                            rn.o = j582;
                            y64.z(context, j582.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!rn.w) {
                rn.a.execute(new nn(context, 0));
            }
        }
        j58 n = eo.n(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(eo.s(context, B, n, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof kx3) {
            try {
                ((kx3) context).a(eo.s(context, B, n, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (eo.s1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = c44.DEFAULT_ASPECT_RATIO;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = c44.DEFAULT_ASPECT_RATIO;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    vn.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration s = eo.s(context, B, n, configuration, true);
            kx3 kx3 = new kx3(context, mnc.Theme_AppCompat_Empty);
            kx3.a(s);
            try {
                if (context.getTheme() != null) {
                    g4d.a(kx3.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = kx3;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (b59 == null || !b59.i()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (keyCode != 82 || b59 == null || !b59.P(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final View findViewById(int i) {
        eo eoVar = (eo) A();
        eoVar.v();
        return eoVar.Z.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        eo eoVar = (eo) A();
        if (eoVar.y0 == null) {
            eoVar.z();
            b59 b59 = eoVar.x0;
            eoVar.y0 = new c3f(b59 != null ? b59.G() : eoVar.Y);
        }
        return eoVar.y0;
    }

    public final Resources getResources() {
        int i = a2g.a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        A().a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        eo eoVar = (eo) A();
        if (eoVar.O0 && eoVar.I0) {
            eoVar.z();
            b59 b59 = eoVar.x0;
            if (b59 != null) {
                b59.M();
            }
        }
        ho a = ho.a();
        Context context = eoVar.Y;
        synchronized (a) {
            a4d a4d = a.a;
            synchronized (a4d) {
                ya8 ya8 = (ya8) a4d.b.get(context);
                if (ya8 != null) {
                    ya8.a();
                }
            }
        }
        eoVar.a1 = new Configuration(eoVar.Y.getResources().getConfiguration());
        eoVar.l(false, false);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        A().d();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (menuItem.getItemId() != 16908332 || b59 == null || (b59.E() & 4) == 0) {
            return false;
        }
        Intent w2 = i8b.w(this);
        if (w2 == null) {
            return false;
        }
        if (shouldUpRecreateTask(w2)) {
            ArrayList arrayList = new ArrayList();
            Intent w3 = i8b.w(this);
            if (w3 == null) {
                w3 = i8b.w(this);
            }
            if (w3 != null) {
                ComponentName component = w3.getComponent();
                if (component == null) {
                    component = w3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent x = i8b.x(this, component);
                    while (x != null) {
                        arrayList.add(size, x);
                        x = i8b.x(this, x.getComponent());
                    }
                    arrayList.add(w3);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(w2);
            return true;
        }
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((eo) A()).v();
    }

    public final void onPostResume() {
        super.onPostResume();
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (b59 != null) {
            b59.X(true);
        }
    }

    public void onStart() {
        super.onStart();
        ((eo) A()).l(true, false);
    }

    public void onStop() {
        super.onStop();
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (b59 != null) {
            b59.X(false);
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A().k(charSequence);
    }

    public final void openOptionsMenu() {
        eo eoVar = (eo) A();
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (b59 == null || !b59.Q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        B();
        A().g(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((eo) A()).c1 = i;
    }

    public void setContentView(View view) {
        B();
        A().i(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        A().j(view, layoutParams);
    }
}
