package org.mrlem.sample.kotlinpoet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

/**
 * A slightly more complex sample Kotlin generation.
 */
object Sample2 : Sample {

    override val description = "generates a class with a function and a statement"

    override fun run() {
        // prepare our file spec
        val file = FileSpec.builder("org.mrlem.sample.kotlinpoet", "Person")
            .addType(
                TypeSpec.classBuilder("Person")
                    .addProperty(
                        PropertySpec.builder("name", String::class)
                            .initializer("\"Brian\"")
                            .build()
                    )
                    .addFunction(
                        FunSpec.builder("sayHi")
                            .addStatement("""println("Hi, my name is ${'$'}name")""")
                            .build()
                    )
                    .build()
            )
            .build()

        // write out the result
        file.writeTo(System.out)
    }

}
