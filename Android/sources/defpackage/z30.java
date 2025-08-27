package defpackage;

import android.util.Size;
import java.util.Comparator;

/* renamed from: z30  reason: default package */
public final /* synthetic */ class z30 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ z30(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int intValue = num.intValue();
                int i = this.b;
                int abs = Math.abs(intValue - i) - Math.abs(num2.intValue() - i);
                return (int) (abs == 0 ? Math.signum((float) (num.intValue() - num2.intValue())) : Math.signum((float) abs));
            default:
                int a2 = pde.a((Size) obj);
                int i2 = this.b;
                return Math.abs(a2 - i2) - Math.abs(pde.a((Size) obj2) - i2);
        }
    }
}
