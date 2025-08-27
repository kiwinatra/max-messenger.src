package one.me.sdk.messagewrite.recordcontrols;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lqvc;", "type", "(Ljava/lang/String;Lqvc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordControlsWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordControlsWidget.kt\none/me/sdk/messagewrite/recordcontrols/RecordControlsWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 8 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 9 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 10 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 11 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,1724:1\n420#2:1725\n420#2:1726\n255#2,9:1727\n235#2,10:1736\n410#2,8:1833\n410#2,8:1841\n410#2,8:1849\n410#2,8:1857\n410#2,8:1865\n410#2,8:1873\n410#2,8:1881\n5#3:1746\n5#3:1747\n5#3:1748\n5#3:1749\n5#3:1750\n5#3:1751\n5#3:1752\n5#3:1753\n5#3:1754\n5#3:1755\n5#3:1756\n24#4:1757\n24#4:1758\n24#4:1760\n24#4:1761\n24#4:1762\n24#4:1767\n24#4:1768\n24#4:1769\n24#4:1770\n24#4:1771\n24#4:1772\n24#4:1773\n24#4:1774\n24#4:1777\n24#4:1778\n24#4:1787\n24#4:1790\n24#4:1791\n24#4:1792\n24#4:1797\n24#4:1798\n24#4:1799\n24#4:1800\n24#4:1803\n24#4:1804\n24#4:1805\n24#4:1808\n24#4:1809\n24#4:1810\n24#4:1811\n24#4:1812\n24#4:1813\n24#4:1814\n24#4:1815\n24#4:1816\n24#4:1817\n24#4:1818\n24#4:1821\n28#4:1822\n24#4,5:1823\n24#4:1828\n28#4:1829\n24#4:1832\n24#4:1923\n24#4:1924\n24#4:1925\n24#4:1926\n24#4:1927\n24#4:1928\n24#4:1929\n24#4:1930\n24#4:1931\n24#4:1932\n24#4:1933\n28#4:1934\n28#4:1935\n28#4:1936\n28#4:1937\n24#4:1968\n28#4:1969\n28#4:1970\n28#4:1971\n28#4:1972\n28#4:1973\n24#4,5:1974\n24#4:2070\n28#4:2101\n28#4:2132\n28#4:2133\n28#4:2134\n28#4:2135\n28#4:2151\n24#4:2152\n24#4:2210\n28#4:2211\n1#5:1759\n172#6,2:1763\n256#6,2:1765\n172#6,2:1775\n172#6,2:1788\n172#6,2:1793\n256#6,2:1795\n172#6,2:1801\n256#6,2:1806\n172#6,2:1819\n256#6,2:1830\n256#6,2:1889\n65#6,4:1891\n37#6:1895\n53#6:1896\n72#6:1897\n254#6:2069\n65#6,4:2198\n37#6:2202\n53#6:2203\n72#6:2204\n326#6,4:2212\n326#6,4:2216\n193#7,8:1779\n135#8,3:1898\n138#8,8:1915\n33#9,14:1901\n41#10:1938\n91#10,14:1939\n30#10:1953\n91#10,14:1954\n41#10:1979\n91#10,14:1980\n30#10:1994\n91#10,14:1995\n41#10:2009\n91#10,14:2010\n30#10:2024\n91#10,14:2025\n41#10:2039\n91#10,14:2040\n30#10:2054\n91#10,14:2055\n30#10:2071\n91#10,14:2072\n30#10:2086\n91#10,14:2087\n41#10:2102\n91#10,14:2103\n30#10:2117\n91#10,14:2118\n30#10:2136\n91#10,14:2137\n30#10:2153\n91#10,14:2154\n30#10:2168\n91#10,14:2169\n30#10:2183\n91#10,14:2184\n23#11:2205\n23#11:2206\n23#11:2207\n23#11:2208\n23#11:2209\n*S KotlinDebug\n*F\n+ 1 RecordControlsWidget.kt\none/me/sdk/messagewrite/recordcontrols/RecordControlsWidget\n*L\n86#1:1725\n90#1:1726\n92#1:1727,9\n93#1:1736,10\n586#1:1833,8\n606#1:1841,8\n612#1:1849,8\n617#1:1857,8\n630#1:1865,8\n635#1:1873,8\n639#1:1881,8\n144#1:1746\n145#1:1747\n147#1:1748\n148#1:1749\n149#1:1750\n154#1:1751\n159#1:1752\n164#1:1753\n169#1:1754\n174#1:1755\n177#1:1756\n213#1:1757\n214#1:1758\n225#1:1760\n227#1:1761\n229#1:1762\n238#1:1767\n248#1:1768\n272#1:1769\n278#1:1770\n297#1:1771\n311#1:1772\n313#1:1773\n315#1:1774\n327#1:1777\n329#1:1778\n331#1:1787\n343#1:1790\n345#1:1791\n347#1:1792\n364#1:1797\n365#1:1798\n368#1:1799\n369#1:1800\n384#1:1803\n390#1:1804\n401#1:1805\n418#1:1808\n433#1:1809\n434#1:1810\n435#1:1811\n459#1:1812\n460#1:1813\n463#1:1814\n479#1:1815\n489#1:1816\n500#1:1817\n503#1:1818\n519#1:1821\n522#1:1822\n523#1:1823,5\n525#1:1828\n528#1:1829\n543#1:1832\n802#1:1923\n812#1:1924\n830#1:1925\n831#1:1926\n840#1:1927\n848#1:1928\n849#1:1929\n853#1:1930\n856#1:1931\n857#1:1932\n862#1:1933\n970#1:1934\n973#1:1935\n976#1:1936\n980#1:1937\n1064#1:1968\n1075#1:1969\n1078#1:1970\n1082#1:1971\n1085#1:1972\n1088#1:1973\n1102#1:1974,5\n1344#1:2070\n1422#1:2101\n1482#1:2132\n1485#1:2133\n1489#1:2134\n1509#1:2135\n1551#1:2151\n1569#1:2152\n151#1:2210\n166#1:2211\n229#1:1763,2\n231#1:1765,2\n315#1:1775,2\n331#1:1788,2\n347#1:1793,2\n352#1:1795,2\n369#1:1801,2\n403#1:1806,2\n503#1:1819,2\n530#1:1830,2\n670#1:1889,2\n715#1:1891,4\n715#1:1895\n715#1:1896\n715#1:1897\n1329#1:2069\n1662#1:2198,4\n1662#1:2202\n1662#1:2203\n1662#1:2204\n1068#1:2212,4\n1348#1:2216,4\n329#1:1779,8\n771#1:1898,3\n771#1:1915,8\n771#1:1901,14\n1002#1:1938\n1002#1:1939,14\n1027#1:1953\n1027#1:1954,14\n1106#1:1979\n1106#1:1980,14\n1133#1:1994\n1133#1:1995,14\n1225#1:2009\n1225#1:2010,14\n1234#1:2024\n1234#1:2025,14\n1302#1:2039\n1302#1:2040,14\n1309#1:2054\n1309#1:2055,14\n1357#1:2071\n1357#1:2072,14\n1408#1:2086\n1408#1:2087,14\n1431#1:2102\n1431#1:2103,14\n1435#1:2117\n1435#1:2118,14\n1522#1:2136\n1522#1:2137,14\n1576#1:2153\n1576#1:2154,14\n1595#1:2168\n1595#1:2169,14\n1614#1:2183\n1614#1:2184,14\n144#1:2205\n145#1:2206\n147#1:2207\n148#1:2208\n150#1:2209\n*E\n"})
@SuppressLint({"ValidController"})
public final class RecordControlsWidget extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] g1;
    public static final IntRange h1 = new IntRange(0, 135);
    public static final IntRange i1 = new IntRange(135, 275);
    public final ReadOnlyProperty A0;
    public final ReadOnlyProperty B0;
    public final ReadOnlyProperty C0;
    public final ReadOnlyProperty D0;
    public final ReadOnlyProperty E0;
    public final ReadOnlyProperty F0;
    public final ReadOnlyProperty G0;
    public final ReadOnlyProperty H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final Lazy S0;
    public Pair T0;
    public Pair U0;
    public float V0;
    public float W0;
    public final ReadOnlyProperty X;
    public ohe X0;
    public final ReadOnlyProperty Y;
    public aje Y0;
    public final ReadOnlyProperty Z;
    public final wie Z0;
    public final is a;
    public AnimatorSet a1;
    public final Lazy b;
    public AnimatorSet b1;
    public final Lazy c;
    public AnimatorSet c1;
    public AnimatorSet d1;
    public AnimatorSet e1;
    public AnimatorSet f1;
    public final Lazy o;
    public final Lazy v;
    public final ReadOnlyProperty v0;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty w0;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty x0;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty y0;
    public final ReadOnlyProperty z;
    public final ReadOnlyProperty z0;

    static {
        Class<RecordControlsWidget> cls = RecordControlsWidget.class;
        g1 = new KProperty[]{rae.s(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "type", "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;", 0), wj6.p(cls, "rootView", "getRootView()Landroid/view/View;", 0), wj6.p(cls, "recordingPanel", "getRecordingPanel()Landroid/view/View;", 0), wj6.p(cls, "dotView", "getDotView()Landroid/view/View;", 0), wj6.p(cls, "durationView", "getDurationView()Landroid/widget/TextView;", 0), wj6.p(cls, "trashView", "getTrashView()Landroid/widget/ImageView;", 0), wj6.p(cls, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), wj6.p(cls, "audioHandFreeRecordView", "getAudioHandFreeRecordView()Landroid/view/View;", 0), wj6.p(cls, "waveContainer", "getWaveContainer()Landroid/view/View;", 0), wj6.p(cls, "handFreeDotView", "getHandFreeDotView()Landroid/view/View;", 0), wj6.p(cls, "playPauseListeningButton", "getPlayPauseListeningButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "handFreeDurationView", "getHandFreeDurationView()Landroid/widget/TextView;", 0), wj6.p(cls, "waveView", "getWaveView()Lone/me/sdk/uikit/common/audiowave/AudioWaveRecordView;", 0), wj6.p(cls, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "pauseRecordingButton", "getPauseRecordingButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "playRecordingButton", "getPlayRecordingButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "actionViewContainer", "getActionViewContainer()Landroid/view/View;", 0), wj6.p(cls, "actionViewBgContainer", "getActionViewBgContainer()Landroid/view/View;", 0), wj6.p(cls, "actionViewBackground", "getActionViewBackground()Landroid/view/View;", 0), wj6.p(cls, "actionView", "getActionView()Landroid/widget/ImageView;", 0), wj6.p(cls, "lockView", "getLockView()Landroid/view/View;", 0), rae.s(cls, "prepareDataAndOnPauseWaveJob", "getPrepareDataAndOnPauseWaveJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public RecordControlsWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        this.a = new is(qvc.class, "arg_key_type");
        KProperty kProperty = g1[0];
        this.b = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, yvc.class, (Function0) null);
        this.c = createViewModelLazy(pwc.class, new zfa(19, new swc(this, 2)));
        this.o = fdb.a.c();
        this.v = wqg.a.getAccessor().h(gaf.class);
        this.w = viewBinding(xya.f);
        this.x = viewBinding(xya.p);
        this.y = viewBinding(xya.h);
        this.z = viewBinding(xya.i);
        this.X = viewBinding(xya.r);
        this.Y = viewBinding(xya.g);
        this.Z = viewBinding(xya.e);
        this.v0 = viewBinding(xya.s);
        this.w0 = viewBinding(xya.j);
        this.x0 = viewBinding(xya.n);
        this.y0 = viewBinding(xya.k);
        this.z0 = viewBinding(xya.t);
        this.A0 = viewBinding(xya.q);
        this.B0 = viewBinding(xya.m);
        this.C0 = viewBinding(xya.o);
        this.D0 = viewBinding(xya.d);
        this.E0 = viewBinding(xya.c);
        this.F0 = viewBinding(xya.b);
        this.G0 = viewBinding(xya.a);
        this.H0 = viewBinding(xya.l);
        swc swc = new swc(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, swc);
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new swc(this, 4));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new swc(this, 5));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new swc(this, 6));
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new swc(this, 7));
        this.N0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(18));
        this.O0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(19));
        this.P0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(20));
        this.Q0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(21));
        this.R0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(22));
        this.S0 = LazyKt.lazy(lazyThreadSafetyMode, new mxb(23));
        this.W0 = 1.0f;
        this.Z0 = o5a.U();
    }

    public static final c33 c0(RecordControlsWidget recordControlsWidget) {
        zx3 parentController = recordControlsWidget.getParentController();
        if (parentController instanceof c33) {
            return (c33) parentController;
        }
        return null;
    }

    public static final View d0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        return (View) recordControlsWidget.x.getValue(recordControlsWidget, g1[3]);
    }

    public static final void e0(RecordControlsWidget recordControlsWidget) {
        Pair pair = recordControlsWidget.U0;
        if (pair != null) {
            recordControlsWidget.s0().setTranslationX(((Number) pair.getFirst()).floatValue());
            recordControlsWidget.s0().setTranslationY(((Number) pair.getSecond()).floatValue());
        }
        Pair pair2 = recordControlsWidget.T0;
        if (pair2 != null) {
            recordControlsWidget.k0().setX(((Number) pair2.getFirst()).floatValue());
            recordControlsWidget.k0().setY(((Number) pair2.getSecond()).floatValue());
        }
        recordControlsWidget.T0 = null;
        recordControlsWidget.U0 = null;
    }

    public static final void f0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        recordControlsWidget.f1 = animatorSet;
        animatorSet.playTogether(new Animator[]{i8b.b(recordControlsWidget.q0(), View.ALPHA, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1000, 1000, 2, -1)});
        AnimatorSet animatorSet2 = recordControlsWidget.f1;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new wwc(recordControlsWidget, 13));
        }
        AnimatorSet animatorSet3 = recordControlsWidget.f1;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void A() {
        D0().t();
    }

    public final View A0() {
        return (View) this.w.getValue(this, g1[2]);
    }

    public final ImageView B0() {
        return (ImageView) this.X.getValue(this, g1[6]);
    }

    public final qvc C0() {
        KProperty kProperty = g1[1];
        return (qvc) this.a.a(this);
    }

    public final pwc D0() {
        return (pwc) this.c.getValue();
    }

    public final GradientDrawable E0() {
        return (GradientDrawable) this.P0.getValue();
    }

    public final c80 F0() {
        return (c80) this.z0.getValue(this, g1[13]);
    }

    public final void G0() {
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.b1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.b1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        AnimatorSet animatorSet4 = this.e1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.b1 = new AnimatorSet();
        List createListBuilder = CollectionsKt.createListBuilder();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 96) * vo4.c().getDisplayMetrics().density)}).setDuration(300);
        duration.addUpdateListener(new qwc(this, 7));
        createListBuilder.add(duration);
        View l0 = l0();
        Property property = View.ALPHA;
        createListBuilder.add(i8b.c(l0, property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 0, 112));
        ImageView z02 = z0();
        Property property2 = View.TRANSLATION_Y;
        createListBuilder.add(i8b.c(z02, property2, vo4.c().getDisplayMetrics().density * 48.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
        createListBuilder.add(i8b.c(z0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 150, 96));
        createListBuilder.add(i8b.c(w0(), property2, vo4.c().getDisplayMetrics().density * 48.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
        Property property3 = property;
        createListBuilder.add(i8b.c(w0(), property3, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 150, 96));
        createListBuilder.add(i8b.c(n0(), property3, n0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.add(i8b.c(n0(), property2, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        createListBuilder.add(i8b.c(o0(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.add(i8b.c(o0(), property2, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        createListBuilder.add(i8b.c(m0(), property, m0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.add(i8b.c(m0(), property2, m0().getTranslationY(), vo4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        Pair pair = this.U0;
        createListBuilder.add(i8b.c(s0(), property2, s0().getTranslationY(), pair != null ? ((Number) pair.getSecond()).floatValue() : c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
        createListBuilder.add(i8b.c(s0(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
        createListBuilder.add(i8b.c(k0(), property2, k0().getTranslationY(), c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.addAll(i8b.Q(j0(), 1.0f, ((float) MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density)) / (vo4.c().getDisplayMetrics().density * 84.0f), 300, 0));
        List build = CollectionsKt.build(createListBuilder);
        AnimatorSet animatorSet5 = this.b1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new wwc(this, 6));
        }
        AnimatorSet animatorSet6 = this.b1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new wwc(this, 5));
        }
        AnimatorSet animatorSet7 = this.b1;
        if (animatorSet7 != null) {
            animatorSet7.setInterpolator(p0());
        }
        AnimatorSet animatorSet8 = this.b1;
        if (animatorSet8 != null) {
            animatorSet8.playTogether(build);
        }
        AnimatorSet animatorSet9 = this.b1;
        if (animatorSet9 != null) {
            animatorSet9.start();
        }
    }

    public final void H0() {
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.b1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.b1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.b1 = new AnimatorSet();
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.addAll(i8b.Q(w0(), 1.0f, 0.5f, 150, 0));
        ImageView w02 = w0();
        Property property = View.ALPHA;
        createListBuilder.add(i8b.c(w02, property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.addAll(i8b.Q(q0(), 1.0f, 0.5f, 150, 0));
        createListBuilder.add(i8b.c(q0(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
        createListBuilder.addAll(i8b.Q(y0(), 0.5f, 1.0f, 150, 50));
        createListBuilder.add(i8b.c(y0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 50, 96));
        createListBuilder.addAll(i8b.Q(x0(), 0.5f, 1.0f, 150, 50));
        createListBuilder.add(i8b.c(x0(), property, 0.5f, 1.0f, 150, 50, 96));
        js9 js9 = fu4.k;
        int i = js9.f(h0()).getText().e;
        js9.f(h0()).getText().getClass();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{i, -1});
        ofArgb.setDuration(150);
        ofArgb.setStartDelay(50);
        ofArgb.addUpdateListener(new qwc(this, 1));
        createListBuilder.add(ofArgb);
        js9.f(o0()).c().a.getClass();
        int Y2 = i8b.Y(0.08f, -16745729);
        js9.f(o0()).getIcon().getClass();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{Y2, -16745729});
        ofArgb2.setDuration(150);
        ofArgb2.setStartDelay(50);
        ofArgb2.addUpdateListener(new qwc(this, 2));
        createListBuilder.add(ofArgb2);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        js9.f(o0()).getIcon().getClass();
        int Y3 = i8b.Y(0.5f, -16745729);
        js9.f(o0()).getIcon().getClass();
        ValueAnimator ofArgb3 = ValueAnimator.ofArgb(new int[]{Y3, i8b.Y(0.5f, -1)});
        ofArgb3.setDuration(150);
        ofArgb3.setStartDelay(50);
        ofArgb3.addUpdateListener(new bn(7, booleanRef, this));
        createListBuilder.add(ofArgb3);
        List build = CollectionsKt.build(createListBuilder);
        AnimatorSet animatorSet4 = this.b1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new wwc(this, 8));
        }
        AnimatorSet animatorSet5 = this.b1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new wwc(this, 7));
        }
        AnimatorSet animatorSet6 = this.b1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(p0());
        }
        AnimatorSet animatorSet7 = this.b1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(build);
        }
        AnimatorSet animatorSet8 = this.b1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void I0(boolean z2) {
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.b1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.b1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.b1 = new AnimatorSet();
        List createListBuilder = CollectionsKt.createListBuilder();
        View n0 = n0();
        Property property = View.ALPHA;
        createListBuilder.add(i8b.c(n0, property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 150, 96));
        View n02 = n0();
        Property property2 = View.TRANSLATION_X;
        createListBuilder.add(i8b.c(n02, property2, vo4.c().getDisplayMetrics().density * 72.0f, c44.DEFAULT_ASPECT_RATIO, 300, 150, 96));
        createListBuilder.add(i8b.c(o0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 150, 96));
        Property property3 = property2;
        createListBuilder.add(i8b.c(o0(), property3, vo4.c().getDisplayMetrics().density * 72.0f, c44.DEFAULT_ASPECT_RATIO, 300, 150, 96));
        createListBuilder.add(i8b.c(m0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 250, 96));
        createListBuilder.add(i8b.c(m0(), property3, vo4.c().getDisplayMetrics().density * 70.0f, c44.DEFAULT_ASPECT_RATIO, 300, 200, 96));
        createListBuilder.add(i8b.c(s0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 250, 96));
        Pair pair = this.U0;
        createListBuilder.add(i8b.c(s0(), View.TRANSLATION_Y, ((float) -48) - (vo4.c().getDisplayMetrics().density * 2.0f), pair != null ? ((Number) pair.getSecond()).floatValue() : c44.DEFAULT_ASPECT_RATIO, 200, 200, 96));
        js9 js9 = fu4.k;
        int i = js9.f(h0()).a().l().e.g;
        js9.f(h0()).a().l().e.getClass();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{i, -1});
        ofArgb.setStartDelay(150);
        ofArgb.setDuration(300);
        ofArgb.addUpdateListener(new qwc(this, 8));
        createListBuilder.add(ofArgb);
        createListBuilder.addAll(i8b.Q(j0(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 100));
        createListBuilder.add(i8b.c(j0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 100, 96));
        List build = CollectionsKt.build(createListBuilder);
        AnimatorSet animatorSet4 = this.b1;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(p0());
        }
        AnimatorSet animatorSet5 = this.b1;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(build);
        }
        AnimatorSet animatorSet6 = this.b1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new wwc(this, 11));
        }
        AnimatorSet animatorSet7 = this.b1;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new ig(this, z2));
        }
        ob9 u0 = u0();
        AnimatorSet animatorSet8 = null;
        if (u0 != null) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) u0;
            if (messageWriteWidget.getView() != null) {
                dc9 d0 = messageWriteWidget.d0();
                d0.getClass();
                AnimatorSet animatorSet9 = new AnimatorSet();
                List createListBuilder2 = CollectionsKt.createListBuilder();
                createListBuilder2.add(i8b.c(d0.c, property2, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                List list = createListBuilder2;
                list.add(i8b.c(d0.c, property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
                ImageView imageView = d0.b;
                list.add(i8b.c(imageView, property2, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                AnimatorSet animatorSet10 = animatorSet9;
                list.add(i8b.c(imageView, property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0, 112));
                Lazy lazy = d0.v;
                if (lazy.isInitialized()) {
                    list.add(i8b.c((View) lazy.getValue(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 0, 112));
                    list.addAll(i8b.Q((View) lazy.getValue(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0));
                }
                Lazy lazy2 = d0.z;
                if (lazy2.isInitialized()) {
                    list.add(i8b.c((View) lazy2.getValue(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 0, 112));
                    list.addAll(i8b.Q((View) lazy2.getValue(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 0));
                }
                List build2 = CollectionsKt.build(list);
                animatorSet10.addListener(new cc9(d0, 6));
                animatorSet10.playTogether(build2);
                animatorSet8 = animatorSet10;
            }
        }
        AnimatorSet animatorSet11 = this.b1;
        if (animatorSet11 != null) {
            animatorSet11.playTogether(new Animator[]{animatorSet8});
        }
        AnimatorSet animatorSet12 = this.b1;
        if (animatorSet12 != null) {
            animatorSet12.start();
        }
    }

    public final void J0() {
        aje aje = this.Y0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.Y0 = null;
        AnimatorSet animatorSet = this.a1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        i0().setScaleX(1.0f);
        i0().setScaleY(1.0f);
    }

    public final void K0() {
        etc etc = D0().y0;
        this.Z0.setValue(this, g1[22], ev0.u(getViewLifecycleScope(), ((osa) ((gaf) this.v.getValue())).a(), f14.b, new gxc((Continuation) null, this, etc != null ? (byte[]) etc.a.getValue() : null)));
    }

    public final void g(int i, Bundle bundle) {
        if (i == 1) {
            xag.h(((yvc) this.b.getValue()).b, uvc.a);
        } else if (i == 2) {
            D0().t();
        }
    }

    public final void g0() {
        AnimatorSet animatorSet = this.c1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.d1;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.e1;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        AnimatorSet animatorSet5 = this.a1;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        AnimatorSet animatorSet6 = this.b1;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        J0();
    }

    public final ImageView h0() {
        return (ImageView) this.G0.getValue(this, g1[20]);
    }

    public final View i0() {
        return (View) this.F0.getValue(this, g1[19]);
    }

    public final View j0() {
        return (View) this.E0.getValue(this, g1[18]);
    }

    public final View k0() {
        return (View) this.D0.getValue(this, g1[17]);
    }

    public final View l0() {
        return (View) this.Z.getValue(this, g1[8]);
    }

    public final TextView m0() {
        return (TextView) this.Y.getValue(this, g1[7]);
    }

    public final View n0() {
        return (View) this.y.getValue(this, g1[4]);
    }

    public final TextView o0() {
        return (TextView) this.z.getValue(this, g1[5]);
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        D0().m();
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            android.content.Context r11 = r9.getContext()
            r10.<init>(r11)
            int r11 = defpackage.xya.f
            r10.setId(r11)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = 48
            float r0 = (float) r12
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r2 = -1
            r11.<init>(r2, r1)
            r10.setLayoutParams(r11)
            r11 = 0
            r10.setClipChildren(r11)
            r1 = 4
            r10.setVisibility(r1)
            rwc r3 = new rwc
            r4 = 0
            r3.<init>(r9, r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r10.getContext()
            r4.<init>(r5)
            int r5 = defpackage.xya.p
            r4.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r0
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r5.<init>(r2, r6)
            r6 = 80
            r5.gravity = r6
            r4.setLayoutParams(r5)
            r4.setVisibility(r1)
            r5 = 1
            r4.setClickable(r5)
            r4.setFocusable(r5)
            r4.setMinimumHeight(r12)
            r4.setOrientation(r11)
            r4.setBackgroundColor(r11)
            r3.invoke(r4)
            r10.addView(r4)
            rwc r12 = new rwc
            r3 = 1
            r12.<init>(r9, r3)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            int r4 = defpackage.xya.e
            r3.setId(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 96
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            r4.<init>(r2, r7)
            r4.gravity = r6
            r3.setLayoutParams(r4)
            r3.setVisibility(r1)
            r3.setClickable(r5)
            r3.setFocusable(r5)
            bs8 r2 = new bs8
            r4 = 3
            r5 = 0
            r6 = 2
            r2.<init>(r4, r5, r6)
            defpackage.b0h.H(r3, r2)
            r12.invoke(r3)
            r10.addView(r3)
            rwc r12 = new rwc
            r2 = 2
            r12.<init>(r9, r2)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            android.content.Context r2 = r10.getContext()
            r9.<init>(r2)
            int r2 = defpackage.xya.d
            r9.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 84
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            float r6 = (float) r6
            r7 = 1069128090(0x3fb9999a, float:1.45)
            float r6 = r6 * r7
            int r6 = (int) r6
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r3 = r3 * r8
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            r2.<init>(r6, r3)
            r3 = 85
            r2.gravity = r3
            r3 = -37
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r2.setMargins(r11, r11, r6, r3)
            r9.setLayoutParams(r2)
            r9.setVisibility(r1)
            r12.invoke(r9)
            r10.addView(r9)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r12 = r10.getContext()
            r9.<init>(r12)
            int r12 = defpackage.xya.l
            r9.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r1 = 40
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r2 = 52
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r12.<init>(r1, r2)
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r12.gravity = r1
            r9.setLayoutParams(r12)
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r12 = r12 * r1
            r9.setTranslationX(r12)
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r0 = r0 * r12
            int r12 = kotlin.math.MathKt.roundToInt((float) r0)
            int r12 = -r12
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 * r1
            float r12 = r12 - r0
            r9.setTranslationY(r12)
            r12 = 6
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r12
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r9.setPadding(r0, r2, r12, r1)
            int r12 = defpackage.cad.S0
            r9.setImageResource(r12)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            android.content.res.Resources r0 = defpackage.vo4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            r12.setCornerRadius(r0)
            r9.setBackground(r12)
            r12 = 8
            r9.setVisibility(r12)
            xd2 r12 = new xd2
            r0 = 5
            r12.<init>(r4, r5, r0)
            defpackage.b0h.H(r9, r12)
            r10.addView(r9)
            android.view.ViewParent r9 = r10.getParent()
            boolean r12 = r9 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x0228
            r5 = r9
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x0228:
            if (r5 == 0) goto L_0x022d
            r5.setClipChildren(r11)
        L_0x022d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        this.X0 = null;
    }

    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.b1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        g0();
        D0().m();
    }

    public final void onViewCreated(View view) {
        on2 on2 = new on2(D0().v0, 28);
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(on2, getViewLifecycleOwner().getLifecycle(), iu7), new xwc((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(D0().x0, 28), getViewLifecycleOwner().getLifecycle(), iu7), new ywc((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(D0().z0, getViewLifecycleOwner().getLifecycle(), iu7), new zwc((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(D0().A0, getViewLifecycleOwner().getLifecycle(), iu7), new axc((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(D0().B0, getViewLifecycleOwner().getLifecycle(), iu7), new bxc((Continuation) null, this), 5), getViewLifecycleScope());
        etc etc = D0().y0;
        if (etc != null) {
            bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new cxc((Continuation) null, this), 5), getViewLifecycleScope());
        }
        bs0.K(new ps5(ct.k(((yvc) this.b.getValue()).c, getViewLifecycleOwner().getLifecycle(), iu7), new dxc((Continuation) null, this), 5), getViewLifecycleScope());
        ohe ohe = new ohe(s0(), ohe.p);
        phe phe = new phe();
        ohe.m = phe;
        phe.b(200.0f);
        ohe.m.a(0.75f);
        this.X0 = ohe;
    }

    public final PathInterpolator p0() {
        return (PathInterpolator) this.S0.getValue();
    }

    public final View q0() {
        return (View) this.w0.getValue(this, g1[10]);
    }

    public final TextView r0() {
        return (TextView) this.y0.getValue(this, g1[12]);
    }

    public final View s0() {
        return (View) this.H0.getValue(this, g1[21]);
    }

    public final ob9 u0() {
        zx3 parentController = getParentController();
        if (parentController instanceof ob9) {
            return (ob9) parentController;
        }
        return null;
    }

    public final Drawable v0() {
        return (Drawable) this.K0.getValue();
    }

    public final ImageView w0() {
        return (ImageView) this.B0.getValue(this, g1[15]);
    }

    public final ImageView x0() {
        return (ImageView) this.x0.getValue(this, g1[11]);
    }

    public final ImageView y0() {
        return (ImageView) this.C0.getValue(this, g1[16]);
    }

    public final ImageView z0() {
        return (ImageView) this.A0.getValue(this, g1[14]);
    }

    public RecordControlsWidget(String str, qvc qvc, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("arg_key_type", qvc)));
    }
}
