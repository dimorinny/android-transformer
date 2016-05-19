package com.mobandme.sample.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.mobandme.android.transformer.Transformer;
import com.mobandme.sample.app.model.NetworkHome;
import com.mobandme.sample.app.model.PresentationHome;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Transformer presentationHomeTransformer = new Transformer.Builder().build(PresentationHome.class);

            PresentationHome presentationHome = new PresentationHome();
            presentationHome.city = "city";
            presentationHome.name = "name";

            NetworkHome networkHome = presentationHomeTransformer.transform(presentationHome, NetworkHome.class);

            Log.d(TAG, networkHome.city);

        } catch (Exception e) {
            Log.e("android-transformer", e.getMessage(), e);
        }
    }
}
