// Generated by jextract

package net.renderdoc.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$9 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$9() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(pRENDERDOC_TriggerMultiFrameCapture.class, "apply", constants$9.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$9.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(pRENDERDOC_StartFrameCapture.class, "apply", constants$6.const$4);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(pRENDERDOC_IsFrameCapturing.class, "apply", constants$2.const$5);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


