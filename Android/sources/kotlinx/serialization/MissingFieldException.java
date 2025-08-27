package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0})
public final class MissingFieldException extends SerializationException {
    public final List a;

    public MissingFieldException(ArrayList arrayList, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        this.a = arrayList;
    }
}
