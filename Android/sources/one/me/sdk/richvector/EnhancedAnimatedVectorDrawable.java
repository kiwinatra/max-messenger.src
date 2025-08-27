package one.me.sdk.richvector;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;

@SourceDebugExtension({"SMAP\nEnhancedAnimatedVectorDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnhancedAnimatedVectorDrawable.kt\none/me/sdk/richvector/EnhancedAnimatedVectorDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
@SuppressLint({"ResourceType"})
@Keep
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005*\u0002Yj\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0002gtB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020+2\u0006\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020%H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0010J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\u0010J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\u0010J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010#J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010#J\u000f\u0010=\u001a\u00020+H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020+2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010#J\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010#J\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010L\u001a\u00020FH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\fH\u0016¢\u0006\u0004\bP\u0010#J\u0017\u0010S\u001a\u00020\f2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020H2\u0006\u0010U\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0014\u0010@\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010`\u001a\u0012\u0012\u0004\u0012\u00020H0^j\b\u0012\u0004\u0012\u00020H`_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010c\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020F0b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020?0p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lone/me/sdk/richvector/EnhancedAnimatedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getColorFilter", "()Landroid/graphics/ColorFilter;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "jumpToCurrentState", "()V", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "state", "", "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "visible", "restart", "setVisible", "(ZZ)Z", "getDirtyBounds", "()Landroid/graphics/Rect;", "getIntrinsicWidth", "getIntrinsicHeight", "getMinimumWidth", "getMinimumHeight", "start", "stop", "isRunning", "()Z", "Lye;", "callback", "registerAnimationCallback", "(Lye;)V", "unregisterAnimationCallback", "(Lye;)Z", "clearAnimationCallbacks", "", "targetName", "Landroid/animation/Animator;", "findAnimations", "(Ljava/lang/String;)Landroid/animation/Animator;", "invalidateAnimations", "name", "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Landroid/animation/AnimatorSet;", "animatorSet", "prepareLocalAnimators", "(Landroid/animation/AnimatorSet;)V", "index", "prepareLocalAnimator", "(I)Landroid/animation/Animator;", "I", "e75", "Le75;", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "drawable", "Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "animators", "Ljava/util/ArrayList;", "Landroid/util/ArrayMap;", "targetNameMap", "Landroid/util/ArrayMap;", "animatorSetFromXml", "Landroid/animation/AnimatorSet;", "Lc75;", "animator", "Lc75;", "d75", "animatorListener$delegate", "Lkotlin/Lazy;", "getAnimatorListener", "()Ld75;", "animatorListener", "", "animationCallbacks", "Ljava/util/List;", "Companion", "b75", "rich-vector_release"}, k = 1, mv = {2, 0, 0})
public final class EnhancedAnimatedVectorDrawable extends Drawable implements Animatable, b2g {
    private static final b75 Companion = new Object();
    @Deprecated
    public static final boolean SHOULD_IGNORE_INVALID_ANIMATION = true;
    /* access modifiers changed from: private */
    public List<ye> animationCallbacks = new ArrayList();
    private c75 animator;
    private final Lazy animatorListener$delegate = LazyKt.lazy(new nm1(29, this));
    private AnimatorSet animatorSetFromXml;
    private final ArrayList<Animator> animators;
    private final e75 callback = new e75(this);
    private final EnhancedVectorDrawable drawable;
    private final int resId;
    private final ArrayMap<Animator, String> targetNameMap;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EnhancedAnimatedVectorDrawable(android.content.Context r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r17.<init>()
            r0.resId = r1
            e75 r2 = new e75
            r2.<init>(r0)
            r0.callback = r2
            nm1 r2 = new nm1
            r3 = 29
            r2.<init>(r3, r0)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r0.animatorListener$delegate = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.animationCallbacks = r2
            cg r2 = new cg
            r3 = r18
            r2.<init>(r3)
            p3a r3 = defpackage.cg.c
            java.lang.Object r4 = r3.a
            android.util.LruCache r4 = (android.util.LruCache) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            java.lang.Object r4 = r4.get(r5)
            bg r4 = (defpackage.bg) r4
            if (r4 == 0) goto L_0x0077
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            java.util.ArrayList r8 = r4.b
            java.util.Iterator r8 = r8.iterator()
        L_0x004d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x006a
            java.lang.Object r9 = r8.next()
            android.animation.Animator r9 = (android.animation.Animator) r9
            android.animation.Animator r10 = r9.clone()
            r6.add(r10)
            android.util.ArrayMap r11 = r4.c
            java.lang.Object r9 = r11.get(r9)
            r7.put(r10, r9)
            goto L_0x004d
        L_0x006a:
            bg r8 = new bg
            one.me.sdk.richvector.EnhancedVectorDrawable r9 = new one.me.sdk.richvector.EnhancedVectorDrawable
            one.me.sdk.richvector.EnhancedVectorDrawable r4 = r4.a
            r9.<init>(r4)
            r8.<init>(r9, r6, r7)
            goto L_0x0078
        L_0x0077:
            r8 = 0
        L_0x0078:
            if (r8 == 0) goto L_0x007c
            goto L_0x013b
        L_0x007c:
            android.content.res.Resources r4 = r2.b
            android.content.res.XmlResourceParser r4 = r4.getXml(r1)
            int r6 = r4.next()
        L_0x0086:
            r7 = 1
            r8 = 2
            if (r6 == r8) goto L_0x0091
            if (r6 == r7) goto L_0x0091
            int r6 = r4.next()
            goto L_0x0086
        L_0x0091:
            if (r6 != r8) goto L_0x0176
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.util.ArrayMap r9 = new android.util.ArrayMap
            r9.<init>()
            int r10 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            int r11 = r4.getDepth()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r12 = 0
        L_0x00a6:
            if (r10 == r7) goto L_0x0126
            int r13 = r4.getDepth()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r13 >= r11) goto L_0x00b1
            r13 = 3
            if (r10 == r13) goto L_0x0126
        L_0x00b1:
            if (r10 == r8) goto L_0x00c1
            int r10 = r4.next()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            goto L_0x00a6
        L_0x00b8:
            r0 = move-exception
            goto L_0x0172
        L_0x00bb:
            r0 = move-exception
            goto L_0x016a
        L_0x00be:
            r0 = move-exception
            goto L_0x016e
        L_0x00c1:
            java.lang.String r10 = r4.getName()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            java.lang.String r13 = "animated-vector"
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r13)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r13 == 0) goto L_0x00d6
            one.me.sdk.richvector.EnhancedVectorDrawable r10 = r2.b(r4)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r10.getPixelSize()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r12 = r10
            goto L_0x0120
        L_0x00d6:
            java.lang.String r13 = "target"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r13)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r10 == 0) goto L_0x0120
            int r10 = r4.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r13 = 0
            r14 = r13
            r15 = 0
        L_0x00e5:
            if (r14 >= r10) goto L_0x0120
            java.lang.String r5 = r4.getAttributeName(r14)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            java.lang.String r7 = "name"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r7 == 0) goto L_0x00f8
            java.lang.String r15 = r4.getAttributeValue(r14)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            goto L_0x011c
        L_0x00f8:
            java.lang.String r7 = "animation"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r5 == 0) goto L_0x011c
            int r5 = r4.getAttributeResourceValue(r14, r13)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r5 == 0) goto L_0x011c
            android.content.Context r7 = r2.a     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r7, r5)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            boolean r16 = defpackage.cg.c(r7)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            if (r16 == 0) goto L_0x0116
            android.animation.Animator r7 = r2.a(r5)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
        L_0x0116:
            r6.add(r7)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r9.put(r7, r15)     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
        L_0x011c:
            int r14 = r14 + 1
            r7 = 1
            goto L_0x00e5
        L_0x0120:
            int r10 = r4.next()     // Catch:{ XmlPullParserException -> 0x00be, IOException -> 0x00bb }
            r7 = 1
            goto L_0x00a6
        L_0x0126:
            r4.close()
            if (r12 == 0) goto L_0x015e
            bg r8 = new bg
            r8.<init>(r12, r6, r9)
            java.lang.Object r2 = r3.a
            android.util.LruCache r2 = (android.util.LruCache) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2.put(r1, r8)
        L_0x013b:
            e75 r1 = r0.callback
            one.me.sdk.richvector.EnhancedVectorDrawable r2 = r8.a
            r2.setCallback(r1)
            r0.drawable = r2
            java.util.ArrayList r1 = r8.b
            r0.animators = r1
            android.util.ArrayMap r1 = r8.c
            r0.targetNameMap = r1
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r0.prepareLocalAnimators(r1)
            r0.animatorSetFromXml = r1
            c75 r2 = new c75
            r2.<init>(r0, r1)
            r0.animator = r2
            return
        L_0x015e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "VectorDrawable was not found in XML"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016a:
            r0.printStackTrace()     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x016e:
            r0.printStackTrace()     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x0172:
            r4.close()
            throw r0
        L_0x0176:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.richvector.EnhancedAnimatedVectorDrawable.<init>(android.content.Context, int):void");
    }

    /* access modifiers changed from: private */
    public static final d75 animatorListener_delegate$lambda$0(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        return new d75(enhancedAnimatedVectorDrawable);
    }

    private final d75 getAnimatorListener() {
        return (d75) this.animatorListener$delegate.getValue();
    }

    private final Animator prepareLocalAnimator(int i) {
        Animator animator2 = this.animators.get(i);
        Animator clone = animator2.clone();
        String str = this.targetNameMap.get(animator2);
        AnimationTarget findTarget$rich_vector_release = str != null ? this.drawable.findTarget$rich_vector_release(str) : null;
        if (findTarget$rich_vector_release == null) {
            throw new IllegalStateException(wj6.k("Target with the name \"", str, "\" cannot be found in the VectorDrawable to be animated."));
        } else if ((findTarget$rich_vector_release instanceof GroupElement) || (findTarget$rich_vector_release instanceof PathElement)) {
            clone.setTarget(findTarget$rich_vector_release);
            return clone;
        } else {
            Class<?> cls = findTarget$rich_vector_release.getClass();
            throw new UnsupportedOperationException("Target should be either GroupElement or PathElement, " + cls + " is not supported");
        }
    }

    private final void prepareLocalAnimators(AnimatorSet animatorSet) {
        int size = this.animators.size();
        if (size > 0) {
            AnimatorSet.Builder play = animatorSet.play(prepareLocalAnimator(0));
            for (int i = 1; i < size; i++) {
                play.with(prepareLocalAnimator(i));
            }
        }
    }

    public void clearAnimationCallbacks() {
        c75 c75 = this.animator;
        c75.b.removeListener(getAnimatorListener());
        this.animationCallbacks.clear();
    }

    public void draw(Canvas canvas) {
        c75 c75 = this.animator;
        if (c75.b.isStarted()) {
            c75.a.invalidateSelf();
        }
        this.drawable.draw(canvas);
    }

    public Animator findAnimations(String str) {
        Integer valueOf = Integer.valueOf(CollectionsKt.indexOf(this.targetNameMap.values(), str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return this.targetNameMap.keyAt(valueOf.intValue());
    }

    public VectorPath findPath(String str) {
        return this.drawable.findPath(str);
    }

    public int getAlpha() {
        return this.drawable.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.drawable.getColorFilter();
    }

    public Rect getDirtyBounds() {
        return this.drawable.getDirtyBounds();
    }

    public int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.drawable.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.drawable.getMinimumWidth();
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateAnimations() {
        AnimatorSet animatorSet = new AnimatorSet();
        prepareLocalAnimators(animatorSet);
        this.animatorSetFromXml = animatorSet;
        c75 c75 = this.animator;
        c75.b.removeListener(getAnimatorListener());
        c75 c752 = new c75(this, this.animatorSetFromXml);
        if (this.animationCallbacks.size() != 0) {
            c752.b.addListener(getAnimatorListener());
        }
        this.animator = c752;
    }

    public void invalidatePath() {
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.animator.b.isRunning();
    }

    public void jumpToCurrentState() {
        this.animator.b.end();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        return this.drawable.setState(iArr);
    }

    public void registerAnimationCallback(ye yeVar) {
        if (this.animationCallbacks.size() == 0) {
            c75 c75 = this.animator;
            c75.b.addListener(getAnimatorListener());
        }
        if (!this.animationCallbacks.contains(yeVar)) {
            this.animationCallbacks.add(yeVar);
        }
    }

    public void setAlpha(int i) {
        this.drawable.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.drawable.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.drawable.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        c75 c75 = this.animator;
        if (c75.c && c75.b.isStarted()) {
            if (z) {
                this.animator.b.resume();
            } else {
                this.animator.b.pause();
            }
        }
        this.drawable.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        c75 c75 = this.animator;
        AnimatorSet animatorSet = c75.b;
        if (!animatorSet.isStarted()) {
            animatorSet.start();
            c75.a.invalidateSelf();
        }
    }

    public void stop() {
        this.animator.b.end();
    }

    public boolean unregisterAnimationCallback(ye yeVar) {
        boolean remove = this.animationCallbacks.remove(yeVar);
        if (this.animationCallbacks.size() == 0) {
            c75 c75 = this.animator;
            c75.b.removeListener(getAnimatorListener());
        }
        return remove;
    }
}
