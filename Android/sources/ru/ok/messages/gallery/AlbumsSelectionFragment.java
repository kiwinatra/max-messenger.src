package ru.ok.messages.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.views.fragments.base.FrgBase;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/gallery/AlbumsSelectionFragment;", "Lru/ok/messages/views/fragments/base/FrgBase;", "<init>", "()V", "lc", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAlbumsSelectionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumsSelectionFragment.kt\nru/ok/messages/gallery/AlbumsSelectionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,151:1\n172#2,9:152\n106#2,15:161\n131#3,10:176\n49#4:186\n51#4:190\n46#5:187\n51#5:189\n105#6:188\n*S KotlinDebug\n*F\n+ 1 AlbumsSelectionFragment.kt\nru/ok/messages/gallery/AlbumsSelectionFragment\n*L\n39#1:152,9\n44#1:161,15\n122#1:176,10\n122#1:186\n122#1:190\n122#1:187\n122#1:189\n122#1:188\n*E\n"})
public final class AlbumsSelectionFragment extends FrgBase {
    public final lc B1 = new lc();
    public final bbg C1;
    public final Lazy D1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumsSelectionFragment() {
        super(ujc.fragment_albums_selection);
        bbg bbg;
        Class<GalleryViewModel> cls = GalleryViewModel.class;
        try {
            bbg = new bbg(Reflection.getOrCreateKotlinClass(cls), (Function0) new tc(0, this), (Function0) new jc(this, 0), (Function0) new tc(1, this));
        } catch (Throwable unused) {
            jc jcVar = new jc(this, 1);
            jc jcVar2 = new jc(this, 2);
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(0, jcVar));
            bbg = new bbg(Reflection.getOrCreateKotlinClass(cls), (Function0) new vc(0, lazy), (Function0) jcVar2, (Function0) new vc(1, lazy));
        }
        this.C1 = bbg;
        this.D1 = LazyKt.lazy(new jc(this, 3));
    }

    public final void A2(View view, Bundle bundle) {
        h3();
        bs0.K(new ps5(i3().B, new qc(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(i3().z, new rc(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(i3().j, new sc(this, (Continuation) null), 5), fqc.p(X1()));
        etc etc = i3().l;
        bs0.K(new pc(new ps5(new on2(etc, 28), new mc(etc, (Continuation) null, this), 5), 0), fqc.p(X1()));
    }

    public final String V2() {
        return null;
    }

    public final void Z2(View view) {
        h3();
    }

    public final void h3() {
        scf scf = this.r1;
        lc lcVar = this.B1;
        lcVar.getClass();
        KProperty[] kPropertyArr = lc.y;
        iq.m(scf, (Toolbar) lcVar.o.getValue(lcVar, kPropertyArr[1]), (TextView) null, 54);
        ((View) lcVar.v.getValue(lcVar, kPropertyArr[2])).setBackground(scf.d());
        lcVar.d().setTextColor(scf.G);
        iq.b0((ProgressBar) lcVar.x.getValue(lcVar, kPropertyArr[4]), scf.K);
    }

    public final GalleryViewModel i3() {
        return (GalleryViewModel) this.C1.getValue();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k2 = super.k2(layoutInflater, viewGroup, bundle);
        jv7 X1 = X1();
        lc lcVar = this.B1;
        lcVar.a(k2, X1);
        KProperty[] kPropertyArr = lc.y;
        ((Toolbar) lcVar.o.getValue(lcVar, kPropertyArr[1])).setNavigationOnClickListener(new t84((View.OnClickListener) new kc(this, 0), 0));
        cvg.x(lcVar.d()).b();
        ExtraActionsView e = lcVar.e();
        List emptyList = CollectionsKt.emptyList();
        c73 c73 = new c73((j4b) w63.J, 2);
        c73.G(emptyList);
        d9d d9d = new d9d(1, this);
        e.z = (yk6) this.D1.getValue();
        e.v0 = d9d;
        e.y = c73;
        c73.w = e;
        e.w0.setAdapter(c73);
        ct.G((View) lcVar.v.getValue(lcVar, kPropertyArr[2]), 300, new kc(this, 1));
        return k2;
    }
}
