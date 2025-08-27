package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexFormat;
import kotlin.uuid.Uuid;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, d2 = {"HexFormat", "Lkotlin/text/HexFormat;", "builderAction", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "isCaseSensitive", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,844:1\n1088#2,2:845\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:845,2\n*E\n"})
public final class HexFormatKt {
    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> function1) {
        HexFormat.Builder builder = new HexFormat.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    /* access modifiers changed from: private */
    public static final boolean isCaseSensitive(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Intrinsics.compare((int) charAt, (int) Uuid.SIZE_BITS) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
