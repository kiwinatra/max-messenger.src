package one.me.mediapicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lql6;", "galleryMode", "(Lql6;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPickerScreen.kt\none/me/mediapicker/MediaPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 IntentExt.kt\none/me/sdk/uikit/common/IntentExtKt\n+ 6 MediaPickerUtils.kt\none/me/mediapicker/MediaPickerUtilsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 ViewExt.kt\none/me/sdk/uikit/common/ViewExtKt\n+ 10 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,307:1\n420#2:308\n235#2,10:309\n235#2,10:319\n235#2,10:329\n419#2:339\n410#2,8:341\n410#2,8:349\n410#2,8:357\n410#2,8:365\n1#3:340\n5#4:373\n14#5,2:374\n14#5,2:376\n11#6,14:378\n27#6:394\n1863#7,2:392\n256#8,2:395\n256#8,2:399\n256#8,2:402\n256#8,2:404\n256#8,2:406\n256#8,2:408\n256#8,2:411\n65#9,2:397\n68#9:401\n24#10:410\n*S KotlinDebug\n*F\n+ 1 MediaPickerScreen.kt\none/me/mediapicker/MediaPickerScreen\n*L\n64#1:308\n70#1:309,10\n74#1:319,10\n81#1:329,10\n102#1:339\n169#1:341,8\n196#1:349,8\n206#1:357,8\n222#1:365,8\n251#1:373\n254#1:374,2\n255#1:376,2\n258#1:378,14\n258#1:394\n258#1:392,2\n271#1:395,2\n274#1:399,2\n277#1:402,2\n283#1:404,2\n284#1:406,2\n98#1:408,2\n132#1:411,2\n273#1:397,2\n273#1:401\n128#1:410\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaPickerScreen extends Widget {
    public static final /* synthetic */ KProperty[] z0;
    public final sn0 X;
    public final is Y;
    public final sn0 Z;
    public final yh7 a;
    public final ReadOnlyProperty b;
    public final String c;
    public final is o;
    public final w28 v;
    public final sn0 v0;
    public final Lazy w;
    public final sn0 w0;
    public final Lazy x;
    public final ReadOnlyProperty x0;
    public final Lazy y;
    public final sn0 y0;
    public final ReadOnlyProperty z;

    static {
        Class<MediaPickerScreen> cls = MediaPickerScreen.class;
        z0 = new KProperty[]{wj6.p(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), wj6.p(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wj6.p(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), rae.s(cls, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I", 0), wj6.p(cls, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "divider", "getDivider()Landroid/view/View;", 0), wj6.p(cls, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)};
    }

    public MediaPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        this.b = childSlotRouter(sva.b);
        this.c = "MediaPickerScreenScopeId";
        this.o = new is(ql6.class, "gallery_mode_args");
        this.v = new w28(new ck7(27), (Function0) null, 6);
        this.w = createViewModelLazy(om6.class, new i76(20, new ck7(28)));
        this.x = createViewModelLazy(opd.class, new i76(21, new yt8(this, 1)));
        this.y = createViewModelLazy(gu8.class, new i76(22, new yt8(this, 2)));
        this.z = childSlotRouter(sva.a);
        this.X = binding(new yt8(this, 3));
        this.Y = new is(Integer.class, 0, "max_height_albums_content");
        this.Z = binding(new yt8(this, 4));
        this.v0 = binding(new yt8(this, 5));
        this.w0 = binding(new yt8(this, 6));
        this.x0 = viewBinding(sva.c);
        this.y0 = binding(new yt8(this, 7));
    }

    public static final void c0(MediaPickerScreen mediaPickerScreen, boolean z2) {
        sn0 sn0 = mediaPickerScreen.y0;
        int i = 8;
        if (z2) {
            ((View) sn0.getValue()).setVisibility(0);
        } else if (sn0.isInitialized()) {
            ((TextView) sn0.getValue()).setVisibility(8);
        }
        KProperty kProperty = z0[5];
        oz1 oz1 = (oz1) mediaPickerScreen.Z.getValue();
        if (!z2) {
            i = 0;
        }
        oz1.setVisibility(i);
    }

    public final ql6 d0() {
        KProperty kProperty = z0[1];
        return (ql6) this.o.a(this);
    }

    public final h3b e0() {
        KProperty kProperty = z0[6];
        return (h3b) this.v0.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1554getScopeIdIluPPks() {
        return this.c;
    }

    public final pgd getScreenDelegate() {
        return this.v;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Rect rect;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 666 && i2 == -1 && (!d0().c)) {
            zx3 zx3 = null;
            if (intent == null) {
                z68.f(MediaPickerScreen.class.getName(), "ActAvatarCrop sent empty data", (Throwable) null);
                return;
            }
            RectF rectF = (RectF) ((Parcelable) cjf.z(intent, "ru.ok.tamtam.extra.CROPPED_RECT", RectF.class));
            if (rectF != null && (rect = (Rect) ((Parcelable) cjf.z(intent, "ru.ok.tamtam.extra.CROPPED_ABSOLUTE", Rect.class))) != null && (stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.FILE_PATH")) != null) {
                e9d router = getRouter();
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addLast(router);
                loop0:
                while (true) {
                    if (!(!arrayDeque.isEmpty())) {
                        break;
                    }
                    e9d e9d = (e9d) arrayDeque.removeLast();
                    int lastIndex = CollectionsKt.getLastIndex(e9d.e());
                    while (true) {
                        if (-1 < lastIndex) {
                            zx3 zx32 = ((i9d) e9d.e().get(lastIndex)).a;
                            if (zx32 instanceof md0) {
                                zx3 = zx32;
                                break loop0;
                            }
                            for (T addLast : CollectionsKt.asReversedMutable(zx32.getChildRouters())) {
                                arrayDeque.addLast(addLast);
                            }
                            lastIndex--;
                        }
                    }
                }
                md0 md0 = (md0) zx3;
                if (md0 != null) {
                    md0.a(stringExtra, rectF, rect);
                }
                getRouter().C();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(e0());
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(sva.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[5];
        frameLayout.addView((oz1) this.Z.getValue());
        KProperty kProperty2 = kPropertyArr[3];
        frameLayout.addView((oz1) this.X.getValue());
        KProperty kProperty3 = kPropertyArr[7];
        frameLayout.addView((View) this.w0.getValue());
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        Lazy lazy = this.y;
        etc etc = ((gu8) lazy.getValue()).Z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new zt8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((om6) this.w.getValue()).c, getViewLifecycleOwner().getLifecycle(), iu7), new au8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((gu8) lazy.getValue()).Y, getViewLifecycleOwner().getLifecycle(), iu7), new bu8((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(((opd) this.x.getValue()).o, getViewLifecycleOwner().getLifecycle(), iu7), new cu8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaPickerScreen(ql6 ql6) {
        this(o54.f(TuplesKt.to("gallery_mode_args", ql6)));
    }
}
