package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.HTTP;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001aD\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010*\u001aD\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\n\u00103\u001a\u00020\u0010*\u00020\u0002\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\b\u001a\r\u00106\u001a\u00020\u0010*\u00020\u0002H\b\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00108\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00109\u001a\u00020:*\u00020\u0002H\u0002\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010<\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010<\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u0002\u001a\u0010\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u0002\u001a\u0015\u0010A\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\f\u001a\u000f\u0010B\u001a\u00020\r*\u0004\u0018\u00010\rH\b\u001a\u001c\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010C\u001a\u00020\r*\u00020\r2\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010F\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001a\u001c\u0010F\u001a\u00020\r*\u00020\r2\u0006\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u0014\u001aG\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010>*\u00020\u00022\u000e\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010K\u001a=\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010>*\u00020\u00022\u0006\u0010H\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bJ\u001a4\u0010L\u001a\u00020\u0010*\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010Q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u001d\u0010Q\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\b\u001a\u0015\u0010Q\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u0001H\b\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010V\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00020XH\bø\u0001\u0000\u001a\u001d\u0010V\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\rH\b\u001a$\u0010[\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010[\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010_\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a$\u0010_\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001d\u0010`\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020\rH\b\u001a)\u0010a\u001a\u00020\r*\u00020\r2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140XH\bø\u0001\u0000¢\u0006\u0002\bb\u001a)\u0010a\u001a\u00020\r*\u00020\r2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020XH\bø\u0001\u0000¢\u0006\u0002\bc\u001a\"\u0010d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0002\u001a\u001a\u0010d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020\u0002\u001a%\u0010d\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u0002H\b\u001a\u001d\u0010d\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u00012\u0006\u0010Z\u001a\u00020\u0002H\b\u001a=\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010f\u001a0\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\n\u0010H\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0006\u0010U\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bg\u001a%\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0@*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\b\u001a=\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0I\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010i\u001a0\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\n\u0010H\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0>*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\b\u001a\u001c\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010j\u001a\u00020\u0010*\u00020\u00022\u0006\u0010P\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010k\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u001d\u0010k\u001a\u00020\u0002*\u00020\r2\u0006\u0010l\u001a\u00020\u00062\u0006\u0010m\u001a\u00020\u0006H\b\u001a\u001f\u0010n\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\b\u001a\u0012\u0010n\u001a\u00020\r*\u00020\u00022\u0006\u0010R\u001a\u00020\u0001\u001a\u0012\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010R\u001a\u00020\u0001\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010r\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00142\b\b\u0002\u0010\\\u001a\u00020\r\u001a\u001c\u0010r\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\\\u001a\u00020\r\u001a\f\u0010s\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010t\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010u\u001a\n\u0010v\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010v\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010v\u001a\u00020\r*\u00020\rH\b\u001a$\u0010v\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010v\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010y\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010y\u001a\u00020\u0002*\u00020\u00022\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010y\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010y\u001a\u00020\r*\u00020\rH\b\u001a$\u0010y\u001a\u00020\r*\u00020\r2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100XH\bø\u0001\u0000\u001a\u0016\u0010y\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b20\u0001¨\u0006z"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isBlank", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1499:1\n80#1,22:1500\n114#1,5:1522\n131#1,5:1527\n80#1,22:1532\n108#1:1554\n80#1,22:1555\n114#1,5:1577\n125#1:1582\n114#1,5:1583\n131#1,5:1588\n142#1:1593\n131#1,5:1594\n80#1,22:1599\n114#1,5:1621\n131#1,5:1626\n1069#2,2:1631\n12654#3,2:1633\n12654#3,2:1635\n295#4,2:1637\n295#4,2:1639\n1557#4:1642\n1628#4,3:1643\n1557#4:1646\n1628#4,3:1647\n1#5:1641\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1500,22\n125#1:1522,5\n142#1:1527,5\n147#1:1532,22\n152#1:1554\n152#1:1555,22\n157#1:1577,5\n162#1:1582\n162#1:1583,5\n167#1:1588,5\n172#1:1593\n172#1:1594,5\n177#1:1599,22\n188#1:1621,5\n199#1:1626,5\n312#1:1631,2\n952#1:1633,2\n976#1:1635,2\n1015#1:1637,2\n1021#1:1639,2\n1321#1:1642\n1321#1:1643,3\n1346#1:1646\n1346#1:1647,3\n*E\n"})
class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final String commonPrefixWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && CharsKt__CharKt.equals(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (hasSurrogatePairAt(charSequence, i2) || hasSurrogatePairAt(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min && CharsKt__CharKt.equals(charSequence.charAt((length - i) - 1), charSequence2.charAt((length2 - i) - 1), z)) {
            i++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i) - 1) || hasSurrogatePairAt(charSequence2, (length2 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z);
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (indexOf$default(charSequence, (String) charSequence2, 0, z, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (indexOf$StringsKt__StringsKt$default(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, charSequence2, z);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual((Object) charSequence, (Object) charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(CharSequence charSequence, char c, boolean z) {
        return charSequence.length() > 0 && CharsKt__CharKt.equals(charSequence.charAt(getLastIndex(charSequence)), c, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, c, z);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence charSequence, Collection<String> collection, int i, boolean z) {
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
    }

    /* access modifiers changed from: private */
    public static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (z || collection.size() != 1) {
            IntProgression intRange = !z2 ? new IntRange(RangesKt.coerceAtLeast(i, 0), charSequence.length()) : RangesKt.downTo(RangesKt.coerceAtMost(i, getLastIndex(charSequence)), 0);
            if (charSequence instanceof String) {
                int first = intRange.getFirst();
                int last = intRange.getLast();
                int step = intRange.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (StringsKt__StringsJVMKt.regionMatches(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += step;
                        } else {
                            return TuplesKt.to(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = intRange.getFirst();
                int last2 = intRange.getLast();
                int step2 = intRange.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (regionMatchesImpl(str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += step2;
                        } else {
                            return TuplesKt.to(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) CollectionsKt.single(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int indexOf$default = !z2 ? indexOf$default(charSequence2, str6, i2, false, 4, (Object) null) : lastIndexOf$default(charSequence2, str6, i2, false, 4, (Object) null);
        if (indexOf$default < 0) {
            return null;
        }
        return TuplesKt.to(Integer.valueOf(indexOf$default), str5);
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return findAnyOf(charSequence, collection, i, z);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence charSequence, Collection<String> collection, int i, boolean z) {
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return findLastAnyOf(charSequence, collection, i, z);
    }

    public static final IntRange getIndices(CharSequence charSequence) {
        return new IntRange(0, charSequence.length() - 1);
    }

    public static int getLastIndex(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + -2 && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <C extends java.lang.CharSequence & R, R> R ifBlank(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
        /*
            boolean r0 = isBlank(r1)
            if (r0 == 0) goto L_0x000a
            java.lang.Object r1 = r2.invoke()
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.ifBlank(java.lang.CharSequence, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <C extends java.lang.CharSequence & R, R> R ifEmpty(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
        /*
            int r0 = r1.length()
            if (r0 != 0) goto L_0x000a
            java.lang.Object r1 = r2.invoke()
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.ifEmpty(java.lang.CharSequence, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static final int indexOf(CharSequence charSequence, char c, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return indexOfAny(charSequence, new char[]{c}, i, z);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression intRange = !z2 ? new IntRange(RangesKt.coerceAtLeast(i, 0), RangesKt.coerceAtMost(i2, charSequence.length())) : RangesKt.downTo(RangesKt.coerceAtMost(i, getLastIndex(charSequence)), RangesKt.coerceAtLeast(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (true) {
                if (regionMatchesImpl(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                    return first;
                }
                if (first == last) {
                    return -1;
                }
                first += step;
            }
        } else {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int step2 = intRange.getStep();
            if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
                return -1;
            }
            while (true) {
                if (StringsKt__StringsJVMKt.regionMatches((String) charSequence2, 0, (String) charSequence, first2, ((String) charSequence2).length(), z)) {
                    return first2;
                }
                if (first2 == last2) {
                    return -1;
                }
                first2 += step2;
            }
        }
    }

    public static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i, i2, z, z2);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, c, i, z);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
            int lastIndex = getLastIndex(charSequence);
            if (coerceAtLeast > lastIndex) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(coerceAtLeast);
                for (char equals : cArr) {
                    if (CharsKt__CharKt.equals(equals, charAt, z)) {
                        return coerceAtLeast;
                    }
                }
                if (coerceAtLeast == lastIndex) {
                    return -1;
                }
                coerceAtLeast++;
            }
        } else {
            return ((String) charSequence).indexOf(ArraysKt.single(cArr), i);
        }
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, cArr, i, z);
    }

    public static boolean isBlank(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @InlineOnly
    private static final boolean isEmpty(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @InlineOnly
    private static final boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    @InlineOnly
    private static final boolean isNotEmpty(CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    @InlineOnly
    private static final boolean isNullOrBlank(CharSequence charSequence) {
        return charSequence == null || isBlank(charSequence);
    }

    @InlineOnly
    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final CharIterator iterator(CharSequence charSequence) {
        return new StringsKt__StringsKt$iterator$1(charSequence);
    }

    public static final int lastIndexOf(CharSequence charSequence, char c, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return lastIndexOfAny(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, c, i, z);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int coerceAtMost = RangesKt.coerceAtMost(i, getLastIndex(charSequence)); -1 < coerceAtMost; coerceAtMost--) {
                char charAt = charSequence.charAt(coerceAtMost);
                for (char equals : cArr) {
                    if (CharsKt__CharKt.equals(equals, charAt, z)) {
                        return coerceAtMost;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ArraysKt.single(cArr), i);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, cArr, i, z);
    }

    public static Sequence<String> lineSequence(CharSequence charSequence) {
        return splitToSequence$default(charSequence, new String[]{HTTP.CRLF, "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> lines(CharSequence charSequence) {
        return SequencesKt.toList(lineSequence(charSequence));
    }

    @InlineOnly
    private static final boolean matches(CharSequence charSequence, Regex regex) {
        return regex.matches(charSequence);
    }

    @InlineOnly
    private static final String orEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i, char c) {
        if (i < 0) {
            throw new IllegalArgumentException(a81.j(i, "Desired length ", " is less than zero."));
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return sb;
        }
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padEnd(charSequence, i, c);
    }

    public static final CharSequence padStart(CharSequence charSequence, int i, char c) {
        if (i < 0) {
            throw new IllegalArgumentException(a81.j(i, "Desired length ", " is less than zero."));
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padStart(charSequence, i, c);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        requireNonNegativeLimit(i2);
        return new DelimitedRangesSequence(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, z));
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i, z, i2);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence charSequence2) {
        if (startsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i, int i2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a81.l("End index (", i2, ") is less than start index (", i, ")."));
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence charSequence2) {
        if (endsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (charSequence.length() < charSequence3.length() + charSequence2.length() || !startsWith$default(charSequence, charSequence2, false, 2, (Object) null) || !endsWith$default(charSequence, charSequence3, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length());
        }
        return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, String str) {
        return regex.replace(charSequence, str);
    }

    public static final String replaceAfter(String str, char c, String str2, String str3) {
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : replaceRange((CharSequence) str, indexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c, str2, str3);
    }

    public static final String replaceAfterLast(String str, String str2, String str3, String str4) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, str2.length() + lastIndexOf$default, str.length(), (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, char c, String str2, String str3) {
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c, str2, str3);
    }

    public static final String replaceBeforeLast(String str, char c, String str2, String str3) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c, str2, str3);
    }

    @InlineOnly
    private static final String replaceFirst(CharSequence charSequence, Regex regex, String str) {
        return regex.replaceFirst(charSequence, str);
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "replaceFirstCharWithChar")
    private static final String replaceFirstCharWithChar(String str, Function1<? super Character, Character> function1) {
        if (str.length() <= 0) {
            return str;
        }
        char charValue = function1.invoke(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        return charValue + substring;
    }

    @OverloadResolutionByLambdaReturnType
    @SinceKotlin(version = "1.5")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "replaceFirstCharWithCharSequence")
    private static final String replaceFirstCharWithCharSequence(String str, Function1<? super Character, ? extends CharSequence> function1) {
        if (str.length() <= 0) {
            return str;
        }
        return function1.invoke(Character.valueOf(str.charAt(0))) + str.substring(1);
    }

    public static CharSequence replaceRange(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(a81.l("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final void requireNonNegativeLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(wj6.h(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List<String> split(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z, i);
            }
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange substring : asIterable) {
            arrayList.add(substring(charSequence, substring));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z, int i) {
        requireNonNegativeLimit(i);
        int i2 = 0;
        int indexOf = indexOf(charSequence, str, 0, z);
        if (indexOf == -1 || i == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = RangesKt.coerceAtMost(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, indexOf).toString());
            i2 = str.length() + indexOf;
            if ((z2 && arrayList.size() == i - 1) || (indexOf = indexOf(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, indexOf).toString());
            i2 = str.length() + indexOf;
            break;
        } while ((indexOf = indexOf(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, strArr, z, i);
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, String[] strArr, boolean z, int i) {
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z, i, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitToSequence(charSequence, strArr, z, i);
    }

    public static final boolean startsWith(CharSequence charSequence, char c, boolean z) {
        return charSequence.length() > 0 && CharsKt__CharKt.equals(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, c, z);
    }

    public static final CharSequence subSequence(CharSequence charSequence, IntRange intRange) {
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static String substring(String str, IntRange intRange) {
        return str.substring(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    public static /* synthetic */ String substring$default(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return charSequence.subSequence(i, i2).toString();
    }

    public static String substringAfter(String str, char c, String str2) {
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str2 : str.substring(indexOf$default + 1, str.length());
    }

    public static /* synthetic */ String substringAfter$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c, str2);
    }

    public static String substringAfterLast(String str, char c, String str2) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str2 : str.substring(lastIndexOf$default + 1, str.length());
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c, str2);
    }

    public static final String substringBefore(String str, char c, String str2) {
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str2 : str.substring(0, indexOf$default);
    }

    public static /* synthetic */ String substringBefore$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c, str2);
    }

    public static final String substringBeforeLast(String str, char c, String str2) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str2 : str.substring(0, lastIndexOf$default);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c, str2);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean toBooleanStrict(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "true")) {
            return true;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "false")) {
            return false;
        }
        throw new IllegalArgumentException(a81.m("The string doesn't represent a boolean value: ", str));
    }

    @SinceKotlin(version = "1.5")
    public static Boolean toBooleanStrictOrNull(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence trim(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ((Boolean) rae.k(charSequence, !z ? i : length, function1)).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!((Boolean) rae.k(charSequence, length, function1)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!((Boolean) rae.k(charSequence, i, function1)).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, c, z);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.endsWith$default((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return regionMatchesImpl(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, charSequence2, z);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i, z);
    }

    public static /* synthetic */ String padEnd$default(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padEnd(str, i, c);
    }

    public static /* synthetic */ String padStart$default(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padStart(str, i, c);
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i, z, i2);
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> function1) {
        return regex.replace(charSequence, function1);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, cArr, z, i);
    }

    public static final Sequence<String> splitToSequence(CharSequence charSequence, char[] cArr, boolean z, int i) {
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z, i, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$2(charSequence));
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitToSequence(charSequence, cArr, z, i);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return regionMatchesImpl(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, z);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    private static final CharSequence subSequence(String str, int i, int i2) {
        return str.subSequence(i, i2);
    }

    @InlineOnly
    private static final String substring(CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        requireNonNegativeLimit(i2);
        return new DelimitedRangesSequence(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$2(ArraysKt.asList((T[]) strArr), z));
    }

    public static final String replaceAfter(String str, String str2, String str3, String str4) {
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str4 : replaceRange((CharSequence) str, str2.length() + indexOf$default, str.length(), (CharSequence) str3).toString();
    }

    public static final String replaceAfterLast(String str, char c, String str2, String str3) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, lastIndexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    public static final String replaceBefore(String str, String str2, String str3, String str4) {
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str4 : replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) str3).toString();
    }

    public static final String replaceBeforeLast(String str, String str2, String str3, String str4) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) str3).toString();
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final Sequence<String> splitToSequence(CharSequence charSequence, Regex regex, int i) {
        return regex.splitToSequence(charSequence, i);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, Regex regex, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, i, z);
    }

    public static final String substring(CharSequence charSequence, IntRange intRange) {
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1).toString();
    }

    public static String substringAfter(String str, String str2, String str3) {
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : str.substring(str2.length() + indexOf$default, str.length());
    }

    public static final String substringAfterLast(String str, String str2, String str3) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : str.substring(str2.length() + lastIndexOf$default, str.length());
    }

    public static final String substringBefore(String str, String str2, String str3) {
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? str3 : str.substring(0, indexOf$default);
    }

    public static final String substringBeforeLast(String str, String str2, String str3) {
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? str3 : str.substring(0, lastIndexOf$default);
    }

    public static final boolean contains(CharSequence charSequence, char c, boolean z) {
        return indexOf$default(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    public static final int indexOf(CharSequence charSequence, String str, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return indexOf$StringsKt__StringsKt$default(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    public static final int lastIndexOf(CharSequence charSequence, String str, int i, boolean z) {
        if (z || !(charSequence instanceof String)) {
            return indexOf$StringsKt__StringsKt(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static String removePrefix(String str, CharSequence charSequence) {
        return startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) ? str.substring(charSequence.length()) : str;
    }

    public static String removeSuffix(String str, CharSequence charSequence) {
        return endsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    public static final String removeSurrounding(String str, CharSequence charSequence, CharSequence charSequence2) {
        return (str.length() < charSequence2.length() + charSequence.length() || !startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) || !endsWith$default((CharSequence) str, charSequence2, false, 2, (Object) null)) ? str : str.substring(charSequence.length(), str.length() - charSequence2.length());
    }

    @InlineOnly
    private static final boolean contains(CharSequence charSequence, Regex regex) {
        return regex.containsMatchIn(charSequence);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) charSequence2, i, false, 4, (Object) null);
        }
        return regionMatchesImpl(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence charSequence2) {
        return removeSurrounding(charSequence, charSequence2, charSequence2);
    }

    public static String removeSurrounding(String str, CharSequence charSequence) {
        return removeSurrounding(str, charSequence, charSequence);
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> collection, int i, boolean z) {
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> collection, int i, boolean z) {
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    @InlineOnly
    private static final String trim(String str) {
        return trim((CharSequence) str).toString();
    }

    public static final String trim(String str, Function1<? super Character, Boolean> function1) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = function1.invoke(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @InlineOnly
    private static final String trimEnd(String str) {
        return trimEnd((CharSequence) str).toString();
    }

    @InlineOnly
    private static final String trimStart(String str) {
        return trimStart((CharSequence) str).toString();
    }

    public static final String trimEnd(String str, Function1<? super Character, Boolean> function1) {
        Object obj;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!function1.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    public static final String trimStart(String str, Function1<? super Character, Boolean> function1) {
        Object obj;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    public static final List<String> split(CharSequence charSequence, char[] cArr, boolean z, int i) {
        if (cArr.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange substring : asIterable) {
            arrayList.add(substring(charSequence, substring));
        }
        return arrayList;
    }

    public static final CharSequence trim(CharSequence charSequence, char... cArr) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean contains = ArraysKt.contains(cArr, charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!contains) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!contains) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String padEnd(String str, int i, char c) {
        return padEnd((CharSequence) str, i, c).toString();
    }

    public static String padStart(String str, int i, char c) {
        return padStart((CharSequence) str, i, c).toString();
    }

    @InlineOnly
    private static final String removeRange(String str, int i, int i2) {
        return removeRange((CharSequence) str, i, i2).toString();
    }

    @InlineOnly
    private static final String replaceRange(String str, int i, int i2, CharSequence charSequence) {
        return replaceRange((CharSequence) str, i, i2, charSequence).toString();
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... cArr) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ArraysKt.contains(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... cArr) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ArraysKt.contains(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence removeRange(CharSequence charSequence, IntRange intRange) {
        return removeRange(charSequence, intRange.getStart().intValue(), tr1.f(1, intRange));
    }

    public static final CharSequence replaceRange(CharSequence charSequence, IntRange intRange, CharSequence charSequence2) {
        return replaceRange(charSequence, intRange.getStart().intValue(), tr1.f(1, intRange), charSequence2);
    }

    public static final String trim(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean contains = ArraysKt.contains(cArr, str.charAt(!z ? i : length));
            if (!z) {
                if (!contains) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!contains) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @InlineOnly
    private static final List<String> split(CharSequence charSequence, Regex regex, int i) {
        return regex.split(charSequence, i);
    }

    public static final String trimEnd(String str, char... cArr) {
        Object obj;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ArraysKt.contains(cArr, str.charAt(length))) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        obj = "";
        return obj.toString();
    }

    public static final String trimStart(String str, char... cArr) {
        Object obj;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!ArraysKt.contains(cArr, str.charAt(i))) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    @InlineOnly
    private static final String removeRange(String str, IntRange intRange) {
        return removeRange((CharSequence) str, intRange).toString();
    }

    @InlineOnly
    private static final String replaceRange(String str, IntRange intRange, CharSequence charSequence) {
        return replaceRange((CharSequence) str, intRange, charSequence).toString();
    }

    public static CharSequence trim(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean isWhitespace = CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!isWhitespace) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!isWhitespace) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }
}
