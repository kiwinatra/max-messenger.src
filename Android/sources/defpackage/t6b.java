package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import one.me.sdk.arch.Widget;

/* renamed from: t6b  reason: default package */
public final class t6b extends xx3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public t6b(iy3 iy3, ArrayList arrayList) {
        this.c = iy3;
        this.b = arrayList;
    }

    public final void a(zx3 zx3, ey3 ey3, fy3 fy3) {
        switch (this.a) {
            case 0:
                if (((zx3) this.c) == zx3 && fy3.b && ey3.d()) {
                    View view = zx3.getView();
                    lv7 lv7 = null;
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        lv7 lv72 = ((v6b) this.b).a;
                        if ((lv72 == null ? null : lv72).d == iu7.o) {
                            if (lv72 != null) {
                                lv7 = lv72;
                            }
                            lv7.e(hu7.ON_RESUME);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (fy3 == fy3.POP_EXIT) {
                    List list = (List) this.b;
                    for (int size = list.size() - 1; size > 0; size--) {
                        ((e9d) this.c).z((i9d) null, (i9d) list.get(size), true, new jbe());
                    }
                    return;
                }
                return;
        }
    }

    public void b(zx3 zx3, ey3 ey3, fy3 fy3) {
        switch (this.a) {
            case 0:
                v6b.a((v6b) this.b, (zx3) this.c, zx3, ey3, fy3);
                for (ls6 ls6 : ms6.a.values()) {
                    ls6.getClass();
                    if (ls6.a.contains(zx3.getInstanceId())) {
                        ls6.b.invoke(zx3, ey3, fy3);
                    }
                }
                return;
            default:
                return;
        }
    }

    public void c(zx3 zx3, Bundle bundle) {
        switch (this.a) {
            case 0:
                ((v6b) this.b).o = bundle.getBundle("Registry.savedState");
                return;
            default:
                return;
        }
    }

    public void e(zx3 zx3, Bundle bundle) {
        switch (this.a) {
            case 0:
                bundle.putBundle("Registry.savedState", ((v6b) this.b).o);
                return;
            default:
                return;
        }
    }

    public void f(zx3 zx3) {
        switch (this.a) {
            case 0:
                v6b v6b = (v6b) this.b;
                if (!v6b.c) {
                    Bundle bundle = new Bundle();
                    v6b.o = bundle;
                    ndd ndd = v6b.b;
                    if (ndd == null) {
                        ndd = null;
                    }
                    ndd.c(bundle);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void g(zx3 zx3) {
        switch (this.a) {
            case 0:
                lv7 lv7 = ((v6b) this.b).a;
                if (lv7 == null) {
                    lv7 = null;
                }
                lv7.e(hu7.ON_RESUME);
                return;
            default:
                return;
        }
    }

    public void h(zx3 zx3) {
        switch (this.a) {
            case 0:
                v6b v6b = (v6b) this.b;
                v6b.getClass();
                LinkedHashMap linkedHashMap = ms6.a;
                List createListBuilder = CollectionsKt.createListBuilder();
                for (zx3 parentController = zx3.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    createListBuilder.add(parentController.getInstanceId());
                }
                ms6.a.put(zx3.getInstanceId(), new ls6(CollectionsKt.build(createListBuilder), new u6b(v6b)));
                return;
            default:
                return;
        }
    }

    public void j(zx3 zx3, View view) {
        switch (this.a) {
            case 0:
                Object tag = view.getTag(zfc.view_tree_lifecycle_owner);
                v6b v6b = (v6b) this.b;
                if (tag == null && view.getTag(zfc.view_tree_saved_state_registry_owner) == null) {
                    view.setTag(hic.view_tree_lifecycle_owner, v6b);
                    view.setTag(xfc.view_tree_saved_state_registry_owner, v6b);
                }
                lv7 lv7 = v6b.a;
                if (lv7 == null) {
                    lv7 = null;
                }
                lv7.e(hu7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(zx3 zx3) {
        switch (this.a) {
            case 0:
                ((v6b) this.b).getClass();
                ms6.a.remove(zx3.getInstanceId());
                return;
            default:
                return;
        }
    }

    public void q(zx3 zx3) {
        switch (this.a) {
            case 0:
                v6b v6b = (v6b) this.b;
                v6b.c = false;
                v6b.a = new lv7(v6b);
                ndd ndd = new ndd(v6b);
                v6b.b = ndd;
                ndd.b(v6b.o);
                lv7 lv7 = v6b.a;
                if (lv7 == null) {
                    lv7 = null;
                }
                lv7.e(hu7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: lv7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(defpackage.zx3 r3, android.view.View r4) {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = r3.isBeingDestroyed()
            java.lang.Object r2 = r2.b
            v6b r2 = (defpackage.v6b) r2
            r1 = 0
            if (r0 == 0) goto L_0x0036
            e9d r3 = r3.getRouter()
            bg0 r3 = r3.a
            java.util.ArrayDeque r3 = r3.a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0036
            android.view.ViewParent r3 = r4.getParent()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x002a
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x002a:
            if (r1 == 0) goto L_0x0041
            p50 r3 = new p50
            r4 = 7
            r3.<init>(r4, r1, r2)
            r1.addOnAttachStateChangeListener(r3)
            goto L_0x0041
        L_0x0036:
            lv7 r2 = r2.a
            if (r2 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            hu7 r2 = defpackage.hu7.ON_DESTROY
            r1.e(r2)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6b.s(zx3, android.view.View):void");
    }

    public void t(zx3 zx3) {
        switch (this.a) {
            case 0:
                v6b v6b = (v6b) this.b;
                lv7 lv7 = v6b.a;
                lv7 lv72 = null;
                if ((lv7 == null ? null : lv7).d == iu7.v) {
                    if (lv7 == null) {
                        lv7 = null;
                    }
                    lv7.e(hu7.ON_PAUSE);
                }
                lv7 lv73 = v6b.a;
                if (lv73 != null) {
                    lv72 = lv73;
                }
                lv72.e(hu7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public t6b(v6b v6b, Widget widget) {
        this.b = v6b;
        this.c = widget;
    }
}
