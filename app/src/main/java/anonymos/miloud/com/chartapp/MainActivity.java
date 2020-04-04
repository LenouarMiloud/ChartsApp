package anonymos.miloud.com.chartapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Lunch The Activity of Bar Chart
        findViewById(R.id.BarChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BarActivity.class));
            }
        });
        //Lunch The Activity of Radar Chart
        findViewById(R.id.RadarChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RadarActivity.class));
            }
        });
        //Lunch The Activity of Pie Chart
        findViewById(R.id.PieChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieActivity.class));
            }
        });


    }
}
