package ru.ok.messages.pinlock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.Lazy;

public class PinIndicator extends LinearLayout implements bif {
    public final ArrayList a = new ArrayList();
    public final int b;
    public final int c = 4;

    public PinIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.b = ro4.b().h;
        for (int i = 0; i < this.c; i++) {
            View view = new View(getContext());
            int i2 = this.b;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = this.b;
            layoutParams.setMargins(i3, 0, i3, 0);
            addView(view, layoutParams);
            this.a.add(view);
        }
        c();
    }

    public final void c() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        int i = 0;
        setBackgroundColor(0);
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                View view = (View) arrayList.get(i);
                if (i < 0) {
                    view.setBackground(i8b.K(Integer.valueOf(k0.G), (Integer) null, (Integer) null));
                } else {
                    view.setBackground(i8b.K(Integer.valueOf(k0.J), (Integer) null, (Integer) null));
                }
                i++;
            } else {
                return;
            }
        }
    }
}
