package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* renamed from: ed  reason: default package */
public class ed extends go implements DialogInterface {
    public final cd w = new cd(getContext(), this, getWindow());

    public ed(Context context, int i) {
        super(context, g(i, context));
    }

    public static int g(int i, Context context) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(hdc.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View findViewById;
        int i = 2;
        super.onCreate(bundle);
        cd cdVar = this.w;
        cdVar.b.setContentView(cdVar.F);
        int i2 = egc.parentPanel;
        Window window = cdVar.c;
        View findViewById2 = window.findViewById(i2);
        View findViewById3 = findViewById2.findViewById(egc.topPanel);
        View findViewById4 = findViewById2.findViewById(egc.contentPanel);
        View findViewById5 = findViewById2.findViewById(egc.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(egc.customPanel);
        View view = cdVar.h;
        Context context = cdVar.a;
        View view2 = null;
        if (view == null) {
            view = cdVar.i != 0 ? LayoutInflater.from(context).inflate(cdVar.i, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !cd.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(egc.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (cdVar.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (cdVar.g != null) {
                ((xv7) viewGroup.getLayoutParams()).weight = c44.DEFAULT_ASPECT_RATIO;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(egc.topPanel);
        View findViewById7 = viewGroup.findViewById(egc.contentPanel);
        View findViewById8 = viewGroup.findViewById(egc.buttonPanel);
        ViewGroup b = cd.b(findViewById6, findViewById3);
        ViewGroup b2 = cd.b(findViewById7, findViewById4);
        ViewGroup b3 = cd.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(egc.scrollView);
        cdVar.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        cdVar.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        cdVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = cdVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                cdVar.w.removeView(cdVar.B);
                if (cdVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) cdVar.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(cdVar.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(cdVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        cdVar.k = button;
        wld wld = cdVar.M;
        button.setOnClickListener(wld);
        boolean isEmpty = TextUtils.isEmpty(cdVar.l);
        int i3 = cdVar.d;
        if (!isEmpty || cdVar.n != null) {
            cdVar.k.setText(cdVar.l);
            Drawable drawable = cdVar.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                cdVar.k.setCompoundDrawables(cdVar.n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            cdVar.k.setVisibility(0);
            z = true;
        } else {
            cdVar.k.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) b3.findViewById(16908314);
        cdVar.o = button2;
        button2.setOnClickListener(wld);
        if (!TextUtils.isEmpty(cdVar.p) || cdVar.r != null) {
            cdVar.o.setText(cdVar.p);
            Drawable drawable2 = cdVar.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                cdVar.o.setCompoundDrawables(cdVar.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            cdVar.o.setVisibility(0);
            z |= true;
        } else {
            cdVar.o.setVisibility(8);
        }
        Button button3 = (Button) b3.findViewById(16908315);
        cdVar.s = button3;
        button3.setOnClickListener(wld);
        if (!TextUtils.isEmpty(cdVar.t) || cdVar.v != null) {
            cdVar.s.setText(cdVar.t);
            Drawable drawable3 = cdVar.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                cdVar.s.setCompoundDrawables(cdVar.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            cdVar.s.setVisibility(0);
            z |= true;
        } else {
            cdVar.s.setVisibility(8);
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(hdc.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                Button button4 = cdVar.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z) {
                Button button5 = cdVar.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z) {
                Button button6 = cdVar.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z) {
            b3.setVisibility(8);
        }
        if (cdVar.C != null) {
            b.addView(cdVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(egc.title_template).setVisibility(8);
        } else {
            cdVar.z = (ImageView) window.findViewById(16908294);
            if (!(!TextUtils.isEmpty(cdVar.e)) || !cdVar.K) {
                window.findViewById(egc.title_template).setVisibility(8);
                cdVar.z.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(egc.alertTitle);
                cdVar.A = textView2;
                textView2.setText(cdVar.e);
                int i4 = cdVar.x;
                if (i4 != 0) {
                    cdVar.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = cdVar.y;
                    if (drawable4 != null) {
                        cdVar.z.setImageDrawable(drawable4);
                    } else {
                        cdVar.A.setPadding(cdVar.z.getPaddingLeft(), cdVar.z.getPaddingTop(), cdVar.z.getPaddingRight(), cdVar.z.getPaddingBottom());
                        cdVar.z.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z4 = b3.getVisibility() != 8;
        if (!z4 && (findViewById = b2.findViewById(egc.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = cdVar.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (!(cdVar.f == null && cdVar.g == null)) {
                view2 = b.findViewById(egc.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = b2.findViewById(egc.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = cdVar.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z3) {
            View view3 = cdVar.g;
            if (view3 == null) {
                view3 = cdVar.w;
            }
            if (view3 != null) {
                if (!z4) {
                    i = 0;
                }
                int i6 = i5 | i;
                View findViewById10 = window.findViewById(egc.scrollIndicatorUp);
                View findViewById11 = window.findViewById(egc.scrollIndicatorDown);
                WeakHashMap weakHashMap = gag.a;
                w9g.d(view3, i6, 3);
                if (findViewById10 != null) {
                    b2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = cdVar.g;
        if (alertController$RecycleListView2 != null && (listAdapter = cdVar.D) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i7 = cdVar.E;
            if (i7 > -1) {
                alertController$RecycleListView2.setItemChecked(i7, true);
                alertController$RecycleListView2.setSelection(i7);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.w.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.w.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        cd cdVar = this.w;
        cdVar.e = charSequence;
        TextView textView = cdVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
