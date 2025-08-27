package defpackage;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: qyc  reason: default package */
public final class qyc implements zu7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qyc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        View view;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                if (hu7 == hu7.ON_CREATE) {
                    jv7.getLifecycle().b(this);
                    odd odd = (odd) obj;
                    Bundle a2 = odd.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a2 != null) {
                        ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String next : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(next, false, qyc.class.getClassLoader()).asSubclass(kdd.class);
                                    try {
                                        Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            ((qt7) ((kdd) declaredConstructor.newInstance((Object[]) null))).getClass();
                                            if (odd instanceof hbg) {
                                                gbg viewModelStore = ((hbg) odd).getViewModelStore();
                                                mdd savedStateRegistry = odd.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    b59.f((yag) linkedHashMap.get((String) it.next()), savedStateRegistry, odd.getLifecycle());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(a81.m("Failed to instantiate ", next), e);
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new RuntimeException(wj6.k("Class ", next, " wasn't found"), e3);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                bc3 bc3 = (bc3) obj;
                bc3.access$ensureViewModelStore(bc3);
                bc3.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                np6[] np6Arr = (np6[]) obj;
                if (np6Arr.length > 0) {
                    np6 np6 = np6Arr[0];
                    throw null;
                } else if (np6Arr.length > 0) {
                    np6 np62 = np6Arr[0];
                    throw null;
                } else {
                    return;
                }
            case 3:
                if (hu7 == hu7.ON_DESTROY) {
                    soc soc = (soc) obj;
                    hff hff = (hff) soc.v;
                    if (hff != null) {
                        AnimatorSet animatorSet = hff.q;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = hff.p;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                    }
                    hff hff2 = (hff) soc.v;
                    if (hff2 != null) {
                        hff2.dismiss();
                    }
                    soc.v = null;
                    return;
                }
                return;
            case 4:
                if (hu7 == hu7.ON_DESTROY) {
                    qf5 qf5 = (qf5) obj;
                    qf5.a = null;
                    LinkedList<pf5> linkedList = qf5.b;
                    for (pf5 pf5 : linkedList) {
                        pf5.b.invoke();
                        pf5.a = null;
                    }
                    linkedList.clear();
                    qf5.b();
                    return;
                }
                return;
            case 5:
                if (hu7 == hu7.ON_STOP && (view = ((a) obj).S0) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            case 6:
                ((we8) obj).f(false);
                return;
            case 7:
                z68.c("hr6", "onStateChanged: new event = " + hu7, new Object[0]);
                if (hu7 == hu7.ON_RESUME) {
                    hr6 hr6 = (hr6) obj;
                    pm7 pm7 = (pm7) hr6.v;
                    if (pm7 != null) {
                        pm7.b((CancellationException) null);
                    }
                    int i = ((yd7) ((y35) hr6.c).b).x0.get();
                    z68.c("hr6", "onStateChanged: prevAllMediaCount = " + i, new Object[0]);
                    hr6.v = ev0.v((d14) hr6.a, (s04) hr6.b, (f14) null, new nd8(hr6, i, (Continuation) null), 2);
                    return;
                }
                return;
            default:
                if (hu7 == hu7.ON_CREATE) {
                    jv7.getLifecycle().b(this);
                    ((jdd) obj).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + hu7).toString());
        }
    }
}
