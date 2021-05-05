package org.mrlem.sample.kotlinpoet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

/**
 * A minimalistic sample Kotlin generation.
 */
object Sample1 : Sample {

    override val description = "generates a class with a single property"

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
                    .build()
            )
            .build()

        // write out the result
        file.writeTo(System.out)
    }

}
