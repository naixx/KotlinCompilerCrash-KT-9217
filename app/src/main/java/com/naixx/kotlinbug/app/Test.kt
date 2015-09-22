package com.naixx.kotlinbug.app

/**
 * Created by astra on 21.09.2015.
 */
public class Test {

    fun crash(){
        CompilerCrash.crashOnDeprecated<String>()
    }
}
