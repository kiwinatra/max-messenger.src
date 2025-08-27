package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* renamed from: cd  reason: default package */
public final class cd {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int E = -1;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final ad L;
    public final wld M = new wld(2, this);
    public final Context a;
    public final go b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public boolean j = false;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public int x = 0;
    public Drawable y;
    public ImageView z;

    public cd(Context context, go goVar, Window window) {
        this.a = context;
        this.b = goVar;
        this.c = window;
        ad adVar = new ad();
        adVar.b = new WeakReference(goVar);
        this.L = adVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, koc.AlertDialog, hdc.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(koc.AlertDialog_android_layout, 0);
        obtainStyledAttributes.getResourceId(koc.AlertDialog_buttonPanelSideLayout, 0);
        this.G = obtainStyledAttributes.getResourceId(koc.AlertDialog_listLayout, 0);
        this.H = obtainStyledAttributes.getResourceId(koc.AlertDialog_multiChoiceItemLayout, 0);
        this.I = obtainStyledAttributes.getResourceId(koc.AlertDialog_singleChoiceItemLayout, 0);
        this.J = obtainStyledAttributes.getResourceId(koc.AlertDialog_listItemLayout, 0);
        this.K = obtainStyledAttributes.getBoolean(koc.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(koc.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        goVar.d().f(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.L.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.t = charSequence;
            this.u = obtainMessage;
            this.v = null;
        } else if (i2 == -2) {
            this.p = charSequence;
            this.q = obtainMessage;
            this.r = null;
        } else if (i2 == -1) {
            this.l = charSequence;
            this.m = obtainMessage;
            this.n = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
