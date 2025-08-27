package one.me.folders.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.sdk.arch.Widget;

@SourceDebugExtension({"SMAP\nFolderMemberPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderMemberPickerScreen.kt\none/me/folders/picker/FolderMemberPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,132:1\n420#2:133\n420#2:134\n410#2,8:147\n55#3,12:135\n*S KotlinDebug\n*F\n+ 1 FolderMemberPickerScreen.kt\none/me/folders/picker/FolderMemberPickerScreen\n*L\n43#1:133\n44#1:134\n100#1:147,8\n47#1:135,12\n*E\n"})
@SuppressLint({"ValidController"})
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lp16;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "membersIds", "(Ljava/lang/String;Ljava/lang/String;[J)V", "folders_release"}, k = 1, mv = {2, 0, 0})
public final class FolderMemberPickerScreen extends AbstractPickerScreen<p16> {
    public static final /* synthetic */ KProperty[] v0;
    public final zc4 X;
    public final is Y;
    public final is Z;
    public final yh7 y;
    public final xme z;

    static {
        Class<FolderMemberPickerScreen> cls = FolderMemberPickerScreen.class;
        v0 = new KProperty[]{wj6.p(cls, "folderId", "getFolderId()Ljava/lang/String;", 0), wj6.p(cls, "tag", "getTag()Ljava/lang/String;", 0)};
    }

    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.y = yh7.d;
        this.z = f6e.a(new igf(jra.b0));
        i66 i66 = i66.a;
        this.X = new zc4(i66.getAccessor().h(x23.class), i66.getAccessor().h(gaf.class), i66.getAccessor().h(qx2.class), m0(bundle));
        Class<String> cls = String.class;
        this.Y = new is(cls, "folder_id");
        this.Z = new is(cls, "result_tag");
        zr0 zr0 = new zr0((zx3) this, (Function0) new u75(7, this));
        if (getRouter() != null) {
            getRouter().a(zr0);
        } else {
            addLifecycleListener(new la(this, zr0, 5));
        }
    }

    public final Iterable c0() {
        return CollectionsKt.emptyList();
    }

    public final ojb d0() {
        i66 i66 = i66.a;
        return new eud(9, this.X, new y35(12, (Object) i66.getAccessor().h(qx2.class)), i66.getAccessor().h(eu3.class), i66.getAccessor().h(x23.class));
    }

    public final Widget e0(String str) {
        return new PickerChatsListWidget2("all.chat.folder", str, false, (DefaultConstructorMarker) null);
    }

    public final h3b f0(Context context) {
        h3b d = o54.d(context, (AttributeSet) null);
        d.setId(gua.a);
        d.setTransitionName(context.getString(jra.q));
        d.setTitle(jra.c0);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new rx2(15, this)));
        return d;
    }

    public final ukb g0() {
        i66 i66 = i66.a;
        return new p16(this.X, i66.getAccessor().h(u82.class), i66.getAccessor().h(gaf.class));
    }

    public final yh7 getInsetsConfig() {
        return this.y;
    }

    public final xme i0() {
        return this.z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = kotlin.collections.ArraysKt.toSet(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set m0(android.os.Bundle r1) {
        /*
            r0 = this;
            java.lang.String r0 = "preselected_ids"
            long[] r0 = r1.getLongArray(r0)
            if (r0 == 0) goto L_0x000e
            java.util.Set r0 = kotlin.collections.ArraysKt.toSet((long[]) r0)
            if (r0 != 0) goto L_0x0012
        L_0x000e:
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.folders.picker.FolderMemberPickerScreen.m0(android.os.Bundle):java.util.Set");
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(l0().x, getViewLifecycleOwner().getLifecycle(), iu7.o), new q16((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(((p16) l0().c).e, new r16((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public FolderMemberPickerScreen(String str, String str2, long[] jArr) {
        this(o54.f(TuplesKt.to("folder_id", str), TuplesKt.to("result_tag", str2), TuplesKt.to("preselected_ids", jArr)));
    }
}
