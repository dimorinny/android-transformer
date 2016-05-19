package com.mobandme.sample.app.model;

import com.mobandme.android.transformer.annotations.Mappable;
import com.mobandme.android.transformer.annotations.Mapped;

/**
 * Created by Dimorinny on 20.05.16.
 */
@Mappable(with = NetworkHome.class)
public class PresentationHome {
    @Mapped public String name;
    @Mapped public String city;
}
