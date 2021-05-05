package org.mrlem.sample.kotlinpoet

import com.squareup.kotlinpoet.*

/**
 * A slightly more complex sample Kotlin generation.
 */
object Sample3 : Sample {

    override val description = "generates a class with a function, an argument and an external symbol reference"

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
                        FunSpec.builder("sayHiAndSayPi")
                            .addParameter(
                                ParameterSpec.builder(
                                    "to",
                                    ClassName("org.mrlem.sample.kotlinpoet", "Person")
                                )
                                    .build()
                            )
                            .addStatement("""println("Hi ${'$'}{to.name}, here is pi: ${'$'}%M")""",
                                MemberName("kotlin.math", "PI")
                            )
                            .build()
                    )
                    .build()
            )
            .build()

        // write out the result
        file.writeTo(System.out)
    }

}
