package org.mrlem.sample.kotlinpoet

/**
 * Run all samples.
 */
fun main() {
    val samples = listOf(
        Sample1,
        Sample2,
        Sample3
    )

    samples.forEach { sample ->
        println()
        println("=======================================================================")
        println("  ${sample::class.java.simpleName}: ${sample.description}")
        println("=======================================================================")
        println()
        sample.run()
    }
}
