package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.AlbumsSelectionFragment;

/* renamed from: qc  reason: default package */
public final class qc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AlbumsSelectionFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qc(AlbumsSelectionFragment albumsSelectionFragment, Continuation continuation) {
        super(2, continuation);
        this.b = albumsSelectionFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qc qcVar = new qc(this.b, continuation);
        qcVar.a = obj;
        return qcVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qc) create((zk6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zk6 zk6 = (zk6) this.a;
        Integer num = zk6.a;
        AlbumsSelectionFragment albumsSelectionFragment = this.b;
        if (num == null || (drawable = ew3.b(albumsSelectionFragment.G2(), num.intValue())) == null) {
            drawable = null;
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(albumsSelectionFragment.r1.G, PorterDuff.Mode.SRC_IN));
        }
        albumsSelectionFragment.B1.d().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        lc lcVar = albumsSelectionFragment.B1;
        lcVar.getClass();
        KProperty[] kPropertyArr = lc.y;
        ProgressBar progressBar = (ProgressBar) lcVar.x.getValue(lcVar, kPropertyArr[4]);
        zk6 zk62 = zk6.LOADING;
        boolean z = false;
        progressBar.setVisibility(zk6 == zk62 ? 0 : 8);
        lcVar.getClass();
        View view = (View) lcVar.v.getValue(lcVar, kPropertyArr[2]);
        if (zk6 != zk62) {
            z = true;
        }
        view.setClickable(z);
        return Unit.INSTANCE;
    }
}
