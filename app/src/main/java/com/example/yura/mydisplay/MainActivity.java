package com.example.yura.mydisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        String strScreen = "";
        strScreen += "Ширина : " + String.valueOf(dm.widthPixels) + " pixels"
                + "\n\n";
        strScreen += "Высота : " + String.valueOf(dm.heightPixels) + " pixels"
                + "\n\n";
        strScreen += "Плотность : " + String.valueOf(dm.density)
                + "\n\n";
        strScreen += "X Измерение : " + String.valueOf(dm.xdpi) + " dot/inch"
                + "\n\n";
        strScreen += "Y Измерение : " + String.valueOf(dm.ydpi) + " dot/inch"
                + "\n\n";
        strScreen += "Плотность экрана, выраженная в виде точек на дюйм: "
                + dm.densityDpi + "\n\n";
        strScreen += "Коэффициент масштабирования для шрифтов, отображаемых на дисплее: "
                + dm.scaledDensity + "\n\n";

        TextView mScreenSize = (TextView) findViewById(R.id.infoText);
        mScreenSize.setText(strScreen);
    }
}
