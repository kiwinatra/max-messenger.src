package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;

@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0001\b&\u0018\u0000 «\u00012\u00020\u0001:\u0002¬\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b,\u0010+J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u000e\b\b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\bø\u0001\u0000¢\u0006\u0004\b2\u00103J?\u00109\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u0006\u00105\u001a\u0002042\u0010\b\n\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\bø\u0001\u0000¢\u0006\u0004\b7\u00108J;\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0/H\u0001¢\u0006\u0004\b>\u0010?JG\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\u0006\u00105\u001a\u0002042\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0001¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010C*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000H\"\b\b\u0000\u0010G*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\b\b\u0000\u0010G*\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0004¢\u0006\u0004\bN\u0010OJB\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020R0H2\b\b\u0001\u0010P\u001a\u00020\u00042\u001b\b\u0002\u0010T\u001a\u0015\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0012\u0018\u00010Q¢\u0006\u0002\bSH\u0004¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020W0H2\b\b\u0001\u0010P\u001a\u00020\u0004H\u0004¢\u0006\u0004\bX\u0010JJS\u0010_\u001a\u00020\u0012\"\u0004\b\u0000\u0010G*\b\u0012\u0004\u0012\u00028\u00000Y2\b\b\u0002\u0010[\u001a\u00020Z2$\b\u0004\u0010^\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120]\u0012\u0006\u0012\u0004\u0018\u00010K0\\H\bø\u0001\u0000¢\u0006\u0004\b_\u0010`J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000d\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0003\u0010eJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000d\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010b\u001a\u00020aH\b¢\u0006\u0004\b\u0003\u0010fJ.\u0010h\u001a\u00020\u00122\u0019\b\u0004\u0010g\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120Q¢\u0006\u0002\bSH\bø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010q\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u0001H\u0002¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010sR\u001a\u0010u\u001a\u00020t8\u0000X\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR&\u0010{\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020z0y8\u0000X\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u00105\u001a\u0002048\u0016X\u0004¢\u0006\u000e\n\u0004\b5\u0010\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020a8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020j8BX\u0002¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010lR\u0015\u0010 \u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010¤\u0001\u001a\u00030¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010¨\u0001\u001a\u00030¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010ª\u0001\u001a\u00030¡\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010£\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006­\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Lzx3;", "Landroid/os/Bundle;", "args", "", "layoutRes", "<init>", "(Landroid/os/Bundle;I)V", "Lhn;", "requireActivity", "()Lhn;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "Landroid/content/res/Resources;", "requireResources", "()Landroid/content/res/Resources;", "newArgs", "", "updateArgs", "(Landroid/os/Bundle;)V", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedViewState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;)V", "Ley3;", "changeHandler", "Lfy3;", "changeType", "onChangeStarted", "(Ley3;Lfy3;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lxag;", "VM", "Lkotlin/Function0;", "vmProducer", "Lkotlin/Lazy;", "viewModel", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Legd;", "scopeId", "defaultFactory", "sharedViewModel-qk3jasM", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "sharedViewModel", "Ljava/lang/Class;", "viewModelClass", "Lwag;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "getSharedViewModel-cp94BC8", "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "getSharedViewModel", "V", "id", "findViewById", "(I)Landroid/view/View;", "T", "Lkotlin/properties/ReadOnlyProperty;", "viewBinding", "(I)Lkotlin/properties/ReadOnlyProperty;", "", "bindAction", "Lsn0;", "binding", "(Lkotlin/jvm/functions/Function0;)Lsn0;", "containerId", "Lkotlin/Function1;", "Le9d;", "Lkotlin/ExtensionFunctionType;", "routerBuilder", "childRouter", "(ILkotlin/jvm/functions/Function1;)Lkotlin/properties/ReadOnlyProperty;", "Lmz2;", "childSlotRouter", "Lbs5;", "Liu7;", "minActiveState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "collectInViewScope", "(Lbs5;Liu7;Lkotlin/jvm/functions/Function2;)V", "", "key", "defaultValue", "Lis;", "(Ljava/lang/String;Ljava/lang/Object;)Lis;", "(Ljava/lang/String;)Lis;", "action", "doActionIfRootExist", "(Lkotlin/jvm/functions/Function1;)V", "Loz1;", "addIfNeedChildWidgetContainer", "()Loz1;", "findWidgetByScopeId-iP7A0G4", "(Ljava/lang/String;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "controller", "finalizeCleanActions", "(Lzx3;)V", "I", "Lhng;", "viewModelStore", "Lhng;", "getViewModelStore$arch_release", "()Lhng;", "Lqz9;", "Ln13;", "cleanActions", "Lqz9;", "getCleanActions$arch_release", "()Lqz9;", "Ljava/lang/String;", "getScopeId-IluPPks", "()Ljava/lang/String;", "Lyh7;", "insetsConfig", "Lyh7;", "getInsetsConfig", "()Lyh7;", "Lpgd;", "screenDelegate", "Lpgd;", "getScreenDelegate", "()Lpgd;", "", "isDialog", "Z", "()Z", "tag", "dng", "internalLifecycleListener", "Ldng;", "Lly3;", "_viewLifecycleOwner", "Lly3;", "get_viewLifecycleOwner$annotations", "()V", "childWidgetContainer$delegate", "Lkotlin/Lazy;", "getChildWidgetContainer", "childWidgetContainer", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ltu7;", "getLifecycleScope", "()Ltu7;", "lifecycleScope", "Ljv7;", "getViewLifecycleOwner", "()Ljv7;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", "Companion", "ang", "arch_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widget.kt\none/me/sdk/arch/Widget\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Log.kt\nru/ok/tamtam/logger/Log\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,462:1\n5#2:463\n5#2:464\n1#3:465\n32#4,4:466\n418#5,3:470\n363#5,6:473\n373#5,3:480\n376#5,2:484\n422#5,2:486\n379#5,6:488\n424#5:494\n1826#6:479\n1688#6:483\n*S KotlinDebug\n*F\n+ 1 Widget.kt\none/me/sdk/arch/Widget\n*L\n66#1:463\n160#1:464\n444#1:466,4\n447#1:470,3\n447#1:473,6\n447#1:480,3\n447#1:484,2\n447#1:486,2\n447#1:488,6\n447#1:494\n447#1:479\n447#1:483\n*E\n"})
public abstract class Widget extends zx3 {
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    public static final ang Companion = new Object();
    private static final AtomicInteger allocationsCount = new AtomicInteger(0);
    private ly3 _viewLifecycleOwner;
    private final Lazy childWidgetContainer$delegate;
    private final qz9 cleanActions;
    private final yh7 insetsConfig;
    private final dng internalLifecycleListener;
    private final boolean isDialog;
    private final int layoutRes;
    private final String scopeId;
    private final pgd screenDelegate;
    /* access modifiers changed from: private */
    public final String tag;
    private final hng viewModelStore;

    public Widget() {
        this((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final Object binding$lambda$8(Function0 function0, Object obj) {
        return function0.invoke();
    }

    /* access modifiers changed from: private */
    public static final Unit binding$lambda$9(Widget widget, Object obj, n13 n13) {
        qz9 qz9 = widget.cleanActions;
        int g = qz9.g(obj);
        if (g < 0) {
            g = ~g;
        }
        Object[] objArr = qz9.c;
        Object obj2 = objArr[g];
        qz9.b[g] = obj;
        objArr[g] = n13;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ReadOnlyProperty childRouter$default(Widget widget, int i, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function1 = null;
            }
            return widget.childRouter(i, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: childRouter");
    }

    /* access modifiers changed from: private */
    public static final e9d childRouter$lambda$10(Widget widget, int i, Function1 function1, e9d e9d) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (function1 == null) {
            return widget.getChildRouter(viewGroup);
        }
        e9d childRouter = widget.getChildRouter(viewGroup);
        function1.invoke(childRouter);
        return childRouter;
    }

    /* access modifiers changed from: private */
    public static final mz2 childSlotRouter$lambda$11(Widget widget, int i, mz2 mz2) {
        return new mz2(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [oz1, android.widget.FrameLayout, android.view.View] */
    /* access modifiers changed from: private */
    public static final oz1 childWidgetContainer_delegate$lambda$13(Widget widget) {
        ? frameLayout = new FrameLayout(widget.getContext());
        frameLayout.setId(ihc.arch_child_widget_wrapper_id);
        return frameLayout;
    }

    public static void collectInViewScope$default(Widget widget, bs5 bs5, iu7 iu7, Function2 function2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                iu7 = iu7.o;
            }
            bs0.K(new ps5(ct.k(bs5, widget.getViewLifecycleOwner().getLifecycle(), iu7), new bng(function2, (Continuation) null), 5), widget.getViewLifecycleScope());
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectInViewScope");
    }

    /* access modifiers changed from: private */
    public final void finalizeCleanActions(zx3 zx3) {
        long[] jArr;
        long[] jArr2;
        int i;
        if (!this.cleanActions.d()) {
            String y = ev0.y(zx3);
            a67 a67 = z68.b;
            Object obj = null;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, y, wj6.h(getCleanActions$arch_release().e, "view detached, call onFinalize for clean actions "), (Throwable) null);
            }
            qz9 qz9 = this.cleanActions;
            Object[] objArr = qz9.c;
            long[] jArr3 = qz9.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j) < 128) {
                                rn0 rn0 = (rn0) ((n13) objArr[(i2 << 3) + i5]);
                                if (!rn0.a) {
                                    sn0 sn0 = rn0.b;
                                    sn0.v = new WeakReference(sn0.o);
                                    sn0.o = obj;
                                    rn0.a = true;
                                }
                                String m = a81.m("Binder_", ev0.y(rn0.c));
                                sn0 sn02 = rn0.b;
                                a67 a672 = z68.b;
                                if (a672 != null && a672.c()) {
                                    w78 w78 = w78.o;
                                    WeakReference weakReference = sn02.v;
                                    jArr2 = jArr3;
                                    a672.d(w78, m, "onFinalize " + weakReference + "/" + (weakReference != null ? weakReference.get() : obj), (Throwable) null);
                                } else {
                                    jArr2 = jArr3;
                                }
                                WeakReference weakReference2 = rn0.b.v;
                                if (weakReference2 != null) {
                                    weakReference2.clear();
                                }
                                obj = null;
                                rn0.b.v = null;
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            this.cleanActions.e();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[EDGE_INSN: B:29:0x0036->B:16:0x0036 ?: BREAK  
    EDGE_INSN: B:30:0x0036->B:16:0x0036 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: findWidgetByScopeId-iP7A0G4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final one.me.sdk.arch.Widget m1567findWidgetByScopeIdiP7A0G4(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "default"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0013
            return r3
        L_0x0013:
            zx3 r0 = r3.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r0.m1570getScopeIdIluPPks()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 != 0) goto L_0x0036
            zx3 r0 = r0.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x0036:
            zx3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x0041
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            goto L_0x0042
        L_0x0041:
            r3 = r1
        L_0x0042:
            if (r0 != 0) goto L_0x0055
            if (r3 == 0) goto L_0x004a
            java.lang.String r1 = r3.m1570getScopeIdIluPPks()
        L_0x004a:
            if (r1 != 0) goto L_0x004e
            r4 = 0
            goto L_0x0052
        L_0x004e:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
        L_0x0052:
            if (r4 == 0) goto L_0x0055
            r0 = r3
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.arch.Widget.m1567findWidgetByScopeIdiP7A0G4(java.lang.String):one.me.sdk.arch.Widget");
    }

    private final oz1 getChildWidgetContainer() {
        return (oz1) this.childWidgetContainer$delegate.getValue();
    }

    /* renamed from: getSharedViewModel-cp94BC8$default  reason: not valid java name */
    public static /* synthetic */ Lazy m1568getSharedViewModelcp94BC8$default(Widget widget, String str, Class cls, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return widget.m1571getSharedViewModelcp94BC8(str, cls, function0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedViewModel-cp94BC8");
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    /* renamed from: sharedViewModel-qk3jasM$default  reason: not valid java name */
    public static /* synthetic */ Lazy m1569sharedViewModelqk3jasM$default(Widget widget, String str, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            Intrinsics.reifiedOperationMarker(4, "VM");
            return widget.m1571getSharedViewModelcp94BC8(str, xag.class, function0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel-qk3jasM");
    }

    /* access modifiers changed from: private */
    public static final View viewBinding$lambda$5(Widget widget, int i, View view) {
        String str;
        if (view != null) {
            n13 n13 = (n13) widget.cleanActions.i(view);
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            str = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        String h = wj6.h(i, "#");
        if (Result.m29isFailureimpl(str)) {
            str = h;
        }
        throw new IllegalStateException(a81.m("could not find view ", (String) str), th);
    }

    /* access modifiers changed from: private */
    public static final Unit viewBinding$lambda$6(Widget widget, View view, n13 n13) {
        qz9 qz9 = widget.cleanActions;
        int g = qz9.g(view);
        if (g < 0) {
            g = ~g;
        }
        Object[] objArr = qz9.c;
        Object obj = objArr[g];
        qz9.b[g] = view;
        objArr[g] = n13;
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static final boolean viewBinding$lambda$7(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final oz1 addIfNeedChildWidgetContainer() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        if (getChildWidgetContainer().getParent() == null) {
            y7e.c(viewGroup, getChildWidgetContainer(), Integer.valueOf(viewGroup.getChildCount()));
        }
        return getChildWidgetContainer();
    }

    public final /* synthetic */ <T> is args(String str, T t) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return new is(Object.class, t, str);
    }

    public final <T> sn0 binding(Function0<? extends T> function0) {
        return new sn0((zx3) this, (Function1) new zmg(0, function0), new xmg(this, 1), 8);
    }

    public final ReadOnlyProperty<Widget, e9d> childRouter(int i, Function1<? super e9d, Unit> function1) {
        return new sn0((zx3) this, (Function1) new r5d(this, i, (Function1) function1), (xmg) null, 12);
    }

    public final ReadOnlyProperty<Widget, mz2> childSlotRouter(int i) {
        return new sn0((zx3) this, (Function1) new wmg(this, i, 0), (xmg) null, 12);
    }

    public final <T> void collectInViewScope(bs5 bs5, iu7 iu7, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        bs0.K(new ps5(ct.k(bs5, getViewLifecycleOwner().getLifecycle(), iu7), new bng(function2, (Continuation) null), 5), getViewLifecycleScope());
    }

    @PublishedApi
    public final <VM extends xag> Lazy<VM> createViewModelLazy(Class<VM> cls, Function0<? extends wag> function0) {
        hng hng = this.viewModelStore;
        hng.getClass();
        String m = a81.m("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        hng.b.k(m, (wag) function0.invoke());
        return new cng(this, cls);
    }

    public final void doActionIfRootExist(Function1<? super View, Unit> function1) {
        View view = getView();
        if (view != null) {
            function1.invoke(view);
        }
    }

    public final <V extends View> V findViewById(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public final qz9 getCleanActions$arch_release() {
        return this.cleanActions;
    }

    public final Context getContext() {
        return requireActivity();
    }

    public yh7 getInsetsConfig() {
        return this.insetsConfig;
    }

    public final tu7 getLifecycleScope() {
        return fqc.p(this.lifecycleOwner);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public String m1570getScopeIdIluPPks() {
        return this.scopeId;
    }

    public pgd getScreenDelegate() {
        return this.screenDelegate;
    }

    @PublishedApi
    /* renamed from: getSharedViewModel-cp94BC8  reason: not valid java name */
    public final <VM extends xag> Lazy<VM> m1571getSharedViewModelcp94BC8(String str, Class<VM> cls, Function0<? extends VM> function0) {
        return new bbg(this, str, (Class) cls, (Function0) function0);
    }

    public final jv7 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final tu7 getViewLifecycleScope() {
        return fqc.p(this._viewLifecycleOwner);
    }

    public final hng getViewModelStore$arch_release() {
        return this.viewModelStore;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    @Deprecated(message = "Be careful working with views in this lifecycle function")
    public void onActivityPaused(Activity activity) {
    }

    @Deprecated(message = "Be careful working with views in this lifecycle function")
    public void onActivityResumed(Activity activity) {
    }

    public void onChangeStarted(ey3 ey3, fy3 fy3) {
        if (fy3 == fy3.POP_ENTER || fy3 == fy3.PUSH_ENTER) {
            getScreenDelegate().f();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.layoutRes, viewGroup, false);
    }

    public void onUpdateArgs(Bundle bundle, Bundle bundle2) {
    }

    public void onViewCreated(View view) {
    }

    public final hn requireActivity() {
        return (hn) getActivity();
    }

    public final Resources requireResources() {
        Resources resources = getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalArgumentException(("Resources are null because of widget " + this + " is not attached to an activity").toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("view is null!".toString());
    }

    /* renamed from: sharedViewModel-qk3jasM  reason: not valid java name */
    public final /* synthetic */ <VM extends xag> Lazy<VM> m1572sharedViewModelqk3jasM(String str, Function0<? extends VM> function0) {
        Intrinsics.reifiedOperationMarker(4, "VM");
        return m1571getSharedViewModelcp94BC8(str, xag.class, function0);
    }

    public final void updateArgs(Bundle bundle) {
        Bundle deepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(bundle);
        onUpdateArgs(deepCopy, getArgs());
    }

    public final <T extends View> ReadOnlyProperty<Widget, T> viewBinding(int i) {
        return new sn0((zx3) this, (Function1) new wmg(this, i, 1), (Function2) new xmg(this, 0), (Function1) new ymg(this, 0));
    }

    public final /* synthetic */ <VM extends xag> Lazy<VM> viewModel(Function0<? extends VM> function0) {
        Intrinsics.reifiedOperationMarker(4, "VM");
        return createViewModelLazy(xag.class, new mle(8, function0));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Widget(Bundle bundle, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? -1 : i);
    }

    public final /* synthetic */ <T> is args(String str) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return new is(Object.class, str);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [ly3, java.lang.Object, jv7] */
    public Widget(Bundle bundle, int i) {
        super(bundle);
        this.layoutRes = i;
        this.viewModelStore = new hng();
        this.cleanActions = new qz9(3);
        this.scopeId = "default";
        this.insetsConfig = yh7.c;
        this.screenDelegate = nfd.X;
        this.tag = getClass().getName();
        dng dng = new dng(this);
        this.internalLifecycleListener = dng;
        ? obj = new Object();
        obj.a = new lv7(obj);
        addLifecycleListener(new fa3(2, obj));
        this._viewLifecycleOwner = obj;
        String name = getClass().getName();
        int incrementAndGet = allocationsCount.incrementAndGet();
        z68.c(name, "allocations count = " + incrementAndGet, new Object[0]);
        addLifecycleListener(dng);
        addLifecycleListener(x78.a);
        this.childWidgetContainer$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(20, this));
    }
}
