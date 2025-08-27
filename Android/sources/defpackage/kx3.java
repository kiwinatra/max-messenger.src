package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: kx3  reason: default package */
public final class kx3 extends ContextWrapper {
    public static Configuration f;
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public kx3(Context context, int i) {
        super(context);
        this.a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                if (f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = c44.DEFAULT_ASPECT_RATIO;
                    f = configuration2;
                }
                if (!configuration.equals(f)) {
                    this.e = createConfigurationContext(this.d).getResources();
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = mnc.Theme_AppCompat_Light;
        }
        b();
        return this.b;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }
}
