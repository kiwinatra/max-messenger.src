package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KProperty;
import one.me.folders.list.FoldersListScreen;

/* renamed from: mu0  reason: default package */
public final /* synthetic */ class mu0 extends FunctionReferenceImpl implements Function3 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mu0(int i, Object obj) {
        super(3, obj, ru0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(3, obj, ru0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
                return;
            case 2:
                super(3, obj, FoldersListScreen.class, "onActionMenuClick", "onActionMenuClick(Landroid/view/View;Lone/me/folders/list/adapter/UserFolderListItem;I)V", 0);
                return;
            default:
                return;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Collection collection;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                iq.o(((ru0) this.receiver).b, obj2, (CoroutineContext) obj3);
                return Unit.INSTANCE;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj4 = ((e22) obj2).a;
                CoroutineContext coroutineContext = (CoroutineContext) obj3;
                Function1 function1 = ((ru0) this.receiver).b;
                if (obj4 instanceof d22) {
                    obj4 = null;
                }
                iq.o(function1, obj4, coroutineContext);
                return Unit.INSTANCE;
            default:
                g0g g0g = (g0g) obj2;
                ((Number) obj3).intValue();
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                KProperty[] kPropertyArr = FoldersListScreen.x;
                foldersListScreen.c0().z = g0g;
                lw3 o = m58.b(ix3.a).o((View) obj);
                foldersListScreen.c0().getClass();
                zx5 zx5 = g0g.a;
                if (zx5 == null) {
                    collection = CollectionsKt.emptyList();
                } else {
                    List createListBuilder = CollectionsKt.createListBuilder();
                    createListBuilder.add(new ow3(gua.j, (ngf) new igf(iua.n), Integer.valueOf(lya.g), (Integer) null, 20));
                    if (!zx5.A0.contains(a26.NO_DELETE)) {
                        int i = gua.k;
                        igf igf = new igf(iua.o);
                        int i2 = cad.y;
                        int i3 = jya.I;
                        int i4 = jya.E;
                        createListBuilder.add(new ow3(i, (ngf) igf, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                    }
                    collection = CollectionsKt.build(createListBuilder);
                }
                o.h(collection).d().build().o(foldersListScreen);
                return Unit.INSTANCE;
        }
    }
}
