package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.ParserException;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;

/* renamed from: iq  reason: default package */
public abstract class iq {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final frg c = new frg("CORE", 2);
    public static final int[] d = new int[2];

    public static final Boolean A(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static int[] B(int i, int i2, int i3, int i4) {
        float f = (float) i4;
        float f2 = (float) i3;
        int i5 = (int) ((f / f2) * ((float) i));
        if (i5 > i2) {
            i = (int) ((f2 / f) * ((float) i2));
        } else {
            i2 = i5;
        }
        Size size = new Size(i, i2);
        return new int[]{size.getWidth(), size.getHeight()};
    }

    public static final String C(mi3 mi3) {
        int i = mi3 == null ? -1 : hi3.$EnumSwitchMapping$0[mi3.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "4G" : "3G" : "2G" : "WIFI";
    }

    public static Drawable D(Context context, int i) {
        return a4d.c().f(context, i);
    }

    public static final Drawable E(int i, int i2, Context context) {
        Drawable b2 = ew3.b(context, i);
        if (b2 != null) {
            Drawable mutate = b2.mutate();
            a0(mutate, i2);
            return mutate;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static ArrayList F(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object i : list) {
            MediaRoute2Info i2 = x3.i(i);
            if (i2 != null) {
                arrayList.add(i2.getId());
            }
        }
        return arrayList;
    }

    public static int G(ky1 ky1) {
        int i = ky1.i(4);
        if (i == 15) {
            if (ky1.b() >= 24) {
                return ky1.i(24);
            }
            throw ParserException.a("AAC header insufficient data", (RuntimeException) null);
        } else if (i < 13) {
            return a[i];
        } else {
            throw ParserException.a("AAC header wrong Sampling Frequency Index", (RuntimeException) null);
        }
    }

    public static Rect H(View view) {
        WindowInsets rootWindowInsets;
        if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return null;
        }
        return new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
    }

    public static void I(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public static void J(int i, int i2, int i3, int i4, View view, View view2) {
        if (ct.z(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static void K(View view, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4, view, (View) view.getParent());
    }

    public static void L(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void M(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void N(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginStart() != i) {
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void O(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static Typeface P(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, h88.l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final boolean S(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static e T(ky1 ky1, boolean z) {
        int i = ky1.i(5);
        if (i == 31) {
            i = ky1.i(6) + 32;
        }
        int G = G(ky1);
        int i2 = ky1.i(4);
        String h = wj6.h(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            G = G(ky1);
            int i3 = ky1.i(5);
            if (i3 == 31) {
                i3 = ky1.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = ky1.i(4);
            }
        }
        if (z) {
            if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 17)) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i);
                }
            }
            if (ky1.h()) {
                i8b.V("Unexpected frameLengthFlag = 1");
            }
            if (ky1.h()) {
                ky1.t(14);
            }
            boolean h2 = ky1.h();
            if (i2 != 0) {
                if (i == 6 || i == 20) {
                    ky1.t(3);
                }
                if (h2) {
                    if (i == 22) {
                        ky1.t(16);
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        ky1.t(3);
                    }
                    ky1.t(1);
                }
                switch (i) {
                    case LangUtils.HASH_SEED /*17*/:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i4 = ky1.i(2);
                        if (i4 == 2 || i4 == 3) {
                            throw ParserException.c("Unsupported epConfig: " + i4);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new e(G, i5, h);
        }
        throw ParserException.a((String) null, (RuntimeException) null);
    }

    public static final String U(Long l) {
        if (l == null || l.longValue() <= 0) {
            return l + "ms";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
    }

    public static final void V(View view, odd odd) {
        view.setTag(xfc.view_tree_saved_state_registry_owner, odd);
    }

    public static final void W(EditText editText, int i) {
        Class<TextView> cls = TextView.class;
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = cls.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b2 = ew3.b(editText.getContext(), i2);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            b2.setColorFilter(new PorterDuffColorFilter(i, mode));
            Unit unit = Unit.INSTANCE;
            Drawable b3 = ew3.b(editText.getContext(), i2);
            b3.setColorFilter(new PorterDuffColorFilter(i, mode));
            declaredField3.set(obj, new Drawable[]{b2, b3});
            Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static void X(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof Spinner) {
                    Spinner spinner = (Spinner) childAt;
                    if (spinner.getSelectedView() != null) {
                        spinner.getSelectedView().setEnabled(z);
                    }
                } else if (childAt instanceof ViewGroup) {
                    X((ViewGroup) childAt, z);
                }
                childAt.setEnabled(z);
            }
        }
    }

    public static void Y(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void Z(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void a(String str, Throwable th) {
        String str2;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    str2 = "UnknownHostException (no network)";
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            String valueOf = String.valueOf(str);
            new StringBuilder(g63.f(valueOf.length() + 4, str2.replace("\n", "\n  ")));
        }
    }

    public static final void a0(Drawable drawable, int i) {
        if (drawable != null) {
            ru4.g(drawable, i);
            ru4.i(drawable, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void b(scf scf, ImageButton imageButton, int i) {
        int i2 = scf.l;
        c(scf, imageButton, i2, j4b.l0(0.3f, i2), scf.m, i);
    }

    public static final void b0(ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            indeterminateDrawable = progressBar.getProgressDrawable();
        }
        if (indeterminateDrawable != null) {
            a0(indeterminateDrawable, i);
        }
    }

    public static final void c(scf scf, ImageButton imageButton, int i, int i2, int i3, int i4) {
        imageButton.setBackground(i8b.f(i, scf.j, i2, i4));
        imageButton.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }

    public static int c0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static final void d(scf scf, TextView textView, int i) {
        f(scf, textView, i, 0, 0, 60);
    }

    public static int d0(Object obj) {
        return c0(obj == null ? 0 : obj.hashCode());
    }

    public static final void e(scf scf, TextView textView, int i, int i2, int i3) {
        f(scf, textView, i, i2, i3, 48);
    }

    public static nv8 e0(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        l15 l15 = new l15(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        int a2 = mediaRoute2Info.getConnectionState();
        Bundle bundle = (Bundle) l15.a;
        bundle.putInt("connectionState", a2);
        bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
        bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
        bundle.putInt("volume", mediaRoute2Info.getVolume());
        Bundle j = mediaRoute2Info.getExtras();
        if (j == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(j));
        }
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        CharSequence z = mediaRoute2Info.getDescription();
        if (z != null) {
            bundle.putString("status", z.toString());
        }
        Uri i = mediaRoute2Info.getIconUri();
        if (i != null) {
            bundle.putString("iconUri", i.toString());
        }
        Bundle j2 = mediaRoute2Info.getExtras();
        if (j2 == null || !j2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !j2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !j2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        Bundle bundle2 = j2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (bundle2 == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(bundle2));
        }
        bundle.putInt("deviceType", j2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", j2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = j2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            l15.c(parcelableArrayList);
        }
        return l15.g();
    }

    public static void f(scf scf, TextView textView, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = scf.l;
        }
        if ((i4 & 8) != 0) {
            i3 = scf.m;
        }
        textView.setBackground(i8b.f(i2, scf.j, j4b.l0(0.3f, i2), i));
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{i3, i3, i3}));
    }

    public static final void f0(fwf fwf) {
        fwf.c(oa4.class, new qid(17));
    }

    public static final void g(scf scf, Menu menu, Integer num) {
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                Drawable icon = menu.getItem(i).getIcon();
                if (icon != null) {
                    a0(icon, num != null ? num.intValue() : scf.x);
                }
            }
        }
    }

    public static final void g0(fwf fwf) {
        fwf.c(oa4.class, new qid(21));
    }

    public static final void h(scf scf, ProgressBar progressBar) {
        b0(progressBar, scf.l);
    }

    public static void h0(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " > 0 required but it was " + i);
        }
    }

    public static final void i(scf scf, AppCompatRadioButton appCompatRadioButton) {
        Integer num;
        Integer num2;
        appCompatRadioButton.setTextColor(scf.G);
        if (!Intrinsics.areEqual((Object) scf, (Object) vi4.f0) && (num = scf.X) != null && (num2 = scf.W) != null) {
            jd3.c(appCompatRadioButton, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
        }
    }

    public static void i0(int i) {
        boolean z = true;
        if (!(i == 100 || i == 102 || i == 104)) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        vzg.g(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static final void j(scf scf, SwitchCompat switchCompat) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        switchCompat.setTextColor(scf.G);
        if (!Intrinsics.areEqual((Object) scf, (Object) vi4.f0) && (num = scf.X) != null && (num2 = scf.W) != null && (num3 = scf.Z) != null && (num4 = scf.Y) != null) {
            switchCompat.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
            switchCompat.setTrackTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num3.intValue(), num4.intValue()}));
        }
    }

    public static String j0(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static final void k(scf scf, TextInputLayout textInputLayout) {
        int i = scf.N;
        textInputLayout.setDefaultHintTextColor(i8b.j(i, i));
        textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{16842910, 16842908}, new int[0]}, new int[]{scf.l, scf.N}));
    }

    public static final void l(scf scf, Toolbar toolbar, TextView textView, TextView textView2, boolean z, int i, int i2) {
        if (toolbar != null) {
            toolbar.setPopupTheme(scf.k);
            if (z) {
                toolbar.setBackgroundColor(scf.O);
            }
            Drawable navigationIcon = toolbar.getNavigationIcon();
            int i3 = scf.x;
            if (navigationIcon != null) {
                navigationIcon.mutate();
                navigationIcon.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                a0(overflowIcon, i3);
            }
            try {
                Field declaredField = Toolbar.class.getDeclaredField("w");
                declaredField.setAccessible(true);
                ((Drawable) declaredField.get(toolbar)).mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            } catch (Exception e) {
                z68.f("ThemeHelper", "applyToToolbar: ", e);
            }
        }
        if (textView != null) {
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public static /* synthetic */ void m(scf scf, Toolbar toolbar, TextView textView, int i) {
        if ((i & 2) != 0) {
            textView = null;
        }
        l(scf, toolbar, textView, (TextView) null, true, scf.G, scf.N);
    }

    public static final i9d n(zx3 zx3, ey3 ey3, ey3 ey32) {
        i9d i9d = new i9d(zx3, (String) null, (ey3) null, (ey3) null, false, -1);
        i9d.c(ey32);
        i9d.a(ey3);
        return i9d;
    }

    public static final void o(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException p = p(function1, obj, (UndeliveredElementException) null);
        if (p != null) {
            u04.a(p, coroutineContext);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [kotlinx.coroutines.internal.UndeliveredElementException, java.lang.RuntimeException] */
    public static final UndeliveredElementException p(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            ExceptionsKt.addSuppressed(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static void q(View view, int i) {
        if (view.getPaddingBottom() != i) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        }
    }

    public static void r(View view, int i) {
        WeakHashMap weakHashMap = gag.a;
        if (view.getPaddingEnd() != i) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static void s(View view, int i) {
        if (view.getPaddingLeft() != i) {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static void t(View view, int i) {
        WeakHashMap weakHashMap = gag.a;
        if (view.getPaddingStart() != i) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static void u(View view, int i) {
        if (view.getPaddingTop() != i) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static final boolean v(cla cla) {
        if (!(!Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper()))) {
            return true;
        }
        cla.c(new o7(1, m58.d));
        cla.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }

    public static void x(Rect rect, View view) {
        int[] iArr = d;
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Rect rect2 = i < rect.top ? new Rect(0, rect.top - i, view.getWidth(), view.getHeight()) : null;
        if (view.getHeight() + i > rect.bottom) {
            int height = view.getHeight() - ((view.getHeight() + i) - rect.bottom);
            if (rect2 == null) {
                rect2 = new Rect(0, 0, view.getWidth(), height);
            } else {
                rect2.bottom = height;
            }
        }
        if (rect2 != null) {
            view.setClipBounds(rect2);
        } else {
            view.setClipBounds((Rect) null);
        }
    }

    public static void y(IllegalArgumentException illegalArgumentException) {
        a("", illegalArgumentException);
    }

    public static View z(ViewGroup viewGroup, int i, int i2) {
        int[] iArr = null;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof ViewGroup) {
                View z = z((ViewGroup) childAt, i, i2);
                if (z != null && z.isShown()) {
                    return z;
                }
            } else {
                if (iArr == null) {
                    iArr = new int[2];
                }
                childAt.getLocationOnScreen(iArr);
                int i4 = iArr[0];
                if (new Rect(i4, iArr[1], childAt.getWidth() + i4, childAt.getHeight() + iArr[1]).contains(i, i2)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public void Q() {
    }

    public void R() {
    }

    public abstract List w(String str, List list);
}
