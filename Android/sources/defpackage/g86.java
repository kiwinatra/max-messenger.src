package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: g86  reason: default package */
public final class g86 extends ContinuationImpl {
    public final /* synthetic */ FoldersPickerViewModel X;
    public int Y;
    public FoldersPickerViewModel a;
    public Collection b;
    public Iterator c;
    public Object o;
    public m58 v;
    public String w;
    public boolean x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g86(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(continuation);
        this.X = foldersPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.Y |= IntCompanionObject.MIN_VALUE;
        return FoldersPickerViewModel.j(this.X, (List) null, this);
    }
}
