package adventOdCode.puzzles.day5.part2

import adventOdCode.common.DataReader
import adventOdCode.puzzles.day5.common.SeatDecoder
import adventOdCode.puzzles.day5.common.parseInput
import kotlin.math.absoluteValue
import kotlin.properties.Delegates

class Analysis() {
    private var previousValue: Int? = null
    private var _result = 0
    private var _hasResult = false

    val hasResult get() = _hasResult
    val result get() = _result

    fun next(value: Int) {
        previousValue?.let {
            val delta = (value - it).absoluteValue
            if (delta > 1) {
                _result = (value - 1)
                _hasResult = true
            }
        }

        previousValue = value
    }
}

