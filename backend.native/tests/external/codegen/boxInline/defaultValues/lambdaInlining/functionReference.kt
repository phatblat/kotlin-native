// FILE: 1.kt
// SKIP_INLINE_CHECK_IN: inlineFun$default
package test

fun ok() = "OK"

@Suppress("NOT_YET_SUPPORTED_IN_INLINE")
inline fun inlineFun(lambda: () -> String = ::ok): String {
    return lambda()
}

// FILE: 2.kt

import test.*

fun box(): String {
    return inlineFun()
}