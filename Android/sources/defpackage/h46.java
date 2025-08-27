package defpackage;

import android.graphics.Rect;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;
import ru.ok.messages.settings.folders.tutor.FolderTutorLayout;

/* renamed from: h46  reason: default package */
public final class h46 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderSettingsFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h46(FolderSettingsFragment folderSettingsFragment, Continuation continuation) {
        super(2, continuation);
        this.b = folderSettingsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h46 h46 = new h46(this.b, continuation);
        h46.a = obj;
        return h46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h46) create((y46) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        Rect rect;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        y46 y46 = (y46) this.a;
        FolderSettingsFragment folderSettingsFragment = this.b;
        b46 b46 = (b46) folderSettingsFragment.C1.d().getAdapter();
        ArrayList arrayList = new ArrayList();
        for (Object next : y46.a) {
            if (!Intrinsics.areEqual((Object) ((x16) next).a, (Object) "all.chat.folder")) {
                arrayList.add(next);
            }
        }
        mo4 h = h88.h(new c71(1, b46.X, arrayList));
        b46.X = arrayList;
        h.a(new y35(2, (Object) b46));
        f46 f46 = folderSettingsFragment.C1;
        b46 b462 = (b46) f46.e().getAdapter();
        List list = b462.X;
        List list2 = y46.b;
        mo4 h2 = h88.h(new c71(1, list, list2));
        b462.X = list2;
        h2.a(new y35(2, (Object) b462));
        f46.getClass();
        ((TextView) f46.w.getValue(f46, f46.v0[3])).setVisibility(list2.isEmpty() ^ true ? 0 : 8);
        tf6 tf6 = y46.c;
        if (tf6 == null || 1 != folderSettingsFragment.G2().getResources().getConfiguration().orientation) {
            m56 m56 = folderSettingsFragment.F1;
            if (m56 != null) {
                m56.g(true);
            }
        } else {
            m56 m562 = folderSettingsFragment.F1;
            if (m562 != null && !m562.a) {
                m562.a = true;
                l56 l56 = new l56(m562, 3);
                FolderTutorLayout folderTutorLayout = (FolderTutorLayout) m562.c;
                folderTutorLayout.setTutorFinishCallback(l56);
                if (!folderTutorLayout.isLaidOut() || folderTutorLayout.isLayoutRequested()) {
                    folderTutorLayout.addOnLayoutChangeListener(new nn1(2, m562, tf6));
                } else {
                    vj6 vj6 = new vj6(5, (Object) m562, (Object) tf6);
                    buf a2 = m56.a(m562, tf6);
                    if (a2 == null || (rect = rcg.c(a2.o(), folderTutorLayout)) == null) {
                        rect = new Rect();
                    }
                    if (rect.bottom > folderTutorLayout.getHeight()) {
                        m56.b(m562, rect);
                        NestedScrollView nestedScrollView = (NestedScrollView) m562.e;
                        if (!nestedScrollView.isLaidOut() || nestedScrollView.isLayoutRequested()) {
                            nestedScrollView.addOnLayoutChangeListener(new dr0(6, vj6));
                        } else {
                            vj6.run();
                        }
                    } else {
                        vj6.run();
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : y46.a) {
            if (((x16) next2).g) {
                arrayList2.add(next2);
            }
        }
        f46.getClass();
        KProperty[] kPropertyArr = f46.v0;
        ((TextView) f46.Y.getValue(f46, kPropertyArr[8])).setVisibility(0);
        f46.getClass();
        TextView textView = (TextView) f46.Y.getValue(f46, kPropertyArr[8]);
        if (!arrayList2.isEmpty()) {
            charSequence = ((qra) ((id3) folderSettingsFragment.p1.b)).v().k.c(folderSettingsFragment.T1(qad.N2, CollectionsKt___CollectionsKt.joinToString(arrayList2, ", ", "", "", -1, "...", new of3(21))));
        } else {
            charSequence = folderSettingsFragment.S1(qad.O2);
        }
        textView.setText(charSequence);
        return Unit.INSTANCE;
    }
}
