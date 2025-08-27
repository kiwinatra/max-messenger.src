package androidx.preference;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;

public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    public DialogPreference B1;
    public CharSequence C1;
    public CharSequence D1;
    public CharSequence E1;
    public CharSequence F1;
    public int G1;
    public BitmapDrawable H1;
    public int I1;

    public final Dialog V2(Bundle bundle) {
        this.I1 = -2;
        dd d = new dd(G2()).setTitle(this.C1).a(this.H1).e(this.D1, this).d(this.E1, this);
        G2();
        int i = this.G1;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.X0;
            if (layoutInflater == null) {
                layoutInflater = D2();
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            b3(view);
            d.setView(view);
        } else {
            d.b(this.F1);
        }
        d3(d);
        ed create = d.create();
        if (a3()) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                xsb.a(window);
            } else {
                e3();
            }
        }
        return create;
    }

    public final DialogPreference Z2() {
        PreferenceScreen preferenceScreen;
        if (this.B1 == null) {
            String string = F2().getString("key");
            dtb dtb = ((PreferenceFragmentCompat) U1(true)).m1;
            Preference preference = null;
            if (!(dtb == null || (preferenceScreen = dtb.g) == null)) {
                preference = preferenceScreen.A(string);
            }
            this.B1 = (DialogPreference) preference;
        }
        return this.B1;
    }

    public boolean a3() {
        return false;
    }

    public void b3(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.F1;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void c3(boolean z);

    public void d3(dd ddVar) {
    }

    public void e3() {
    }

    public void i2(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.i2(bundle);
        a U1 = U1(true);
        if (U1 instanceof PreferenceFragmentCompat) {
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) U1;
            String string = F2().getString("key");
            if (bundle == null) {
                dtb dtb = preferenceFragmentCompat.m1;
                Preference preference = null;
                if (!(dtb == null || (preferenceScreen = dtb.g) == null)) {
                    preference = preferenceScreen.A(string);
                }
                DialogPreference dialogPreference = (DialogPreference) preference;
                this.B1 = dialogPreference;
                this.C1 = dialogPreference.W0;
                this.D1 = dialogPreference.Z0;
                this.E1 = dialogPreference.a1;
                this.F1 = dialogPreference.X0;
                this.G1 = dialogPreference.b1;
                Drawable drawable = dialogPreference.Y0;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.H1 = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.H1 = new BitmapDrawable(R1(), createBitmap);
                return;
            }
            this.C1 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.D1 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.E1 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.F1 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.G1 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.H1 = new BitmapDrawable(R1(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.I1 = i;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c3(this.I1 == -1);
    }

    public void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.C1);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.D1);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.E1);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.F1);
        bundle.putInt("PreferenceDialogFragment.layout", this.G1);
        BitmapDrawable bitmapDrawable = this.H1;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
