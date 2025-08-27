package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* renamed from: hne  reason: default package */
public class hne {
    public final View a;
    public final yh7 b;
    public final Function1 c;
    public final int d;
    public iog e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public /* synthetic */ hne(View view, yh7 yh7, Function1 function1) {
        this(view, yh7, function1, 7);
    }

    public final void a(wh7 wh7, nr0 nr0) {
        int max = Math.max(wh7.d, this.f);
        int ordinal = nr0.a.ordinal();
        if (ordinal != 0) {
            View view = this.a;
            if (ordinal == 1) {
                view.setTranslationY(-((float) max));
            } else if (ordinal == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + max);
            } else if (ordinal == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), max);
            } else if (ordinal == 4) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = this.i.bottom + max;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public void b(iog iog, nr0 nr0) {
        a(iog.a.f(this.d), nr0);
    }

    public void c(iog iog) {
        yh7 yh7 = this.b;
        jdb jdb = yh7.a;
        if (jdb != null) {
            wh7 f2 = iog.a.f(this.d);
            int ordinal = jdb.ordinal();
            if (ordinal != 0) {
                View view = this.a;
                if (ordinal == 1) {
                    view.setTranslationY((float) f2.b);
                } else if (ordinal == 2) {
                    view.setPadding(view.getPaddingLeft(), this.h.top + f2.b, view.getPaddingRight(), view.getPaddingBottom());
                } else if (ordinal == 3) {
                    view.setPadding(view.getPaddingLeft(), f2.b, view.getPaddingRight(), view.getPaddingBottom());
                } else if (ordinal == 4) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = this.i.top + f2.b;
                        view.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        nr0 nr0 = yh7.b;
        if (nr0 != null) {
            b(iog, nr0);
        }
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(iog);
        }
    }

    public iog d(iog iog) {
        return iog;
    }

    public void e() {
        this.g = false;
    }

    public hne(View view, yh7 yh7, Function1 function1, int i2) {
        Rect rect;
        this.a = view;
        this.b = yh7;
        this.c = function1;
        this.d = i2;
        nqd nqd = new nqd(8, this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            rect = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            rect = new Rect(0, 0, 0, 0);
        }
        this.i = rect;
        WeakHashMap weakHashMap = gag.a;
        v9g.u(view, nqd);
        if (view.isAttachedToWindow()) {
            t9g.c(view);
            zh7.a.a(this);
        }
        view.addOnAttachStateChangeListener(new el(9, this));
    }
}
