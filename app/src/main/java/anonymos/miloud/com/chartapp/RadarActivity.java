package anonymos.miloud.com.chartapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class RadarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);

        RadarChart radarChart = findViewById(R.id.RadarChart);

        // Array List of persons who visit our country in defferent years
        ArrayList<RadarEntry> years = new ArrayList<>();
        years.add(new RadarEntry(415));
        years.add(new RadarEntry(250));
        years.add(new RadarEntry(152));
        years.add(new RadarEntry(380));
        years.add(new RadarEntry(860));

        //Specify The Pie Chart Properties
        RadarDataSet radarDataSet = new RadarDataSet(years,"Visitors");
        radarDataSet.setColor(Color.RED);
        radarDataSet.setValueTextSize(18f);
        radarDataSet.setValueTextColor(Color.RED);
        radarDataSet.setLineWidth(2f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSet);

        String[] labels = {"2012","2014","2016","2018","2020"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));

        radarChart.getDescription().setText("Radar Chart Exemple");
        radarChart.setData(radarData);

    }
}
