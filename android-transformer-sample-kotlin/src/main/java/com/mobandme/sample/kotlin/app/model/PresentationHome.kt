package com.mobandme.sample.kotlin.app.model

import com.mobandme.android.transformer.annotations.Mappable
import com.mobandme.android.transformer.annotations.Mapped

/**
 * Created by Dimorinny on 20.05.16.
 */
@Mappable(with = NetworkHome::class)
data class PresentationHome(
        @Mapped
        var name: String = "",

        @Mapped
        var city: String = ""
)