package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.messages.location.FrgLocationMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFragmentWrapperWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentWrapperWidget.kt\nandroidx/fragment/app/FragmentWrapperWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n420#2:114\n420#2:115\n420#2:116\n420#2:117\n543#3,6:118\n*S KotlinDebug\n*F\n+ 1 FragmentWrapperWidget.kt\nandroidx/fragment/app/FragmentWrapperWidget\n*L\n18#1:114\n19#1:115\n20#1:116\n21#1:117\n83#1:118,6\n*E\n"})
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ KProperty[] v;
    public final is a;
    public final is b;
    public final is c;
    public final is o;

    static {
        Class<FragmentWrapperWidget> cls = FragmentWrapperWidget.class;
        v = new KProperty[]{rae.s(cls, "fragmentId", "getFragmentId()I", 0), rae.s(cls, "fragmentClass", "getFragmentClass()Ljava/lang/String;", 0), rae.s(cls, "fragmentTag", "getFragmentTag()Ljava/lang/String;", 0), rae.s(cls, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;", 0)};
    }

    public FragmentWrapperWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        this.a = new is(Integer.class, "widget:fragment:id");
        Class<String> cls = String.class;
        this.b = new is(cls, ":widget:fragment:class");
        this.c = new is(cls, "widget:fragment:tag");
        this.o = new is(Bundle.class, "widget:fragment:args");
    }

    public final ed6 c0() {
        Activity activity = getActivity();
        hn hnVar = activity instanceof hn ? (hn) activity : null;
        if (hnVar != null) {
            return hnVar.v();
        }
        return null;
    }

    public final a d0() {
        ed6 c0 = c0();
        if (c0 == null) {
            return null;
        }
        KProperty kProperty = v[0];
        return c0.D(((Number) this.a.a(this)).intValue());
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final void onAttach(View view) {
        a d0 = d0();
        if (d0 != null) {
            d0.h2(getContext());
        }
    }

    public final void onChangeEnded(ey3 ey3, fy3 fy3) {
        ed6 c0;
        a d0;
        if (!fy3.b && (c0 = c0()) != null && (d0 = d0()) != null) {
            xe0 xe0 = new xe0(c0);
            xe0.j(d0);
            xe0.e(true);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        KProperty[] kPropertyArr = v;
        KProperty kProperty = kPropertyArr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        ed6 c0 = c0();
        if (c0 == null) {
            return frameLayout;
        }
        a D = c0.D(frameLayout.getId());
        KProperty kProperty2 = kPropertyArr[1];
        String str = (String) this.b.a(this);
        pd6 pd6 = null;
        if (D == null) {
            D = c0.J().a(frameLayout.getContext().getClassLoader(), str);
            int i = D.H0;
            D.H0 = i;
            D.I0 = i;
            D.J0 = D.J0;
            D.D0 = c0;
            D.E0 = c0.w;
            KProperty kProperty3 = kPropertyArr[3];
            D.L2((Bundle) this.o.a(this));
            frameLayout.getContext();
            D.r2((AttributeSet) null, bundle);
            xe0 xe0 = new xe0(c0);
            xe0.p = true;
            KProperty kProperty4 = kPropertyArr[2];
            D.R0 = frameLayout;
            D.z0 = true;
            xe0.h(frameLayout.getId(), D, (String) this.c.a(this), 1);
            xe0.g();
        }
        FrgLocationMap frgLocationMap = D instanceof FrgLocationMap ? (FrgLocationMap) D : null;
        if (frgLocationMap != null) {
            ArrayList e = getRouter().e();
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((i9d) obj).a instanceof pd6) {
                    break;
                }
            }
            i9d i9d = (i9d) obj;
            zx3 zx3 = i9d != null ? i9d.a : null;
            if (zx3 instanceof pd6) {
                pd6 = (pd6) zx3;
            }
            frgLocationMap.B1 = pd6;
        }
        View view = D.S0;
        if (view != null && view.getParent() == null) {
            D.R0 = frameLayout;
            e g = c0.g(D);
            g.b();
            g.k();
        }
        return frameLayout;
    }

    public final void onDestroy() {
        a d0 = d0();
        if (d0 != null) {
            d0.l2();
        }
    }

    public final void onDestroyView(View view) {
        a d0 = d0();
        if (d0 != null) {
            d0.m2();
        }
    }

    public final void onDetach(View view) {
        a d0 = d0();
        if (d0 != null) {
            d0.n2();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        KProperty[] kPropertyArr = v;
        KProperty kProperty = kPropertyArr[0];
        this.a.b(this, Integer.valueOf(i));
        String name = cls.getName();
        KProperty kProperty2 = kPropertyArr[1];
        this.b.b(this, name);
        KProperty kProperty3 = kPropertyArr[2];
        this.c.b(this, str);
        KProperty kProperty4 = kPropertyArr[3];
        this.o.b(this, bundle);
    }
}
