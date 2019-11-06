package anonymos.miloud.com.chartapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        PieChart pieChart = findViewById(R.id.PieChart);

        // Array List of persons who visit our country in defferent years
        ArrayList<PieEntry> years = new ArrayList<>();
        years.add(new PieEntry(245,"2012"));
        years.add(new PieEntry(150,"2014"));
        years.add(new PieEntry(452,"2016"));
        years.add(new PieEntry(362,"2018"));
        years.add(new PieEntry(860,"2020"));

        //Specify The Pie Chart Properties
        PieDataSet pieDataSet = new PieDataSet(years,"Visitors");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(18f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();
        pieChart.setCenterText("Visitors");


    }
}
