package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;

/* renamed from: zw8  reason: default package */
public abstract class zw8 {
    public static final int a = qdc.mr_dynamic_dialog_icon_light;

    public static ContextThemeWrapper a(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, h(!z ? hdc.dialogTheme : hdc.alertDialogTheme, context));
        return h(bdc.mediaRouteTheme, contextThemeWrapper) != 0 ? new ContextThemeWrapper(contextThemeWrapper, f(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int h = h(bdc.mediaRouteTheme, contextThemeWrapper);
        return h == 0 ? f(contextThemeWrapper) : h;
    }

    public static int c(Context context) {
        return w53.c(-1, g(hdc.colorPrimary, context)) >= 3.0d ? -1 : -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable D = iq.D(context, obtainStyledAttributes.getResourceId(0, 0));
        if (i(context)) {
            ru4.g(D, fw3.a(context, a));
        }
        obtainStyledAttributes.recycle();
        return D;
    }

    public static int f(Context context) {
        return i(context) ? c(context) == -570425344 ? fnc.Theme_MediaRouter_Light : fnc.Theme_MediaRouter_Light_DarkControlPanel : c(context) == -570425344 ? fnc.Theme_MediaRouter_LightControlPanel : fnc.Theme_MediaRouter;
    }

    public static int g(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int h(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean i(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(hdc.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void j(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(fw3.a(context, i(context) ? qdc.mr_cast_progressbar_progress_and_thumb_light : qdc.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
