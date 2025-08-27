package defpackage;

import android.content.Context;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;
import kotlin.TuplesKt;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: wc6  reason: default package */
public final class wc6 extends rc6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wc6(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final a a(ClassLoader classLoader, String str) {
        switch (this.b) {
            case 0:
                oc6 oc6 = ((c) this.c).w;
                Context context = oc6.w0;
                oc6.getClass();
                try {
                    return (a) rc6.c(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (InstantiationException e) {
                    throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(wj6.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
                }
            default:
                a32 k3 = ((FrgBaseProfile) this.c).k3();
                if (k3 == null || !str.equals(SuggestsFragment.class.getName())) {
                    return super.a(classLoader, str);
                }
                SuggestsFragment suggestsFragment = new SuggestsFragment();
                suggestsFragment.L2(o54.f(TuplesKt.to("SuggestsFragment:chat_id", Long.valueOf(k3.a))));
                return suggestsFragment;
        }
    }
}
