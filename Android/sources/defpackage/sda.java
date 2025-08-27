package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;
import kotlin.io.ConstantsKt;

/* renamed from: sda  reason: default package */
public abstract class sda {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public sda(FrameLayout frameLayout, fub fub) {
        this.c = frameLayout;
        this.d = fub;
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.d);
        }
        CharSequence charSequence = (CharSequence) this.c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String e = e();
        if (e != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e);
        }
    }

    public abstract void b(tgg tgg);

    public RemoteViews c(int i) {
        boolean z;
        boolean z2;
        Resources resources = ((eda) this.b).a.getResources();
        RemoteViews remoteViews = new RemoteViews(((eda) this.b).a.getPackageName(), i);
        eda eda = (eda) this.b;
        int i2 = eda.k;
        int i3 = 0;
        if (eda.i != null) {
            remoteViews.setViewVisibility(ahc.icon, 0);
            remoteViews.setImageViewBitmap(ahc.icon, d(((eda) this.b).i, 0, 0));
        }
        CharSequence charSequence = ((eda) this.b).e;
        if (charSequence != null) {
            remoteViews.setTextViewText(ahc.title, charSequence);
        }
        CharSequence charSequence2 = ((eda) this.b).f;
        boolean z3 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(ahc.text, charSequence2);
            z = true;
        } else {
            z = false;
        }
        ((eda) this.b).getClass();
        if (((eda) this.b).j > 0) {
            if (((eda) this.b).j > resources.getInteger(xic.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(ahc.info, resources.getString(alc.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(ahc.info, NumberFormat.getIntegerInstance().format((long) ((eda) this.b).j));
            }
            remoteViews.setViewVisibility(ahc.info, 0);
            z = true;
            z2 = true;
        } else {
            remoteViews.setViewVisibility(ahc.info, 8);
            z2 = false;
        }
        ((eda) this.b).getClass();
        eda eda2 = (eda) this.b;
        long j = 0;
        if ((eda2.l ? eda2.F.when : 0) == 0) {
            z3 = z2;
        } else if (eda2.m) {
            remoteViews.setViewVisibility(ahc.chronometer, 0);
            int i4 = ahc.chronometer;
            eda eda3 = (eda) this.b;
            if (eda3.l) {
                j = eda3.F.when;
            }
            remoteViews.setLong(i4, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j);
            remoteViews.setBoolean(ahc.chronometer, "setStarted", true);
            ((eda) this.b).getClass();
        } else {
            remoteViews.setViewVisibility(ahc.time, 0);
            int i5 = ahc.time;
            eda eda4 = (eda) this.b;
            if (eda4.l) {
                j = eda4.F.when;
            }
            remoteViews.setLong(i5, "setTime", j);
        }
        remoteViews.setViewVisibility(ahc.right_side, z3 ? 0 : 8);
        int i6 = ahc.line3;
        if (!z) {
            i3 = 8;
        }
        remoteViews.setViewVisibility(i6, i3);
        return remoteViews;
    }

    public Bitmap d(IconCompat iconCompat, int i, int i2) {
        Object obj;
        Resources resources;
        Context context = ((eda) this.b).a;
        if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String f = iconCompat.f();
                    if ("android".equals(f)) {
                        resources = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(f, ConstantsKt.DEFAULT_BUFFER_SIZE);
                            if (applicationInfo != null) {
                                resources = packageManager.getResourcesForApplication(applicationInfo);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        resources = null;
                    }
                    int identifier = resources.getIdentifier(str4, str3, str5);
                    if (iconCompat.e != identifier) {
                        iconCompat.e = identifier;
                    }
                }
            }
        }
        Drawable c2 = v67.c(v67.d(iconCompat, context), context);
        int intrinsicWidth = i2 == 0 ? c2.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = c2.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        c2.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            c2.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        c2.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public String e() {
        return null;
    }

    public abstract View f();

    public abstract Bitmap g();

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l(z3f z3f, u00 u00);

    public void m() {
        View f = f();
        if (f != null && this.a) {
            FrameLayout frameLayout = (FrameLayout) this.c;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            fub fub = (fub) this.d;
            fub.getClass();
            if (size.getHeight() == 0 || size.getWidth() == 0) {
                size.toString();
            } else if (fub.f()) {
                if (f instanceof TextureView) {
                    ((TextureView) f).setTransform(fub.d());
                } else {
                    Display display = f.getDisplay();
                    if (!fub.g || display == null || display.getRotation() == fub.e) {
                    }
                    boolean z = fub.g;
                    if (!z) {
                        if ((!z ? fub.c : -kne.N(fub.e)) != 0) {
                        }
                    }
                }
                RectF e = fub.e(size, layoutDirection);
                f.setPivotX(c44.DEFAULT_ASPECT_RATIO);
                f.setPivotY(c44.DEFAULT_ASPECT_RATIO);
                f.setScaleX(e.width() / ((float) fub.a.getWidth()));
                f.setScaleY(e.height() / ((float) fub.a.getHeight()));
                f.setTranslationX(e.left - ((float) f.getLeft()));
                f.setTranslationY(e.top - ((float) f.getTop()));
            }
        }
    }

    public void n(eda eda) {
        if (((eda) this.b) != eda) {
            this.b = eda;
            if (eda != null) {
                eda.q(this);
            }
        }
    }

    public abstract zz7 o();

    public sda() {
    }
}
