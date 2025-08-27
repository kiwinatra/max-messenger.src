package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ngf  reason: default package */
public abstract class ngf implements Parcelable {
    public static final mgf a = new mgf("");

    public final CharSequence a(Context context) {
        return b(context.getResources());
    }

    public final CharSequence b(Resources resources) {
        if (this instanceof igf) {
            return resources.getString(((igf) this).b);
        }
        if (this instanceof kgf) {
            kgf kgf = (kgf) this;
            Object[] array = kgf.c.toArray(new Object[0]);
            return resources.getString(kgf.b, Arrays.copyOf(array, array.length));
        } else if (this instanceof egf) {
            egf egf = (egf) this;
            int i = egf.c;
            return resources.getQuantityString(egf.b, i, new Object[]{Integer.valueOf(i)});
        } else if (this instanceof mgf) {
            return ((mgf) this).b;
        } else {
            if (this instanceof ggf) {
                ggf ggf = (ggf) this;
                Object[] array2 = ggf.o.toArray(new Object[0]);
                return resources.getQuantityString(ggf.b, ggf.c, Arrays.copyOf(array2, array2.length));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
