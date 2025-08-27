package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* renamed from: qp  reason: default package */
public class qp {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final qae e = new qae(0);
    public final Object[] a = new Object[2];

    public in a(Context context, AttributeSet attributeSet) {
        return new in(context, attributeSet, hdc.autoCompleteTextViewStyle);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        qae qae = e;
        Constructor<? extends U> constructor = (Constructor) qae.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            qae.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
