package com.sq.common_module.common.utils.kt

import android.content.res.Resources
import android.util.TypedValue
import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

/**
 *
 * @ClassName: IntExt
 * @Author: 史大拿
 * @CreateDate: 8/6/22$ 4:14 PM$
 *
 */
val Int.dp
    get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(),
        Resources.getSystem().displayMetrics)

val Int.sp
    get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this.toFloat(),
        Resources.getSystem().displayMetrics)

val Int.px
    get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, this.toFloat(),
        Resources.getSystem().displayMetrics)



infix fun Int.diagonalDistance(b: Int): Float = let {
    val a = this
    return sqrt(a.toDouble().pow(2.0) + b.toDouble().pow(2.0)).toFloat()
}

fun Double.decimal2() : String{
    val df = DecimalFormat("#0.00")
    return df.format(this)
}