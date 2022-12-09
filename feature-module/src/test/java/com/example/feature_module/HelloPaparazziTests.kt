package com.example.feature_module

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import app.cash.paparazzi.androidHome
import app.cash.paparazzi.detectEnvironment
import org.junit.Rule
import org.junit.Test

class HelloPaparazziTests {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        environment = detectEnvironment().copy(
            platformDir = "${androidHome()}/platforms/android-32",
            compileSdkVersion = 32
        ),
    )


    @Test
    fun helloTests() {
        paparazzi.snapshot {
            HelloPaparazziScreen()
        }
    }
}