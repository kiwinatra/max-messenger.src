package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import one.me.rlottie.RLottieImageView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m61  reason: default package */
public final class m61 extends Lambda implements Function1 {
    public static final m61 A0 = new m61(1, 16);
    public static final m61 B0 = new m61(1, 17);
    public static final m61 X = new m61(1, 8);
    public static final m61 Y = new m61(1, 9);
    public static final m61 Z = new m61(1, 10);
    public static final m61 b = new m61(1, 0);
    public static final m61 c = new m61(1, 1);
    public static final m61 o = new m61(1, 2);
    public static final m61 v = new m61(1, 3);
    public static final m61 v0 = new m61(1, 11);
    public static final m61 w = new m61(1, 4);
    public static final m61 w0 = new m61(1, 12);
    public static final m61 x = new m61(1, 5);
    public static final m61 x0 = new m61(1, 13);
    public static final m61 y = new m61(1, 6);
    public static final m61 y0 = new m61(1, 14);
    public static final m61 z = new m61(1, 7);
    public static final m61 z0 = new m61(1, 15);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m61(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof w4b);
            case 1:
                return Boolean.valueOf(obj instanceof tz6);
            case 2:
                return Boolean.valueOf(obj instanceof ka1);
            case 3:
                return Boolean.valueOf(obj instanceof rd1);
            case 4:
                return Boolean.valueOf(obj instanceof wcf);
            case 5:
                return Boolean.valueOf(obj instanceof wcf);
            case 6:
                StringBuilder sb = new StringBuilder("- ");
                sb.append("Object(type=" + ((Class) obj).getName() + ')');
                return sb.toString();
            case 7:
                return Boolean.valueOf(obj instanceof RLottieImageView);
            case 8:
                return Boolean.valueOf(obj instanceof RLottieImageView);
            case 9:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 10:
                vof vof = (vof) obj;
                vof.getClass();
                vof.b = new fbe("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                return Unit.INSTANCE;
            case 11:
                return ((zof) obj).getClass().getName();
            case 12:
                return ((apf) obj).getClass().getName();
            case 13:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new z69(1, viewGroup);
                }
                return null;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Boolean.valueOf(obj instanceof RecyclerView);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ViewParent parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 16:
                Object tag = ((View) obj).getTag(hic.view_tree_lifecycle_owner);
                if (tag instanceof jv7) {
                    return (jv7) tag;
                }
                return null;
            default:
                return ((xpg) obj).d() ? "Periodic" : "OneTime";
        }
    }
}
