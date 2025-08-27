package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0121 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0057
            if (r1 == r6) goto L_0x0044
            if (r1 == r5) goto L_0x003f
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0021:
            java.lang.Object r1 = r10.L$1
            kotlin.collections.RingBuffer r1 = (kotlin.collections.RingBuffer) r1
            java.lang.Object r4 = r10.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0149
        L_0x002e:
            java.lang.Object r1 = r10.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r10.L$1
            kotlin.collections.RingBuffer r5 = (kotlin.collections.RingBuffer) r5
            java.lang.Object r8 = r10.L$0
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x011b
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0165
        L_0x0044:
            int r1 = r10.I$0
            java.lang.Object r2 = r10.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r10.L$1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r10.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r11)
        L_0x0055:
            r11 = r1
            goto L_0x00a5
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            int r1 = r10.$size
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = kotlin.ranges.RangesKt.coerceAtMost((int) r1, (int) r8)
            int r8 = r10.$step
            int r9 = r10.$size
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00d9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator<T> r1 = r10.$iterator
            r3 = 0
            r4 = r11
            r11 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L_0x007a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r2.next()
            if (r11 <= 0) goto L_0x0089
            int r11 = r11 + -1
            goto L_0x007a
        L_0x0089:
            r3.add(r8)
            int r8 = r3.size()
            int r9 = r10.$size
            if (r8 != r9) goto L_0x007a
            r10.L$0 = r4
            r10.L$1 = r3
            r10.L$2 = r2
            r10.I$0 = r1
            r10.label = r6
            java.lang.Object r11 = r4.yield(r3, r10)
            if (r11 != r0) goto L_0x0055
            return r0
        L_0x00a5:
            boolean r1 = r10.$reuseBuffer
            if (r1 == 0) goto L_0x00ad
            r3.clear()
            goto L_0x00b5
        L_0x00ad:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.$size
            r1.<init>(r3)
            r3 = r1
        L_0x00b5:
            r1 = r11
            goto L_0x007a
        L_0x00b7:
            boolean r11 = r3.isEmpty()
            r11 = r11 ^ r6
            if (r11 == 0) goto L_0x0165
            boolean r11 = r10.$partialWindows
            if (r11 != 0) goto L_0x00ca
            int r11 = r3.size()
            int r1 = r10.$size
            if (r11 != r1) goto L_0x0165
        L_0x00ca:
            r10.L$0 = r7
            r10.L$1 = r7
            r10.L$2 = r7
            r10.label = r5
            java.lang.Object r10 = r4.yield(r3, r10)
            if (r10 != r0) goto L_0x0165
            return r0
        L_0x00d9:
            kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
            r5.<init>(r1)
            java.util.Iterator<T> r1 = r10.$iterator
            r8 = r11
        L_0x00e1:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0121
            java.lang.Object r11 = r1.next()
            r5.add(r11)
            boolean r11 = r5.isFull()
            if (r11 == 0) goto L_0x00e1
            int r11 = r5.size()
            int r9 = r10.$size
            if (r11 >= r9) goto L_0x0101
            kotlin.collections.RingBuffer r5 = r5.expanded(r9)
            goto L_0x00e1
        L_0x0101:
            boolean r11 = r10.$reuseBuffer
            if (r11 == 0) goto L_0x0107
            r11 = r5
            goto L_0x010c
        L_0x0107:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
        L_0x010c:
            r10.L$0 = r8
            r10.L$1 = r5
            r10.L$2 = r1
            r10.label = r4
            java.lang.Object r11 = r8.yield(r11, r10)
            if (r11 != r0) goto L_0x011b
            return r0
        L_0x011b:
            int r11 = r10.$step
            r5.removeFirst(r11)
            goto L_0x00e1
        L_0x0121:
            boolean r11 = r10.$partialWindows
            if (r11 == 0) goto L_0x0165
            r1 = r5
            r4 = r8
        L_0x0127:
            int r11 = r1.size()
            int r5 = r10.$step
            if (r11 <= r5) goto L_0x014f
            boolean r11 = r10.$reuseBuffer
            if (r11 == 0) goto L_0x0135
            r11 = r1
            goto L_0x013a
        L_0x0135:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
        L_0x013a:
            r10.L$0 = r4
            r10.L$1 = r1
            r10.L$2 = r7
            r10.label = r3
            java.lang.Object r11 = r4.yield(r11, r10)
            if (r11 != r0) goto L_0x0149
            return r0
        L_0x0149:
            int r11 = r10.$step
            r1.removeFirst(r11)
            goto L_0x0127
        L_0x014f:
            boolean r11 = r1.isEmpty()
            r11 = r11 ^ r6
            if (r11 == 0) goto L_0x0165
            r10.L$0 = r7
            r10.L$1 = r7
            r10.L$2 = r7
            r10.label = r2
            java.lang.Object r10 = r4.yield(r1, r10)
            if (r10 != r0) goto L_0x0165
            return r0
        L_0x0165:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
