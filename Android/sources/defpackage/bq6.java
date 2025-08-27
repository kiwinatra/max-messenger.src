package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: bq6  reason: default package */
public final class bq6 {
    public aq6 a = null;
    public final float b;
    public boolean c = false;
    public boolean d = false;
    public long e;
    public float f;
    public float g;

    public bq6(Context context) {
        this.b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
