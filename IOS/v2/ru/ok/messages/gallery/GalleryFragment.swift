package ru.ok.messages.gallery;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.gallery.view.CameraContainerView;
import ru.ok.messages.gallery.view.MediaPermissionsView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.fragments.base.FrgBase;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/gallery/GalleryFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "<init>", "()V", "cl6", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGalleryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryFragment.kt\nru/ok/messages/gallery/GalleryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,410:1\n172#2,9:411\n106#2,15:420\n172#2,9:435\n326#3,4:444\n65#3,2:460\n310#3:462\n326#3,4:463\n311#3:467\n68#3:468\n37#3:469\n53#3:470\n72#3:471\n28#4,12:448\n28#4,12:532\n131#5,10:472\n131#5,10:487\n131#5,10:502\n131#5,10:517\n49#6:482\n51#6:486\n49#6:497\n51#6:501\n49#6:512\n51#6:516\n49#6:527\n51#6:531\n46#7:483\n51#7:485\n46#7:498\n51#7:500\n46#7:513\n51#7:515\n46#7:528\n51#7:530\n105#8:484\n105#8:499\n105#8:514\n105#8:529\n*S KotlinDebug\n*F\n+ 1 GalleryFragment.kt\nru/ok/messages/gallery/GalleryFragment\n*L\n55#1:411,9\n77#1:420,15\n82#1:435,9\n118#1:444,4\n142#1:460,2\n146#1:462\n146#1:463,4\n146#1:467\n142#1:468\n142#1:469\n142#1:470\n142#1:471\n125#1:448,12\n389#1:532,12\n223#1:472,10\n231#1:487,10\n252#1:502,10\n259#1:517,10\n223#1:482\n223#1:486\n231#1:497\n231#1:501\n252#1:512\n252#1:516\n259#1:527\n259#1:531\n223#1:483\n223#1:485\n231#1:498\n231#1:500\n252#1:513\n252#1:515\n259#1:528\n259#1:530\n223#1:484\n231#1:499\n252#1:514\n259#1:529\n*E\n"})
public final class GalleryFragment extends FrgBase {
    public final bbg B1;
    public final bbg C1;
    public final Lazy D1;
    public final cl6 E1;
    public final k71 F1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryFragment() {
        super(ujc.fragment_gallery);
        bbg bbg;
        Class<GalleryViewModel> cls = GalleryViewModel.class;
        try {
            bbg = new bbg(Reflection.getOrCreateKotlinClass(cls), (Function0) new tc(9, this), (Function0) new bl6(this, 0), (Function0) new tc(10, this));
        } catch (Throwable unused) {
            bl6 bl6 = new bl6(this, 1);
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(8, new tc(14, this)));
            bbg = new bbg(Reflection.getOrCreateKotlinClass(cls), (Function0) new vc(16, lazy), (Function0) bl6, (Function0) new vc(17, lazy));
        }
        this.B1 = bbg;
        this.C1 = new bbg(Reflection.getOrCreateKotlinClass(GalleryResultViewModel.class), (Function0) new tc(11, this), (Function0) new tc(13, this), (Function0) new tc(12, this));
        this.D1 = LazyKt.lazy(new bl6(this, 2));
        this.E1 = new cl6();
        this.F1 = new k71(3, this);
    }

    public static final void h3(GalleryFragment galleryFragment, sm6 sm6, int i, int i2) {
        galleryFragment.getClass();
        o5h o5h = null;
        if (((qra) ym.e()).d().q()) {
            cl6 cl6 = galleryFragment.E1;
            pzc M = cl6.e().M(i2);
            if (M != null) {
                EndlessRecyclerView e = cl6.e();
                Rect rect = rcg.a;
                rcg.d(rect, e);
                o5h = new o5h((SimpleDraweeView) M.a.findViewById(lic.simple_drawee_view), rect, (Object) null);
            }
        }
        z38 a = a48.a();
        a.d = ((pm6) galleryFragment.k3().z.a.getValue()).a.a.b();
        a.f = i;
        a.e = sm6.b.b.toString();
        a.j = 0;
        a.k = 0;
        a.a = galleryFragment.k3().m.o;
        a.b = galleryFragment.k3().m.v;
        d48 M2 = cvg.M(sm6.b);
        boolean z = galleryFragment.k3().m.z;
        GalleryResultViewModel j3 = galleryFragment.j3();
        uk2 uk2 = (uk2) j3.j.getValue(j3, GalleryResultViewModel.k[0]);
        int i3 = ActLocalMedias.W0;
        Pair c0 = ActLocalMedias.c0(galleryFragment.E2(), M2, o5h, a, z);
        Intent intent = (Intent) c0.first;
        if (uk2 != null) {
            intent.putExtra("act:local_medias:chat_mode", uk2.ordinal());
        }
        galleryFragment.S2(intent, 110, (Bundle) c0.second);
    }

    public final void A2(View view, Bundle bundle) {
        z68.c("GalleryFragment", "onViewCreated()", new Object[0]);
        i3();
        this.E1.e();
        E2();
        ((at7) ((qra) ym.e()).getAccessor().g(at7.class)).getClass();
        bs0.K(new ps5(k3().s, new ll6(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(k3().v, new ml6(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(new on2(k3().z, 28), new nl6(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(k3().x, new ol6(this, (Continuation) null), 5), fqc.p(X1()));
        vo6 vo6 = k3().p;
        bs0.K(new k26(new ps5(new on2(vo6, 28), new dl6(vo6, (Continuation) null, this), 5), 4), fqc.p(X1()));
        etc etc = k3().D;
        bs0.K(new k26(new ps5(new on2(etc, 28), new fl6(etc, (Continuation) null, this), 5), 5), fqc.p(X1()));
        etc etc2 = k3().u;
        bs0.K(new k26(new ps5(new on2(etc2, 28), new hl6(etc2, (Continuation) null, this), 5), 6), fqc.p(X1()));
        etc etc3 = j3().f;
        bs0.K(new k26(new ps5(new on2(etc3, 28), new jl6(etc3, (Continuation) null, this), 5), 7), fqc.p(X1()));
        if (n54.f(G2())) {
            k3().t(true);
        }
    }

    public final String V2() {
        if (M1() != null) {
            return "GALLERY";
        }
        return null;
    }

    public final void Z2(View view) {
        i3();
    }

    public final void b3(int i, int i2, Intent intent) {
        m02 m02;
        tqd tqd;
        d48 d48;
        Object obj;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i3 == 110 || i3 == 666) {
            StringBuilder n = a81.n("onActivityResult, requestCode = ", i3, ", resultCode = ", i4, ", data = ");
            n.append(intent2);
            z68.c("GalleryFragment", n.toString(), new Object[0]);
            if (i4 != -1) {
                if (i3 == 666) {
                    GalleryViewModel k3 = k3();
                    KProperty[] kPropertyArr = GalleryViewModel.S;
                    k3.l(false);
                    return;
                }
                GalleryViewModel k32 = k3();
                k32.getClass();
                if (intent2 != null && (m02 = (m02) intent2.getParcelableExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT")) != null && !k32.R) {
                    k32.R = true;
                    ev0.v(b0h.C(k32), ((osa) k32.o()).e().plus(k32.h), (f14) null, new dp6(m02, k32, (Continuation) null), 2);
                }
            } else if (k3().m.o) {
                j3().h.k(new o85(intent2));
            } else {
                if (i3 == 666) {
                    sqd sqd = k3().E;
                    tqd tqd2 = (tqd) CollectionsKt.firstOrNull(y7e.a(sqd));
                    sqd.a();
                    if (tqd2 != null) {
                        tqd = new tqd(tqd2.a, tqd2.b, tqd2.c, tqd2.o, intent2 != null ? intent2.getStringExtra("ru.ok.tamtam.extra.FILE_PATH") : null, intent2 != null ? (RectF) intent2.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT") : null, intent2 != null ? (Rect) intent2.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE") : null, tqd2.y);
                    } else {
                        return;
                    }
                } else {
                    GalleryViewModel k33 = k3();
                    k33.getClass();
                    if (intent2 == null || (d48 = (d48) intent2.getParcelableExtra("act:local_medias:send_result")) == null) {
                        tqd = null;
                    } else {
                        sqd sqd2 = k33.E;
                        Iterator it = y7e.a(sqd2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((tqd) obj).a.a == d48.b) {
                                break;
                            }
                        }
                        sqd2.a();
                        tqd = (tqd) obj;
                    }
                    if (tqd == null) {
                        return;
                    }
                }
                xme xme = j3().c;
                o85 o85 = new o85(new sl6(tqd));
                xme.getClass();
                xme.m((Object) null, o85);
                if (i3 == 666) {
                    xe0 xe0 = new xe0(Q1());
                    xe0.j(this);
                    xe0.e(false);
                }
                Q1().T();
            }
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (k3().m.a) {
            b0h.b(E2().getOnBackPressedDispatcher(), this, new rx2(23, this));
        }
    }

    public final void i3() {
        View view = this.S0;
        if (view != null) {
            view.setBackgroundColor(this.r1.n);
        }
        cl6 cl6 = this.E1;
        cl6.e().setBackgroundColor(this.r1.n);
        ((MediaPermissionsView) cl6.c.getValue(cl6, cl6.y[0])).setBackgroundColor(this.r1.n);
    }

    public final GalleryResultViewModel j3() {
        return (GalleryResultViewModel) this.C1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k2 = super.k2(layoutInflater, viewGroup, bundle);
        k3().Q = j3();
        GalleryViewModel k3 = k3();
        wm6 a = h88.a(k3.c);
        k3.q = a;
        z68.c(GalleryViewModel.T, "did recalculate uiOptions: " + a, new Object[0]);
        jv7 X1 = X1();
        cl6 cl6 = this.E1;
        cl6.a(k2, X1);
        boolean z = k3().m.y;
        w28 w28 = cl6.x;
        if (z) {
            View view = (View) w28.getValue(cl6, cl6.y[4]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = vo4.a(G2());
                view.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        mg4 mg4 = null;
        if (k3().m.y && N1().D(lic.albums_selection_fragment) == null) {
            c N1 = N1();
            N1.getClass();
            xe0 xe0 = new xe0(N1);
            xe0.h(lic.albums_selection_fragment, new AlbumsSelectionFragment(), (String) null, 1);
            xe0.e(false);
        }
        KProperty[] kPropertyArr = cl6.y;
        fqc.l((View) w28.getValue(cl6, kPropertyArr[4]), new bi7(true, k3().m.X, true, false, false, 1));
        ((MediaPermissionsView) cl6.c.getValue(cl6, kPropertyArr[0])).setOnPermissionsClickListener(new bl6(this, 3));
        if (!k2.isLaidOut() || k2.isLayoutRequested()) {
            k2.addOnLayoutChangeListener(new nn1(3, this, k2));
        } else {
            int i = k3().q.a;
            int width = (k2.getWidth() / i) - (k3().q.b - (k3().q.b / i));
            CameraContainerView d = cl6.d();
            ViewGroup.LayoutParams layoutParams2 = d.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = width;
                layoutParams2.height = width;
                d.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        EndlessRecyclerView e = cl6.e();
        e.setPager(this.F1);
        e.setProgressView(ujc.ll_chat_media_progress);
        e.setHasFixedSize(true);
        e.setThreshold(k3().q.f);
        e.setNestedScrollingEnabled(false);
        e.setAdapter((jk6) this.D1.getValue());
        G2();
        e.setLayoutManager(new GridLayoutManager(k3().q.a));
        e.j(new cl2(k3().q.a, k3().q.b, 3));
        if (k3().q.e) {
            mg4 = new mg4();
        }
        e.setItemAnimator(mg4);
        e.m(new k61(6, this));
        ct.G(cl6.d(), 300, new xu3(15, (Object) this));
        return k2;
    }

    public final GalleryViewModel k3() {
        return (GalleryViewModel) this.B1.getValue();
    }

    public final void m2() {
        super.m2();
        z68.c("GalleryFragment", "onDestroyView()", new Object[0]);
    }

    public final void v2(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            k3().t(n54.X(this, strArr, iArr, n54.n(), qad.f7, qad.e7));
        } else if (i != 158) {
            if (i == 162) {
                n54.X(this, strArr, iArr, n54.l(), qad.T6, qad.M6);
                k3().getClass();
                Integer orNull = ArraysKt.getOrNull(iArr, ArraysKt.indexOf((T[]) strArr, "android.permission.READ_EXTERNAL_STORAGE"));
                k3().t((orNull != null ? orNull.intValue() : -1) == 0);
            }
        } else if (k3().m.b) {
            boolean X = n54.X(this, strArr, iArr, n54.e, qad.T6, qad.M6);
            z68.c("GalleryFragment", "isCameraPermissionGranted = " + X, new Object[0]);
        }
    }

    public final void w2() {
        super.w2();
        z5a.g(((qra) ((id3) this.p1.b)).w(), jgd.AVATAR_PICKER_GALLERY);
    }
}
