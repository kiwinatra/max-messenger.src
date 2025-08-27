package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* renamed from: fl2  reason: default package */
public final class fl2 implements owe {
    public final /* synthetic */ int a;
    public final Function1 b;

    public /* synthetic */ fl2(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final Object a(int i) {
        switch (this.a) {
            case 0:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 1:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 2:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 3:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
            case 4:
                return d(i);
            default:
                if (i < 0) {
                    return null;
                }
                return (CharSequence) this.b.invoke(Integer.valueOf(i));
        }
    }

    public final iwe b(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new el2(new TextView(viewGroup.getContext()));
            case 1:
                return new qy2(new TextView(viewGroup.getContext()));
            case 2:
                return new ku3(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 3:
                return new fk7(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
            case 4:
                return new xt7(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null, 0));
            default:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.addView(new AppCompatTextView(viewGroup.getContext(), (AttributeSet) null));
                return new zsc(frameLayout);
        }
    }

    public final void c(iwe iwe, int i) {
        switch (this.a) {
            case 0:
                ((el2) iwe).o.setText((CharSequence) a(i));
                return;
            case 1:
                ((qy2) iwe).o.setText((CharSequence) a(i));
                return;
            case 2:
                ((ku3) iwe).o.setText((CharSequence) a(i));
                return;
            case 3:
                ((fk7) iwe).o.setText((CharSequence) a(i));
                return;
            case 4:
                Character d = d(i);
                xt7 xt7 = (xt7) iwe;
                if (d != null) {
                    xt7.o.setText(new char[]{d.charValue()}, 0, 1);
                    return;
                }
                xt7.o.setText((CharSequence) null);
                return;
            default:
                TextView textView = ((zsc) iwe).o;
                textView.setText((CharSequence) a(i));
                textView.setTextSize(1, 14.0f);
                return;
        }
    }

    public Character d(int i) {
        char c;
        Character ch = null;
        if (i < 0) {
            return null;
        }
        CharSequence charSequence = (CharSequence) this.b.invoke(Integer.valueOf(i));
        if (charSequence == null) {
            return null;
        }
        Character firstOrNull = StringsKt.firstOrNull(charSequence);
        if (firstOrNull != null) {
            if (Character.isLetter(firstOrNull.charValue())) {
                ch = firstOrNull;
            }
            if (ch != null) {
                c = Character.toUpperCase(ch.charValue());
                return Character.valueOf(c);
            }
        }
        c = '#';
        return Character.valueOf(c);
    }
}
