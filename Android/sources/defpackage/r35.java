package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: r35  reason: default package */
public final class r35 extends pae {
    public final /* synthetic */ int v = 0;
    public Function1 w;
    public final Object x;

    public r35(yw2 yw2, ExecutorService executorService) {
        super(executorService);
        this.x = yw2;
    }

    public /* bridge */ /* synthetic */ void J(kbe kbe, int i) {
        switch (this.v) {
            case 2:
                L((zr2) kbe, i);
                return;
            default:
                super.s(kbe, i);
                return;
        }
    }

    public void L(zr2 zr2, int i) {
        xk2 xk2 = (xk2) ((ov) this.o).f.get(i);
        yw2 yw2 = (yw2) this.x;
        f fVar = new f(14, (Object) yw2);
        zw zwVar = new zw(8, (Object) yw2);
        zr2.M(xk2);
        i42 i42 = (i42) zr2.a;
        ct.G(i42, 300, new pb(15, fVar, xk2));
        i42.setOnLongClickListener(new v32(zwVar, xk2, zr2, 4));
    }

    public /* bridge */ /* synthetic */ void s(pzc pzc, int i) {
        switch (this.v) {
            case 2:
                L((zr2) pzc, i);
                return;
            default:
                super.s(pzc, i);
                return;
        }
    }

    public final void t(pzc pzc, int i, List list) {
        switch (this.v) {
            case 0:
                q35 q35 = (q35) pzc;
                Iterable<Object> iterable = list;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object obj : iterable) {
                        if (obj instanceof kqe) {
                            ArrayList arrayList = new ArrayList();
                            for (Object next : iterable) {
                                if (next instanceof ux1) {
                                    arrayList.add(next);
                                }
                            }
                            ux1 ux1 = (ux1) CollectionsKt.lastOrNull(arrayList);
                            if (ux1 != null) {
                                q35.P(ux1.a);
                                return;
                            } else {
                                s(q35, i);
                                return;
                            }
                        }
                    }
                }
                s(q35, i);
                return;
            case 1:
                vre vre = (vre) pzc;
                Iterable<Object> iterable2 = list;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    for (Object obj2 : iterable2) {
                        if (obj2 instanceof kqe) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next2 : iterable2) {
                                if (next2 instanceof kqe) {
                                    arrayList2.add(next2);
                                }
                            }
                            kqe kqe = (kqe) CollectionsKt.firstOrNull(arrayList2);
                            if (kqe == null) {
                                s(vre, i);
                                return;
                            } else if (kqe instanceof iqe) {
                                vre.Q(((iqe) kqe).a);
                                return;
                            } else if (kqe instanceof jqe) {
                                vre.P(((jqe) kqe).a);
                                return;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
                s(vre, i);
                return;
            default:
                zr2 zr2 = (zr2) pzc;
                Function1 function1 = this.w;
                ov ovVar = (ov) this.o;
                if (function1 != null) {
                    function1.invoke(Long.valueOf(((xk2) ovVar.f.get(i)).a));
                }
                if (!list.isEmpty()) {
                    j3h j3h = new j3h(7);
                    for (Object next3 : list) {
                        vk2 vk2 = next3 instanceof vk2 ? (vk2) next3 : null;
                        if (vk2 != null) {
                            ((BitSet) j3h.a).or((BitSet) vk2.a);
                        }
                    }
                    zr2.N((xk2) ovVar.f.get(i), j3h);
                    return;
                }
                L(zr2, i);
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.v) {
            case 0:
                return new q35(viewGroup.getContext(), (ShapeDrawable) this.x, (rx2) this.w);
            case 1:
                return new vre(viewGroup.getContext(), (ShapeDrawable) this.x, (vq7) this.w);
            default:
                return new pzc(new i42(viewGroup.getContext()));
        }
    }

    public r35(ExecutorService executorService, vq7 vq7) {
        super(executorService);
        this.w = vq7;
        this.x = new ShapeDrawable(new OvalShape());
    }

    public r35(ExecutorService executorService, rx2 rx2) {
        super(executorService);
        this.w = rx2;
        this.x = new ShapeDrawable(new OvalShape());
    }
}
