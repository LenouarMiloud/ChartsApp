package anonymos.miloud.com.chartapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        BarChart barChart = findViewById(R.id.barChart);
        // Array List of persons who visit our country in defferent years
        ArrayList<BarEntry> years = new ArrayList<>();
        years.add(new BarEntry(2012,245));
        years.add(new BarEntry(2014,150));
        years.add(new BarEntry(2016,452));
        years.add(new BarEntry(2018,362));
        years.add(new BarEntry(2020,860));

        //Specify the Bar Chart Properties
        BarDataSet barDataSet = new BarDataSet(years,"Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(20f);

        BarData barData = new BarData(barDataSet);

        barChart.setData(barData);
        barChart.animateY(3000);
        barChart.setFitBars(true);
        barChart.getDescription().setText("Visitors of our country");

    }
}
